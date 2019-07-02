package AbstractAndInterface2;

public class Plane implements Transportation {
    private int charge = 1000;

    public int getCharge() {
        return charge;
    }

    public boolean cost(int x, int y){
        return x>=y?true:false;
    }
}
