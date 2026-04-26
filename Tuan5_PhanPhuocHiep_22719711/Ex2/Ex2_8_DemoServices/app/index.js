const express = require('express');
const mysql = require('mysql2/promise');
const app = express();

const dbConfig = {
  host: process.env.DB_HOST || 'db',
  user: process.env.DB_USER || 'user',
  password: process.env.DB_PASSWORD || 'password',
  database: process.env.DB_NAME || 'mydb',
};

app.get('/', async (req, res) => {
  const conn = await mysql.createConnection(dbConfig);
  const [rows] = await conn.execute('SELECT NOW() as time');
  res.json({ status: 'connected', serverTime: rows[0].time });
});

app.listen(3000, () => console.log('App running on :3000'));
