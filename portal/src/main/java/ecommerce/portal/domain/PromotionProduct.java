package ecommerce.portal.domain;

import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.ormmapper.model.PmsProductFullReduction;
import ecommerce.ormmapper.model.PmsProductLadder;
import ecommerce.ormmapper.model.PmsSkuStock;

import java.util.List;

public class PromotionProduct extends PmsProduct {
    private List<PmsSkuStock> skuStockList;
    //Product discount information
    private List<PmsProductLadder> productLadderList;
    //Commodity full reduction information
    private List<PmsProductFullReduction> productFullReductionList;

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }
}
