package capstone.bcs.lifo.commands;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotEmpty
    @Size(min = 4, max = 100)
    private String userName;

    @NotEmpty
    @Size(min = 4, max = 80)
    private String passwordPlain;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordPlain() {
        return passwordPlain;
    }

    public void setPasswordPlain(String passwordPlain) {
        this.passwordPlain = passwordPlain;
    }
}
