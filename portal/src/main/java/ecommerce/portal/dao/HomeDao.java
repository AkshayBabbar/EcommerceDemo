package ecommerce.portal.dao;

import ecommerce.ormmapper.model.CmsSubject;
import ecommerce.ormmapper.model.PmsBrand;
import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.portal.domain.FlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HomeDao {

    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset, @Param("limit") Integer limit);

    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId, @Param("sessionId") Long sessionId);

    List<PmsProduct> getNewProductList(@Param("offset") Integer offset, @Param("limit") Integer limit);


    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);

    List<CmsSubject> getRecommendSubjectList(@Param("offset") Integer offset, @Param("limit") Integer limit);

}
