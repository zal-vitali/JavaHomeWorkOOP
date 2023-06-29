package JavaHomeWorkOOP.familyTree;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Human {
    private Sex sex;
    private String firstName;
    private String lastName;
    private LocalDate birtDay;
    private LocalDate deathDay;
    private Human marryedBy;
    private List<Human> children;
    private Human mother;
    private Human father;

    public Human(Sex sex, String firstName,String lastName,LocalDate birtDay,LocalDate deathDay,List<Human> children, Human marryedBy){
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;  
        this.birtDay = birtDay;
        this.deathDay = deathDay;                      
        this.children = children;
    }

    public Human() {
        this(Sex.male,"uncnown", "uncnown",LocalDate.of(1, 1, 1), LocalDate.of(1, 1, 1),new ArrayList<>(),new Human());       
    }

    public void setMarryedBy(Human marryedBy) {
        this.marryedBy = marryedBy;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        
        return this.firstName + " " +this.lastName + " д.р: "+ this.birtDay.toString();
    }

    public List<Human> getChildren() {
        return children;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }
}
