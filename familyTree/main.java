package JavaHomeWorkOOP.familyTree;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        Human ivan = new Human(Sex.male, "Иван", "Иванов", LocalDate.of(2008, 1, 7), null, new ArrayList<>(), null);
        Human nataly = new Human(Sex.female, "Наталья", "Иванова", LocalDate.of(2012, 4, 9), null, new ArrayList<>(), null);

        children.add(ivan);
        children.add(nataly);
        

        Human mother = new Human(Sex.female, "Ирина", "Иванова", LocalDate.of(1986, 4, 15), null, children, null);
        Human father = new Human(Sex.male, "Игорь", "Иванов", LocalDate.of(1984, 12, 15), null, children, null);
        ivan.setFather(father);
        ivan.setMother(mother);

        nataly.setFather(father);
        nataly.setMother(mother);

        mother.setMarryedBy(father);
        father.setMarryedBy(mother);

        for (Human child : father.getChildren()) {
            System.out.println(child);
            System.out.println("Отец: " + child.getFather());
            System.out.println("Мать: " + child.getMother());
        }

    }

    
}
