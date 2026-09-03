class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        for(char ch : s.toCharArray()){
            m1.put(ch, m1.getOrDefault(ch, 0)+1);
        }

        for(char ch : t.toCharArray()){
            m2.put(ch, m2.getOrDefault(ch, 0) +1);
        }
        return m1.equals(m2);
    }
}
