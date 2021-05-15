package ecommerce.portal.service;

import ecommerce.ormmapper.model.PmsProductCategory;
import ecommerce.portal.domain.HomeContentResult;
import ecommerce.ormmapper.model.CmsSubject;
import ecommerce.ormmapper.model.PmsProduct;

import java.util.List;

public interface HomeService {
    /**
     * Get homepage content
     *
     * @return
     */
    HomeContentResult content();

    /**
     * Home product recommendation
     *
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PmsProduct> recommedProductList(Integer pageSize, Integer pageNum);

    /**
     * Paging to get topics according to topic classification
     *
     * @param categoryId Thematic category id
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<CmsSubject> getSubjectList(Long categoryId, Integer pageSize, Integer pageNum);


    /**
     * Paging to get popular recommended products
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * Paging to get new recommended products
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);

    /**
     * Get product category
     * @param parentId 0: Obtain the first-level classification; Other: Obtain the designated second-level classification
     * @return
     */
    List<PmsProductCategory> getProductCateList(Long parentId);
}
