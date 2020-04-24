package com.zx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zx.mapper.TAdminRoleMapper;
import com.zx.domain.TAdminRole;
import com.zx.service.TAdminRoleService;
@Service
public class TAdminRoleServiceImpl extends ServiceImpl<TAdminRoleMapper, TAdminRole> implements TAdminRoleService{

}
