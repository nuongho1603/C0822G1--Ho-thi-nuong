package ss4.exercise.excercise2;

import ss4.exercise.excercise2.Fan;

public class TestFan {
    //    public static void main(String[] args) {
//        Fan fan1 = new Fan(3, true, "yellow", 10);
//        Fan fan2 = new Fan(2, false, "blue", 5);
//        System.out.println(fan1);
//        System.out.println(fan2);
//    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setColor("yellow");
        fan1.setRadius(10);

        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5);

        System.out.println(fan2);

    }
}

