package com.gmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.gmall.common.api.CommonPage;
import com.gmall.common.api.CommonResult;
import com.gmall.mapper.UmsAdminMapper;
import com.gmall.model.UmsAdmin;
import com.gmall.model.UmsAdminExample;
import com.gmall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public CommonPage<UmsAdmin> getUmsAdminByPage(String strKeyWord, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        UmsAdminExample umsAdminExample = new UmsAdminExample();
        if(!StringUtils.isEmpty(strKeyWord)){
            UmsAdminExample.Criteria criteria = umsAdminExample.createCriteria();
            criteria.andUsernameLike("%"+strKeyWord+"%");
            umsAdminExample.or(umsAdminExample.createCriteria().andNickNameLike("%"+strKeyWord+"%"));
        }
        List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(umsAdminExample);
        return CommonPage.pageHelper(umsAdminList);
    }

    @Override
    public UmsAdmin registerUmsAdmin(UmsAdmin umsAdmin) {
        //非空检查
        if(StringUtils.isEmpty(umsAdmin.getUsername()) ||
                StringUtils.isEmpty(umsAdmin.getPassword())){
            return null;
        }
        //判断username是否重复
        //密码加密
        passwordEncoder.encode();
        return null;
    }

    @Override
    public Boolean delUmsAdmin(Integer userId) {
        return null;
    }


}
