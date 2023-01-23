package FirstLab;

public class Task11 {
    public String longestPalindrome(String str){
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++){
            int len1 = expandFromCenter(str, i, i);
            int len2 = expandFromCenter(str, i, i+1);
            int len  = Math.max(len1, len2);

            if (len > end - start){
                start = (int) Math.ceil(i-(len-1)/2.0);
                end  = (int) Math.floor(i + (len/2.0));
            }
        }

        return str.substring(start, end+1);
    }
    public static int expandFromCenter(String s, int left, int right){
        while ((left >= 0) && (right < s.length()) && (s.charAt(left) == s.charAt(right))){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
