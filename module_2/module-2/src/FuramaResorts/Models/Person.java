package FuramaResorts.Models;

public abstract class Person {
  private String hoTen;
        private  String ngayThangNamSinh;
        private String gioiTinh;
        private int CMND;
        private int soDienThoai;
        private String email;

    public Person() {
    }

    public Person(String hoTen, String ngayThangNamSinh, String gioiTinh, int CMND, int soDienThoai, String email) {
        this.hoTen = hoTen;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngayThangNamSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", CMND=" + CMND +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }
}
