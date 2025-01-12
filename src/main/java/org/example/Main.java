package org.example;

public class Main {//class name and file name should be same
    //starting point of the Java program
    public static void main(String[] args) {

       //Arithmetic Operators
        int a=7,b=13;
        int result=a+b;//10
//        System.out.println("a+b= "+result);
////                            7 + 3 = 10
//        System.out.println(a+"+"+b+"= "+result);//7+3= 10
//        result=a-b;
//        System.out.println(a+"-"+b+"= "+result);
//        result=a*b;
//        System.out.println(a+"*"+b+"= "+result);//7+3= 10
//        result=a/b;
//        System.out.println(a+"/"+b+"= "+result);//7+3= 10
//        result=a%b;
//        System.out.println(a+"%"+b+"= "+result);//7+3= 10
//        System.out.println(11%3);//2

        //to comment more than one line select the line and press ctrl+/ press the same to uncomment
        //relational operator true false
//        System.out.println(a+">"+b+"= "+(a>b));//true
//        System.out.println(a+">="+b+"= "+(a>=b));//true
//        System.out.println(a+"<"+b+"= "+(a<b));//true
//        System.out.println(a+"<="+b+"= "+(a<=b));//true
//        System.out.println(a+"=="+b+"= "+(a==b));//true
//        System.out.println(a+"!="+b+"= "+(a!=b));//true

//        passmark above 50
//            mark>50 pass
        //logical Operator(and &&, or ||,not !)
        //a=7 b=3
        int c=12;
//        7>3 && 7>12=false
//        System.out.println((a>b)&&(a>c));//7>3 && 7>12 = true && false= false
//        System.out.println((a>b)||(a>c));//7>3 || 7>12 = true || false= true
//        System.out.println(!((a>b)||(a>c)));//!(7>3 || 7>12) = true || false= false


        //Bitwise operator
//        System.out.println(~7);//negative of the next -8
//        System.out.println(7<<1);//negative of the next -8
//        System.out.println(7>>1);//negative of the next -8

        //unary operator +,-,++,--
        //a=7 b=3
//        System.out.println(a++);//7 ++ will be done after printing current 'a' value 8
//        System.out.println("incremented a value "+a);
//        System.out.println(b--);//3 -- will be done after printing current 'b' value 2
//        System.out.println("Decrement b value "+b);
//
//        //Assignment
//        int num2=20;
////        num2=num2+10;
//        num2+=10;//num2=20+10=20; num2=30
//        System.out.println(num2);//30
//        num2-=5;//30-5
//        System.out.println(num2);//25
//        num2*=2;//25*2=50
//        System.out.println(num2);

        //ternary operator
        //a=7 b=3
        result=a>b?a:b;//if the condition is true the value after the question will be result otherwise the value after the colon is the result
        System.out.println(result);












    }
}