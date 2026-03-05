class Solution {
    public int minOperations(String s) {
        int swz=0;
        int swo=0;
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(i%2==0){
                if(current!='0')swz++;
                if(current!='1')swo++;
            }
            else{
                if(current!='1')swz++;
                if(current!='0')swo++;
            }
        }
        return Math.min(swz,swo);
    }
}