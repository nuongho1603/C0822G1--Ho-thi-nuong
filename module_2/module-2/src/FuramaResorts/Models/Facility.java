package FuramaResorts.Models;

public abstract class Facility {
    private String tenDichVu;
    private Double dienTichSuDung;
    private int chiPhiThue;
    private int soLuongToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, Double dienTichSuDung, int chiPhiThue, int soLuongToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongToiDa = soLuongToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(Double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongToiDa=" + soLuongToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
