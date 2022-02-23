package cj.mybatis.studyproject01.controller;


import cj.mybatis.studyproject01.service.impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cj
 * @since 2021-12-03
 */
@RestController
@RequestMapping("/studyproject01/user")
public class SysUserController {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @RequestMapping("/test01")
    public void test01(){
        System.out.println("cj.mybatis.studyproject01.controller.SysUserController.test01....");
        sysUserService.test();
        sysUserService.test2();

    }


}
