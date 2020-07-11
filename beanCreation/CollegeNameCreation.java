package beanCreation;
public class CollegeNameCreation {

    //bean creation with Object Dependency

    private Sports sports;
    public CollegeNameCreation(Sports sports) {
        this.sports = sports;
    }
    public void getCollegeName(){
        sports.test_VolleyBall();
        System.out.println("Vivekanada Degree College");
    }
}
