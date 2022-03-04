package classesandobjects;

import java.util.Scanner;

public class MilkSaller {
int totalMilkQty;
int totalMilkQtySold=0;

float otherExpenses;
float costPrice;
float salePrice;
double totalSale=0;
/*
* constructor
* 1.Name of constructor exactly same as class name
* 2.It never return any kind of value
* 3.No use of void return type
* 4.Automatically called as soon as object created
* 5.More than one constructor can be created for single class
* 6.It can not override
* 7.It can be overloaded
*/
public MilkSaller(int milkQty,float cp,float sp,float otherExpenses) {
totalMilkQty=milkQty;
costPrice=cp;
salePrice=sp;

}
public double sellingMilk(int qty) {
double payment;
if (totalMilkQty>=(totalMilkQtySold+qty)){
totalMilkQtySold=totalMilkQtySold+qty;
payment=((salePrice*qty)+0.5);
totalSale=totalSale+payment;
}else {
payment=0;

}
return(payment);
}
public void infoForCustomer() {
System.out.print("\ntotalMilkQty:"+totalMilkQty);
System.out.print("\ntotalMilkQtySold:"+totalMilkQtySold);
System.out.print("\nsalePrice:"+salePrice);
}

public void infoForShopkeer() {
double profit=0;
double remainingMilkQty;
double priceUsed=0;
System.out.print("\ntotalMilkQty:"+totalMilkQty);
remainingMilkQty=totalMilkQty-totalMilkQtySold;
System.out.print("\nRemaining milk Qty:"+remainingMilkQty);
priceUsed=totalMilkQty*costPrice+otherExpenses;
profit=totalSale-(priceUsed-(remainingMilkQty*costPrice));
System.out.print("\ntotalSale:"+totalSale);
System.out.print("\nprofit:"+profit);
}
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int choice,qty;
MilkSaller ms=new MilkSaller(100,48,52,200);
do {
System.out.print("\n1. Selling Milk");
System.out.print("\n2. Info For Customer");
System.out.print("\n3. Info For Shopkeer");
System.out.print("\n0. Exit");
System.out.print("\nEnter your choice(0-3):");
choice=sc.nextInt();
switch(choice) {
case 1:
System.out.print("\nEnter milk quantity:");
qty=sc.nextInt();
double amout=ms.sellingMilk(qty);
if(amout>0) {
System.out.print("\nPlease pay :"+amout+" for milk");
}else {
System.out.print("\npurchasing milk failed..Required milk greater than remaining");
}
break;
case 2:
ms.infoForCustomer();
break;
case 3:
ms.infoForShopkeer();
break;
case 0:
System.out.print("\nApplication terminated...");
break;
default:
System.err.print("\nInvalid option choosen...");
}

}while(choice!=0);
}
}