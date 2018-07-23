package cn.isdev.springh.dao;

import cn.isdev.springh.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Administrator on 2018/7/23.
 */
public class UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User user){
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
}
