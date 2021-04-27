package ecommerce.portal.controller;


import ecommerce.common.api.CommonResult.CommonResult;
import ecommerce.portal.domain.HomeContentResult;
import ecommerce.portal.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")

@Api(tags = "HomeController")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @ApiOperation("Homepage content page information display")
    @RequestMapping(value = "/content", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<HomeContentResult> content() {
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }


}
