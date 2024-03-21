package action;

import domain.IAppProject;
import domain.IWebProject;
import repository.FakeDatabase;

import java.util.List;

public class ListProjects implements IAction {
    private List<IAppProject> appProjects = FakeDatabase.getAppProjects();
    private List<IWebProject> webProjects = FakeDatabase.getWebProjects();

    public ListProjects() {

    }

    private void printAppProjects() {
        appProjects.forEach(element -> {
            System.out.println(
                    "Projeto: <" + element.getName() + "> - <" + element.getLevel() + ">\n" +
                    "Custo: <" + element.getCost() + ">\n" +
                    "Gerente de Projetos: <" + element.getManager() + ">\n"+
                    "Tamanho do projeto: <" + element.getTamanho() + ">\n"+
                    "Plataforma do projeto: <" + element.getPlataforma() + ">\n");
        });
    }

    private void printWebProjects() {
        webProjects.forEach(element -> {
            System.out.println(
                    "Projeto: <" + element.getName() + "> - <" + element.getLevel() + ">\n" +
                    "Custo: <" + element.getCost() + ">\n" +
                    "Gerente de Projetos: <" + element.getManager() + ">\n"+
                    "Linguagem de programação: <" + element.getProgrammingLanguage() + ">\n"+
                    "Banco de dados: <" + element.getDb() + ">\n");
        });
    }

    private void checkIfThereAreProjectsToPrint() {
        if (!appProjects.isEmpty() || !webProjects.isEmpty()) {
            System.out.println("<vvvvvvvv Lista de projetos cadastrados: vvvvvvvv>\n");
            printAppProjects();
            printWebProjects();
            System.out.println("<^^^^^^^^ Lista de projetos cadastrados: ^^^^^^^^>\n");
        } else {
            System.out.println("<--------- Sem projetos: ---------->\n");
        }
    }

    @Override
    public void run() {

        checkIfThereAreProjectsToPrint();

    }
}
