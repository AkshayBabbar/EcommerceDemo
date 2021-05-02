package ecommerce.portal.domain;

import ecommerce.ormmapper.model.OmsCartItem;

import java.math.BigDecimal;

/**
 * Encapsulation of promotional information in the shopping cart
 */
public class CartPromotionItem extends OmsCartItem {
    //Promotion information
    private String promotionMessage;
    //The amount subtracted from the promotion, for each product
    private BigDecimal reduceAmount;
    //The actual inventory of the product (remaining inventory-locked inventory)
    private Integer realStock;
    //Free points for purchasing goods
    private Integer integration;
    //Free growth value for purchasing goods
    private Integer growth;

    public String getPromotionMessage() {
        return promotionMessage;
    }

    public void setPromotionMessage(String promotionMessage) {
        this.promotionMessage = promotionMessage;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getRealStock() {
        return realStock;
    }

    public void setRealStock(Integer realStock) {
        this.realStock = realStock;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }
}
