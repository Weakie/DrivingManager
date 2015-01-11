package com.weakie.driving.service.driver;

import java.util.List;

import com.weakie.driving.model.CallRecord;
import com.weakie.driving.utils.PageControl;

public interface CallRecordService {

	public List<CallRecord> getCallRecords(PageControl p);
}
