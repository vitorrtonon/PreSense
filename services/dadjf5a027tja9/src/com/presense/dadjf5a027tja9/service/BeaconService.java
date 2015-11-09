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
 * Service object for domain model class Beacon.
 * @see com.presense.dadjf5a027tja9.Beacon
 */

public interface BeaconService {
   /**
	 * Creates a new beacon.
	 * 
	 * @param created
	 *            The information of the created beacon.
	 * @return The created beacon.
	 */
	public Beacon create(Beacon created);

	/**
	 * Deletes a beacon.
	 * 
	 * @param beaconId
	 *            The id of the deleted beacon.
	 * @return The deleted beacon.
	 * @throws EntityNotFoundException
	 *             if no beacon is found with the given id.
	 */
	public Beacon delete(String beaconId) throws EntityNotFoundException;

	/**
	 * Finds all beacons.
	 * 
	 * @return A list of beacons.
	 */
	public Page<Beacon> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Beacon> findAll(Pageable pageable);
	
	/**
	 * Finds beacon by id.
	 * 
	 * @param id
	 *            The id of the wanted beacon.
	 * @return The found beacon. If no beacon is found, this method returns
	 *         null.
	 */
	public Beacon findById(String id) throws EntityNotFoundException;
	/**
	 * Updates the information of a beacon.
	 * 
	 * @param updated
	 *            The information of the updated beacon.
	 * @return The updated beacon.
	 * @throws EntityNotFoundException
	 *             if no beacon is found with given id.
	 */
	public Beacon update(Beacon updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the beacons in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the beacon.
	 */

	public long countAll();


    public Page<Beacon> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

