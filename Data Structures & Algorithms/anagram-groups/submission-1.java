class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            // int[] freq = new int[26];
            // for(char ch : str.toCharArray()){
            //     freq[ch - 'a']++;
            // }
            // String key = Arrays.toString(freq);
            // map.putIfAbsent(key,new ArrayList<>());;
            // map.get(key).add(str);
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
