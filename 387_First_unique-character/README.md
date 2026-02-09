# 387. First Unique Character in a String

### Problem
Given a string `s` consisting of lowercase English letters, return the index of the first character that does not repeat anywhere else in the string.  
If no such character exists, return `-1`.

### Examples
- Input: `"leetcode"` → Output: `0`
- Input: `"loveleetcode"` → Output: `2`
- Input: `"aabb"` → Output: `-1`

---

### Approach
To solve this efficiently, I simulated a hash map using a fixed-size array instead of using Java’s built-in `HashMap`.

- Since the string only contains lowercase letters (`a`–`z`), an integer array of size 26 is used.
- Each character is mapped to an index using `character - 'a'`.
- The algorithm runs in two passes:
  1. First pass counts the frequency of each character.
  2. Second pass scans the string again to find the first character with a frequency of 1.

This ensures the first non-repeating character is returned while preserving the original order.

---

### Complexity
- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)` (constant size array of 26 elements)

---

### Language
- Java
