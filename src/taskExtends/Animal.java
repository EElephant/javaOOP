package taskExtends;

public class Animal {
    public int age;
    public String weight;
    public void run(){
        System.out.println("动物会跑");
    }
    public void eat(){
        System.out.println("也会跳");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
