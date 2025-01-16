import java.util.*;
public class seat3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("****Exam Seating Arrangement****");
        System.out.println("------------------------------------------");
        
        System.out.println("Enter no.of class roooms");

        int Classrooms=sc.nextInt();

        int numofseats[]=new int[Classrooms];
//seat input
     for (int i=0;i<Classrooms;i++){
        System.out.println("no of seat in classrooms"+(i+1)+":");
 numofseats[i]=sc.nextInt();
//  totalseats+=numofseats[i];
    }
System.out.println("----------------------------------------------");
int sum=0;
    //seatoutput
    for(int i=0;i<Classrooms;i++){
       System.out.println("no.of student in class room="+(i+1));
        for(int j=1;j<=numofseats[i];j++){
            System.out.print("student"+j+"\t");
           //sum+=numofseats[i]; 
        }
       System.out.println();
    
    sum+=numofseats[i]; 
    
    }
    System.out.println("--------------------------------------------");
    System.out.println("Total present student ="+sum);  

    System.out.println("Enter Total no.of student in School/CAollege ");
    int totalstudent=sc.nextInt();
   int notgiveexam;
   notgiveexam=totalstudent-sum;
   System.out.println("Total absent student="+notgiveexam);
}  
}
