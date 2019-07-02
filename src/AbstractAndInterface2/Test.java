package AbstractAndInterface2;

public class Test {
    public static void main(String[] args) {
        DrivingSelf drivingSelf = new DrivingSelf();
        if(drivingSelf.cost(500,drivingSelf.getCharge())){
            System.out.println("小明可以选择自驾游");
        }

        Bus bus = new Bus();
        if(bus.cost(500,bus.getCharge())){
            System.out.println("小明可以选择巴士出游");
        }

        Train train = new Train();
        if(train.cost(500,train.getCharge())){
            System.out.println("小明可以选择火车出游");
        }

        Plane plane = new Plane();
        if(plane.cost(500,plane.getCharge())){
            System.out.println("小明可以选择飞机出游");
        }

    }
}
