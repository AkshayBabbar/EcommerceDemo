package ecommerce.portal.service;

import ecommerce.common.api.CommonResult;
import ecommerce.common.domain.UserDto;
import ecommerce.ormmapper.model.UmsMember;
import org.springframework.transaction.annotation.Transactional;

public interface UmsMemberService {
    /**
     * Get members based on user name
     */
    UmsMember getByUsername(String username);

    /**
     * Get members based on membership number
     */
    UmsMember getById(Long id);

    /**
     * User registration
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * Generate verification code
     */
    String generateAuthCode(String telephone);

    /**
     * change Password
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * Get the currently logged-in member
     */
    UmsMember getCurrentMember();

    /**
     * Modify member points according to member id
     */
    void updateIntegration(Long id, Integer integration);


    /**
     * Get user information
     */
    UserDto loadUserByUsername(String username);

    /**
     * Get token after login
     */
    CommonResult login(String username, String password);
}
