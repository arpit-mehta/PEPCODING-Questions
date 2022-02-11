import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner scn= new Scanner(System.in);
            String str= scn.next();
            ArrayList<String> ans= getKPC(str);
            System.out.print(ans);
    }

    static String[] codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};     // global code array
    public static ArrayList<String> getKPC(String str) {
         
        //base case
        if(str.length()==0){
            ArrayList<String> blist= new ArrayList<>();
            blist.add("");
            return blist;
        }
      
        char firstchar= str.charAt(0);  //charater at 0th index
        String ros = str.substring(1);  //rest of the string

        ArrayList<String> res = getKPC(ros); //faith

        ArrayList<String> fans= new ArrayList<>();  //final answer arraylist

        String addstr = codes[firstchar - '0'];  //String to be added to res elements  
        for(int i=0;i< addstr.length();i++)
        {
            char toadd = addstr.charAt(i);       //character of that string 
        for(String ans : res)
        {
                fans.add(toadd + ans);
        }
        } 
        return fans;       
    }

}
