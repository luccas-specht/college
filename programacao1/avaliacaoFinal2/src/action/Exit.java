package action;

import useCase.SingletonScanner;

public class Exit implements Action {
    @Override
    public void run() {
        SingletonScanner.closeScanner();
        System.out.println("Programa encerrado.");
    }
}
