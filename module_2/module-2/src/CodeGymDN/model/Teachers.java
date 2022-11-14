package CodeGymDN.model;

public class Teachers extends Person {
    private String specialize;

    public Teachers() {
    }

    public Teachers(int id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
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
        return "Teachers{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return null;
    }
}
