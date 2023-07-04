package JavaHomeWorkOOP.familyTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tree implements Serializable{
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
}
