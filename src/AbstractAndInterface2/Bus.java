package AbstractAndInterface2;

public class Bus implements Transportation {
    private int charge = 300;

    public int getCharge() {
        return charge;
    }

    public boolean cost(int x, int y){
        return x>=y?true:false;
    }
}
