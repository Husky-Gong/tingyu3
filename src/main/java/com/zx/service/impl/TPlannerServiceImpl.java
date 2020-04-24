package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.domain.TPlanner;
import com.zx.mapper.TPlannerMapper;
import com.zx.service.TPlannerService;
@Service
public class TPlannerServiceImpl extends ServiceImpl<TPlannerMapper, TPlanner> implements TPlannerService{

}
