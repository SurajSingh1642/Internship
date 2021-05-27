package Assingment1;




/**
 *
 * @author suraj
 */
public class Time {
    private int hour,min, sec;
    Time(int h,int m,int s)
    {
        hour=h;
        min=m;
        sec=s;
    }
    Time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    public Time add(Time ob)
    {
        //System.out.println(this.hour+": "+this.min+": "+this.sec);
        //System.out.println(ob.hour+": "+ob.min+": "+ob.sec);
        Time t=new Time();
        t.sec=this.sec+ob.sec;
        
        if(t.sec>60)
        {
            t.sec-=60;
            t.min++;
        }
        //System.out.println(t.sec);
        t.min+=this.min+ob.min;
        if(t.min>60)
        {
            t.min-=60;
            t.hour++;
        }
        //System.out.println(t.min);
        t.hour+=this.hour + ob.hour;
        if(t.hour>24)
        {
            t.min-=24;
        }
        //System.out.println(t.hour);
        return t;
    }
    void display(String str)
    {
        System.out.println(str+""+hour+":"+min+":"+sec);
    }
    
    public static void main(String args[])
    {
        Time t1=new Time(5,23,12);
        Time t2=new Time(6,38,50);
        Time t3=t1.add(t2);
        t1.display("Initial Time:");
        t2.display("Added Time:");
        t3.display("Final Time:");
    }
}
