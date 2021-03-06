/*
 * CouchDB-client
 * ==============
 * 
 * Copyright (C) 2016 Joaquim Rocha <jrocha@gmailbox.org>
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package net.uiqui.couchdb.api;

import net.uiqui.couchdb.impl.Cluster;

public class TypedDB<T extends Document> extends DB {
	private Class<T> type = null;
	
	public TypedDB(final Cluster cluster, final String db, final Class<T> type) {
		super(cluster, db);
		this.type = type;
	}

	public T get(final String docId) throws CouchException {
		return super.get(docId, type);
	}
}
