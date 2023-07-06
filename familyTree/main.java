package JavaHomeWorkOOP.familyTree;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import JavaHomeWorkOOP.familyTree.human.Human;
import JavaHomeWorkOOP.familyTree.human.Sex;
import JavaHomeWorkOOP.familyTree.tree.Tree;

public class Main{

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Tree tree = new Tree();
        ArrayList<Human> children = new ArrayList<>();
        Human ivan = new Human(Sex.male, "Иван", "Иванов", LocalDate.of(2008, 1, 7), null, new ArrayList<>(), null);
        Human nataly = new Human(Sex.female, "Наталья", "Иванова", LocalDate.of(2012, 4, 9), null, new ArrayList<>(), null);

        children.add(ivan);
        children.add(nataly);
        

        Human mother = new Human(Sex.female, "Ирина", "Иванова", LocalDate.of(1983, 4, 15), null, children, null);
        Human father = new Human(Sex.male, "Игорь", "Иванов", LocalDate.of(1984, 12, 15), null, children, null);
        ivan.setFather(father);
        ivan.setMother(mother);

        nataly.setFather(father);
        nataly.setMother(mother);

        mother.setMarryedBy(father);
        father.setMarryedBy(mother);

        tree.addHuman(father);
        tree.addHuman(mother);
        tree.addHuman(ivan);
        tree.addHuman(nataly);

         for (Human element : tree) {
            System.out.println(element);
         }
        
        //
        //InputOutput io = new InputOutput();
        //io.saveToFile(tree);

        //Tree restoredTree = io.restoreFromFile();
        //for (Human element : restoredTree) {
        //    System.out.println(element);
        //}
        System.out.println("--------Сортируем по имени---------");
         tree.sortByName();
         for (Human element : tree) {
            System.out.println(element);
         }

         System.out.println("---------Сортируем по дате рождения----------");
         tree.sortByAge();
         for (Human element : tree) {
            System.out.println(element);
         }

    }

    
}
