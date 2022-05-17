package entity;

public class Users {

    private int id;
    private String idUsers;

    public Users(){

    }

    public Users(int id, String idUsers) {
        this.id = id;
        this.idUsers = idUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(String idUsers) {
        this.idUsers = idUsers;
    }
}
