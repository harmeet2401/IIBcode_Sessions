package enumsingleton;

/**
 * There is no constructors in ENUM to instantiate the attribute INSTANCE
 * So no reflection technique can be used to hack the singleton pattern
 * ENUM actually follows singleton pattern
 */
public enum EnumSingleTon {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
