import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//实验2
public class Text2 {
    static Scanner in =new Scanner(System.in);

    static void m1(){
        double x1,x2,y1,y2;
        double r=6371.01;
        System.out.println("请输入第一个点的经纬度坐标");
        x1=Math.toRadians(in.nextDouble());
        y1=Math.toRadians(in.nextDouble());
        System.out.println("请输入第二个点的经纬度坐标");
        x2=Math.toRadians(in.nextDouble());
        y2=Math.toRadians(in.nextDouble());
        System.out.println(r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2))+" km");

    }

    static void m2(){
        int L_num;
        double L;
        System.out.println("请输入正多边形的边数和边长");
        L_num=in.nextInt();
        L=in.nextDouble();
        System.out.println((L_num*Math.pow(L,2))/(4*Math.tan(Math.PI/L_num)));
    }

    static void m3(){
        double c;
        for(int i=0;i<3;i++){
            c=Math.random()*Math.PI;
            System.out.println("( "+(40*Math.cos(c))+","+(40*Math.sin(c))+" )");
        }
    }

    static void m4(){
        int n;
        n=in.nextInt();
        System.out.println((char)(n));
    }

    static void m5(){
        String s;
        s=in.nextLine();
        System.out.println((int)(s.charAt(0)));
    }

    static void m6(){
        System.out.println("请输入 一个十六进制数");
        int[] bin=new int[100];
        String s=in.next();
        int x,n,j=0;
        char ch;
        for(int i=s.length()-1;i>=0;i--){
            switch (s.charAt(i)){
                case 'A':
                    x=10;
                    break;
                case 'B':
                    x=11;
                    break;
                case 'C':
                    x=12;
                    break;
                case 'D':
                    x=13;
                    break;
                case 'E':
                    x=14;
                    break;
                default:
                    x=s.charAt(i)-'0';
                    break;
            }

            while(x!=0){
                bin[j++]=(x%2);
                x/=2;
            }
            if(j%4!=0){
                bin[j++]=0;
            }
        }
        for(int i=j-1;i>=0;i--){
            System.out.print(bin[i]);
        }

    }

    static void m7(){
        System.out.println("请输入一个字母等级");
        String s=in.nextLine();
        Map<Character, String> dict=new HashMap<Character, String>();
        dict.put('A',"4");
        dict.put('B',"3");
        dict.put('C',"2");
        dict.put('D',"1");
        dict.put('F',"0");
        System.out.println(dict.get(s.charAt(0)));


    }

    static void m8(){
        int num;
        System.out.println("请输入一个有效字符");
        String s=in.next().toLowerCase();
        switch(s.charAt(0)){
            case 'a':
            case 'b':
            case 'c':
                num=2;
                break;
            case 'd':
            case 'e':
            case 'f':
                num=3;break;
            case 'g':
            case 'h':
            case 'i':
                num=4;break;
            case 'j':
            case 'k':
            case 'l':
                num=5;break;
            case 'm':
            case 'n':
            case 'o':
                num=6;break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                num=7;break;
            case 't':
            case 'u':
            case 'v':
                num=8;break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                num=9;break;
            default:
                num=-1;
                break;
        }
        if(num!=-1){
            System.out.println(num);
        }
        else{
            System.out.println("无效");
        }
    }

    static void m9(){
        Map<String,Integer> dict=new HashMap<>();
        System.out.println("请输入年份:");
        int year=in.nextInt();
        System.out.println("请输入月份简写:");
        String month=in.next();
        dict.put("Jan",31);
        dict.put("Feb",28);
        dict.put("Mar",31);
        dict.put("Apr",30);
        dict.put("May",31);
        dict.put("Jun",30);
        dict.put("Jul",31);
        dict.put("Aug",31);
        dict.put("Sep",30);
        dict.put("Oct",31);
        dict.put("Nov",30);
        dict.put("Dec",31);
        if(month.equals("Feb")&&((year%400==0)||(year%100==0&&year%4==0))){
            System.out.println(month+" has "+(dict.get(month)+1));
        }
        else{
            System.out.println(month+" has "+dict.get(month));
        }

    }

    static void m10(){
        Scanner in =new Scanner(System.in);
        System.out.println("请输入一个社保号码");
        String[] s=in.next().split("-");
        if(s[0].length()==3&&s[1].length()==2&&s[2].length()==4){
            System.out.println("正确");
        }
        else{
            System.out.println("错误");
        }

    }

    static void m11(){
        Scanner in =new Scanner(System.in);
        System.out.println("输入S1:");
        String s1=in.next();
        System.out.println("输入S2:");
        String s2=in.next();
        if(s1.contains(s2)){
            System.out.println("存在");
        }
        else{
            System.out.println("不存在");
        }
    }

    static void m12(){
        System.out.print("name: ");
        String name=in.next();
        System.out.print("number of hour: ");
        double hour=in.nextDouble();
        System.out.print("hourly pay rate: ");
        double hour_rate=in.nextDouble();
        System.out.print("federal tax withholding rate: ");
        double federal_rate=in.nextDouble();
        System.out.print("state tax withholding rate: ");
        double state_rate=in.nextDouble();
        System.out.print("Employee Name: "+name);
        System.out.println("\nHour Worked: "+hour);
        System.out.println("Pay rate: $"+hour_rate);
        System.out.println("Gross Pay: $"+(hour*hour_rate));
        System.out.println("Deduction:");
        System.out.printf("  Federal withholding: $%.1f\n",hour*hour_rate*federal_rate);
        System.out.printf("  State withholding: $%.2f\n",hour*hour_rate*state_rate);
        System.out.printf("  Total Dedution: $%.2f\n",(hour*hour_rate*(federal_rate+state_rate)));
        System.out.printf("Net Pay: $%.2f\n",(hour*hour_rate*(1-federal_rate-state_rate)));
    }

    static void m13(){
        Scanner in =new Scanner(System.in);
        String temp=null;
        System.out.println("请输入三个城市名称");
        String firstCity=in.nextLine();

        String secondeCity=in.nextLine();

        String thirdCity=in.nextLine();
        if(firstCity.compareTo(secondeCity)>0){
            temp=firstCity;
            firstCity=secondeCity;
            secondeCity=temp;
        }
        if(firstCity.compareTo(thirdCity)>0){
            temp=thirdCity;
            thirdCity=firstCity;
            firstCity=temp;
        }
        if (secondeCity.compareTo(thirdCity)>0){
            temp=thirdCity;
            thirdCity=secondeCity;
            secondeCity=temp;
        }
        System.out.println(firstCity+" "+secondeCity+" "+thirdCity);
    }

    static void m14(){
        char[] c=new char[3];
        int[] n=new int[4];
        int i;
        for(i=0;i<3;i++){
            c[i]=(char)(65+(int)(Math.random()*26));
        }
        for(i=0;i<4;i++){
            n[i]=(int)(Math.random()*10);
        }
        System.out.printf("%c%c%c%d%d%d%d",c[0],c[1],c[2],n[0],n[1],n[2],n[3]);
    }

    static void m15(){
        int i;
        System.out.println("千克               磅");
        for(i=1;i<=199;i++){
            System.out.printf("%-3d               %4.1f\n",i,i*2.2);
        }
    }

    static void m16(){
        System.out.println("英里         千米");
        for(int i=1;i<=10;i++){
            System.out.printf("%-2d           %.3f\n",i,i*1.609);
        }
    }

    static void m17(){
        System.out.println("英里       千米       千米      英里");
        for(int i=1,j=20;i<=10;i++,j+=5){
            System.out.printf("%-2d        %3.3f        %d       %.3f\n",i,i*1.609,j,j*(12.430/20));
        }
    }

    static void m18(){
        System.out.println("请输入学生个数");
        int studentsnum=in.nextInt();
        System.out.println("请输入学生名字及其分数");
        String[] studentName=new String[studentsnum];
        double studentScore,maxScore=0;
        int index=0;
        for(int i=0;i<studentsnum;i++){
            studentName[i]=in.next();
            studentScore=in.nextDouble();
            if (maxScore<studentScore){
                maxScore=studentScore;
                index=i;
            }
        }
        System.out.println(studentName[index]+"最高分 "+maxScore);
    }

    static void m19() {
        System.out.println("请输入学生人数");
        int studentNum = in.nextInt();
        System.out.println("请输入学生名字及其分数");

        String[] stuName = new String[studentNum];
        double fisrtmax = 0, secondmax = 0, score;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < studentNum; i++) {
            stuName[i] = in.next();
            score = in.nextDouble();
            if (score >= fisrtmax) {
                secondmax=fisrtmax;
                fisrtmax = score;
                index2=index1;
                index1 = i;
            }
        }
        System.out.print("第一高分："+stuName[index1]+" "+fisrtmax);
        System.out.print("第二高分: "+stuName[index2]+" "+secondmax);
    }

    static void m20(){
        int i=(int)('!');
        boolean flag=false;
        while(i<(int)('~')){
            for(int j=0;j<10;j++){
                switch (i){
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        flag=true;
                        break;
                    default:
                        flag=false;
                        break;
                }
                System.out.printf("%c",i);
                if(flag){
                    System.out.print(" ");
                    flag=false;
                }
                i++;
            }
            System.out.print("\n");
        }
    }

    static void m21(){
        int x=in.nextInt();
        for(int i=2;i<=x;i++){
            while(x%i==0){
                x=x/i;
                if(x!=1){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i);
                }
            }
        }
    }

    static void m22(){
        for(int i=0;i<8;i++){
            for(int j=0;j<7-i;j++){
                System.out.print("    ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k<=(2*i+1)/2){
                    System.out.printf(" %3d",(int)Math.pow(2,k));
                }
                else{
                    System.out.printf(" %3d",(int)Math.pow(2,(2*i)-k));
                }
            }
            System.out.print("\n");
         }
    }

    static void m23() {
        double all=in.nextDouble();
        int year=in.nextInt();
        double rate=in.nextDouble();
        rate=7.0/100/12;
        double x=(all*rate*Math.pow(1+rate,year*12));
        double x2=Math.pow(1+rate,year*12)-1;
        double Month_Pay=x/x2;
        double Total_Pay=Month_Pay*12;
        double Inter=all*rate;
        double Prin=Month_Pay-Inter;
        double Balance=all;
        System.out.println("Monthly Payment "+Month_Pay);
        System.out.println("Total Payment  "+Total_Pay);
        System.out.println("Payment   Interest  Principal  Balance");
        for(int i=1;i<=year*12;i++) {
            Inter=Balance*rate;
            Prin=Month_Pay-Inter;
            Balance-=Prin;
            System.out.printf("   %d          %.2f         %.2f        %.2f\n",i,Inter,Prin,Balance);
        }
    }

    static void m24(){
        double sum=0;
        for(int i=1;i<=49;i++){
            sum+=(2*(i-1)+1)/(2*i+1.0);
        }
        System.out.println(sum);
    }

    static void m25(){
        double PI=0;
        for(int i=1000;i<100000;i*=2){
            for(int j=1;j<=i;j++){
                PI+=Math.pow(-1, j+1)/(2*j-1);
            }
            System.out.println(4*PI);
            PI=0;
        }
    }

    static void m26(){
        String[] month={"January","February","March","April","May","June","July","August",
                "September","October","November","December"};
        String[] weekend={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] monthlyDays={31,28,31,30,31,30,31,31,30,31,30};
        System.out.println("请输入年份和代表该年第一天是星期几的数字");
        int year=in.nextInt();
        int week_digit=in.nextInt();
        int remainder;
        if(year%400==0||(year%100!=0&&year%4==0)){
            monthlyDays[1]+=1;
        }
        System.out.println(month[0]+" 1, "+year+" is "+weekend[week_digit]);
        for(int i=0;i<11;i++){
            remainder=monthlyDays[i]%7;
            if(remainder+week_digit>6){
                week_digit=remainder+week_digit-7;
            }
            else {
                week_digit+=remainder;
            }
            System.out.println(month[i+1]+" 1, "+year+" is "+weekend[week_digit]);
        }

    }

    static void m27(){
        String[] month={"January","February","March","April","May","June","July","August",
                "September","October","November","December"};
        String[] weekend={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] monthlyDays={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("请输入年份和代表该年第一天是星期几的数字");
        int year=in.nextInt();
        int week_digit=in.nextInt();
        int remainder,n;
        if(year%400==0||(year%100!=0&&year%4==0)){
            monthlyDays[1]+=1;
        }

        for(int i=0;i<12;i++){
            n=week_digit;
            System.out.printf("          %s %d           \n",month[i],year);
            System.out.println("---------------------------------");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            for(int j=0;j<week_digit;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=monthlyDays[i];k++){
                if(n<=6){
                    System.out.printf("%2d  ",k);
                    n++;
                }
                else{
                    System.out.print("\n");
                    n=0;
                    k--;
                }
            }
            System.out.print("\n\n");
            remainder=monthlyDays[i]%7;
            if(remainder+week_digit>6){
                week_digit=remainder+week_digit-7;
            }
            else {
                week_digit+=remainder;
            }
        }
    }

    static void m28(){
        int sum=0;
        for(int i=6;i<10000;i++){
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i)
                System.out.println(i);
            sum=0;
        }
    }

    static void m29(){
        int n,x,computerCount=0,userCount=0;
        System.out.println("scissor(0) rock(1) paper(2)");
        while(computerCount<=1&&userCount<=1) {
            System.out.print("Enter your choose:");
            n = in.nextInt();
            x = (int) (Math.random() * 4);
            if (n - x == -1 || n - x == 2){
                computerCount++;
                System.out.println("computer win");
            }
            else if (n - x == 0)
                System.out.println("no winner");
            else{
                userCount++;
                System.out.println("user win");
            }
        }
    }

    static void m30(){
        System.out.println("请输入一个十进制数");
        int n=in.nextInt(),i=0;
        int[] sum=new int[100];
        while(n!=0){
            sum[i++]=n%8;
            n=n/8;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(sum[j]);
        }
        System.out.println("(8)");
    }

    static void m31(){
        int i;
        for(i=10000;;i++){
            if(i*0.12>=25300)
                break;
        }
        System.out.println(i);
    }

    static void m32(){
        int positivenumber=0,negative=0;
        for(int i=0;i<1000000;i++){
            if(Math.random()>0.5){
                positivenumber++;
            }
            else {
                negative++;
            }
        }
        System.out.println(positivenumber+"  "+negative);
    }

    static void m33(){
        int number;
        int max=0,count=0;
        System.out.print("Enter numbers: ");
        while(true){
            number=in.nextInt();
            if(number==0)break;

            if(number>max){
                max=number;
                count=1;
            }
            else if(number==max){
                count++;
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The occurrence count of the largest number is "+count);
    }

    static void m34(){
        double[] numbers=new double[10];
        double average,variance,sum=0,squares_sum=0;
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++){
            numbers[i]=in.nextDouble();
            sum+=numbers[i];
            squares_sum+=numbers[i]*numbers[i];
        }
        average=sum/10;
        variance=Math.pow((squares_sum-sum*sum/10)/9,0.5);
        System.out.println("The mean is "+average);
        System.out.println("The standard deviation is "+variance);
    }

    static void m35(){
        System.out.print("Enter the first 12 digits os an ISBM-13 as a string");
        String digits=in.next();
        int flag,sum=0,d;
        if(digits.length()<12){
            System.out.println(digits+" is invalid input");
            System.exit(0);
        }
        for(int i=0;i<12;i++){
            if((i&1)==0){
                sum+=(int)digits.charAt(i);
            }
            else {
                sum+=3*(int)digits.charAt(i);
            }
        }
        if((d=10-sum%10)==10){
            System.out.println("The ISBM-13 number is "+digits+0);
        }
        else
            System.out.println("The ISBM-13 is "+digits+d);
    }

    static void m36(){
        int length=0;
        System.out.print("Enter the first string:");
        String s1=in.nextLine();
        System.out.print("Enter the second string: ");
        String s2=in.nextLine();
        for(int i=0;s1.charAt(i)!='\n'&&s2.charAt(i)!='\n';i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            else {
                length++;
            }
        }
        if(length==0){
            System.out.println(s1+" and "+s2+"have no commen prefix");
        }
        else {
            System.out.println("The commen prefix is "+s1.substring(0,length));
        }
    }

    public static void main(String[] args) {
        m3();
    }
}
