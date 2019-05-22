import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//实验3
public class Text3 {
    static Scanner in =new Scanner(System.in);

    static void m1(){
        System.out.println("Enter the password: ");
        String password=in.next();
        int count=0,i;
        if(password.length()<8){
            System.out.println("Invalid Password");
        }
        else {
            for(i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i))){
                    count++;
                }
                if(count>=2&&Character.isLetter(password.charAt(i))){
                    System.out.println("Valid Password");
                    return;
                }
            }
            if(i==password.length())
                System.out.println("Invalid Password");
        }
    }

    static double sqrt(long n){
        double nextGuess;
        double lastGuess = Math.random()*10;
        while(true){
            nextGuess=(lastGuess+n/lastGuess)/2;
            if(Math.abs(nextGuess-lastGuess)<0.0001){
                return nextGuess;
            }
            else {
                lastGuess=nextGuess;
            }
        }
    }

    static boolean isPrime(int n){
        int i;
        for(i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    static void m3(){
        int i=0,n,k=0,m=0;
        int count=0;
        for(i=13;;i++){
            if(isPrime(i)){
                n=i;
                while (n!=0){
                    m=m*10;
                    m+=n%10;
                    n/=10;
                }
                if(isPrime(m)){
                    System.out.print(i+" ");
                    if(k++>10){
                        System.out.print("\n");
                        k=0;
                    }
                    count++;
                }
                if(count==100){
                    break;
                }
                m=0;
            }
        }
    }

    static void m4(){
        System.out.println("P          2^P-1");
        System.out.println("----------------");
        for(int p=2;p<=31;p++){
            if(isPrime((int)Math.pow(2,p)-1)){
                System.out.printf("%-2d           %d\n",p,(int)Math.pow(2,p)-1);
            }
        }
    }

    static void m5(){
        int craps1,craps2,sum=0;
        boolean f=false;
        while(true){
            craps1=1+(int)(Math.random()*6);
            craps2=1+(int)(Math.random()*6);
            if(sum==craps1+craps2){
                System.out.println("You rolled "+craps1+" + "+craps2+" = "+sum);
                System.out.println("You win");
                break;
            }
            switch (sum=craps1+craps2){
                case 2:
                case 3:
                case 12:
                    System.out.println("You rolled "+craps1+" + "+craps2+" = "+sum);
                    System.out.println("You lose");
                    return;
                case 7:
                    if(f){
                        System.out.println("You rolled "+craps1+" + "+craps2+" = "+sum);
                        System.out.println("You lose");
                        return;
                    }
                case 11:
                    System.out.println("You rolled "+craps1+" + "+craps2+" = "+sum);
                    System.out.println("You win");
                    return;
                default:
                    System.out.println("You rolled "+craps1+" + "+craps2+" = "+sum);
                    System.out.println("point is "+sum);
                    f=true;
                    break;
            }

        }
    }

    static void m6(){
        System.out.println("Enter a credit number as a long integer:");
        String cardNo=in.next();
        int i,j;
        int[] cardNoArr = new int[cardNo.length()];
        for ( i = 0; i < cardNo.length(); i++) {
            cardNoArr[i] = Integer.valueOf(String.valueOf(cardNo.charAt(i)));
        }
        for ( i = cardNoArr.length - 2; i >= 0; i -= 2) {
            cardNoArr[i] <<= 1;
            cardNoArr[i] = cardNoArr[i] / 10 + cardNoArr[i] % 10;
        }
        int sum = 0;
        for ( i = 0; i < cardNoArr.length; i++) {
            sum += cardNoArr[i];
        }
        if(sum % 10 == 0){
            System.out.println(cardNo+" is valid");
        }
        else
            System.out.println(cardNo+" is invalid");
    }

    static void m7(){
        int n,j,k=0,i=0;
        System.out.print("Enter ten numbers:");
        int[] m=new int[10];
        while(i++<10){
            n=in.nextInt();
            for(j=0;j<k;j++){
                if(n==m[j])
                    break;
            }
            if(j==k)
                m[k++]=n;
        }
        System.out.print("The distinct are :");
        for(i=0;i<k;i++){
            System.out.print(m[i]+" ");
        }
    }

    static void m8(){
        int n,i=0;
        int[] counts=new int[10];
        while(i++<100){
            n=(int)(Math.random()*10);
            counts[n]++;
        }
        for(i=0;i<10;i++){
            System.out.printf("%d    %d\n",i,counts[i]);
        }
    }

    static int getRandom(int... numbers){
        int n=1+(int)(Math.random()*54);
        for(int i=0;i<numbers.length;i++){
            if(n==numbers[i]){
                n=1+(int)(Math.random()*54);
                i=-1;
            }
        }
        return n;
    }

    static int[] eliminateDuplicates(int[] list){
        int k=0,j;
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            for(j=0;j<k;j++){
                if(list[i]==arr[j]){
                    break;
                }
            }
            if(j==k){
                arr[k++]=list[i];
            }
        }
        return arr;
    }
    static void m10(){
        System.out.print("Enter ten numbers:");
        int[] list=new int[10];
        for(int i=0;i<10;i++){
            list[i]=in.nextInt();
        }
        list=eliminateDuplicates(list);
        for(int x:list){
            System.out.print(x+" ");
        }

    }

    static boolean isSorted(int[] list){
        for(int i=0;i<list.length-1;i++){
            if(list[i]>list[i+1]){
                return false;
            }
        }
        return true;
    }

    static void m11(){
        System.out.print("Enter list: ");
        int n=in.nextInt();
        int[] list=new int[n];
        for(int i=0;i<n;i++){
            list[i]=in.nextInt();
        }
        if(isSorted(list))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
    }

    static void m12(){
        System.out.print("Enter the number of balls to drop:");
        int ballsNumber=in.nextInt();
        System.out.print("Enter the number of slots in the bean machine:");
        int slotsNumber=in.nextInt();
        int count=0,maxcount=0;
        int[] slots=new int[slotsNumber];
        while(ballsNumber-->0){
            for(int i=0;i<slotsNumber-1;i++){
                if(Math.random()>0.5){
                    System.out.print("R");
                    count++;
                }
                else
                    System.out.print("L");
            }
            if(count>maxcount)
                maxcount=count;
            slots[count]++;
            count=0;
            System.out.print("\n");
        }
        //模拟现实豆机槽与球的摆放
        int[][] slotsView=new int[maxcount][slotsNumber];
        for(int i=0;i<slotsNumber;i++){
            for(int k=0,j=maxcount-1;k<slots[i];k++,j--){
                slotsView[j][i]=1;
            }
        }
        for(int i=0;i<maxcount;i++){
            for(int j=0;j<slotsNumber;j++){
                if(slotsView[i][j]==0)
                    System.out.print(" ");
                else
                    System.out.print("0");
            }
            System.out.print("\n");
        }
    }

    /*static void m13(){
        int[][] Checkerboard=new int[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){

            }
        }
    }*/

    static void m14(){
        boolean[] cabinet=new boolean[100];
        for(int i=0;i<100;i++){
            for(int j=i;j<100;j+=(i+1)){
                cabinet[i]=!cabinet[j];
            }
        }
        for(int i=0;i<100;i++){
            if(cabinet[i])
                System.out.print(i+" ");
        }
    }

    static void m15(){
        int[] count=new int[4];
        int poker;
        while(true){
            poker=1+(int)(Math.random()*52);
            if(poker<=13)
                count[0]++;
            else if(poker<=26)
                count[1]++;
            else if(poker<=39)
                count[2]++;
            else
                count[3]++;
            if(count[0]>0&&count[1]>0&&count[2]>0&&count[3]>0){
                System.out.print("Numbwe of picks: "+(count[0]+count[1]+count[2]+count[3]));
                break;
            }
        }
    }

    static boolean equals(int[] list1,int[] list2){
        if(list1.length==list2.length){
            for(int i=0;i<list1.length;i++){
                if(list1[i]!=list2[i])
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    static void m16(){
        System.out.print("Enter list1:");
        int n=in.nextInt();
        int[] list1=new int[n];
        for(int i=0;i<n;i++){
            list1[i]=in.nextInt();
        }
        System.out.print("Enter list2: ");
        n=in.nextInt();
        int[] list2=new int[n];
        for(int i=0;i<n;i++){
            list2[i]=in.nextInt();
        }
        if(equals(list1,list2))
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");
    }

    static void m17(){
        System.out.print("Enter ten numbers:");
        int i,j;
        int[] list=new int[10];
        for( i=0;i<10;i++){
            list[i]=in.nextInt();
        }
        for( i=0;i<10;i++){
            for( j=i;j<10;j++){
                System.out.printf("(%d,%d)\n",list[i],list[j]);
            }
        }
    }

    static void m18(){
        int i,j,k,p,count=0;
		for(i=0;i<49;i++){
			for(j=i+1;j<50;j++){
				for(k=j+1;k<51;k++){
					for(p=k+1;p<52;p++){
						if(i%13+j%13+k%13+p%13==20){
							count++;
						}
						
					}
				}
			}
		}
		System.out.println(count);
    }

    static boolean isConsecutiveFour(int[] values){
        int i,j;
        for( i=0;i<values.length;i++){
            for(j=0;j<4;j++){
                if(values[i]!=values[j]){
                    i=j;
                    break;
                }
            }
            if (j==4)
                return true;
        }
        return false;
    }
    static void m19(){
        int n;
        boolean f=false;
        System.out.print("Enter the number of values:");
        n=in.nextInt();
        int[] list1=new int[n];

        System.out.print("Enter the values:");
        for(int i=0;i<n;i++){
            list1[i]=in.nextInt();
        }
        if(isConsecutiveFour(list1))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");

    }

    static int partion(int[] list){
        int i=1,j= list.length-1,index=0;
        int q=0,p=j;
        int[] newlist=new int[j+1];
        while(i<j){
            if(list[i]>=list[index] && list[j]>=list[index]){
                newlist[p--]=list[j--];
                newlist[p--]=list[i++];
            }
            else if(list[i]<=list[index]&&list[j]<=list[index]){
                newlist[q++]=list[i++];
                newlist[q++]=list[j--];
            }
            else if(list[i]>=list[index]&&list[j]<=list[index]){
                newlist[p--]=list[i++];
                newlist[q++]=list[j--];
            }
            else {
                newlist[p--]=list[j--];
                newlist[q++]=list[i++];
            }
        }
        newlist[(q+p)/2]=list[index];
        for(i=0;i<newlist.length;i++){
            System.out.print(newlist[i]+" ");
        }
        System.out.print("\n");
        return (q+p)/2;
    }
    static void m20(){
        int n,i;
        System.out.print("Enter a list:");
        n=in.nextInt();
        int[] list=new int[n];
        for(i=0;i<n;i++){
            list[i]=in.nextInt();
        }
        System.out.print(partion(list));
    }


    static String sort(String s){
        char[] str=s.toCharArray();
        char temp,ch;
        int i,j,f;
        for( i=0;i<s.length()-1;i++){
            ch=str[i];
            f=i;
            for( j=i+1;j<s.length();j++){
                if(ch>str[j]){
                    f=j;
                }
            }
            if(i!=j){
                temp=str[i];
                str[i]=str[f];
                str[f]=temp;
            }
        }
        return new String(str);
    }
    static void m21(){
        String s=in.nextLine();
        System.out.println(sort(s));
    }

    static boolean find_wordindex(int index,int limit,int[] list){
       for(int i=0;i<limit;i++){
           if(list[i]==index)
               return true;
       }
       return false;
   }
    static void m22(){
        String[] word={"world","hello"};
        int count=0,j=0,p=0,i;
        String guessWord;
        while(true){
            int[] index=new int[word[j].length()];
            for(i=0;i<word[j].length();i++) {
                System.out.print("(Guess)Enter a letter in word ");
                for(int k=0;k<word[j].length();k++){
                    if(find_wordindex(k,p,index)){
                        System.out.print(word[j].charAt(k));
                    }
                    else
                        System.out.print("*");
                }
                System.out.print(" >");
                guessWord=in.next();
                index[p++]=word[j].indexOf(guessWord.charAt(0));
                if(index[p-1]==-1){
                    count++;
                    p--;
                    i--;
                }
            }
            System.out.print("The word is program. You miss "+count+" time\n");
            System.out.print("Do you want sto guess another word? Enter y or n >");
            if(in.next().equals("n"))
                break;
            j++;
            p=0;
            count=0;
        }
    }

    static double sumColumn(double[][] m,int columnIndex){
        int i;
        double sum=0;
        for(i=0;i<3;i++){
            sum+=m[i][columnIndex];
        }
        return sum;
    }
    static void m23(){
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] m=new double[3][4];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                m[i][j]=in.nextDouble();
            }
        }
        for(i=0;i<4;i++){
            System.out.println("Sum of the elements at column "+i+" is "+sumColumn(m,i));
        }
    }

    static double sumMajorDiagonal(double[][] m){
        int i;
        double sum=0;
        for(i=0;i<4;i++){
            sum+=m[i][i];
        }
        return sum;
    }
    static void m24(){
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] m=new double[4][4];
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                m[i][j]=in.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the mahor diagonal is "+sumMajorDiagonal(m));
    }

    static void m25(){
        		double[][] employeeWorkTime={{2,4,3,4,5,8,8},
									{7,3,4,3,3,4,4},
									{3,3,4,3,3,2,2},
									{9,3,4,7,3,4,1},
									{3,5,4,3,6,3,8},
									{3,4,4,6,3,4,4},
									{6,3,5,9,2,7,9}};
		int i,j,f;
		double[][] totalTime=new double[7][2];
		double temp;
		for(i=0;i<7;i++){
			for(j=0;j<7;j++){
				totalTime[i][0]=i;
				totalTime[i][1]+=employeeWorkTime[i][j];
			}
		}
		for(i=0;i<6;i++){
			f=i;
			for(j=i+1;j<7;j++){
				if(totalTime[f][1]<totalTime[j][1]){
					f=j;
				}
			}
			if(f!=i){
				for(j=0;j<2;j++){
					temp=totalTime[i][j];
					totalTime[i][j]=totalTime[f][j];
					totalTime[f][j]=temp;
				}
				
			}
			System.out.println("Employee "+(int)totalTime[i][0]+" "+totalTime[i][1]);
		}
		System.out.println("Employee "+(int)totalTime[6][0]+" "+totalTime[6][1]);
    }

    static double[][] addMatrix(double[][] a,double[][] b){
        double[][] sumAB=new double[a.length][b.length];
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                sumAB[i][j]=a[i][j]+b[i][j];
            }
        }
        return sumAB;
    }

    static void m26(){
        int i,j;
        double[][] a=new double[3][3];
        double[][] b=new double[3][3];
        double[][] c;
        System.out.print("Enter matrix1: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=in.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=in.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows:");
        c=addMatrix(a,b);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            if(i!=1)
                System.out.print("      ");
            else
                System.out.print("  =   ");
            for(j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            if(i!=1)
                System.out.print("      ");
            else
                System.out.print("  +   ");

            for(j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }

    }

    static void m29(){
        int k=0,i,j,p,q,n=0,m=0;
        boolean turn=false;
        int[] count=new int[4];
        int[][] xy=new int[9][2];
        char[] play=new char[2];
        System.out.print("请输入X或者O作为自己的标志：");
        play[0]=in.next().charAt(0);
        play[1]=(play[0]=='X'?'O':'X');
        for(p=0;p<3;p++){
            System.out.println("----------------");
            System.out.println("|    |    |    |");
        }
        System.out.println("----------------");
        while(true){
            for(q=0;q<2;q++){
                System.out.print("Enter a row (0,1,or 2) for player "+play[q]+" :");
                xy[k][0]=in.nextInt();
                System.out.print("Enter a colum(0,1 or 2) for player "+play[q]+" :");
                xy[k++][1]=in.nextInt();
                for(i=0;i<3;i++){
                    System.out.println("----------------");
                    for(j=0;j<3;j++) {
                        for(n=0;n<k;n++){
                            if(i==xy[n][0]&&j==xy[n][1]){
                                turn=true;
                                break;
                            }
                        }
                        if(turn){
                            System.out.printf("| %c  ",play[n&1]);
                            turn=false;
                        }
                        else{
                            System.out.print("|    ");
                        }
                    }
                    System.out.println("|");
                }
                System.out.println("----------------");
                if(k>4){
                    for(p=q,j=0;p<k;p+=2,j++) {
                        if (xy[p][0] == j&&xy[p][1]==0) {
                            count[0]++;
                        }
                        if (xy[p][0] == 0&&xy[p][1]==j) {
                            count[1]++;
                        }
                        if (xy[p][0] == j&&xy[p][1]==j){
                            count[2]++;
                        }

                        if(xy[p][0] == j&&xy[p][1]==2-j){
                            count[3]++;
                        }
                    }
                    for(p=0;p<3;p++){
                        if(count[p]==3){
                            System.out.println(play[n%1]+" player win");
                            return;
                        }
                        count[p]=0;
                    }
                }
            }
            if(k==9){
                System.out.println("No winner");
                break;
            }
        }
    }

    static void m30(){
        int[] bin=new int[9];
        System.out.print("Enter a number between 0 and 511: ");
        int number=in.nextInt();
        int j=0,i,k=0,f=1;
        while(number!=0){
            bin[k++]=number%2;
            number/=2;
        }
        for(j=9;j>k;j--){
            System.out.print("H ");
            if(f++%3==0)
                System.out.print("\n");
        }
        for(i=1;i<=j;i++){
            if(bin[--k]==0)
                System.out.print("H ");
            else
                System.out.print("T ");
            if(f++%3==0)
                System.out.print("\n");
        }
    }

    static void m31(){
        System.out.print("Enter the size for the matrix: ");
        int matrixLength=in.nextInt();
        int[][] matrix=new int[matrixLength][matrixLength];
        int i,j;
        for(i=0;i<matrixLength;i++){
            for(j=0;j<matrixLength;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        for(i=0;i<matrixLength;i++){
            for(j=0;j<matrixLength;j++){

            }
        }

    }
    public static void main(String[] args) {

       m30();
       //System.out.println(getRandom(1,5,7,9,18,48));  m9()
        /*
        m10()
        System.out.print("Enter ten numbers:");
        int[] list=new int[10];
        for(int i=0;i<10;i++){
            list[i]=in.nextInt();
        }
        eliminateDuplicates(list);*/

        /*
        m11()
        System.out.print("Enter list:");
        int n=in.nextInt();
        int[] list=new int[n];
        int k=0;
        while(k<n){
            list[k++]=in.nextInt();
        }
        if(isSorted(list))
            System.out.println("The list is sorted");
        else
            System.out.println("The list is not sorted");
        */

    }
}
