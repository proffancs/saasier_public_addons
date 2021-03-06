/*
 * OpenERP, Open Source Management Solution
 * Copyright (C) 2012-today OpenERP SA (<http:www.openerp.com>)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 * 
 */
package com.openerp.base.ir;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.openerp.orm.OEColumn;
import com.openerp.orm.OEDatabase;
import com.openerp.orm.OEFields;

public class product_model extends OEDatabase {

	Context mContext = null;

	public product_model(Context context) {
		super(context);
		mContext = context;

	}

	
	public String getModelName() {
		return "mrp.production";
	}

	public List<OEColumn> getModelColumns() {
		List<OEColumn> columns = new ArrayList<OEColumn>();
	//	columns.add(new OEColumn("move_ids","177", OEFields.varchar(50)));
		columns.add(new OEColumn("id","20", OEFields.varchar(50)));

		return columns;
	}
}
