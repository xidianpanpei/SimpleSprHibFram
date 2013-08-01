/** 
 * 文 件 名 : BaseDao.java
 * 版权：CopyRright (c) 2008-xxxx: 
 * 描述： 
 * 修改人： crazylion
 * 修改时间： 2013年7月14日
 * 跟踪单号： 
 * 修改单号： 
 * 修改内容： 
 */ 
package com.cst.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author crazylion
 *
 */
public interface BaseDao
{
	public HibernateTemplate getHibernateTemplate();

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);
}
