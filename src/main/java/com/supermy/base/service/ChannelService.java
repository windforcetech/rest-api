/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.supermy.base.service;

import com.supermy.base.domain.Channel;
import com.supermy.base.repository.ChannelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * 复杂逻辑处理
 */
// Spring Bean的标识.
@Component
// 类中所有public函数都纳入事务管理的标识.
@Transactional
public class ChannelService {

	@Autowired
	private ChannelRepository channelRepository;



	public Page<Channel> getCollectionResource(Pageable pageable) {
		return channelRepository.findAll(null, pageable);

	}
}
