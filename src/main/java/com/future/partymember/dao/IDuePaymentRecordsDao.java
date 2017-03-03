package com.future.partymember.dao;
/*
 * 党费缴纳记录的数据层接口
 * @焦祥宇
 * 
 */
import java.util.List;

import com.future.partymember.entity.DuePaymentRecords;

public interface IDuePaymentRecordsDao {
	public Boolean addDuePaymentRecords(DuePaymentRecords duePaymentRecords);
	public Boolean delectDuePaymentRecords(DuePaymentRecords duePaymentRecords);
	public Boolean updateDuePaymentRecords(DuePaymentRecords duePaymentRecords);
	public List<DuePaymentRecords> seekDuePaymentRecordsById(List<DuePaymentRecords> list,int pm_id);
}
