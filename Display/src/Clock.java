public class Clock {
    //hour，minute是成员变量  diplay是它们的类型，
    //有了new之后才可以真正地说只有制造一个clock对象出来，
    // 才会去制造出两个display的对象
    private display hour=new display(24);
    private display minute=new display(60);

    public void start(){
        while(true){
            minute.increase();
            if(minute.getVlaue()==0) {
                hour.increase();
            }
             System.out.printf("%02d:%02d\n",hour.getVlaue(),minute.getVlaue());
        }
    }
    public static void main(String[] args) {
        Clock clock =new Clock();
        clock.start();
    }
}
