package action;

import useCase.FakeDatabase;
import useCase.SingletonScanner;

public class DeleteProject implements IAction {
    private void runsDeleteProjectByName(String projectName) {
        FakeDatabase.deleteProjectByName(projectName);
    }
    @Override
    public void run() {
        System.out.println("Qual o nome do projeto você deseja deletar?\n");
        String projectName = SingletonScanner.getScanner().next();

        runsDeleteProjectByName(projectName);
    }
}
