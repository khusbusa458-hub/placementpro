module.exports = (req, res) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET, OPTIONS');
  res.setHeader('Content-Type', 'application/json');

  if (req.method === 'OPTIONS') {
    res.statusCode = 200;
    return res.end();
  }

  res.statusCode = 200;
  res.end(JSON.stringify({
    status: "UP",
    service: "PlacementPro Backend API (Vercel Serverless)",
    database: "MongoDB Atlas (Database: placementpro)",
    timestamp: new Date().toISOString(),
    version: "1.0.0"
  }));
};
