class Solution{
    static int evenlyDivides(int N){
        // code here
        int count=0;
        int temp=N;
        while(N!=0){
            int d = N%10;
            if(d!=0 && temp%d==0){
                count++;
            }
            N=N/10;
        }
        return count;
    }
}