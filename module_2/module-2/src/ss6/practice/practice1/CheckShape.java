package ss6.practice.practice1;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class CheckShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("rED",false);
        System.out.println(shape);
    }
}
