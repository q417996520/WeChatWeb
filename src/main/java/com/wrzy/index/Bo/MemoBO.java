package com.wrzy.index.Bo;

import java.util.Date;

public class MemoBO {
    private String userId;

    private String memo;

    private Date xzsj;

    private String memodate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getXzsj() {
        return xzsj;
    }

    public void setXzsj(Date xzsj) {
        this.xzsj = xzsj;
    }

    public String getMemodate() {
        return memodate;
    }

    public void setMemodate(String memodate) {
        this.memodate = memodate == null ? null : memodate.trim();
    }
}