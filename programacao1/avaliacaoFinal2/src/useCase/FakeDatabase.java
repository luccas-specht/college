package useCase;

import domain.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class FakeDatabase {
    private static final List<Project> projects = new ArrayList<>();
    public static void save(Project project) {
        projects.add(project);
    }

    public static Optional<Project> findByProjectName(String projectName) {
        return projects.stream()
                .filter(element -> element.getName().equalsIgnoreCase(projectName))
                .findFirst();
    }

    public static void deleteProjectByName(String projectName) {
        Optional<Project> projectFound = findByProjectName(projectName);

        if (projectFound.isPresent()) {
            projects.remove(projectFound.get());
            System.out.println("Projeto removido com sucesso.");
        } else {
            System.out.println("Projeto não encontrado.");
        }
    }


    public static List<Project> getAllProjects() {
       return projects;
    }
}
