package ecommerce.portal.controller;

import ecommerce.common.api.CommonPage;
import ecommerce.common.api.CommonResult;
import ecommerce.ormmapper.model.PmsProduct;
import ecommerce.portal.domain.PmsPortalProductDetail;
import ecommerce.portal.domain.PmsProductCategoryNode;
import ecommerce.portal.service.PmsPortalProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api("PmsPortalProductController")
@RequestMapping("/product")
public class PmsPortalProductController {

    @Autowired
    private PmsPortalProductService portalProductService;

    @ApiOperation(value = "Comprehensive search, filtering, and sorting")
    @ApiImplicitParam(name = "sort", value = "Sort field: 0->by relevance; 1->by new product; 2->by sales volume; 3->price from low to high; 4->price from high to low",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    @GetMapping("/search")
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> search(@RequestParam(required = false) String keyword,
                                                       @RequestParam(required = false) Long brandId,
                                                       @RequestParam(required = false) Long productCategoryId,
                                                       @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                       @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                                       @RequestParam(required = false, defaultValue = "0") Integer sort){
        List<PmsProduct> productList = portalProductService.search(keyword, brandId, productCategoryId, pageNum, pageSize, sort);
        return  CommonResult.success(CommonPage.restPage(productList));
    }
    @ApiOperation("Get all product categories in a tree structure")
    @GetMapping(value = "/categoryTreeList")
    @ResponseBody
    public CommonResult<List<PmsProductCategoryNode>> categoryTreeList() {
        List<PmsProductCategoryNode> list = portalProductService.categoryTreeList();
        return CommonResult.success(list);
    }

    @ApiOperation("Get product details at the front desk")
    @GetMapping(value = "/detail/{id}")
    @ResponseBody
    public CommonResult<PmsPortalProductDetail> detail(@PathVariable Long id) {
        PmsPortalProductDetail productDetail = portalProductService.detail(id);
        return CommonResult.success(productDetail);
    }

}
