package action;

import domain.Projeto;

import domain.ProjetoWeb;
import useCase.FakeDatabase;
import useCase.SingletonScanner;

import java.util.Optional;

public class GetProject implements Action {
    public GetProject() {
    }

    @Override
    public void run() {
        System.out.println("----- Qual o nome do projeto? ------");
        String projectName = SingletonScanner.getScanner().next();

        Optional<Projeto> projectFound = FakeDatabase.findByProjectName(projectName);

        if (projectFound.isPresent()) {
            System.out.println("<--------- Projeto Encontrado ---------->\n");
            System.out.println(
                            "Projeto: <" + projectFound.get().getNome() + "> - <" + projectFound.get().getNivel() + ">\n" +
                            "Custo: <" + projectFound.get().getCusto() + ">\n" +
                            "Gerente de Projetos: <" + projectFound.get().getGerente() + ">\n");
            System.out.println("<--------- Projeto Encontrado ---------->\n");
        } else {
            System.out.println("Projeto não encontrado. Tente novamento com outro nome ou incluir um novo.");
        }
    }
}