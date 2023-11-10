/******************************************************************************
                               TreeSet
*******************************************************************************/
import java.util.*;    
class Tree{    
 public static void main(String args[]){    
 TreeSet<Integer> set=new TreeSet<Integer>();    
         set.add(24);    
         set.add(66);    
         set.add(12);    
         set.add(15);    
          Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
             System.out.println("Lowest Value: "+set.pollFirst());    
             System.out.println("Highest Value: "+set.pollLast());  
             System.out.println("Initial Set: "+set); 
 }  
}  
