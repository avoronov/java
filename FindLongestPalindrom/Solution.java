class Solution {
    public boolean isPalindrom(String s) {
        int len = s.length();

        if (len == 0)
            return false;

        if (len == 1)
            return true; 

        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public String longestPalindrome(String s) {
        int len = s.length();

        if (len == 0)
            return "";

        if (len == 1)
            return s; 

        String maxPalindrom = "";
        for (int i = 0; i < len; i++) {

            if ((len - i) < maxPalindrom.length())
                break;

            for (int j = len; j > i; j--) {
                if ((j - i) <= maxPalindrom.length())
                    break;
                
                String tmp = s.substring(i, j);

                if (isPalindrom(tmp))
                    maxPalindrom = tmp; 
            }
        }

        return maxPalindrom;
    }
}