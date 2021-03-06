package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogSync
{
    // List of call log records with synchronization information. For ISync the total number of returned records is limited to 250; this includes both new records and the old ones, specified by the recordCount parameter
    public CallLogRecord[] records;
    public CallLogSync records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }
    // Sync information (type, token and time)
    public SyncInfoCallLog syncInfo;
    public CallLogSync syncInfo(SyncInfoCallLog syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
