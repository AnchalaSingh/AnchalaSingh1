import java.util.*;
 public class Project { public static void main(String[] args) { Scanner sc=new Scanner(System.in);
 System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
 String name=sc.nextLine(); String customerId=sc.nextLine(); Bank obj1=new Bank(name,customerId);
 obj1.menu();
 }
 } 

 class Bank{ double bal; double prevTrans; String customerName; String customerId;
 Bank(String customerName,String customerId)
 { 
    this.customerName=customerName;
    this.customerId=customerId;
 }

 }
