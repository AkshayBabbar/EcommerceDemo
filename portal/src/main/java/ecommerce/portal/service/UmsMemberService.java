package ecommerce.portal.service;

import ecommerce.common.api.CommonResult;
import ecommerce.common.domain.UserDto;
import ecommerce.ormmapper.model.UmsMember;

public interface UmsMemberService {
    UmsMember getCurrentMember();

    void register(String username, String password, String telephone, String authCode);

    CommonResult login(String username, String password);

    String generateAuthCode(String telephone);

    void updatePassword(String telephone, String password, String authCode);

    UserDto loadUserByUsername(String username);
}
