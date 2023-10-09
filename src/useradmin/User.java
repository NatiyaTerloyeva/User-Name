package useradmin;

class User {
    private int id;
    private String name;
    private String password;

    User(int id) {
        setId(id);
    }

    User(int id, String name, String password) {
        setId(id);
        setName(name);
        setPassword(password);
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }

    public String toString() {
        return "ID: " + getId() + " |Name: " + getName() + " | Password: " + getPassword();
    }
}
