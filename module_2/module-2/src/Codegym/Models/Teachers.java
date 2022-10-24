package Codegym.Models;

public class Teachers extends Person {
    private String specialize;

    public Teachers() {
    }

    public Teachers(int id, String name, String gender, String day, String specialize) {
        super(id, name, gender, day);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "GiaoVien{"+super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
