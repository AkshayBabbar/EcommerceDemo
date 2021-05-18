package ecommerce.portal.service;

import ecommerce.common.api.CommonPage;
import ecommerce.ormmapper.model.PmsBrand;
import ecommerce.ormmapper.model.PmsProduct;

import java.util.List;

public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
