package AbstractAndInterface2;

public class Train implements Transportation {
    private int charge = 400;

    public int getCharge() {
        return charge;
    }

    public boolean cost(int x, int y){
        return x>=y?true:false;
    }
}
