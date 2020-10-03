/**
 * Class to demonstrate some properties of the while loop
 *
 * @author (FEN)
 * @version (2018-09-13)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ListOfStrings{
    private ArrayList<String> strings;
    
    public ListOfStrings(){
        strings= new ArrayList<>();
    }
    
    public ListOfStrings(int noOfStrings){
        strings= new ArrayList<>();
        //Some code that puts some strings in the list
        int i= 0;
        while(i < noOfStrings){
            strings.add("Word " + (i+1));
            i++;
        }
    }
    
    public void addWord(String newWord){
        strings.add(newWord);
    }
    
    public void printStrings(){
        for(String s : strings){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Done printing strings...");
    }

    public void printStrings2(){
        //use a while loop           
        //Code here:
        int i = 0;
        while(i < strings.size()) {
            String s = strings.get(i);
            System.out.println(s);
            i++;
        }
  
        System.out.println();
        System.out.println("Done printing strings...");
    }
    
    public void printStringsIterator(){
        Iterator<String> it= strings.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
                
        System.out.println();
        System.out.println("Done printing strings...");
    }
   
    public void printStrings3(int n){
        //Print only the n first strings
        //use a while loop
        
        //Code here:
        int i = 0;
        while(i < n) {
            String s = strings.get(i);
            System.out.println(s);
            i++;
        }
        System.out.println();
        System.out.println("Done printing strings...");
    }
    
    public void printStrings4(int firstIncl, int lastExcl){
        //Print only the strings between firstIncl and lastExcl
        //use a while loop
        
        //Code here:
        int i = firstIncl;
        while(i < lastExcl) {
            String s = strings.get(i);
            System.out.println(s);
            i++;
        }
        System.out.println();
        System.out.println("Done printing strings...");
    }
    
    public boolean hasWord(String word){
        //Return true, if word is in strings; otherwise return false
        //use a search pattern (while-loop)
        
        //Code here:
        int i = 0;
        boolean found = false;
        while(i < strings.size() && !found) {
            String s = strings.get(i);
            if(s.equalsIgnoreCase(word)) {
                found = true;
            } else {
                i++;
            }
        }
        return found;//to be changed only to "keep the compiler happy"
    }
}
