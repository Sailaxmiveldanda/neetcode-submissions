class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int right = 0;
        int len = 0;
        int maxfreq = 0;
        for(right=0; right < s.length(); right++){
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxfreq = Math.max(maxfreq, freq[ch - 'A']);

            while((right - left + 1) - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            len = Math.max(len , right - left +1);
        }
        return len;
    }
}
