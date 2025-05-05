package model;
public class Utente {
    protected String login;
    protected String password;

    public Utente(String login, String password) {
        this.login = login;
        this.password = password;

    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utente{" + "login=" + login + ", password=" + password + '}';
    }

    public void CheckGuest{
        //Metodo per visualizzare tutti gli ospiti
    }
}

