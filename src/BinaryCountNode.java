import java.util.ArrayList;

public class BinaryCountNode {
    int pos;
    int ct;
    String type;
    ArrayList<String> all;
    public BinaryCountNode()
    {
        pos=0;
        ct=0;
        type="";
        all= new ArrayList<String>();
    }
    public BinaryCountNode(String types)
    {
        pos=0;
        ct=0;
        type=types;
        all= new ArrayList<String>();
    }
    public void addCards(int num){
        all.add(""+type);
    }
    public ArrayList<String> removeCards(int num){
        if(num>=all.size()){
            all.clear();
            return all;
        }
        else{
            for(int x=0; x<num; x++)
                all.remove(0);
            return all;
        }

    }
    public String toString()
    {
        return this.type;
    }
    public ArrayList getem()
    {
        return all;
    }

}
