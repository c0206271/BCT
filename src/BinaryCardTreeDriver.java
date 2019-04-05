import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryCardTreeDriver {
    public static void main(String[]arg)
    {
        File myfile = new File("C:\\Users\\khscs078\\Desktop\\BCT\\src\\text.txt");
        String[] file=main2(myfile);
        System.out.println("GREETINGS AND SALUTATIONS\nDO NOT RESIST\nWE ARE COMING");
        for(int x=0; x<file.length; x++)
            System.out.println(""+file[x]);
        boolean ree=true;
        ArrayList<String> hand=new ArrayList<String>();
        ArrayList<String> goals=new ArrayList<String>();
        ArrayList<String> rest=new ArrayList<String>();
        int ct=0;
        int stage=0;
        int sofar=0;
        int end=0;
        boolean nomatch=true;
        BinaryCountNode black=new BinaryCountNode();
        BinaryCountNode blue=new BinaryCountNode();
        BinaryCountNode green=new BinaryCountNode();
        BinaryCountNode orange=new BinaryCountNode();
        BinaryCountNode pink=new BinaryCountNode();
        BinaryCountNode red=new BinaryCountNode();
        BinaryCountNode white=new BinaryCountNode();
        BinaryCountNode wild=new BinaryCountNode();
        BinaryCountNode yellow=new BinaryCountNode();
        BCT bct=new BCT();
        for(int x=0; x<file.length; x++)
        {
            if(ct<1) {
                if(stage==2) {
                    ct = (file.length - sofar);
                    stage++;
                }
                else {
                    ct = Integer.parseInt(file[x]);
                    sofar += ct;
                    stage++;
                }
            }
            else
            {
                if(stage==1) hand.add(file[x]);
                if(stage==2)
                {
                    while(ree=true)
                    {
                        int y=0;
                        if (Character.isDigit(file[x].charAt(0)))
                            end++;
                        else ree=false;
                    }
                    goals.add(file[x].substring(end+1));
                }
                if(stage==3) rest.add(file[x]);
            }
        }
        for(int x=0; x<hand.size(); x++)
        {
            switch(hand.get(x).trim())
            {
                case "black": black.addCards(1); break;
                case "blue": blue.addCards(1); break;
                case "green": green.addCards(1); break;
                case "orange": orange.addCards(1); break;
                case "pink": pink.addCards(1); break;
                case "red": red.addCards(1); break;
                case "white": white.addCards(1); break;
                case "wild": wild.addCards(1); break;
                case "yellow": yellow.addCards(1); break;
            }

        }
        bct.addNode(black);
        bct.addNode(blue);
        bct.addNode(green);
        bct.addNode(orange);
        bct.addNode(pink);
        bct.addNode(red);
        bct.addNode(white);
        bct.addNode(wild);
        bct.addNode(yellow);
        bct.getAllCards();

    }
    public static String[] main2(File f){

        try{

            Scanner sc = new Scanner(f);
            String[] words2 = new String[23];
            String line="";
            int linenum=0;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                System.out.println("");

                words2[linenum]=line;
                linenum++;
            }
            return words2;
        }
        catch(FileNotFoundException ex){
            String[] words2 = new String[9];
            //jjjjj
            return words2;
        }
    }
}
