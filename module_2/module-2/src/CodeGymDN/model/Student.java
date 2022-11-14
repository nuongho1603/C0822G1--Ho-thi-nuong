package CodeGymDN.model;

public class Student extends Person{
private String classer ;
private double score;

    public Student() {
    }

    public Student(int id, String name, String date, String gender, String classer, double score) {
        super(id, name, date, gender);
        this.classer = classer;
        this.score = score;
    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "classer='" + classer + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public String showInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",getId(),getName(),getDate(),getGender(),getClasser(),getScore());
    }
}
