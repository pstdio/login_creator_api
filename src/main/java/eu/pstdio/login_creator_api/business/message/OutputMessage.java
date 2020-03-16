package eu.pstdio.login_creator_api.business.message;

/**
 *
 * @author mib
 */
public interface OutputMessage {
    void setCreated(boolean created);
    boolean isCreated();
    void setLoginId(Long loginId);
    Long getLoginId();
}
