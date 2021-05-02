package ecommerce.portal.controller;

import ecommerce.common.api.CommonResult;
import ecommerce.ormmapper.model.SmsCoupon;
import ecommerce.ormmapper.model.SmsCouponHistory;
import ecommerce.portal.domain.CartPromotionItem;
import ecommerce.portal.domain.SmsCouponHistoryDetail;
import ecommerce.portal.service.OmsCartItemService;
import ecommerce.portal.service.UmsMemberCouponService;
import ecommerce.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "UmsMemberCouponController", description = "用户优惠券管理")
@RequestMapping("/member/coupon")
public class UmsMemberCouponController {

    @Autowired
    private UmsMemberCouponService memberCouponService;
    @Autowired
    private OmsCartItemService cartItemService;
    @Autowired
    private UmsMemberService memberService;
    //TODO Change Mapping
    @ApiOperation("Receive designated coupons")
    @RequestMapping(value = "/add/{couponId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@PathVariable Long couponId) {
        memberCouponService.add(couponId);
        return CommonResult.success(null,"Received successfully");
    }

    @ApiOperation("Get user coupon history list")
    @ApiImplicitParam(name = "useStatus", value = "Coupon screening type: 0->unused; 1->used; 2->expired",
            allowableValues = "0,1,2", paramType = "query", dataType = "integer")
    //TODO Change Mapping
    @RequestMapping(value = "/listHistory", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SmsCouponHistory>> listHistory(@RequestParam(value = "useStatus", required = false) Integer useStatus) {
        List<SmsCouponHistory> couponHistoryList = memberCouponService.listHistory(useStatus);
        return CommonResult.success(couponHistoryList);
    }
    //TODO Change Mapping
    @ApiOperation("Get user coupon list")
    @ApiImplicitParam(name = "useStatus", value = "Coupon screening type: 0->unused; 1->used; 2->expired",
            allowableValues = "0,1,2", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SmsCoupon>> list(@RequestParam(value = "useStatus", required = false) Integer useStatus) {
        List<SmsCoupon> couponList = memberCouponService.list(useStatus);
        return CommonResult.success(couponList);
    }

    @ApiOperation("Get relevant coupons for logging in to the member's shopping cart")
    @ApiImplicitParam(name = "type", value = "Use available: 0->unavailable; 1->available",
            defaultValue = "1", allowableValues = "0,1", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/list/cart/{type}", method = RequestMethod.GET)
    //TODO Change Mapping
    @ResponseBody
    public CommonResult<List<SmsCouponHistoryDetail>> listCart(@PathVariable Integer type) {
        List<CartPromotionItem> cartPromotionItemList = cartItemService.listPromotion(memberService.getCurrentMember().getId(), null);
        List<SmsCouponHistoryDetail> couponHistoryList = memberCouponService.listCart(cartPromotionItemList, type);
        return CommonResult.success(couponHistoryList);
    }

    @ApiOperation("Get coupons related to current products")
    @RequestMapping(value = "/listByProduct/{productId}", method = RequestMethod.GET)
    //TODO Change Mapping
    @ResponseBody
    public CommonResult<List<SmsCoupon>> listByProduct(@PathVariable Long productId) {
        List<SmsCoupon> couponHistoryList = memberCouponService.listByProduct(productId);
        return CommonResult.success(couponHistoryList);
    }
}
