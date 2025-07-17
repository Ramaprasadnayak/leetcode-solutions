class Solution {
    public boolean isPalindrome(int x){
        int n=x,rem,num=0;
        if(x<0) return false;
        while(n!=0){
            rem=n%10;
            n/=10;
            num=num*10+rem;
        }
        return num==x;
    }
}