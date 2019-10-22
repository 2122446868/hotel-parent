package com.java.mapper;

import com.java.pojo.OneMenu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Desctiption TODO
 * @Author 梦白
 * @Date 2019/10/22 11:36
 * @Version
 **/
public interface LoginMapper {
//    登录
   @Select("SELECT COUNT(*) FROM system_user where username =#{0} AMD pwd=#{1}")
   int login (String username,String password);
//   根据用户id获取具体的权限
  List<OneMenu> getAuthorityByUserID(Long id);

}
