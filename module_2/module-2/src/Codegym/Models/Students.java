package Codegym.Models;

public class Students extends Person {
    private String clasS;
    private int score;

    public Students() {
    }

    public Students(int id, String name, String gender, String day, String clasS, int score) {
        super(id, name, gender, day);
        this.clasS = clasS;
        this.score = score;
    }

    public String getClasS() {
        return clasS;
    }

    public void setClasS(String clasS) {
        this.clasS = clasS;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                super.toString() +
                "clasS='" + clasS + '\'' +
                ", score=" + score +
                '}' ;
    }
}
