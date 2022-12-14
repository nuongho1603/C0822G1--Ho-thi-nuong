package FuramaResorts.Models;

public class Room extends Facility{
    private String dichVuFreeDiKem;

    public Room() {
    }

    @Override
    public String showInfo() {
        return null;
    }

    public Room(String tenDichVu, double dienTichSuDung, int chiPhiThue, int soLuongToiDa, String kieuThue, String dichVuFreeDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongToiDa, kieuThue);
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    public String getDichVuFreeDiKem() {
        return dichVuFreeDiKem;
    }

    public void setDichVuFreeDiKem(String dichVuFreeDiKem) {
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "dichVuFreeDiKem='" + dichVuFreeDiKem + '\'' +
                '}';
    }
}
