package ecommerce.portal.controller;

import ecommerce.common.api.CommonPage;
import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.ConfirmOrderResult;
import ecommerce.portal.domain.OmsOrderDetail;
import ecommerce.portal.domain.OrderParam;
import ecommerce.portal.service.OmsPortalOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@Api("OmsPortalOrderController")
@RequestMapping("/order")
public class OmsPortalOrderController {
    @Autowired
    private OmsPortalOrderService portalOrderService;

    @ApiOperation("Generate confirmation form information based on shopping cart information")
    @PostMapping(value = "/generateConfirmOrder")
    @ResponseBody
    public CommonResult<ConfirmOrderResult> generateConfirmOrder(@RequestBody List<Long> cartIds) {
        ConfirmOrderResult confirmOrderResult = portalOrderService.generateConfirmOrder(cartIds);
        return CommonResult.success(confirmOrderResult);
    }

    @ApiOperation("Generate orders based on shopping cart information")
    @PostMapping("/generateOrder")
    @ResponseBody
    public CommonResult generateOrder(@RequestBody OrderParam orderParam) {
        Map<String, Object> result = portalOrderService.generateOrder(orderParam);
        return CommonResult.success(result, "successfully ordered");
    }

    @ApiOperation("Callback of user payment success")
    @PostMapping(value = "/paySuccess")
    @ResponseBody
    public CommonResult paySuccess(@RequestParam Long orderId, @RequestParam Integer payType) {
        Integer count = portalOrderService.paySuccess(orderId, payType);
        return CommonResult.success(count, "支付成功");
    }

    @ApiOperation("Automatically cancel overtime orders")
    @PostMapping(value = "/cancelTimeOutOrder")
    @ResponseBody
    public CommonResult cancelTimeOutOrder() {
        portalOrderService.cancelTimeOutOrder();
        return CommonResult.success(null);
    }

    @ApiOperation("Cancel a single timeout order")
    @PostMapping(value = "/cancelOrder")
    @ResponseBody
    public CommonResult cancelOrder(Long orderId) {
        portalOrderService.sendDelayMessageCancelOrder(orderId);
        return CommonResult.success(null);
    }

    @ApiOperation("Get the list of user orders by status")
    @ApiImplicitParam(name = "status", value = "Order status: -1->all; 0->to be paid; 1->to be shipped; 2->shipped; 3->completed; 4->closed",
            defaultValue = "-1", allowableValues = "-1,0,1,2,3,4", paramType = "query", dataType = "int")
    @GetMapping(value = "/list")
    @ResponseBody
    public CommonResult<CommonPage<OmsOrderDetail>> list(@RequestParam Integer status,
                                                         @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                         @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        CommonPage<OmsOrderDetail> orderPage = portalOrderService.list(status, pageNum, pageSize);
        return CommonResult.success(orderPage);
    }

    @ApiOperation("Get order details based on ID")
    @GetMapping(value = "/detail/{orderId}")
    @ResponseBody
    public CommonResult<OmsOrderDetail> detail(@PathVariable Long orderId) {
        OmsOrderDetail orderDetail = portalOrderService.detail(orderId);
        return CommonResult.success(orderDetail);
    }

    @ApiOperation("User cancels the order")
    @PostMapping(value = "/cancelUserOrder")
    @ResponseBody
    public CommonResult cancelUserOrder(Long orderId) {
        portalOrderService.cancelOrder(orderId);
        return CommonResult.success(null);
    }

    @ApiOperation("user confirms the receipt")
    @PostMapping(value = "/confirmReceiveOrder")
    @ResponseBody
    public CommonResult confirmReceiveOrder(Long orderId) {
        portalOrderService.confirmReceiveOrder(orderId);
        return CommonResult.success(null);
    }

    @ApiOperation("User delete order")
    @PostMapping(value = "/deleteOrder")
    @ResponseBody
    public CommonResult deleteOrder(Long orderId) {
        portalOrderService.deleteOrder(orderId);
        return CommonResult.success(null);
    }
}
