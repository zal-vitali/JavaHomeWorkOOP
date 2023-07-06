package JavaHomeWorkOOP.familyTree.files;

import java.io.IOException;

import JavaHomeWorkOOP.familyTree.tree.Tree;

public interface Serial {
    void saveToFile(Tree tree) throws IOException, ClassNotFoundException;
    Tree restoreFromFile() throws IOException, ClassNotFoundException;
}
