package JavaHomeWorkOOP.familyTree.tree;

import java.util.Comparator;

import JavaHomeWorkOOP.familyTree.human.Human;

public class ComparatorByAge implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirtDay().compareTo(o2.getBirtDay());
    }
    
}
