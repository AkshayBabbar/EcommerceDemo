package ecommerce.portal.service;

import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.portal.domain.PmsPortalProductDetail;
import ecommerce.portal.domain.PmsProductCategoryNode;

import java.util.List;

public interface PmsPortalProductService {
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    List<PmsProductCategoryNode> categoryTreeList();

    PmsPortalProductDetail detail(Long id);

}
