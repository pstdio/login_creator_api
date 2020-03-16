package eu.pstdio.login_creator_api.business.message;

/**
 *
 * @author mib
 */
public interface OutputMessage {
    void setCreated(boolean created);
    boolean getCreated();
    void setLoginId(Long loginId);
    Long getLoginId();
}
