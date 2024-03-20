package useCase;

import domain.Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class FakeDatabase {
    private static final List<Projeto> projects = new ArrayList<>();
    public static void save(Projeto projeto) {
        projects.add(projeto);
    }

    public static Optional<Projeto> findByProjectName(String projectName) {
        return projects.stream()
                .filter(element -> element.getNome().equalsIgnoreCase(projectName))
                .findFirst();
    }

    public static void deleteProjectByName(String projectName) {
        Optional<Projeto> projectFound = findByProjectName(projectName);

        if (projectFound.isPresent()) {
            projects.remove(projectFound.get());
            System.out.println("Projeto removido com sucesso.");
        } else {
            System.out.println("Projeto não encontrado.");
        }
    }


    public static List<Projeto> getAllProjects() {
       return projects;
    }
}
