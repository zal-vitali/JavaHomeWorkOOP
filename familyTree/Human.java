package JavaHomeWorkOOP.familyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Human implements Serializable{
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
        this(Sex.male,"uncnown", "uncnown",null, null,new ArrayList<>(),new Human());       
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName + " " +this.lastName);
        
        if(this.deathDay == null){
            sb.append(" д/р: ");
            sb.append(this.birtDay.toString()); 
        }
        else{
            sb.append(this.birtDay.toString());
            sb.append("-");
            sb.append(this.deathDay.toString());
        }
        sb.append(". Отец: ");
        if(!(this.father == null)){
            sb.append(this.father.firstName);
            sb.append(" "); 
            sb.append(this.father.lastName);
        }
        else{
            sb.append("неизвестен");
        }

        sb.append(". Мать: ");
        if(!(this.father == null)){
            sb.append(this.mother.firstName);
            sb.append(" "); 
            sb.append(this.mother.lastName);
        }
        else{
            sb.append("неизвестна");
        }

        return sb.toString();
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
