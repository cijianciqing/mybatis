package cj.mybatis.studyproject01.service.impl;

import cj.mybatis.studyproject01.dao.SysRoleDao;
import cj.mybatis.studyproject01.entity.SysUserEntity;
import cj.mybatis.studyproject01.dao.SysUserDao;
import cj.mybatis.studyproject01.service.SysUserService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cj
 * @since 2021-12-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @DS("db1")
    public void test(){
        System.out.println("cj.mybatis.studyproject01.service.impl.SysUserServiceImpl.test1....");
        SysUserEntity sysUserEntity = sysUserDao.selectList(null).get(0);
        System.out.println(sysUserEntity);
    }

    @DS("db2")
    public void test2(){
        System.out.println("cj.mybatis.studyproject01.service.impl.SysUserServiceImpl.test2....");
        SysUserEntity sysUserEntity = sysUserDao.selectList(null).get(0);
        System.out.println(sysUserEntity);

    }

}
