package ss6_inheritance.bai_tap.point_2d_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayB = new float[3];
        arrayB[0] = super.getX();
        arrayB[1] = super.getY();
        arrayB[2] = this.z;
        return arrayB;
    }

    @Override
    public String toString() {
        return "Point3D" + "x=" + super.getX() + "y=" + super.getY() +
                "z=" + this.z;
    }
}
