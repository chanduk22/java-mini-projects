/*Project 2- Team based projects (23-11-2022)
create a project for Pharmacy Management syatem.*/


import java.util.Scanner;
class Management
{
    private String id;
    private String name;
    private int age;
    private String  disease;
    Scanner sc=new Scanner(System.in);
    //To create membership
    void details()
    {
        System.out.println("-------✌️PATIENT DETAILS✌️------");
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter name of the disease:");
        disease=sc.next();
        
    }
    //METHOD TO DISPLAY THE PATIENT DETAILS
    void showdetails()
    {
        System.out.println("------DETAILS OF THE PATIENT------- ");
        System.out.println("PATIENT NAME :  "+name);
          System.out.println("PATIENT DISEASE :  "+disease);
    }
    //METHOD TO HEADACHE
    void headache()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("--🤕HEADACHE MEDICINES ");
        if(age<=20)
        {
             System.out.println("Saridon");
              System.out.println("Vicks");
               System.out.println("MIGREST");
        }
        else
        {
             System.out.println("DOLO 650");
              System.out.println("DART");
               System.out.println("NAPROXEN");
        }
       
    }
   //METHOD TO COUGH
    void cough()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("--🤧COUGH & COLD MEDICINES");
        if(age<=20)
        {
             System.out.println("COUGH RELIEF");
              System.out.println("COFSILS");
               System.out.println("CHESTON_COLD");
        }
        else
        {
             System.out.println("CETRIZNE");
              System.out.println("DOLOCOLD");
               System.out.println("SNEEZY");
        }
       
    } 
     void fever()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("🤒FEVER MEDICINES");
        if(age<=20)
        {
             System.out.println("PARACETOMOl");
              System.out.println("ASPRIN");
               System.out.println("PAINTRIEF");
        }
        else
        {
             System.out.println("SIRIDON");
              System.out.println("ADVIL");
               System.out.println("CALPOL-650");
        }
       
    } 
     void stomachache()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("-😫STOMACHACHE MEDICINES-");
        if(age<=20)
        {
             System.out.println("SPASMONIL");
              System.out.println("BUSCOGOST");
             
        }
        else
        {
             System.out.println("OMEPRAZOLE");
              System.out.println("IMODIUM");
               System.out.println("DIGESTOMAX");
        }
       
    } 
     void muscleache()
    {
        System.out.println("-💪MUSCLEACHE MEDICINES");
        if(age<=20)
        {
             System.out.println("ACYLOFEN");
              System.out.println("AYUNAC");
               System.out.println("LIGATONE");
        }
        else
        {
             System.out.println("CROCIN");
              System.out.println("CRAMPNIL");
               System.out.println("PAIN RELEIF");
        }
       
    } 
}
public class Project
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         Management p=new Management();
         System.out.println("---------❤️❤️❤️PHARMACY MANAGEMENT SYSTEM-❤️❤️❤️------*");
         System.out.println("😊Please enter your details😊");
         p.details();
        int ch;
        do
        {
            System.out.println("Main menu😊\n 1.show details \n 2.Headache🤕 \n 3.cough&cold🤧 \n 4.Fever 🤒 \n 5.Stomachache 😫 \n6.muscleache😒 \n 7.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    p.showdetails();
                    break;
                case 2:
                    p.headache();
                    break;
                case 3:
                    p.cough();
                    break;
                case 4:
                    p.fever();
                    break;
                case 5:
                    p.stomachache();
                    break;
                case 6:
                    p.muscleache();
                    break;
                case 7:
                    System.out.println("good bye");
            }
        }while(ch!=8);
    }
}


/* Output
import java.util.Scanner;
class Management
{
    private String id;
    private String name;
    private int age;
    private String  disease;
    Scanner sc=new Scanner(System.in);
    //To create membership
    void details()
    {
        System.out.println("-------✌️PATIENT DETAILS✌️------");
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter name of the disease:");
        disease=sc.next();
        
    }
    //METHOD TO DISPLAY THE PATIENT DETAILS
    void showdetails()
    {
        System.out.println("------DETAILS OF THE PATIENT------- ");
        System.out.println("PATIENT NAME :  "+name);
          System.out.println("PATIENT DISEASE :  "+disease);
    }
    //METHOD TO HEADACHE
    void headache()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("--🤕HEADACHE MEDICINES ");
        if(age<=20)
        {
             System.out.println("Saridon");
              System.out.println("Vicks");
               System.out.println("MIGREST");
        }
        else
        {
             System.out.println("DOLO 650");
              System.out.println("DART");
               System.out.println("NAPROXEN");
        }
       
    }
   //METHOD TO COUGH
    void cough()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("--🤧COUGH & COLD MEDICINES");
        if(age<=20)
        {
             System.out.println("COUGH RELIEF");
              System.out.println("COFSILS");
               System.out.println("CHESTON_COLD");
        }
        else
        {
             System.out.println("CETRIZNE");
              System.out.println("DOLOCOLD");
               System.out.println("SNEEZY");
        }
       
    } 
     void fever()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("🤒FEVER MEDICINES");
        if(age<=20)
        {
             System.out.println("PARACETOMOl");
              System.out.println("ASPRIN");
               System.out.println("PAINTRIEF");
        }
        else
        {
             System.out.println("SIRIDON");
              System.out.println("ADVIL");
               System.out.println("CALPOL-650");
        }
       
    } 
     void stomachache()
    {
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("-😫STOMACHACHE MEDICINES-");
        if(age<=20)
        {
             System.out.println("SPASMONIL");
              System.out.println("BUSCOGOST");
             
        }
        else
        {
             System.out.println("OMEPRAZOLE");
              System.out.println("IMODIUM");
               System.out.println("DIGESTOMAX");
        }
       
    } 
     void muscleache()
    {
        System.out.println("-💪MUSCLEACHE MEDICINES");
        if(age<=20)
        {
             System.out.println("ACYLOFEN");
              System.out.println("AYUNAC");
               System.out.println("LIGATONE");
        }
        else
        {
             System.out.println("CROCIN");
              System.out.println("CRAMPNIL");
               System.out.println("PAIN RELEIF");
        }
       
    } 
}
public class Project
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         Management p=new Management();
         System.out.println("---------❤️❤️❤️PHARMACY MANAGEMENT SYSTEM-❤️❤️❤️------*");
         System.out.println("😊Please enter your details😊");
         p.details();
        int ch;
        do
        {
            System.out.println("Main menu😊\n 1.show details \n 2.Headache🤕 \n 3.cough&cold🤧 \n 4.Fever 🤒 \n 5.Stomachache 😫 \n6.muscleache😒 \n 7.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    p.showdetails();
                    break;
                case 2:
                    p.headache();
                    break;
                case 3:
                    p.cough();
                    break;
                case 4:
                    p.fever();
                    break;
                case 5:
                    p.stomachache();
                    break;
                case 6:
                    p.muscleache();
                    break;
                case 7:
                    System.out.println("good bye");
            }
        }while(ch!=8);
    }
}
