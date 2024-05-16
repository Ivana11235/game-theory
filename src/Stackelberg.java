import java.util.*;
import java.io.*;
public class Stacklberg {
//same production cost c=cl=c; Q=q1+q2; d=a-bq;
    private int q1;
    private int q2;
    private int c;
    //predetermined
    private int a;
    //predetermined
    private int b;
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
        blocs.get(blocNum).get(0).inclination=(blocs.get(blocNum).get(0).inclination+q1)/2;
        int followerSum=0;
        for (int i=1; i<blocs.get(blocNum).size();i++){
            followerSum+=blocs.get(blocNum).get(i).inclination;
        }
        int followerAve=followerSum/(blocs.get(blocNum).size()-1);
        int fNew=(followerAve+q2)/2;
        for (int i=1; i<blocs.get(blocNum).size();i++){
            blocs.get(blocNum).get(i).inclination=(blocs.get(blocNum).get(i).inclination+fNew)/2;
        }



    }

}
