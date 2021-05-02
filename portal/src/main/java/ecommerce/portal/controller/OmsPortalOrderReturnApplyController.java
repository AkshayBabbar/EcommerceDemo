package ecommerce.portal.controller;

import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.OmsOrderReturnApplyParam;
import ecommerce.portal.service.OmsPortalOrderReturnApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api("OmsPortalOrderReturnApplyController")
@Controller
@RequestMapping("/returnApply")
public class OmsPortalOrderReturnApplyController {

    @Autowired
    private OmsPortalOrderReturnApplyService returnApplyService;

    @ApiOperation("Application for return")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult create(@RequestBody OmsOrderReturnApplyParam returnApply) {
        int count = returnApplyService.create(returnApply);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
