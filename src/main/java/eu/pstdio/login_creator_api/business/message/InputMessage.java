package eu.pstdio.login_creator_api.business.message;

/**
 *
 * @author mib
 */
public interface InputMessage {
    void setLogin(String login);
    String getLogin();
    void setPasswd(String passwd);
    String getPasswd();
}
