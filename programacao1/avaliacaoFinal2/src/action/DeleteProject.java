package action;

import repository.FakeDatabase;
import useCase.SingletonScanner;

public class DeleteProject implements IAction {
    public DeleteProject() {
    }

    @Override
    public void run() {
        System.out.println("Qual o nome do projeto você deseja deletar?\n");
        String projectName = SingletonScanner.getScanner().next();

        FakeDatabase.deleteProjectByName(projectName);
    }
}
