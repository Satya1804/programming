import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String number;
        private String description;
        private int quantity;
        private double price;
        public Invoice(String number,String description,int quantity,double price){
            this.number=number;
            this.description=description;
            this.quantity=quantity;
            this.price=price;
        }
        //Define parameterized constructor here
        
       // Setters
       public void setNumber(String n){number=n;}
       public void setDescription(String d){description=d;}
       public void setQuantity(int q){quantity=q;}
       public void setPrice(double p){price=p;}

       // Getters
       public String getNumber(){return number;}
       public String getDescription(){return description;}
       public int getQuantity(){return quantity;}
       public double getPrice(){return price;}
       

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                if(quantity<0){quantity=0;}
                if(price<0){price=0.0;}
                invoiceAmount=quantity*price;
                return invoiceAmount;
       }
}
public class Expt_1{
         public static void main(String []args){
                   Invoice myInvoice=new Invoice("1","monitor",2,548.00);
                   //Write your code here
                   myInvoice.setNumber("1");
                   myInvoice.setDescription("monitor");
                   myInvoice.setQuantity(2);
                   myInvoice.setPrice(548.00);
                   System.out.println(myInvoice.getInvoiceAmount());
         }
}
