package com.edianzu.cloud.assets.model.data.basic;

import java.util.Date;

public class AssetBasicData {
    private Long id;

    private String assetStatus;

    private String assetSource;

    private String assetOther;

    private Long companyId;

    private Long rootCompanyId;

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

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus == null ? null : assetStatus.trim();
    }

    public String getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(String assetSource) {
        this.assetSource = assetSource == null ? null : assetSource.trim();
    }

    public String getAssetOther() {
        return assetOther;
    }

    public void setAssetOther(String assetOther) {
        this.assetOther = assetOther == null ? null : assetOther.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getRootCompanyId() {
        return rootCompanyId;
    }

    public void setRootCompanyId(Long rootCompanyId) {
        this.rootCompanyId = rootCompanyId;
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