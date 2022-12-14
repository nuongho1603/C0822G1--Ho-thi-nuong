package FuramaResorts.Models;

public class Customer extends Person {
    private int maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(int maKhachHang, String loaiKhach, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String hoTen, String ngayThangNamSinh, String gioiTinh, int CMND, int soDienThoai, String email, int maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngayThangNamSinh, gioiTinh, CMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" + "maKhachHang=" + maKhachHang +super.toString()+
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
