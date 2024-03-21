package action;

import domain.*;

import repository.FakeDatabase;
import useCase.SingletonScanner;

public class CreateProject implements IAction {
    private static final int OPTION_CREATE_WEB_PROJECT = 1;
    private static final int OPTION_CREATE_APP_PROJECT = 2;
    private Manager manager = new Manager();
    public CreateProject() {
    }

    @Override
    public void run() {
        System.out.println("----- Qual o nome do gerente? ------");
        String nomeGerente = SingletonScanner.getScanner().next();
        manager.setName(nomeGerente);

        System.out.println("----- Qual o nome do projeto? ------");
        String nomeProjeto = SingletonScanner.getScanner().next();

        System.out.println("----- Qual o custo do projeto? ------");
        double custoProjeto = SingletonScanner.getScanner().nextDouble();

        System.out.println("----- Qual o nível do projeto? ------\n"+
                "1 - operacional\n" +
                "2 - estratégico");

        int nivelProjeto = SingletonScanner.getScanner().nextInt();

        System.out.println("----- Deseja criar um projeto web ou mobile? ------\n" +
                "1 - Web\n" +
                "2 - Mobile");

        int tipo = SingletonScanner.getScanner().nextInt();

        switch (tipo) {
            case OPTION_CREATE_WEB_PROJECT -> {
                System.out.println("----- Qual a linguagem do projeto? ------");
                String linguagemProjeto = SingletonScanner.getScanner().next();

                System.out.println("----- Qual o bd do projeto? ------");
                String bdProjeto = SingletonScanner.getScanner().next();

                manager.setName(nomeGerente);
                WebProject project = new WebProject(nomeProjeto, nivelProjeto == 1 ? Level.OPERATIONAL: Level.STRATEGIC, custoProjeto, manager, linguagemProjeto, bdProjeto);
                manager.setProject(project);

                FakeDatabase.save(project);
            }

            case OPTION_CREATE_APP_PROJECT -> {
                System.out.println("----- Qual a plataforma do projeto? ------");
                String plataformaProjeto = SingletonScanner.getScanner().next();

                System.out.println("----- Qual o tamanho do projeto? ------");
                float tamanhoProjeto = SingletonScanner.getScanner().nextFloat();

                manager.setName(nomeGerente);
                AppProject project = new AppProject(nomeProjeto, nivelProjeto == 1 ? Level.OPERATIONAL: Level.STRATEGIC, custoProjeto, manager, plataformaProjeto, tamanhoProjeto);
                manager.setProject(project);

                FakeDatabase.save(project);
            }
        }
    }
}