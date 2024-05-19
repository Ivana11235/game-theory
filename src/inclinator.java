import java.util.*;
import java.io.*;

public class inclinator {




    public ArrayList<Nation> nations;
     

    private ArrayList<String> cs=new ArrayList<String>(){{
       ArrayList<String> cs;
       add("cyber");
       add("internet");}};
    private ArrayList<String> hr=new ArrayList<String>(){{

        add("human rights");
        add("humanitarian");
        add("refugee");
    }};
    private ArrayList<String> wr=new ArrayList<String>(){{

       add("women");
       add("female");
    }};
    private ArrayList<String> g=new ArrayList<String>(){{
        //ArrayList<String> g=new ArrayList<>();
        add("gender");}};;

    private ArrayList<String> e=new ArrayList<String>(){{

        add("environment");
        add("emission");
        add("climate");
    }};

    private ArrayList<String> o=new ArrayList<String>(){{

        add("charter");
    }};

    private ArrayList<String> me=new ArrayList<String>(){{

        add("Gaza");
        add("Syria");
        add("Middle East");
    }};

    private HashMap<String, ArrayList<String>> key=new HashMap (){{

        put("cs",cs);
        put("hr",hr);
        put("wr",wr);
        put("g",g);
        put("e",e);
        put("o",o);
        put("me",me);
    }};

    

    public void inclinate(String keyword) throws FileNotFoundException {



        int fileCount=0;
        File[] fileArray=new File("un").listFiles();

        for(File f: fileArray){
            ArrayList list =key.get(keyword);
            boolean checkFile=false;
            Scanner s=new Scanner(f);
            System.out.println(s.nextLine());
            for(int i=0;i<10;i++){
                String line=s.nextLine();

                for (Object word: list){
                    if (line.contains(word.toString())){
                        checkFile=true;
                    }
                }}
            if (checkFile){
                fileCount+=1;
                while (s.hasNextLine()){
                    String line=s.nextLine();
                    for (Nation n:nations){
                        if (line.contains(n.abbr)&&line.contains("dY")){
                            n.inclination+=1;
                        } else if (line.contains(n.abbr)&&line.contains("dA")) {
                            n.inclination+=0.5;}
                    }
                }
            }s.close();
        }
        for (Nation n: nations){
            n.inclination/=fileCount;
            System.out.println(n.getName()+" "+n.inclination);
        }

}}
