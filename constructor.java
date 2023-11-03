/******************************************************************************

                            constructor Example

*******************************************************************************/
class student{
    int id;
    String name;
    int age;
    student(int i,String n){ //parametrized constr..
     id=i;
     name=n;
    }
    student(int i,String n,int a){
      id=i;
     name=n;  
     age=a;
    }
    student(student s){
        id=s.id;
        name=s.name;
        age=s.age;
    }
    void display(){
       System.out.println(id+""+name+""+age);
    }
}
public class constructor{
    public static void main(String[]args){
        student s3=new student(01,"Ankit");
        s3.display();
        student s1=new student(02,"Sidharth",27);
        s1.display();
        student s2=new student(s1);
        s2.display();
    }
}