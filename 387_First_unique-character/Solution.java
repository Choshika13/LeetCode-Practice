class Solution {

    public int firstUniqChar(String s) {
        
        // create a hash table of size 26
        int[] Table = new int[26];

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            Table[index]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) - 'a';
            if (Table[index] == 1) {
                return i;
            }
        }

        return -1;
        
    }

}