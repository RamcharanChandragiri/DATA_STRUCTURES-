class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> al= new Stack<>();
        int i=1;
        int j=0;
        while(j<target.length){
            if(i==target[j]){
                al.push("Push");
                i++;
                j++;
            }
            else{
                al.push("Push");
                al.push("Pop");
                i++;
            }
        }
        return al;
    }
}