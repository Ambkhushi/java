/******************************************************************************
                      LinkedList
*******************************************************************************/
import java.util.*;  
public class LinkedL{  
 public static void main(String args[]){  
  List<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("abc");  
  al.add("Ajay");  
   List<String> ll=new LinkedList<String>();  
           ll.add("Sonoo");  
           ll.add("Hanumat");  
           al.addAll(ll);  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
    al.removeAll(ll);  
              System.out.println("After removing 2nd list: "+al);   
 }  
}  
