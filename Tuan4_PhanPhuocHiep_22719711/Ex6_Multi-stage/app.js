const http = require("http");
http.createServer((req, res) => res.end("Multi-stage build!")).listen(3000);
