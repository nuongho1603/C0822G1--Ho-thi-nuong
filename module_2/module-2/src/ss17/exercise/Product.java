package ss17.exercise;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSanPham;
    private String tenSanPham;
    private String hangSX;
    private double gia;
    private String cacMoTaKhac;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, String hangSX, double gia, String cacMoTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSX = hangSX;
        this.gia = gia;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", gia=" + gia +
                ", cacMoTaKhac='" + cacMoTaKhac + '\'' +
                '}';
    }
}
