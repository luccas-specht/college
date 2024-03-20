package action;

import useCase.SingletonScanner;

public class Exit implements IAction {
    @Override
    public void run() {
        SingletonScanner.closeScanner();
        System.out.println("Programa encerrado.");
    }
}
