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

    public static <T extends IProject> void deleteProjectByName(String projectName, List<T> projects) {
        Optional<T> projectFound = findProjectByName(projectName, projects);

        projectFound.ifPresent(project -> {
            projects.remove(project);
            System.out.println("Projeto removido com sucesso.");
        });

        if (projectFound.isEmpty()) {
            System.out.println("Projeto não encontrado.");
        }
    }


    public static List<IAppProject> getAppProjects() {
       return appProjects;
    }

    public static List<IWebProject> getWebProjects() {
        return webProjects;
    }
}
