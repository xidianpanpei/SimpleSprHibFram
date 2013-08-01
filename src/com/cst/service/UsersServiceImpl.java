/** 
 * 文 件 名 : UsersServiceImpl.java
 * 版权：CopyRright (c) 2008-xxxx: 
 * 描述： 
 * 修改人： crazylion
 * 修改时间： 2013年7月14日
 * 跟踪单号： 
 * 修改单号： 
 * 修改内容： 
 */ 
package com.cst.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cst.dao.DaoImpl;
import com.cst.model.Users;

/**
 * @author crazylion
 *
 */
@Service("usersServiceImpl")
@Repository
public class UsersServiceImpl implements UsersService
{
	@Resource
	private DaoImpl daoImpl;

	public void setDaoImpl(DaoImpl daoImpl)
	{
		this.daoImpl = daoImpl;
	}

	public DaoImpl getdaoImpl()
	{
		return daoImpl;
	}

	@Override
	public void addUser(Users user)
	{
		daoImpl.getHibernateTemplate().save(user);
	}
}
