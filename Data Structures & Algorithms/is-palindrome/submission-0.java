class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newstr = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                newstr.append(Character.toLowerCase(ch));
            }
        }
        return newstr.toString().equals(newstr.reverse().toString());
    }
}
