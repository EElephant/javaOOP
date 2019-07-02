package AbstractAndInterface2;

public class DrivingSelf implements Transportation {
    private int charge = 500;

    public int getCharge() {
        return charge;
    }

    public boolean cost(int x, int y){
        return x>=y?true:false;
    }
}
