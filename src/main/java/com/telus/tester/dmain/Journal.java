/*
 *  Copyright (c) 2018 TELUS Communications Inc.,
 *  All Rights Reserved.
 *
 *  This document contains proprietary information that shall be
 *  distributed or routed only within TELUS, and its authorized
 *  clients, except with written permission of TELUS.
 *
 * $Id$
 */

package com.telus.tester.dmain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Journal
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private Date created;
    private String summary;
    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    public Journal(String title, String summary, String date) throws ParseException{
        this.title = title;
        this.summary = summary;
        this.created = format.parse(date);
    }
    
    Journal(){}

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getCreated()
    {
        return created;
    }

    public void setCreated(Date created)
    {
        this.created = created;
    }

    public String getSummary()
    {
        return summary;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public SimpleDateFormat getFormat()
    {
        return format;
    }

    public void setFormat(SimpleDateFormat format)
    {
        this.format = format;
    }
    
    public String getCreatedAsShort(){
        return format.format(created);
    }
    
    public String toString(){
        StringBuilder value = new StringBuilder("JournalEntry(");
        value.append("Id: ");
        value.append(id);
        value.append(",Title: ");
        value.append(title);
        value.append(",Summary: ");
        value.append(summary);
        value.append(",Created: ");
        value.append(getCreatedAsShort());
        value.append(")");
        return value.toString();
        }
    
}