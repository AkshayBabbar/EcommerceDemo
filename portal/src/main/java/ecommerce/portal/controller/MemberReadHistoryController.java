package ecommerce.portal.controller;


import ecommerce.common.api.CommonPage;
import ecommerce.common.api.CommonResult;
import ecommerce.portal.domain.MemberReadHistory;
import ecommerce.portal.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api("MemberReadHistoryController")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {

    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("Create browsing history")
    @GetMapping("/create")
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.add(memberReadHistory);

        if (count > 0) {
            return CommonResult.success(memberReadHistory);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("Delete Browser History")
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        int count =memberReadHistoryService.delete(ids);
        if(count>0){
            return CommonResult.success(ids);
        }
        else{
            return  CommonResult.failed();
        }
    }

    @ApiOperation("Clear Browser History")
    @PostMapping("/clear")
    @ResponseBody
    public CommonResult clear() {
        memberReadHistoryService.clear();
        return CommonResult.success(null);
    }

    @ApiOperation("Paging to obtain user browsing history")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberReadHistory>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<MemberReadHistory> page = memberReadHistoryService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }


}
