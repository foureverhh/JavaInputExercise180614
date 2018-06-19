package Nackademin.com;

public class MsHandling {
    public  static double countingZhiShu(double x, int n){
        double res = 1;
        int i = 1;
        if(n >= 0)
            for(; i<=n;i++)
                res = res*x;
        else
            for(;i<=-n;i++)
                res = res/x;
        return res;
    }
}
