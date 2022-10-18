package weekend_learning;

public class StaticDemo {
    public static void anh(){
        System.out.println("anh duoc goi");
    }
    public void em(){
        System.out.println("em duoc goi");
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
        StaticDemo.anh();
        staticDemo.em();
    }
}
