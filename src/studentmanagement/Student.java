package studentmanagement;

public class Student {
    private long ID ;
    private String name;
    private String major;
    private float theoryScore;
    private float practiceScore;
    private float averageScore;

    public Student() {
    }

    public Student(long ID, String name, String major, float theoryScore, float practiceScore) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
        this.averageScore = averageScore;
    }
    @Override
    public String toString(){
        return "{ name: " +name +" , id = "+ID+" , major: "+major+" , theory score: "+theoryScore
                +" , practice score : "+practiceScore+" }";
    }
    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public boolean setTheoryScore(float theoryScore) {
        if (theoryScore >=0 && theoryScore<=10){
            this.theoryScore = theoryScore;
            return true;
        }
        else {
            System.err.println("Enter false points!! retype");
            return false;
        }

    }

    public boolean setPracticeScore(float practiceScore) {
        if (practiceScore>=0 && practiceScore<=10){
            this.practiceScore = practiceScore;
            return true;
        }
        else{
            System.out.println("Enter false points!! retype");
            return false;
        }
    }
    public void setAverageScore(float averageScore){
        this.averageScore = averageScore;
    }
    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }
    public float getAverageScore(){
        return averageScore;
    }


}
