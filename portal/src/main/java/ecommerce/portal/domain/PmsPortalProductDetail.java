package ecommerce.portal.domain;

import ecommerce.ormmapper.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PmsPortalProductDetail {
    @ApiModelProperty("Commodity information")
    private PmsProduct product;
    @ApiModelProperty("product brand")
    private PmsBrand brand;
    @ApiModelProperty("Commodity attributes and parameters")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("Manually entered product attributes and parameter values")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("Sku inventory information of the product")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("Commodity price setting")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("Commodity full reduction price setting")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("Coupons available for merchandise")
    private List<SmsCoupon> couponList;
}
