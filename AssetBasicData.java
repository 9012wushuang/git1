package com.edianzu.cloud.assets.model.data.basic;

import java.util.Date;

public class AssetBasicData {
    private Long id;

    private String lall;

    private String ladd;

    private String lreturn;

    private String luse;

    private String free;

    private String buy;

    private String lease;

    private String receiveUse;

    private String borrow;

    private String companyId;

    private String rootCompanyId;

    private Date date;

    private Integer monthBeginHandEnd;

    private Date cdate;

    private Date mdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLall() {
        return lall;
    }

    public void setLall(String lall) {
        this.lall = lall == null ? null : lall.trim();
    }

    public String getLadd() {
        return ladd;
    }

    public void setLadd(String ladd) {
        this.ladd = ladd == null ? null : ladd.trim();
    }

    public String getLreturn() {
        return lreturn;
    }

    public void setLreturn(String lreturn) {
        this.lreturn = lreturn == null ? null : lreturn.trim();
    }

    public String getLuse() {
        return luse;
    }

    public void setLuse(String luse) {
        this.luse = luse == null ? null : luse.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy == null ? null : buy.trim();
    }

    public String getLease() {
        return lease;
    }

    public void setLease(String lease) {
        this.lease = lease == null ? null : lease.trim();
    }

    public String getReceiveUse() {
        return receiveUse;
    }

    public void setReceiveUse(String receiveUse) {
        this.receiveUse = receiveUse == null ? null : receiveUse.trim();
    }

    public String getBorrow() {
        return borrow;
    }

    public void setBorrow(String borrow) {
        this.borrow = borrow == null ? null : borrow.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getRootCompanyId() {
        return rootCompanyId;
    }

    public void setRootCompanyId(String rootCompanyId) {
        this.rootCompanyId = rootCompanyId == null ? null : rootCompanyId.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMonthBeginHandEnd() {
        return monthBeginHandEnd;
    }

    public void setMonthBeginHandEnd(Integer monthBeginHandEnd) {
        this.monthBeginHandEnd = monthBeginHandEnd;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
}