package ss4.exercise;

public class test {
    public static void main(String[] args) {
        QuadracticEquation pt1 = new QuadracticEquation(3,2,1);
//        QuadracticEquation pt2 = new QuadracticEquation(6);
        System.out.println(pt1.getA() );
        System.out.println(pt1.getB() );
        System.out.println(pt1.getC() );


        if(pt1.getDiscriminant() >0) {
            System.out.println("DELTA la: " + pt1.getDiscriminant());
            System.out.println("Nghiem thu nhat la: " + pt1.getRoot1());
            System.out.println("Nghiem thu hai la: " + pt1.getRoot2());
        } else if(pt1.getDiscriminant() == 0) {
            System.out.println("Nghiem kep: " +pt1.getRoot1());
        } else {
            System.out.println("Vo nghiem!");
        }


//        pt1.setB(5);
//        System.out.println(pt1.getB());
    }
}
