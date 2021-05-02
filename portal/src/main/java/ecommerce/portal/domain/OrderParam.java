package ecommerce.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderParam {
    @ApiModelProperty("Delivery address ID")
    private Long memberReceiveAddressId;
    @ApiModelProperty("Coupon ID")
    private Long couponId;
    @ApiModelProperty("Number of points used")
    private Integer useIntegration;
    @ApiModelProperty("payment method")
    private Integer payType;
    @ApiModelProperty("ID of the selected shopping cart item")
    private List<Long> cartIds;
}
