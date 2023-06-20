class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String subString = my_string.substring(0, s);

        int index = s + overwrite_string.length();

        for(int i = 0; i < overwrite_string.length(); i += 1 ) {
            subString += overwrite_string.charAt(i);
        }

        if(s + overwrite_string.length() < my_string.length()) {
            String temp = my_string.substring(index);
            subString += temp;
        }

        return subString;
    }
}
