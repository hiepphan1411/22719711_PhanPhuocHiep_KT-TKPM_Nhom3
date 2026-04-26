const express = require('express');
const { MongoClient } = require('mongodb');

const app = express();
app.use(express.json());

const mongoUrl = process.env.MONGO_URL || 'mongodb://admin:password@mongo:27017';
const dbName = process.env.MONGO_DB || 'mydb';
const port = process.env.PORT || 3000;

async function start() {
  const client = new MongoClient(mongoUrl);
  await client.connect();
  const db = client.db(dbName);

  app.get('/health', (req, res) => {
    res.json({ status: 'ok' });
  });

  app.get('/items', async (req, res) => {
    const items = await db.collection('items').find().toArray();
    res.json(items);
  });

  app.post('/items', async (req, res) => {
    const payload = req.body || {};
    const result = await db.collection('items').insertOne(payload);
    res.json({ id: result.insertedId });
  });

  app.listen(port, () => {
    console.log(`API running on port ${port}`);
  });
}

start().catch((err) => {
  console.error('Failed to start API', err);
  process.exit(1);
});
