package cj.mybatis.studyproject01;

import cj.mybatis.studyproject01.dao.SysUserDao;
import cj.mybatis.studyproject01.entity.SysUserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Studyproject01ApplicationTests {

    @Autowired
    private SysUserDao sysUserDao;

    @Test
    public void test01(){
//        List<SysUserEntity> sysUserEntities = sysUserDao.selectList(null);
//        List<SysUserEntity> sysUserEntities2 = sysUserDao.selectList(null);
//        sysUserEntities.forEach(System.out::println);
        SysUserEntity wqn = sysUserDao.findByName("wqn");
        SysUserEntity wqn02 = sysUserDao.findByName("wqn");
        System.out.println(wqn);


    }
}
