package pub.wkq.infrastructure.dao;


import pub.wkq.infrastructure.po.UserEntity;

/**
 * 虫洞栈：https://bugstack.cn
 * 公众号：bugstack虫洞栈 | 欢迎关注并获取更多专题案例源码
 * Create by fuzhengwei on @2019
 */
public interface UserDao {

    void save(UserEntity userEntity);

    UserEntity query(Long id);

}
