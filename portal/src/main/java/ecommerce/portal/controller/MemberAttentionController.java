package ecommerce.portal.controller;

import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.MemberBrandAttention;
import ecommerce.portal.service.MemberAttentionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Home Component Management Controller
 */

@Controller
@RequestMapping("/member/attention")
public class MemberAttentionController {

    @Autowired
    private MemberAttentionService memberAttentionService;

    @ApiOperation("subscribe for  brand attention")
    @PostMapping(value = "/subscribe")
    @ResponseBody
    public CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention) {
        int count = memberAttentionService.subscribe(memberBrandAttention);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


    @ApiOperation("Unsubscribe/delete brand from the list")
    @PostMapping("/unsubscribe")
    @ResponseBody
    public CommonResult unsubscribe(Long brandId) {
        int count = memberAttentionService.unsubscribe(brandId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Get Details for Brand")
    @GetMapping("/details")
    @ResponseBody
    public CommonResult<MemberBrandAttention> detail(@RequestParam Long brandId) {
        MemberBrandAttention memberBrandAttention = memberAttentionService.detail(brandId);
        return CommonResult.success(memberBrandAttention);
    }

    @ApiOperation("Clear Watchlist")
    @PostMapping("/clear")
    @ResponseBody
    public CommonResult clear() {
        memberAttentionService.clear();
        return CommonResult.success(null);
    }

}
