package action;

import useCase.FakeDatabase;

public class ListProjects implements IAction {
    @Override
    public void run() {
         FakeDatabase.getAppProjects();
         FakeDatabase.getWebProjects();
    }
}
