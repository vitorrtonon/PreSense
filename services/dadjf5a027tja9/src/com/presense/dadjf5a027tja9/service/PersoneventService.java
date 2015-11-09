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
 * Service object for domain model class Personevent.
 * @see com.presense.dadjf5a027tja9.Personevent
 */

public interface PersoneventService {
   /**
	 * Creates a new personevent.
	 * 
	 * @param created
	 *            The information of the created personevent.
	 * @return The created personevent.
	 */
	public Personevent create(Personevent created);

	/**
	 * Deletes a personevent.
	 * 
	 * @param personeventId
	 *            The id of the deleted personevent.
	 * @return The deleted personevent.
	 * @throws EntityNotFoundException
	 *             if no personevent is found with the given id.
	 */
	public Personevent delete(PersoneventId personeventId) throws EntityNotFoundException;

	/**
	 * Finds all personevents.
	 * 
	 * @return A list of personevents.
	 */
	public Page<Personevent> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Personevent> findAll(Pageable pageable);
	
	/**
	 * Finds personevent by id.
	 * 
	 * @param id
	 *            The id of the wanted personevent.
	 * @return The found personevent. If no personevent is found, this method returns
	 *         null.
	 */
	public Personevent findById(PersoneventId id) throws EntityNotFoundException;
	/**
	 * Updates the information of a personevent.
	 * 
	 * @param updated
	 *            The information of the updated personevent.
	 * @return The updated personevent.
	 * @throws EntityNotFoundException
	 *             if no personevent is found with given id.
	 */
	public Personevent update(Personevent updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the personevents in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the personevent.
	 */

	public long countAll();


    public Page<Personevent> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

