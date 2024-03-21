package action;

import domain.IAppProject;
import domain.IWebProject;
import repository.FakeDatabase;
import useCase.SingletonScanner;

import java.util.Optional;

public class GetProject implements IAction {
    public GetProject() {
    }

    @Override
    public void run() {
        System.out.println("----- Qual o nome do projeto? ------");
        String projectName = SingletonScanner.getScanner().next();

        Optional<IAppProject> appProjectFound = FakeDatabase.findProjectByName(projectName, FakeDatabase.getAppProjects());
        Optional<IWebProject> webProjectFound = FakeDatabase.findProjectByName(projectName, FakeDatabase.getWebProjects());

        if (appProjectFound.isPresent()) {
            System.out.println("<--------- Projeto Encontrado ---------->\n");
            System.out.println(
                            "Projeto: <" + appProjectFound.get().getName() + "> - <" +appProjectFound.get().getLevel() + ">\n" +
                            "Custo: <" + appProjectFound.get().getCost() + ">\n" +
                            "Gerente de Projetos: <" + appProjectFound.get().getManager() + ">\n"+
                            "Tamanho do projeto: <" + appProjectFound.get().getSize() + ">\n"+
                            "Plataforma do projeto: <" + appProjectFound.get().getPlataform() + ">\n");
            System.out.println("<--------- Projeto Encontrado ---------->\n");

        } else if (webProjectFound.isPresent()) {
            System.out.println("<--------- Projeto Encontrado ---------->\n");
            System.out.println(
                            "Projeto: <" + webProjectFound.get().getName() + "> - <" +webProjectFound.get().getLevel() + ">\n" +
                            "Custo: <" + webProjectFound.get().getCost() + ">\n" +
                            "Gerente de Projetos: <" + webProjectFound.get().getManager() + ">\n"+
                            "Linguagem de programação: <" + webProjectFound.get().getProgrammingLanguage() + ">\n"+
                            "Banco de dados: <" + webProjectFound.get().getDb() + ">\n");
            System.out.println("<--------- Projeto Encontrado ---------->\n");
        } else {
            System.out.println("Projeto não encontrado. Tente novamente com outro nome ou incluia um novo.");
        }
    }
}