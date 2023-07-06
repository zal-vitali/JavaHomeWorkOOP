package JavaHomeWorkOOP.familyTree.tree;

import java.util.Iterator;
import java.util.List;

import JavaHomeWorkOOP.familyTree.human.Human;

public class HumanIterator implements Iterator<Human>{
    private int index;
    private List<Human> human;

    public HumanIterator(List<Human> human) {
        this.human = human;
    }

    @Override
    public boolean hasNext() {
        return human.size() > index;
    }

    @Override
    public Human next() {
        return human.get(index++);
    }
    
}
