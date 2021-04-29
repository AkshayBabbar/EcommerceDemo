package ecommerce.portal.controller;


import ecommerce.common.api.CommonResult.CommonResult;
import ecommerce.portal.domain.HomeContentResult;
import ecommerce.portal.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ormMapper.model.CmsSubject;
import ormMapper.model.PmsProduct;

import java.util.List;

@Controller
@RequestMapping("/home")
@Api(tags = "HomeController")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @ApiOperation("Homepage content page information display")
    @GetMapping(value = "/content")
    @ResponseBody
    public CommonResult<HomeContentResult> content() {
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }

    @ApiOperation("Paging to get recommended products")
    @GetMapping(value = "/recommendedProduct")
    @ResponseBody
    public CommonResult<List<PmsProduct>> recommendProductList(@RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize, @RequestParam(value = "pageNum", defaultValue = "4") Integer pageNum) {
        List<PmsProduct> productList = homeService.recommedProductList(pageSize, pageNum);
        return CommonResult.success(productList);
    }

    @ApiOperation("Get topics based on classification")
    @GetMapping(value = "/subjectList")
    @ResponseBody
    public CommonResult<List<CmsSubject>> getSubjectList(@RequestParam(required = false) Long categoryId, @RequestParam(value = "pageSize", defaultValue = "4") Integer pageSize, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<CmsSubject> subjectList = homeService.getSubjectList(categoryId, pageSize, pageNum);
        return CommonResult.success(subjectList);
    }

    @ApiOperation("Paging to get popular products recommended")
    @GetMapping(value = "/hotProductList")
    @ResponseBody
    public CommonResult<List<PmsProduct>> hotProductList(@RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = homeService.hotProductList(pageNum, pageSize);
        return CommonResult.success(productList);
    }

    @ApiOperation("Paging to get new products recommended")
    @GetMapping(value = "/newProductList")
    @ResponseBody
    public CommonResult<List<PmsProduct>> newProductList(@RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = homeService.newProductList(pageNum, pageSize);
        return CommonResult.success(productList);
    }


}
