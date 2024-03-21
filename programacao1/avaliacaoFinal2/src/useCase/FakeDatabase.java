package useCase;

import domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class FakeDatabase {
    private static final List<IAppProject> appProjects = new ArrayList<>();
    private static final List<IWebProject> webProjects = new ArrayList<>();

    public static void save (WebProject project) {
        webProjects.add(project);
    }

    public static void save (AppProject project) {
        appProjects.add(project);
    }

    public static <T extends IProject> Optional<T> findProjectByName(String projectName, List<T> projects) {
        return projects.stream()
                .filter(element -> element.getName().equalsIgnoreCase(projectName))
                .findFirst();
    }

    public static void deleteProjectByName(String projectName) {
        Optional<IAppProject> appProjectFound = FakeDatabase.findProjectByName(projectName, FakeDatabase.getAppProjects());
        Optional<IWebProject> webProjectFound = FakeDatabase.findProjectByName(projectName, FakeDatabase.getWebProjects());

        appProjectFound.ifPresent(appProject -> {
            appProjects.remove(appProject);
            System.out.println("Projeto de aplicativo removido com sucesso.\n");
        });

        webProjectFound.ifPresent(webProject -> {
            webProjects.remove(webProject);
            System.out.println("Projeto web removido com sucesso.\n");
        });

        if (appProjectFound.isEmpty() && webProjectFound.isEmpty()) {
            System.out.println("Projeto não encontrado.\n");
        }
    }


    public static List<IAppProject> getAppProjects() {
       return appProjects;
    }

    public static List<IWebProject> getWebProjects() {
        return webProjects;
    }
}
