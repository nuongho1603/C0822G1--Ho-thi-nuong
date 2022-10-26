package FuramaResorts.Models;

public class Booking {
    private int maBooking;
    private int ngayBatDau;
    private int ngayKetThuc;
    private int maKhachHang;
    private String tenDichVu;

    public Booking() {
    }

    public Booking(int maBooking, int ngayBatDau, int ngayKetThuc, int maKhachHang, String tenDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", maKhachHang=" + maKhachHang +
                ", tenDichVu='" + tenDichVu + '\'' +
                '}';
    }
}
