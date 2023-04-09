import java.util.HashSet;

//создание ноутбуков
public class RepositoryModel {
    public HashSet createNotebook(){

        HashSet<Notebook> repositoryNoteSet = new HashSet<>();

        for(int i = 0; i < 5; i++) {
            String nameNotebook = "Msi";
            String modelNotebook = "MX-7" + i;
            Notebook notebook = new Notebook(nameNotebook,modelNotebook,"Black",
                    14.0f,64,4,"Linux",10000 + i * 10000);
            repositoryNoteSet.add(notebook);
        }
        for(int i = 0; i < 5; i++) {
            String nameNotebook = "Asus";
            String modelNotebook = "AS-1" + i;
            Notebook notebook = new Notebook(nameNotebook,modelNotebook,"White",
                    16.0f,128,8,"Windows",50000 + i * 1000);
            repositoryNoteSet.add(notebook);
        }
        for(int i = 0; i < 5; i++) {
            String nameNotebook = "Acer";
            String modelNotebook = "AS-1" + i;
            Notebook notebook = new Notebook(nameNotebook,modelNotebook,"Grey",
                    20.0f,256,12,"macOS",50000 + i * 1000);
            repositoryNoteSet.add(notebook);
        }
        return repositoryNoteSet;
    }
}
