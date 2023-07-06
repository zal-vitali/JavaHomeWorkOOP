package JavaHomeWorkOOP.familyTree.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import JavaHomeWorkOOP.familyTree.tree.Tree;

public class InputOutput implements Serial{
    public void saveToFile(Tree tree) throws IOException, ClassNotFoundException{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("tree.txt"));
        os.writeObject(tree);
        os.close();
    }

    public Tree restoreFromFile() throws IOException, ClassNotFoundException{

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("tree.txt"));
        Tree tree = (Tree) is.readObject();
        is.close();
        return tree;

    }

}
