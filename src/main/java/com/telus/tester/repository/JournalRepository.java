/*
 *  Copyright (c) 2017 TELUS Communications Inc.,
 *  All Rights Reserved.
 *
 *  This document contains proprietary information that shall be
 *  distributed or routed only within TELUS, and its authorized
 *  clients, except with written permission of TELUS.
 *
 * $Id$
 */

package com.telus.tester.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telus.tester.dmain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>
{

}
