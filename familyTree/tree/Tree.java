package JavaHomeWorkOOP.familyTree.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import JavaHomeWorkOOP.familyTree.human.Human;

public class Tree implements Serializable, Iterable<Human>{
    private List<Human> humanList;

    public Tree(List<Human> humanList){
        this.humanList = humanList;
    }

    public Tree() {
        this(new ArrayList<Human>());
    }

    public void addHuman(Human human) {
        if(!(human == null) && !humanList.contains(human)){
            humanList.add(human);
        }
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    @Override
    public Iterator<Human> iterator() {
       
        return new HumanIterator(humanList);
    }

    public void sortByName() {
        Collections.sort(humanList); //Сортирую в классе Human
    }

    public void sortByAge() {
        Collections.sort(humanList,new ComparatorByAge()); //Сортирую компаратором
    }
}
