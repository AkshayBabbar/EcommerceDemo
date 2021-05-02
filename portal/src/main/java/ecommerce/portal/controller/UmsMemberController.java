package ecommerce.portal.controller;

import ecommerce.common.api.CommonResult;
import ecommerce.common.domain.UserDto;
import ecommerce.ormmapper.model.UmsMember;
import ecommerce.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api("UmsMemberController")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("SignUp")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone,
                                 @RequestParam String authCode) {
        memberService.register(username, password, telephone, authCode);
        return CommonResult.success(null, "registration successfull");
    }

    @ApiOperation("Member Login")
    @PostMapping(value = "/login")
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password) {
        return memberService.login(username, password);
    }

    @ApiOperation("Get member information")
    @GetMapping(value = "/info")
    @ResponseBody
    public CommonResult info() {
        UmsMember member = memberService.getCurrentMember();
        return CommonResult.success(member);
    }

    @ApiOperation("get verification code")
    @GetMapping(value = "/getAuthCode")
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        String authCode = memberService.generateAuthCode(telephone);
        return CommonResult.success(authCode, "Get the verification code successfully");
    }

    @ApiOperation("change Password")
    @PostMapping(value = "/updatePassword")
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String password,
                                       @RequestParam String authCode) {
        memberService.updatePassword(telephone, password, authCode);
        return CommonResult.success(null, "Password reset complete");
    }

    @ApiOperation("Get general user information based on user name")
    @GetMapping(value = "/loadByUsername")
    @ResponseBody
    public UserDto loadUserByUsername(@RequestParam String username) {
        return memberService.loadUserByUsername(username);
    }
}
