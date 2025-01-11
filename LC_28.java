public class LC_28 {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(n<m)return 0;
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i, i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
