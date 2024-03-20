package action;

import domain.Project;

import useCase.FakeDatabase;
import useCase.SingletonScanner;

import java.util.Optional;

public class GetProject implements IAction {
    public GetProject() {
    }

    @Override
    public void run() {
        System.out.println("----- Qual o nome do projeto? ------");
        String projectName = SingletonScanner.getScanner().next();

        Optional<Project> projectFound = FakeDatabase.findByProjectName(projectName);

        if (projectFound.isPresent()) {
            System.out.println("<--------- Projeto Encontrado ---------->\n");
            System.out.println(
                            "Projeto: <" + projectFound.get().getName() + "> - <" + projectFound.get().getLevel() + ">\n" +
                            "Custo: <" + projectFound.get().getCost() + ">\n" +
                            "Gerente de Projetos: <" + projectFound.get().getManager() + ">\n");
            System.out.println("<--------- Projeto Encontrado ---------->\n");
        } else {
            System.out.println("Projeto não encontrado. Tente novamento com outro nome ou incluir um novo.");
        }
    }
}