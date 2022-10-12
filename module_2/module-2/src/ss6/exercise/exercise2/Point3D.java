package ss6.exercise.exercise2;

public class Point3D extends  Point2D{
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(){
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(){
    }

    public float[] getXYZ(){
        float[] arr1 = {this.getX(),this.getY(),this.z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D : " +
                String.format("%s - %s - %s",super.getX(),super.getY(),this.z);
    }
}
