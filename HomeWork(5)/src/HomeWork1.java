public class HomeWork1 {
    private int count;
    private int limmit;
    public  HomeWork1(int limmit){
        count=1;
        this.limmit=limmit;
    }

    public void click(){
        if (count<2)
        count++;
    }

    public void reset(){
        count=1;
    }

    public void undo(){
        if (count>0)
            count--;
    }

    public void setLimmit(int limmit){
       this.limmit=limmit;
    }
    public int getCount(){
        return count;
    }
}
