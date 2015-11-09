/*Copyright (c) 2015-2016 presense@presense.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with presense@presense.com*/

package com.presense.dadjf5a027tja9.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.presense.dadjf5a027tja9.*;
/**
 * Specifies methods used to obtain and modify Person related information
 * which is stored in the database.
 */
@Repository("dadjf5a027tja9.PersonDao")
public class PersonDao extends WMGenericDaoImpl <Person, Long> {

   @Autowired
   @Qualifier("dadjf5a027tja9Template")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}

