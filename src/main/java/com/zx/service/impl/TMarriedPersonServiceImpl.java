package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.domain.TMarriedPerson;
import com.zx.mapper.TMarriedPersonMapper;
import com.zx.service.TMarriedPersonService;
@Service
public class TMarriedPersonServiceImpl extends ServiceImpl<TMarriedPersonMapper, TMarriedPerson> implements TMarriedPersonService{

}
