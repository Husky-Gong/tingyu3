package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.mapper.TCompanyMapper;
import com.zx.domain.TCompany;
import com.zx.service.TCompanyService;
@Service
public class TCompanyServiceImpl extends ServiceImpl<TCompanyMapper, TCompany> implements TCompanyService{

}
