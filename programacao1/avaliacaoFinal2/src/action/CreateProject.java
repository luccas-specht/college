package action;

import domain.Nivel;
import domain.Gerente;
import domain.Projeto;
import domain.ProjetoWeb;
import domain.ProjetoAplicativo;

import useCase.FakeDatabase;
import useCase.SingletonScanner;

public class CreateProject implements Action {
    private Projeto projeto;
    private Gerente gerente = new Gerente();
    public CreateProject() {
    }

    @Override
    public void run() {
        System.out.println("----- Qual o nome do gerente? ------");
        String nomeGerente = SingletonScanner.getScanner().next();
        gerente.setNome(nomeGerente);

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
            case 1 -> {
                System.out.println("----- Qual a linguagem do projeto? ------");
                String linguagemProjeto = SingletonScanner.getScanner().next();

                System.out.println("----- Qual o bd do projeto? ------");
                String bdProjeto = SingletonScanner.getScanner().next();

                gerente.setNome(nomeGerente);
                this.projeto = new ProjetoWeb(nomeProjeto, nivelProjeto == 1 ? Nivel.OPERACIONAL: Nivel.ESTRATEGICO, custoProjeto, gerente, linguagemProjeto, bdProjeto);
                gerente.setProjeto(projeto);

            }
            case 2 -> {
                System.out.println("----- Qual a plataforma do projeto? ------");
                String plataformaProjeto = SingletonScanner.getScanner().next();

                System.out.println("----- Qual o tamanho do projeto? ------");
                float tamanhoProjeto = SingletonScanner.getScanner().nextFloat();

                gerente.setNome(nomeGerente);
                this.projeto = new ProjetoAplicativo(nomeProjeto, nivelProjeto == 1 ? Nivel.OPERACIONAL: Nivel.ESTRATEGICO, custoProjeto, gerente, plataformaProjeto, tamanhoProjeto);
                gerente.setProjeto(projeto);
            }
        }
        FakeDatabase.save(projeto);
    }
}