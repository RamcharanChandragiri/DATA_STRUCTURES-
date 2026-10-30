class Solution {
    public int calculateScore(int a, int b) {
        String ab=Integer.toBinaryString(a);
        String bb=Integer.toBinaryString(b);
        char[] arr1 = ab.toCharArray();
        char[] arr2 = bb.toCharArray();
        int s1=0;
        int s2=0;
        int score =0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=='1') s1++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]=='1') s2++;
        }
        if(s1>=s2) score= s1*s2;
        else score = s2/s1;


        return score;
    }
}