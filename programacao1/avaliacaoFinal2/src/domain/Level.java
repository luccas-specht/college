package domain;

public enum Level {
    OPERATIONAL("Operacional"),
    STRATEGIC("Estratégico");

    private final String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
