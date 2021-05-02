package ecommerce.portal.domain;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class OmsOrderReturnApplyParam {
    @ApiModelProperty("Order Id")
    private Long orderId;
    @ApiModelProperty("product id")
    private Long productId;
    @ApiModelProperty("Order number")
    private String orderSn;
    @ApiModelProperty("会员用户名")
    private String memberUsername;
    @ApiModelProperty("退货人姓名")
    private String returnName;
    @ApiModelProperty("退货人电话")
    private String returnPhone;
    @ApiModelProperty("商品图片")
    private String productPic;
    @ApiModelProperty("商品名称")
    private String productName;
    @ApiModelProperty("商品品牌")
    private String productBrand;
    @ApiModelProperty("商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;
    @ApiModelProperty("退货数量")
    private Integer productCount;
    @ApiModelProperty("商品单价")
    private BigDecimal productPrice;
    @ApiModelProperty("商品实际支付单价")
    private BigDecimal productRealPrice;
    @ApiModelProperty("原因")
    private String reason;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("凭证图片，以逗号隔开")
    private String proofPics;
}
