public class Author {
    private String name;
    private String email;
    private String nationality;

    // Constructor
    public Author(String name, String email, String nationality) {
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNationality() {
        return nationality;
    }

    // toString method
    @Override
    public String toString() {
        return "Author: " + name + ", Email: " + email + ", Nationality: " + nationality;
    }
}