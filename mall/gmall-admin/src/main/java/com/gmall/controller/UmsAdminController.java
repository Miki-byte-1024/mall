package com.gmall.controller;

import com.github.pagehelper.PageHelper;
import com.gmall.common.api.CommonPage;
import com.gmall.common.api.CommonResult;
import com.gmall.model.UmsAdmin;
import com.gmall.model.UmsAdminExample;
import com.gmall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @RequestMapping("/list")
    @ResponseBody
    public CommonPage<UmsAdmin> getUmsAdminByPage(@RequestParam(value = "keyword",required = false) String strKeyWord,
                                                  @RequestParam(value = "pageNum",defaultValue = "0") Integer pageNum,
                                                  @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize) {
       return umsAdminService.getUmsAdminByPage(strKeyWord,pageNum,pageSize);
    }

    @RequestMapping("")
    @ResponseBody
    public CommonResult<UmsAdmin> registerUmsAdmin(UmsAdmin umsAdmin) {
        return umsAdminService.getUmsAdminByPage(strKeyWord,pageNum,pageSize);
    }
}
