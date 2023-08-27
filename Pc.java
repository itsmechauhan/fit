
import java.util.*;
public class Pc{
    public static void main(String[] args){
        System.out.println("enter any choice: \n 1.Add new student details\n  2.check SGPA \n 3.Check CGPA \n 4.Book issued from library");
        Scanner ac=new Scanner(System.in);
        int choice=ac.nextInt();
        if(choice == 1) {
            System.out.print("enter student name:");
            ac.nextLine();
            String name = ac.nextLine();
            System.out.print("enter student roll no: ");
            int rno = ac.nextInt();
            System.out.print("enter adhaar no: ");
            int adno = ac.nextInt();
            System.out.print("enter course name:");
            ac.nextLine();
            String cname = ac.nextLine();
            System.out.println("enter collage name: ");
            String collagename = ac.nextLine();
            System.out.println("enter high school percentage: ");
            int marks12 = ac.nextInt();

            if(marks12>0 && marks12 <100){
            System.out.println("new user registed sucessfully !!");}
            else{
                System.out.println("please enter correct details !!\n try again");
            }

        }
        if(choice==2){

                System.out.print("enter the marks of sub1: ");
                int sub1=ac.nextInt();
                System.out.print("enter the marks of sub2: ");
                int sub2=ac.nextInt();
                System.out.print("enter the marks of sub3: ");
                int sub3=ac.nextInt();
                System.out.print("enter the marks of sub4: ");
                int sub4=ac.nextInt();
                System.out.print("enter the marks of sub5: ");
                int sub5=ac.nextInt();
                int total= sub1+sub2+sub3+sub4+sub5;
                int percent=total/5;
                Float sgpa= (float) (percent/9.5);
                System.out.println("your sgpa : "+sgpa);


            }
            if(choice==3){
                System.out.print("enter Sgpa of first sem :");
                Float sgpa1=ac.nextFloat();
                System.out.print("enter the sgpa of sem2 :");
                Float sgpa2= ac.nextFloat();
                Float cgpa=(sgpa1+sgpa2)/2;
                System.out.print("cgpa ="+cgpa);
            }
            if(choice==4){
                System.out.print("enter the serial no of book");
                int bok=ac.nextInt();
                System.out.print("enter the current month in numbers: ");

                int num=ac.nextInt();
                System.out.println("your book has been issued successfully!!");
                num+=1;
                System.out.println("note:- last date for returning book is 30 "+num+" 2023");
            }
        }



    }


