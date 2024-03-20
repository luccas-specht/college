package action;

import useCase.FakeDatabase;

public class ListProjects implements Action {
    @Override
    public void run() {
         FakeDatabase.getAllProjects();
    }
}
