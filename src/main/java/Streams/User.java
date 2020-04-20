package Streams;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class User implements Serializable {
    private String login;
    transient private String password;
    private static final String STYLE = "Users individual approach";

    public User(String login, String password, String STYLE) {
        this.login = login;
        this.password = password;
    }

    public String getStyle() {
        return STYLE;
    }
}
