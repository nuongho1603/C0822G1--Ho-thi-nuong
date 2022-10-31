package ss19.exercise.exercise1;

import ss19.exercise.exercise1.ClassNameExample;

public class ClassNameExampleTest {
    public static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[]{"C0822G","M0318G", "P0323A","C09991"};
   // public static final String[] invalidClassName = new String[]{};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName){
            boolean isvalid = classNameExample.validate(className);
            System.out.println("Class name : " + className + " is valid " + isvalid);
        }

//        for (String className : invalidClassName){
//            boolean isvalid = classNameExample.validate(className);
//            System.out.println("Class name: " + className + " is valid " + isvalid);
//        }
    }
}
