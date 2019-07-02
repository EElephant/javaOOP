package AbstractAndInterface;

public class Test {
    public static void main(String[] args) {
        Rooster rooster = new Rooster();
        Hen hen = new Hen();
        Chick chick = new Chick();

        for (int x=0;x<20;x++){
            for (int y=0;y<33;y++){
                for (int z=0;z<100;z++){
                    if ((x+y+z)==100){
                        if ((rooster.getSinglePrice()*x + hen.getSinglePrice()*y + chick.getSinglePrice()*z) == 100){
                            System.out.print("公鸡："+ x + "只");
                            System.out.print("母鸡："+ y + "只");
                            System.out.println("小鸡："+ z + "只");
                        }
                    }
                }
            }
        }
    }
}
