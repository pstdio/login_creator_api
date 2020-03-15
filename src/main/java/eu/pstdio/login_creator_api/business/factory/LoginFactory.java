package eu.pstdio.login_creator_api.business.factory;

import eu.pstdio.login_creator_api.business.message.InputMessage;
import eu.pstdio.login_creator_api.integration.entity.LoginEntity;

/**
 *
 * @author mib
 */
public interface LoginFactory {
    LoginEntity create(InputMessage credentials);
}
