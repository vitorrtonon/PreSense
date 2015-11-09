/*Copyright (c) 2015-2016 presense@presense.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with presense@presense.com*/


package com.presense.dadjf5a027tja9.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class Dadjf5a027tja9ProcedureExecutorServiceImpl implements Dadjf5a027tja9ProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Dadjf5a027tja9ProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("dadjf5a027tja9WMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;


	@Transactional(value = "dadjf5a027tja9TransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

