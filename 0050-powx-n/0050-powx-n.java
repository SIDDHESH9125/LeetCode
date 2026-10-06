class Solution {
    public double sqr(double x, int n){
        if(n==0) return 1;
        double temp= sqr(x, n/2);
        temp*=temp;
        if(n%2 != 0) temp*=x;
        return temp;
    }

    public double myPow(double x, int n) {
    if(n<0){
        long val =(long) n;
        double ans = sqr(x,(int) -val);
        return 1.0/ans;
    }
    return sqr(x,n);
    }
}