/*Copyright (c) 2015-2016 presense@presense.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with presense@presense.com*/

package com.presense.dadjf5a027tja9.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.presense.dadjf5a027tja9.*;

/**
 * Service object for domain model class Sensor.
 * @see com.presense.dadjf5a027tja9.Sensor
 */

public interface SensorService {
   /**
	 * Creates a new sensor.
	 * 
	 * @param created
	 *            The information of the created sensor.
	 * @return The created sensor.
	 */
	public Sensor create(Sensor created);

	/**
	 * Deletes a sensor.
	 * 
	 * @param sensorId
	 *            The id of the deleted sensor.
	 * @return The deleted sensor.
	 * @throws EntityNotFoundException
	 *             if no sensor is found with the given id.
	 */
	public Sensor delete(long sensorId) throws EntityNotFoundException;

	/**
	 * Finds all sensors.
	 * 
	 * @return A list of sensors.
	 */
	public Page<Sensor> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Sensor> findAll(Pageable pageable);
	
	/**
	 * Finds sensor by id.
	 * 
	 * @param id
	 *            The id of the wanted sensor.
	 * @return The found sensor. If no sensor is found, this method returns
	 *         null.
	 */
	public Sensor findById(long id) throws EntityNotFoundException;
	/**
	 * Updates the information of a sensor.
	 * 
	 * @param updated
	 *            The information of the updated sensor.
	 * @return The updated sensor.
	 * @throws EntityNotFoundException
	 *             if no sensor is found with given id.
	 */
	public Sensor update(Sensor updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the sensors in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the sensor.
	 */

	public long countAll();


    public Page<Sensor> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

