public final class Conifg {
    private final String databaseUrl;
    private final String username;
    private final String password;

    public Conifg(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    public String getDatabaseUrl() { return databaseUrl; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public static void main(String[] args) {
        Conifg a = new Conifg("jdbc:mysql://localhost", "admin", "password123");
        System.out.println(a.getDatabaseUrl());
    }
}