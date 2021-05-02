package ecommerce.portal.controller;


import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.CartProduct;
import ecommerce.portal.domain.CartPromotionItem;
import ecommerce.portal.service.OmsCartItemService;
import ecommerce.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ormMapper.model.OmsCartItem;

import java.util.List;

@Controller
@Api(tags = "OmsCartItemController", value = "Shopping cart management")
@RequestMapping("/cart")
public class OmsCartItemController {

    @Autowired
    OmsCartItemService cartItemService;
    @Autowired
    UmsMemberService memberService;

    @ApiOperation("Add product to shopping cart")
    @PostMapping("/add")
    @ResponseBody
    public CommonResult add(@RequestBody OmsCartItem cartItem) {
        int count = cartItemService.add(cartItem);
        if (count > 0) {
            return CommonResult.success(cartItem);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Get a customer’s shopping cart list")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<List<OmsCartItem>> list() {
        List<OmsCartItem> cartItemList = cartItemService.list(memberService.getCurrentMember().getId());
        return CommonResult.success(cartItemList);
    }

    @ApiOperation("Get a member's shopping cart list, including promotional information")
    @GetMapping(value = "/list/promotion")
    @ResponseBody
    public CommonResult<List<CartPromotionItem>> listPromotion(@RequestParam(required = false) List<Long> cartIds) {
        List<CartPromotionItem> cartPromotionItemList = cartItemService.listPromotion(memberService.getCurrentMember().getId(), cartIds);
        return CommonResult.success(cartPromotionItemList);
    }

    @ApiOperation("Modify the quantity of an item in the shopping cart")
    @GetMapping(value = "/update/quantity")
    @ResponseBody
    public CommonResult updateQuantity(@RequestParam Long id, @RequestParam Integer quantity) {
        int count = cartItemService.updateQuantity(id, memberService.getCurrentMember().getId(), quantity);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Get the specifications of a product in the shopping cart for reselecting specifications")
    @GetMapping(value = "/getProduct/{productId}")
    @ResponseBody
    public CommonResult<CartProduct> getCartProduct(@PathVariable Long productId) {
        CartProduct cartProduct = cartItemService.getCartProduct(productId);
        return CommonResult.success(cartProduct);
    }

    @ApiOperation("Modify the specifications of the items in the shopping cart")
    @RequestMapping(value = "/update/attr", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAttr(@RequestBody OmsCartItem cartItem) {
        int count = cartItemService.updateAttr(cartItem);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Delete an item in the shopping cart")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = cartItemService.delete(memberService.getCurrentMember().getId(), ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Empty shopping cart")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        int count = cartItemService.clear(memberService.getCurrentMember().getId());
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
