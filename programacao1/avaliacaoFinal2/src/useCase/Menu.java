package useCase;

import action.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {
    private static final int OPTION_CREATE_PROJECT = 1;
    private static final int OPTION_FIND_PROJECT = 2;
    private static final int OPTION_DELETE_PROJECT = 3;
    private static final int OPTION_EXIT = 4;
    private static final int OPTION_LIST_PROJECTS = 5;

    private static void displayMenuOptions() {
        System.out.println("<--------- Menu ---------->\n" +
                "1 – Incluir Projeto \n" +
                "2 – Pesquisar Projeto\n" +
                "3 – Remover Projeto \n" +
                "4 – Sair\n" +
                "5 – Listar todos os projetos\n" +
                "<--------- Menu ---------->\n");
    }

    private static Action createOption(int input) {
        return switch (input) {
            case OPTION_CREATE_PROJECT -> new CreateProject();
            case OPTION_FIND_PROJECT -> new GetProject();
            case OPTION_EXIT -> new Exit();
            case OPTION_LIST_PROJECTS -> new ListProjects();
            default -> null;
        };
    }

    private static void callAction(Action option) {
        option.run();
    }

    public static void Start(Scanner input) {
        int optionTyped;

        do {
            displayMenuOptions();
            optionTyped = input.nextInt();

            Action option = createOption(optionTyped);
            callAction(option);
        } while (optionTyped != OPTION_EXIT);
    }
}
