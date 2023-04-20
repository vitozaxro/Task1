import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        //1.1 Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
/*
        double z,a,b,c;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter a");
        a=in.nextDouble();
        System.out.println("Enter b");
        b=in.nextDouble();
        System.out.println("Enter c");
        c=in.nextDouble();

        z=((a-3)*b/2)+c;

        System.out.println("z= "+z);
*/

        //1.2 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     /*   double z,a,b,c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a");
        a=in.nextDouble();
        System.out.println("Enter b");
        b=in.nextDouble();
        System.out.println("Enter c");
        c=in.nextDouble();

        z=(b+sqrt((pow(b,2)+4*a*c)))/(2*a)-(pow(a,3)*c+pow(b,-2));

        System.out.println("z= "+z);
*/

        //1.3 Вычислить значение выражения по формуле (все переменные принимают действительные значения
        /*
        double x,y,res;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        x=in.nextDouble();
        System.out.println("Enter y");
        y=in.nextDouble();
        res=((sin(x)+cos(y))/(cos(x)-sin(y)))*(tan(x*y));

        System.out.println("Result is= "+res);
*/
//1.4 Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
        /*
        double  a=111.222;
        int c,b;
        c= (int) a;
        b= (int) (a*1000%1000);
        System.out.println(c+" "+b);

*/

        //1.5 Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        //ННч ММмин SSc.
/*
        int T=64000;
        System.out.println("Hours "+(T/3600.)+" Minutes "+ (T/60.)+" Seconds "+T);

*/
        //1.6 Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
      /*  int x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        x=in.nextInt();
        System.out.println("Enter y");
        y=in.nextInt();

        if(x>=-4 && x<=4 && y<=0 && y>=-3 || x>=-2 && x<=2 && y>=0 && y<=4){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
*/

    /*
      2.1 Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

      int A,B,C;
        Scanner in = new Scanner(System.in);
        System.out.println("A = ");
        A=in.nextInt();
        System.out.println("B = ");
        B=in.nextInt();
            if(A+B<180)
            {
                System.out.println("Exists");
                if(A+B==90 || A==90 || B==90) {
                    System.out.println("Has a right angle");
                }
                else {
                    System.out.println("Has no right angle");
                }
                }
            else {
                System.out.println("Does not exist");
            }
*/
        // 2.2 Найти max{min(a, b), min(c, d)}.
      /*
        int a,b,c,d;
        Scanner in = new Scanner(System.in);

        a=in.nextInt();

        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

*/


//2.3 Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 /*
        int x1, y1, x2, y2, x3, y3;
        Scanner in = new Scanner(System.in);
        System.out.println("enter x1");
        x1=in.nextInt();
        System.out.println("enter y1");
        y1=in.nextInt();
        System.out.println("enter x2");
        x2=in.nextInt();
        System.out.println("enter y2");
        y2=in.nextInt();
        System.out.println("enter x3");
        x3=in.nextInt();
        System.out.println("enter y3");
        y3=in.nextInt();


        if((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0){

            System.out.println("dots located on the same line");
        }

    else {

            System.out.println("dots not located on the same line");
        }

*/
        //2.4 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
     /*   int a, b, z, x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a");
        a=in.nextInt();
        System.out.println("Enter b");
        b=in.nextInt();
        System.out.println("Enter x");
        x=in.nextInt();
        System.out.println("Enter y");
        y=in.nextInt();
        System.out.println("Enter z");
        z=in.nextInt();


        if (x<=a && y<=b || x<=b && y<=a || x<=a && z<=b || x<=b && z<=a || y<=a && z<=b || y<=b && z<=a)
        {
            System.out.println("YES, it fit");
        }
        else
        {
            System.out.println("no, it dose not fit");
        }


*/
        //2.5 Вычислить значение функции:
        /*
    double x;
        Scanner in = new Scanner(System.in);
        x=in.nextDouble();
        if(x<=3){
            System.out.println(pow(x,2)-(3*x)+9);
        }
        else {
            System.out.println(1/(pow(x,3)+6));
        }
*/
        // 3.1 Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
            /*
        int a , sum = 0;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
    if(a>0){
        for (int i = 0; i < a; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    else {
        System.out.println("a is negative or 0");
    }

*/

        //3.2 Вычислить значения функции на отрезке [а,b] c шагом h:
        /*
        Scanner scanner = new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double h=scanner.nextDouble();



        for (double i = a; i <=b ; i+=h) {
            if (i>2){
                System.out.println(i);
            }
            else {
                System.out.println("-"+i);

            }

        }

         */


        //3.3 Найти сумму квадратов первых ста чисел.
    /*
        int sum=0;
        for (int i = 1; i <101 ; i++) {
            sum+=pow(i,2);
        }
        System.out.println(sum);

*/
        //3.4 Составить программу нахождения произведения квадратов первых двухсот чисел.

/*
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
           */
      /*
      3.5 Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
        int e;
        double  sum=0;
        Scanner in = new Scanner(System.in);
        e=in.nextInt();

        for (int i = 1; i<e; i++) {

            sum+=( 1/(pow(2,i))+(1/pow(3,i)) );
        }
        System.out.println(sum);


       */
//3.6 Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
        /*
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
*/

        //3.7 Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        //m и n вводятся с клавиатуры.
    /* int m,n;
        Scanner in = new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        for (int i = m; i <=n ; i++) {
            for (int j = m+1; j <=n-1 ; j++) {
                if(i%j==0 && i!=j){
                    System.out.println("for "+i+" "+j+ " divider");
                }
            }
        }
*/
        //3.8 Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
      /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        System.out.println("Digits that are included in the number a: " + numberEnter(a));
        System.out.println("Digits that are included in the number b: " + numberEnter(b));


       */
    }
    /*public static ArrayList numberEnter(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
*/


    }



