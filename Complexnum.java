

public class Complexnum {
    double real,img ;
    Complexnum(double r,double i)
    {
        this.real=r;
        this.img=i;

    }
    public static Complexnum
    sum(Complexnum c1,Complexnum c2)
    {
        Complexnum temp=new Complexnum(0,0);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;

    
    }
    public static void main(String[] args)
    {
        Complexnum c1=new Complexnum(7.5,6);
        Complexnum c2=new Complexnum(1.2,4.5);
        Complexnum temp=sum(c1,c2);
        System.out.println("SUM IS:"+temp.real+"+"+temp.img+"i");
    }


}
