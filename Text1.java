import java.util.Scanner;
public class Text1 {
    static void m1() {
        for(int i=0;i<5;i++)
            System.out.println("Welcome to Java");
    }

    static void m2() {
        System.out.println("a  a^2  a^3");
        for(int i=1;i<=4;i++) {
            System.out.println(i+"  "+Math.pow(i,2)+"  "+Math.pow(i,3));
        }
    }

    static void m3() {
        System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
    }
    static void m4() {
        int sum=0;
        for(int i=1;i<=9;i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    static void m5() {
        double PI=1.0;
        int flag=1;
        for(int i=3;i<=11;i+=2) {
            if(flag%2==1){
                PI-=1.0/i;
            }
            else{
                PI+=1.0/i;
            }
            flag++;
        }
        PI*=4;
        flag=1;
        System.out.println(PI);
        PI=1.0;
        for(int i=3;i<=13;i+=2) {
            if(flag%2==1){
                PI-=1.0/i;
            }
            else {
                PI+=1.0/i;
            }
            flag++;
        }
        PI*=4;
        System.out.println(PI);
    }
    static void m6() {
        final double PI=3.14;
        double r=5.5;
        System.out.println(2*r*PI+Math.pow(r,2)*PI);
    }
    static void m7() {
        double speed=14;
        speed/=1.6;
        double s=45*60+30;
        System.out.println(speed/(s/3600));
    }
    static void m8() {
        long num=312032486;
        for(int i=0;i<5;i++) {
            num+=(int)(3600*365*24/7.0);
            num-=(int)(3600*365*24/13.0);
            num+=(int)(3600*365*24/45.0);
            System.out.println(num);
        }
    }
    static void m9() {
        double speed=24;
        speed*=1.6;
        double s=40*60+35+3600;
        System.out.println(speed/(s/3600));
    }
    static void m10() {
        System.out.println("x="+((44.5*0.55-50.2*2.1)/(3.4*0.55-50.2*2.1))+"y="+((3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1)));
    }
    static void m11() {
        Scanner in=new Scanner(System.in);
        double c;
        c=in.nextDouble();
        System.out.println(c+"  "+"Celsius is"+"  "+((9.0/5)*c+32)+"  "+"Fahrenheit");
    }
    static void m12() {
        Scanner in=new Scanner(System.in);
        final double PI=3.14;
        double r,h;
        r=in.nextDouble();
        h=in.nextDouble();
        System.out.println(Math.pow(r,2)*PI+(Math.pow(r,2)*PI*h));
    }
    static void m13() {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        System.out.println(x+" pounds is"+x*0.454+" kilograms");
    }
    static void m14() {
        Scanner in=new Scanner(System.in);
        double price=in.nextDouble();
        double rate=in.nextDouble();
        System.out.println(" The gratuity is "+price*rate/100+" total is "+price*(rate/100+1));
    }
    static void m15() {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int k=0;
        k+=num%10;
        k+=(num%100)/10;
        k+=(num%1000)/100;
        System.out.println("The sum of all digits in "+num+" is "+k);
    }
    static void m16() {
        Scanner in=new Scanner(System.in);
        int min=in.nextInt();
        System.out.println(min+" minutes is approximately "+min/(60*24*365)+" year "+(min/(60*24))%365+" days");
    }
    static void m17() {
        Scanner in=new Scanner(System.in);
        int time=in.nextInt();
        long totalMillisseconds=System.currentTimeMillis();
        long totalSeconds=totalMillisseconds/1000;
        long currentSecond=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long currentMinute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        long currentHour=totalHours%24;
        System.out.println("The current time is"+(currentHour+time)+" : "+currentMinute+" : "+currentSecond);
    }
    static void m18() {
        Scanner in=new Scanner(System.in);
        double v0,v1,time;
        v0=in.nextDouble();
        v1=in.nextDouble();
        time=in.nextDouble();
        System.out.println("a="+((v1-v0)/time));
    }
    static void m19() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double m=in.nextDouble();
        System.out.print("Enter the initial temperature:");
        double t1=in.nextDouble();
        System.out.print("Enter the final temperature:");
        double t2=in.nextDouble();
        System.out.println("The energy needed is"+(m*(t2-t1)*4184));
    }

    static void m20() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter speed and acceleration:");
        double v=in.nextDouble();
        double a=in.nextDouble();
        System.out.println("The minimum runway length for this airplane is "+(Math.pow(v,2)/(2*a)));
    }
    static void m21() {
        Scanner in=new Scanner(System.in);
        double rate=0.05;
        rate/=12;
        final double money=in.nextDouble();
        double sum=0.0;
        for(int i=0;i<6;i++) {
            sum+=money;
            sum*=(1+rate);
        }
        System.out.println(sum);
    }
    static void m22() {
        Scanner in=new Scanner(System.in);
        double weight=in.nextDouble();
        double height=in.nextDouble();
        weight*=0.45359237;
        height*=0.0254;
        System.out.println(weight/Math.pow(height,2));
    }
    static void m23() {
        Scanner in=new Scanner(System.in);
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        double d;
        d=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println(d);
    }
    static void m24() {
        Scanner in=new Scanner(System.in);
        double s=in.nextDouble();
        System.out.println(Math.pow(3,0.5)*3/2*s*s);
    }
    static void m25() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58 and 41");
        double t=in.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour:");
        double v=in.nextDouble();
        System.out.println("The wind chill index is "+(35.74+0.6215*t-35.75*Math.pow(v,0.16)+0.4275*t*Math.pow(v,0.16)));
    }
    static void m26() {
        System.out.println("a     b     pow(a,b)");
        for(int i=1;i<=5;i++)
            System.out.println(i+"     "+(i+1)+"     "+(int)Math.pow(i,i+1));
    }
    static void m27() {
        Scanner in=new Scanner(System.in);
        double[] x=new double[3];
        double[] y=new double[3];
        double[] d=new double[3];
        for(int i=0;i<3;i++)
        {
            x[i]=in.nextDouble();
            y[i]=in.nextDouble();
        }
        d[0]=Math.pow((Math.pow(y[1]-y[0],2)+Math.pow(x[1]-x[0],2)),0.5);
        d[1]=Math.pow((Math.pow(y[2]-y[1],2)+Math.pow(x[2]-x[1],2)),0.5);
        d[2]=Math.pow((Math.pow(y[2]-y[0],2)+Math.pow(x[2]-x[0],2)),0.5);
        double s=d[0]+d[1]+d[2];
        s/=2;
        System.out.println(Math.pow(s*(s-d[0])*(s-d[1])*(s-d[2]),0.5));
    }
    static void m28() {
        Scanner in=new Scanner(System.in);
        double money=in.nextDouble();
        double rate=in.nextDouble();
        System.out.println(money*(3.5/1200));
    }
    static void m29() {
        Scanner in=new Scanner(System.in);
        double money=in.nextDouble();
        double rate=in.nextDouble();
        int years=in.nextInt();
        rate/=100;
        rate/=12;
        years*=12;
        System.out.println(money*Math.pow((1+rate),years));
    }
    static void m30() {
        Scanner in=new Scanner(System.in);
        double lenth=in.nextDouble();
        double speed=in.nextDouble();
        double price=in.nextDouble();
        System.out.println(lenth/speed*price);
    }
    static void m31() {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double r1=Math.pow(Math.pow(b,2)-4*a*c,0.5);
        r1-=b;
        r1/=(2*a);
        double r2=-1*(Math.pow(Math.pow(b,2)-4*a*c,0.5));
        r2-=b;
        r2/=(2*a);
        if(Math.pow(b,2)-4*a*c<0)
            System.out.println("no real answer");
        else if(Math.pow(b,2)-4*a*c>0)
            System.out.println(r1+""+r2);
        else
            System.out.println(r1);
    }
    static void m32() {
        Scanner in=new Scanner(System.in);
        int num1=(int)(System.currentTimeMillis()%10);
        int num2=(int)(System.currentTimeMillis()/7%10);
        int num3=(int)(System.currentTimeMillis()/14%10);
        System.out.println("what is "+num1+"+"+num2+"+"+num3);
        int answer=in.nextInt();
        System.out.println(num1+"+"+num2+"+"+num3+"="+answer);
    }

    static void m33() {
        int mon=1+(int)(Math.random()*12);
        System.out.println(mon);
        switch(mon)
        {
            case 1:System.out.println("January");break;
            case 2:System.out.println("February");break;
            case 3:System.out.println("March");break;
            case 4:System.out.println("April");break;
            case 5:System.out.println("May");break;
            case 6:System.out.println("June");break;
            case 7:System.out.println("July");break;
            case 8:System.out.println("August");break;
            case 9:System.out.println("September");break;
            case 10:System.out.println("October");break;
            case 11:System.out.println("November");break;
            case 12:System.out.println("December");break;
        }
    }
    static void m34() {
        Scanner in=new Scanner(System.in);
        int Today=in.nextInt();
        int After=in.nextInt();
        int x=Today+After;
        x%=7;
        System.out.println(x);
    }
    static void m35() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight =input.nextDouble();
        System.out.println("Enter feet in pounds:");
        double feet =input.nextDouble();
        System.out.println("Enter inches in pounds:");
        double inches =input.nextDouble();
        double BMI=(weight * 0.45359237) /((12*feet+inches)*0.0254)/((12*feet+inches)*0.0254);
        System.out.println("BMI="+BMI);
        if(BMI<18.5)
            System.out.println("underweight");
        else if(BMI<25)
            System.out.println("normal");
        else if(BMI<30)
            System.out.println("overweight");
        else
            System.out.println("obese");
    }

    static void m36() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number:");
        int temp;
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a+" "+b+" "+c);
    }

    static void m37() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        String s1 = input.nextLine();
        int n = 0;
        for (int i = 0 ; i < 9 ; i++) {
            n = i * (s1.charAt(i) - '0') + n;
        }
        int x = n % 11 ;
        if(x == 10 )
            System.out.println(s1+"x");
        else
            System.out.println(s1+x);

    }

    static void m38() {
        Scanner input = new Scanner(System.in);
        int n1 = (int)(Math.random() * 100);
        int n2 = (int)(Math.random() * 100);
        System.out.println("what is "+n1+"+"+n2+"=?");
        System.out.println("please sacnf your answer :");
        int x = input.nextInt();
        int answer = n1 + n2;
        if(answer == x)
            System.out.println("you are correct!");
        else
            System.out.println("the answer is "+answer);
    }
    static void m39() {
        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner input = new Scanner(System.in);
        int x = 0;
        System.out.println("enter a year");
        int year = input.nextInt();
        System.out.println("enter a month");
        int month = input.nextInt();
        if(year % 4 == 0||(year % 100 == 0&&year % 400 == 0))
            x = 1;
        if(month == 2)
            System.out.println(year+"."+ month +" has "+(day[month-1]+x)+" days");
        else
            System.out.println(year+"."+ month +" has "+(day[month-1])+" days");
    }
    static void m40() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number of three");
        int n = input.nextInt();
        int a = n % 10;
        int b = a % 10;
        int c = b % 10;
        if(a == c)
            System.out.println(n+" is a palindrome");
        else
            System.out.println(n+" is not a palindrome");
    }

    static double rate1(double income) {
        double tax = 0;
        if(income <= 8350)
            tax = income*0.1;
        else if( income <= 33950)
            tax = 835 + (income- 8350)*0.15;
        else if( income <= 82250)
            tax = 835 + (33950- 8350)*0.15 + (income - 33950) * 0.25;
        else if( income <= 171550)
            tax = 835 + (33950- 8350)*0.15 + (82250 - 33950) * 0.25 + (income - 88250) * 0.28;
        else if( income <= 372950)
            tax = 835 + (33950- 8350)*0.15 + (82250 - 33950) * 0.25 + (171550 - 88250) * 0.28 + (income - 171550) * 0.33;
        else
            tax = 835 + (33950- 8350)*0.15 + (82250 - 33950) * 0.25 + (171550 - 88250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        return tax ;
    }

    static double rate2(double income) {
        double tax = 0;
        if(income <= 16700)
            tax = income*0.1;
        else if( income <= 67900)
            tax = 1670 + (income- 16700)*0.15;
        else if( income <= 137050)
            tax = 1670 + (67900- 16700)*0.15 + (income - 67900) * 0.25;
        else if( income <= 208850)
            tax =1670 + (67900- 16700)*0.15  + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
        else if( income <= 372950)
            tax = 1670 + (67900- 16700)*0.15  + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
        else
            tax = 1670 + (67900- 16700)*0.15  + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
        return tax ;
    }

    static void m41() {
        Scanner input = new Scanner(System.in);
        System.out.println("choose your status(0-3)");
        int n = input.nextInt();
        System.out.println("enter the taxable income :");
        double income = input.nextDouble();
        double tax = 0;
        switch(n) {
            case 0:
                tax = rate1(income);
                break;
            case 1:
                tax = rate2(income);
                break;
        }
        System.out.println("tax is "+tax);
    }

    static void m42() {
        int i ;
        Scanner input = new Scanner(System.in);
        double x = Math.random();
        if(x > 0.5)
            i = 1;
        else
            i = 0;
        System.out.println("guess the coin :(1 or 0)");
        int answer = input .nextInt();
        if(answer == i)
            System.out.println("you are true");
        else
            System.out.println("you are false");
    }

    static void m43() {
        Scanner input = new Scanner(System.in);
        System.out.println("guess a number");
        int n = input .nextInt();
        int x = 100+(int)(Math.random()*900);
        int[] n1 = new int[3];
        int[] n2 = new int[3];
        n1[0] = x % 10;
        n1[1] = (x / 10) % 10;
        n1[2] = x / 100;
        n2[0] = n % 10;
        n2[1] = (n / 10) % 10;
        n2[2] = n / 100;
        int z = 0;
        for(int i = 0;i < 3; i ++) {
            for(int j = 0;j < 3;j ++)
            {
                if(n1[i] == n2[j] )
                    z = z + 1;
            }
        }
        System.out.println("the number is "+x);
        if(n == x)
            System.out.println("you gets 10000$");
        else if(z % 3 == 0&&z / 3 !=0)
            System.out.println("you gets 3000$");
        else if(z != 0 )
            System.out.println("you gets 1000$");
        else
            System.out.println("you gets zero");
    }

    static void m44() {
        int x = (int)(Math.random()*101) - 50;
        int y = (int)(Math.random()*201) - 100;
        System.out.println("( " + x + " , " + y + " )");
    }

    static void m45() {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor(0) rock(1) paper(2)");
        System.out.println("enter your choose:");
        int n = input .nextInt();
        int x = (int)(Math.random()*4);
        if(x == 0)
            System.out.println("the computer is scissor");
        else if(x == 1)
            System.out.println("the computer is rock");
        else
            System.out.println("the computer is paper");
        if(n == 0)
            System.out.println("you are scissor");
        else if(n == 1)
            System.out.println("you are rock");
        else
            System.out.println("you are paper");
        if(n - x == -1||n - x == 2)
            System.out.println("you lose");
        else if (n - x == 0)
            System.out.println("no winner");
        else
            System.out.println("you win");
    }

    static void m46() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the weight:");
        double w=in.nextDouble();
        double y,r=0;
        if(w>0&&w<=1)
            r=3.5;
        else if(w>1&&w<=3)
            r=5.5;
        else if(w>3&&w<=10)
            r=8.5;
        else if(w>10&&w<=20)
            r=10.5;
        if(r!=0) {
            y=r*w;
            System.out.println(w+"  weight  costs  $"+y);
        }
        else
            System.out.println("the package can not be shipped");
    }

    static void m47() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the three  sides:");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double l;
        if(a<(b+c)&&b<(a+c)&&c<(a+b)) {
            l=a+b+c;
            System.out.println("The circumference of this triangle is : "+ l );
        }
        else
            System.out.println("These input values are illegal !");
    }

    static void m48()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter year:");
        int s=in.nextInt();
        System.out.print("Enter month:");
        int m=in.nextInt();
        System.out.print("Enter the day of the month:");
        int q=in.nextInt();
        int h,j,k;
        String n="\0";

        if(m==1) {
            m=13;
            s--;
        }
        else if(m==2) {
            m=14;
            s--;
        }
        j=Math.abs(s/100);
        k=s%100;
        h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        switch(h) {
            case 0:n=n+"Saturday";
                break;
            case 1:n=n+"Sunday";
                break;
            case 2:n=n+"Monday";
                break;
            case 3:n=n+"Tuseday";
                break;
            case 4:n=n+"Wednesday";
                break;
            case 5:n=n+"Thursday";
                break;
            case 6:n=n+"Friday";
                break;
        }
        System.out.printf("Day of the week is %s\n",n);
    }

    static void m49() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x=in.nextDouble();
        double y=in.nextDouble();
        double s=(x*x+y*y);
        if(s<=100)
            System.out.printf("Point (%.1f,%.1f) is in the circle\n",x,y);
        else
            System.out.printf("Point (%.1f,%.1f) is not in the circle\n",x,y);
    }

    static void m50() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x=in.nextDouble();
        double y=in.nextDouble();
        if(x>=-5&&x<=5&&y>-2.5&&y<=2.5)
            System.out.printf("Point (%.1f,%.1f) is in the rectange",x,y);
        else
            System.out.printf("Point (%.1f,%.1f) is not in the rectange",x,y);
    }

    static void m51() {
        String x="\0",y="\0";
        int a,b;
        a=1 + (int)(Math.random()*13);
        b=1 + (int)(Math.random()*4);
        switch(a) {
            case 1:x=x+"Ace";
                break;
            case 2:x=x+"2";
                break;
            case 3:x=x+"3";
                break;
            case 4:x=x+"4";
                break;
            case 5:x=x+"5";
                break;
            case 6:x=x+"6";
                break;
            case 7:x=x+"7";
                break;
            case 8:x=x+"8";
                break;
            case 9:x=x+"9";
                break;
            case 10:x=x+"10";
                break;
            case 11:x=x+"Jack";
                break;
            case 12:x=x+"Queen";
                break;
            case 13:x=x+"King";
                break;
        }
        switch(b) {
            case 1:y=y+"Clubs";
                break;
            case 2:y=y+"Diamonds";
                break;
            case 3:y=y+"Hearts";
                break;
            case 4:y=y+"Spades";
                break;
        }
        System.out.printf("The card you picked is "+x+" of "+y);
    }

    static void m52() {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter x1,y1,x2,y2,x3,y3,x4,y4 : ");
        double x1 = input.nextDouble(),y1 = input.nextDouble(),x2 = input.nextDouble(),
                y2 = input.nextDouble(),x3 = input.nextDouble(),y3 = input.nextDouble(),
                x4 = input.nextDouble(),y4 = input.nextDouble()  ;
        double t = (y1-y2)*(x4-x3) - (x2-x1)*(y3-y4) ;
        if(t == 0)
            System.out.println("The two lines are parallel .");
        else{
            double pointX = ( ( (y1-y2)*x1-(x1-x2)*y1 ) * (x4-x3) - (x2-x1)*( (y3-y4)*x3 - (x3-x4)*y3 ) ) / t;
            double pointY = ( (y1-y2)*( (y3-y4)*x3 - (x3-x4)*y3 ) - (y3-y4)*( (y1-y2)*x1 - (x1-x2)*y1 ) ) / t;
            System.out.println(" The intersecting point is at ( " + pointX + ", " + pointY);
        }
    }

    static void m53() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter  an integer:");
        boolean a,b,c;
        int x=input.nextInt();
        if(x%5==0&&x%6==0)
            a=true;
        else a=false;
        if(x%5==0||x%6==0)
            b=true;
        else b=false;
        if((x%5==0&&x%6!=0)||(x%5!=0&&x%6==0) )
            c=true;
        else c=false;
        System.out.printf("Is %d  divisible by 5 and 6 ? %b\n",x,a);
        System.out.printf("Is %d  divisible by 5 or 6 ? %b\n",x,b);
        System.out.printf("Is %d  divisible by 5 or 6, but not both ? %b\n",x,c);
    }

    static void m54() {
        Scanner input=new Scanner(System.in);
        double x1,y1,x2,y2,a1,a2,b1,b2;
        System.out.print("Enter r1's center x,y,width ,and height:");
        x1=input.nextDouble();
        y1=input.nextDouble();
        a1=input.nextDouble();
        b1=input.nextDouble();
        System.out.print("Enter r2's center x,y,width ,and height:");
        x2=input.nextDouble();
        y2=input.nextDouble();
        a2=input.nextDouble();
        b2=input.nextDouble();
        if(((y1+b1/2)>=(y2+b2/2))&&((y1-b1/2)<=(y2-b2/2))&&((x1+a1/2)>=(x2+a2/2))&&((x1-a1/2)<=(x2-a2/2)))
            System.out.println("r2 is inside r1");
        else if(((y1-b1/2)>(y2+b2/2))||((y1+b1/2)<(y2-b2/2))||((x1-a1/2)>(x2+a2/2))||((x1+a1/2)<(x2-a2/2))||(((y1+b1/2)<(y2+b2/2))&&((y1-b1/2)>(y2-b2/2))&&((x1+a1/2)<(x2+a2/2))&&((x1-a1/2)>(x2-a2/2))))
            System.out.println("r2 does not overlap  r1");
        else
            System.out.println("r2 overlaps r1");
    }

    static void m55() {
        Scanner input=new Scanner(System.in);
        double x,y,i,r;
        System.out.print("Enter the exchange rate from dollars to RMB:");
        r=input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        i=input.nextDouble();
        if(i==0) {
            System.out.print("Enter the dollar amount:");
            x=input.nextDouble();
            y=r*x;
            System.out.println("$"+x+" is "+y+" Yuan");
        }
        else if(i==1) {
            System.out.print("Enter the RMB amount:");
            x=input.nextDouble();
            y=x/r;
            System.out.println(x+" Yuan is $"+y);
        }
        else
            System.out.println("Incorrect input");
    }

    static void m56() {
        System.out.print("Please enter the title number of your choice");
        Scanner input=new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,r;
        System.out.print("Enter three points for p0,p1, and p2:");
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        x3=input.nextDouble();
        y3=input.nextDouble();
        r=(x2-x1)*(y3-y1)-(x3-x1)*(y2-y1);
        if(r>0)
            System.out.printf("(%.1f,%.1f) is on the left side of the line from (%.1f,%.1f) to  (%.1f,%.1f)\n",x3,y3,x1,y1,x2,y2);
        else if(r==0)
            System.out.printf("(%.1f,%.1f) is on the line from (%.1f,%.1f) to  (%.1f,%.1f)\n",x3,y3,x1,y1,x2,y2);
        else
            System.out.printf("(%.1f,%.1f) is on the right side of the line from (%.1f,%.1f) to  (%.1f,%.1f)\n",x3,y3,x1,y1,x2,y2);

    }
    public static void main(String[] args) {
        m56();
    }

}
