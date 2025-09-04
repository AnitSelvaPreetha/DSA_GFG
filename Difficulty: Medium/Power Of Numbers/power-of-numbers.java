class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int temp=n;
        
       if(n<10)
       {
           return (int)Math.pow(n,n);
           }
       else
       {
           while(n>0)
           {
               rev=rev*10+(n%10);
               n=n/10;
           }
           return (int)Math.pow(temp,rev);
       }
        
    }
}
