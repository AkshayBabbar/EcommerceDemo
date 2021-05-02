package ecommerce.portal.controller;


import ecommerce.common.api.CommonPage;
import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.MemberProductCollection;
import ecommerce.portal.service.MemberCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Member Collection Controller
 */

@Controller
@Api(tags = "MemberCollectionController")
@RequestMapping("/member/productCollection")
public class MemberProductCollectionController {

    @Autowired
    private MemberCollectionService memberCollectionService;

    @ApiOperation("Add Product to Collection")
    @PostMapping("/add")
    @ResponseBody
    public CommonResult add(@RequestBody MemberProductCollection productCollection) {
        int count = memberCollectionService.add(productCollection);
        if (count > 0) {
            return CommonResult.success(productCollection);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("delete from favourites")
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult delete(Long productId) {
        int count = memberCollectionService.delete(productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Show favorite list")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberProductCollection>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<MemberProductCollection> page = memberCollectionService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("Show favorite product details")
    @GetMapping("/details")
    @ResponseBody
    public CommonResult<MemberProductCollection> detail(@RequestParam Long productId) {
        MemberProductCollection memberProductCollection = memberCollectionService.detail(productId);
        return CommonResult.success(memberProductCollection);
    }

    @ApiOperation("Clear favorite list")
    @PostMapping("/clear")
    @ResponseBody
    public CommonResult clear() {
        memberCollectionService.clear();
        return CommonResult.success(null);
    }


}
