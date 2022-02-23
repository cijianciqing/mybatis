package cj.mybatis.studyproject01.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import cj.mybatis.studyproject01.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cj
 * @since 2021-12-03
 */
public interface SysUserDao extends BaseMapper<SysUserEntity> {
    SysUserEntity findByName(@Param("name") String name);
}
