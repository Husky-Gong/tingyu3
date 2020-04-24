package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.mapper.THostMapper;
import com.zx.domain.THost;
import com.zx.service.THostService;
@Service
public class THostServiceImpl extends ServiceImpl<THostMapper, THost> implements THostService{

}
