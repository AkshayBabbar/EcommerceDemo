package ecommerce.portal.domain;

import ecommerce.ormmapper.model.SmsCoupon;
import ecommerce.ormmapper.model.SmsCouponHistory;
import ecommerce.ormmapper.model.SmsCouponProductCategoryRelation;
import ecommerce.ormmapper.model.SmsCouponProductRelation;

import java.util.List;

public class SmsCouponHistoryDetail extends SmsCouponHistory {
    //Related coupon information
    private SmsCoupon coupon;
    //Coupon-related products
    private List<SmsCouponProductRelation> productRelationList;
    //Coupon-related product classification
    private List<SmsCouponProductCategoryRelation> categoryRelationList;

    public SmsCoupon getCoupon() {
        return coupon;
    }

    public void setCoupon(SmsCoupon coupon) {
        this.coupon = coupon;
    }

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getCategoryRelationList() {
        return categoryRelationList;
    }

    public void setCategoryRelationList(List<SmsCouponProductCategoryRelation> categoryRelationList) {
        this.categoryRelationList = categoryRelationList;
    }
}
