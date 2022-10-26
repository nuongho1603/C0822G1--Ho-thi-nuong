package ss16.exercise.exercise2;

public class Nation {
    private int stt;
    private String tenVietTat;
    private String tenQuocGia;

    public Nation() {
    }

    public Nation(int stt, String tenVietTat, String tenQuocGia) {
        this.stt = stt;
        this.tenVietTat = tenVietTat;
        this.tenQuocGia = tenQuocGia;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTenVietTat() {
        return tenVietTat;
    }

    public void setTenVietTat(String tenVietTat) {
        this.tenVietTat = tenVietTat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "stt=" + stt +
                ", tenVietTat='" + tenVietTat + '\'' +
                ", tenQuocGia='" + tenQuocGia + '\'' +
                '}';
    }
}
