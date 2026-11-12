const companies = [
  { id: 1, name: "Google", tier: "Tier 1", ctc: "32 - 45 LPA", rounds: 4, focus: "Graph Algorithms, DP, System Architecture" },
  { id: 2, name: "Microsoft", tier: "Tier 1", ctc: "28 - 42 LPA", rounds: 4, focus: "Binary Trees, Strings, Object Oriented Design" },
  { id: 3, name: "Amazon", tier: "Tier 1", ctc: "28 - 44 LPA", rounds: 4, focus: "Leadership Principles, Sliding Window, Heap" },
  { id: 4, name: "Meta", tier: "Tier 1", ctc: "35 - 50 LPA", rounds: 4, focus: "Arrays, Two Pointers, BFS/DFS, System Scale" },
  { id: 5, name: "Adobe", tier: "Tier 1", ctc: "24 - 36 LPA", rounds: 4, focus: "Recursion, Linked Lists, Problem Solving" },
  { id: 6, name: "Uber", tier: "Tier 1", ctc: "30 - 46 LPA", rounds: 4, focus: "Low Level Design, Concurrency, Greedy" },
  { id: 7, name: "TCS (Digital)", tier: "National", ctc: "7 - 9 LPA", rounds: 3, focus: "Aptitude, Core Java/C++, Arrays, Basic SQL" },
  { id: 8, name: "Infosys (DSE/SP)", tier: "National", ctc: "6.5 - 9.5 LPA", rounds: 3, focus: "Data Structures, HackWithInfy problems, OOP" }
];

module.exports = (req, res) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET, OPTIONS');
  res.setHeader('Content-Type', 'application/json');

  if (req.method === 'OPTIONS') {
    res.statusCode = 200;
    return res.end();
  }

  res.statusCode = 200;
  res.end(JSON.stringify(companies));
};
