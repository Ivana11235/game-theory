import java.util.*;
import java.io.*;
public class Stacklberg {
//same production cost c=cl=c; Q=q1+q2; d=a-bq;
    private int q1;
    private int q2;
    private int c=1;
    //predetermined
    private int a=1;
    //predetermined
    private int b=1;
    //predetermined

    ArrayList<ArrayList<Nation>> blocs=new ArrayList<ArrayList<Nation>>();


    //revenue=(a-b(q1+q2)-c)q1
    //scale q from 1-10; change will be applied to inclination
    //quantity: inclination
    //demand: appeal
    //cost: promises
    //revenue: estimated gains
    //through rounds of discussion, each nation modifies their inclination according to the estimates gain of the resolutions

    public void startStacklberg(int blocNum){
        q1=(a-c)/2/b;
        q2=(a-c)/4/b;
        //leader
        double lpb=blocs.get(blocNum).get(0).inclination;
        double lpab=q1/lpb;
        if (lpab >1){
            lpab=(q1+lpb)/2;
        }
        blocs.get(blocNum).get(0).inclination=lpab;

       //follower
        int followerSum=0;
        for (int i=1; i<blocs.get(blocNum).size();i++){
            followerSum+=blocs.get(blocNum).get(i).getInclination();
        }
        double fpb= (double) followerSum /(blocs.get(blocNum).size()-1);
        for (int i=1; i<blocs.get(blocNum).size();i++){
            double fpab=q2/fpb;
            if(fpab>1){
                fpab=(q2+fpb)/2;
            }
            blocs.get(blocNum).get(i).inclination=fpab;
        }



    }

}


    }

}
