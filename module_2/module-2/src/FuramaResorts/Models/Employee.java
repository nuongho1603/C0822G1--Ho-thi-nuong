package FuramaResorts.Models;

public class Employee extends Person {
    private int maNhanVien;
    private  String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String hoTen, String ngayThangNamSinh, String gioiTinh, int CMND, int soDienThoai, String email, int maNhanVien, String trinhDo, String viTri, double luong) {
        super(hoTen, ngayThangNamSinh, gioiTinh, CMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "maNhanVien=" + maNhanVien +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
