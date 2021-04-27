package ecommerce.portal.domain;

import ormMapper.model.CmsSubject;
import ormMapper.model.PmsBrand;
import ormMapper.model.PmsProduct;
import ormMapper.model.SmsHomeAdvertise;

import java.util.List;

public class HomeContentResult {

    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;
    //当前秒杀场次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
    //推荐专题
    private List<CmsSubject> subjectList;
}
