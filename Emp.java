/******************************************************************************

                            object and Class Example

*******************************************************************************/
import java.util.Scanner;
class Employee{
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
    id=i;
    name=n;
    salary=s;
}
void display(){
    System.out.println(id +""+ name +""+ salary);
}
}
public class Emp{
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        e1.insert(01,"Rohan",50000);
        e2.insert(02,"Rani",45000);
        e3.insert(03,"Aman",60000);
        System.out.print("Enter id, name, and Salary");
        int id1=sc.nextInt();
        String name1=sc.next();
        float salary1=sc.nextFloat();
        e4.insert(id1,name1,salary1);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
