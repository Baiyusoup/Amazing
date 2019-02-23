public class display {
    //两个成员
    private int vlaue=0;
    private int limit=0;

    public display(int limit){
        this.limit=limit;
    }
    public void increase() {
        vlaue++;
        if (vlaue == limit) {
            vlaue = 0;
        }
    }
    public int getVlaue(){
        return vlaue;
    }
    public static void main(String[] args) {
        display d=new display(24);
        for(;;){
            d.increase();
            System.out.println(d.getVlaue());
        }
    }
}
