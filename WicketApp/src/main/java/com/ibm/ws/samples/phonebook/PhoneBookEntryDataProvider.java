/*
 * COPYRIGHT LICENSE: This information contains sample code provided in source code form.
 * You may copy, modify, and distribute these sample programs in any form without payment
 * to IBM for the purposes of developing, using, marketing or distributing application
 * programs conforming to the application programming interface for the operating platform
 * for which the sample code is written.
 * 
 * Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON 
 * AN "AS IS" BASIS AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING,
 * BUT NOT LIMITED TO, ANY IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY,
 * SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE, AND ANY WARRANTY OR
 * CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF
 * THE SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT,
 * UPDATES, ENHANCEMENTS OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
 * 
 * (C) Copyright IBM Corp. 2001, 2013.
 * All Rights Reserved. Licensed Materials - Property of IBM.
 */
package com.ibm.ws.samples.phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;

public class PhoneBookEntryDataProvider implements IDataProvider<PhoneBookEntry>{

	public static Map<String, PhoneBookEntry> phoneBookDataBase = initPhoneBook();

	@Override
	public Iterator<? extends PhoneBookEntry> iterator(long first, long count) {
		return phoneBookDataBase.values().iterator();
	}

	@Override
	public long size() {
		return phoneBookDataBase.size();
	}

	@Override
	public IModel<PhoneBookEntry> model(PhoneBookEntry object) {
		return new DetachablePhoneBookEntryModel(object);	}

	@Override
	public void detach() {
	}

	// A real app would use a more proper database
	private static Map<String, PhoneBookEntry> initPhoneBook() {
		Map<String, PhoneBookEntry> phoneBookDataBase = new HashMap<String, PhoneBookEntry>();
        phoneBookDataBase.put("Tom", new PhoneBookEntry("Tom", "133-4567-2311"));
        phoneBookDataBase.put("Jerry", new PhoneBookEntry("Jerry", "133-4567-2312"));
        return phoneBookDataBase;
	}
}
