package com.gmall.service;

import com.gmall.common.api.CommonPage;
import com.gmall.common.api.CommonResult;
import com.gmall.model.UmsAdmin;

public interface UmsAdminService {
    //分页查询
    public CommonPage<UmsAdmin> getUmsAdminByPage(String strKeyWord,Integer pageNum,Integer pageSize);

    //添加
    public UmsAdmin registerUmsAdmin(UmsAdmin umsAdmin);

    public Boolean delUmsAdmin(Integer userId);


}
