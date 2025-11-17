package theater;

/**
 * Represents a play in the theater billing system.
 */
public class Play {

    private String name;
    private String type;

    /**
     * Constructs a new Play with the given name and type.
     *
     * @param name the name of the play, must not be null
     * @param type the type of the play, must not be null
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
