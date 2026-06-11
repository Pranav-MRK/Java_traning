public class UserTemplate {

    // 1. Private Fields (Encapsulation)
    private int id;
    private String name;

    // 2. Default Constructor (No-Argument)
    public UserTemplate() {
        // Initializes default values
    }

    // 3. Parameterized Constructor
    public UserTemplate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 4. Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 5. toString() Method
    @Override
    public String toString() {
        return "UserTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}