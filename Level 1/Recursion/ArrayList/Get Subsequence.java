//first of all understand the difference between subsequence and substring
//get- to return the ans in an arraylist 
//store the first character for each call as you have to add that character in the first each time
//have faith that the call will bring the rets of the subsequence in an array list
/*
base case will be when an empty call is made with no rest of the string left so it will return an array list with 1 empty subsequence as an empty string also has
1 subsequence[""]
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         String str = scn.next();
         ArrayList<String> ans = gss(str);
         System.out.print(ans);   
    }
    
    //abc-> [---,--c,-b-,-bc,a--,a-b,ab-,abc] expectation
    //bc -> [--,-b,b-,bc] faith 
    //base -> till string becomes empty
    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }


        char firstchar= str.charAt(0);  //0th character
        String ros = str.substring(1);  //rest of the string

        //faith
        ArrayList<String> rans= gss(ros); 

        //in rans first save add is it and then add the first character and save in fans
        ArrayList<String> fans= new ArrayList<>();
        for(String res: rans){
            fans.add(""+ res);
        }
        for(String res: rans){
            fans.add(firstchar + res);
        }
        return fans;
    }

}
