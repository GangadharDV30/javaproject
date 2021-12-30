package com.onlineshopping.persistance;

import java.sql.SQLException;
import java.util.List;
import com.onlineshoppin.bean.OnlineShoping;
public interface OnlineDao {
	 List<OnlineShoping> getAllRecords()throws ClassNotFoundException,SQLException;
//	 OnlineShoping getRecordById(int id)throws ClassNotFoundException,SQLException;
}
