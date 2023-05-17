//7. Write a program in C++ to display various type or arithmetic operation using mixed data type. 

public class Mixdata{
  public static void main(String[] args){

int num1=5;
int num2=7;
double num3=3.7;
double num4=8.0;

int sum1=num1+num2;
int sub1=num1-num2;
int mul1=num1*num2;
int div1=num2/num1;

System.out.println("Arithmatic operations of integers:");
System.out.println("Sum:"+sum1);
System.out.println("Subtraction:"+sub1);
System.out.println("Product:"+mul1);
System.out.println("Division:"+div1);

double sum2=num3+num4;
double sub2=num3-num4;
double mul2=num3*num4;
double div2=num4/num3;

System.out.println("Arithmatic operations of double:");
System.out.println("Sum:"+sum2);
System.out.println("Subtraction:"+sub2);
System.out.println("product:"+mul2);
System.out.println("Division:"+div2);


double sum3=num1+num4;
double sub3=num1-num4;
double mul3=num1*num4;
double div3=num1/num4;

System.out.println("Arithmatic operations of mix datypes:");
System.out.println("Sum:"+sum3);
System.out.println("Subtraction:"+sub3);
System.out.println("Product:"+mul3);
System.out.println("Division:"+div3);

  }
}