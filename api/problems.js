const problems = [
  { id: 1, title: "Two Sum", difficulty: "Easy", tags: ["Arrays", "Hash Table"], creditsReward: 20 },
  { id: 2, title: "Valid Parentheses", difficulty: "Easy", tags: ["Stack", "Strings"], creditsReward: 20 },
  { id: 3, title: "Merge Two Sorted Lists", difficulty: "Easy", tags: ["Linked List"], creditsReward: 20 },
  { id: 4, title: "Best Time to Buy and Sell Stock", difficulty: "Easy", tags: ["Arrays", "Dynamic Programming"], creditsReward: 25 },
  { id: 5, title: "Valid Palindrome", difficulty: "Easy", tags: ["Strings", "Two Pointers"], creditsReward: 20 },
  { id: 6, title: "Invert Binary Tree", difficulty: "Easy", tags: ["Trees", "DFS"], creditsReward: 25 },
  { id: 7, title: "Longest Substring Without Repeating Characters", difficulty: "Medium", tags: ["Sliding Window", "Strings"], creditsReward: 35 },
  { id: 8, title: "Container With Most Water", difficulty: "Medium", tags: ["Two Pointers", "Greedy"], creditsReward: 35 },
  { id: 9, title: "3Sum", difficulty: "Medium", tags: ["Two Pointers", "Sorting"], creditsReward: 40 },
  { id: 10, title: "Group Anagrams", difficulty: "Medium", tags: ["Hash Table", "Strings"], creditsReward: 35 },
  { id: 11, title: "Level Order Traversal", difficulty: "Medium", tags: ["Trees", "BFS"], creditsReward: 35 },
  { id: 12, title: "Product of Array Except Self", difficulty: "Medium", tags: ["Arrays", "Prefix Sum"], creditsReward: 40 },
  { id: 13, title: "Trapping Rain Water", difficulty: "Hard", tags: ["Two Pointers", "Dynamic Programming"], creditsReward: 50 },
  { id: 14, title: "Merge k Sorted Lists", difficulty: "Hard", tags: ["Linked List", "Heap"], creditsReward: 50 },
  { id: 15, title: "Word Ladder", difficulty: "Hard", tags: ["BFS", "Graphs"], creditsReward: 60 }
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
  res.end(JSON.stringify(problems));
};
