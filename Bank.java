/*Project 1- Bank Management System(21-11-2022)
Create a Bank Management System( Console based mini project). */


import java.util.*;
class Admin
{
 private String accno;
 private String name;
 private long balance;
 Scanner sc1=new Scanner(System.in);
 //method to open an account
 void openAccount()
 {
     System.out.println("Enter Account Number");
     accno=sc1.nextLine(); 
     System.out.println("Enter Account Name");
     name=sc1.nextLine(); 
     System.out.println("Enter balance:");
     balance=sc1.nextLong();
     
 }
 
//account details
void accdetails()
{
 System.out.println(" ");   
 System.out.println("show the account holder name"+name);
 System.out.println("show the account number"+accno);
 System.out.println("show balance"+balance);
}
//method to deposit
void deposit()
{
    System.out.println(" "); 
    System.out.println("Enter the amount to deposit");
    long amt=sc1.nextLong();
    balance=balance+amt;
}
//method to withdraw
void withdraw()
{
   System.out.println("Enter the amount to withdraw");
   long amt=sc1.nextLong();
   if(balance >= amt)
     {
       balance=balance-amt;
       System.out.println("amount withdrawn successfully");
    }
   else
      {
      System.out.println("insufficient amount");
      }
}
//method to search an account number
boolean search(String accountno)
{
    if(accno.equals(accountno))
    {
        accdetails();
        return true;}
        return(false);
    }
}
public class Bank
{
public static void main(String args[])
{
   Scanner sc1=new Scanner(System.in);
   //create initial account
    System.out.println("How many customers you need:");
    int n=sc1.nextInt();
    Admin C[]=new Admin[n];
    for(int i=0;i<C.length;i++)//01234
    {
    C[i]=new Admin();//c[0],c[1],c[2],c[3],c[4]
    C[i].openAccount();//accno,name,balance
    }

     int ch;
     do{
    System.out.println("main menu\n1.display\n2.show user\n3.deposit\n4.withdraw\n5.exit");
    System.out.println("enter a choice from given:");
    ch=sc1.nextInt();
    switch(ch)
    {
        case 1:
        for(int i=0;i<C.length;i++)
        {
            C[i].accdetails();
        }
        break;
        case 2:
            System.out.println("enter account that you want to search:");
            String accountno=sc1.next();
            boolean found=false;
            for(int i=0;i<C.length;i++)
            {
                found=C[i].search(accountno);
                if(found)
                {
                    break;
                }
                }
                if(!found)
                System.out.println("account is not found:");

            break;
        case 3:
             System.out.println(" enter acc number:");
             accountno=sc1.next();
             found=false;
             for(int i=0;i<C.length;i++)
             {
                 found=C[i].search(accountno);
                 if(found)
                 {
                   C[i].deposit();
                   break;
                 }
             }
                 if(!found)
                 {
                  System.out.println("account not found:");   
                 }
                 break;
        case 4:
              System.out.println(" enter acc number:");
             accountno=sc1.next();
             found=false;
             for(int i=0;i<C.length;i++)
             {
                 found=C[i].search(accountno);
                 if(found)
                 {
                   C[i].withdraw();
                   break;
                 }
             }
                 if(!found)
                 {
                  System.out.println("account not found:");   
                 }
                 break;
        case 5:
                  System.out.println("Good Byeeee........!!!!!");
                  break;
            
    }
    }while(ch!=5);

}  
}


/*output
How many customers you need:                                                    
2                                                                               
Enter Account Number                                                            
1234                                                                            
Enter Account Name                                                              
chandu                                                                          
Enter balance:                                                                  
10000                                                                           
Enter Account Number                                                            
2219                                                                            
Enter Account Name                                                              
prabhas                                                                         
Enter balance:                                                                  
10000                                                                           
main menu                                                                       
1.display                                                                       
2.show user                                                                     
3.deposit                                                                       
4.withdraw                                                                      
5.exit                                                                          
enter a choice from given:                                                      
1                                      
show the account holder namechandu                                              
show the account number1234                                                     
show balance10000                                                               
                                                                                
show the account holder nameprabhas                                             
show the account number2219                                                     
show balance10000                                                               
main menu                                                                       
1.display                                                                       
2.show user                                                                     
3.deposit                                                                       
4.withdraw                                                                      
5.exit                                                                          
enter a choice from given:                                                      
3                                                                               
 enter acc number:                                                              
1234                                                                            
                                                                                
show the account holder namechandu                                              
show the account number1234                                                     
show balance10000                                                               
                                                                                
show the account holder nameprabhas                                             
show the account number2219                                                     
show balance10000                                                               
main menu                                                                       
1.display                                                                       
2.show user                                                                     
3.deposit                                                                       
4.withdraw                                                                      
5.exit                                                                          
enter a choice from given:                                                      
3                                                                               
 enter acc number:                                                              
1234                                                                            
                                                                                
show the account holder namechandu                                              
show the account number1234                                                     
show balance10000
Enter the amount to deposit                                                     
5000                                                                            
main menu                                                                       
1.display                                                                       
2.show user                                                                     
3.deposit                                                                       
4.withdraw                                                                      
5.exit                                                                          
enter a choice from given:                                                      
1                                                                               
                                                                                
show the account holder namechandu                                              
show the account number1234                                                     
show balance15000                                                               
                                                                                
show the account holder nameprabhas                                             
show the account number2219                                                     
show balance10000 */
