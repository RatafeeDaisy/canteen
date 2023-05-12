package com.canteen.entity;

import java.util.Date;

public class CanteenCustomer {
    private String customerId;

    private String customerName;

    private String customerMobile;

    private String customerAddress;

    private String customerPostscript;

    private Date createTime;

    private Date updateTime;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile == null ? null : customerMobile.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerPostscript() {
        return customerPostscript;
    }

    public void setCustomerPostscript(String customerPostscript) {
        this.customerPostscript = customerPostscript == null ? null : customerPostscript.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerMobile=").append(customerMobile);
        sb.append(", customerAddress=").append(customerAddress);
        sb.append(", customerPostscript=").append(customerPostscript);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}