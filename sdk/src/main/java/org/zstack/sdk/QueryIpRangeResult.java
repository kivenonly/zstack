package org.zstack.sdk;

public class QueryIpRangeResult {
    public java.util.List<IpRangeInventory> inventories;
    public void setInventories(java.util.List<IpRangeInventory> inventories) {
        this.inventories = inventories;
    }
    public java.util.List<IpRangeInventory> getInventories() {
        return this.inventories;
    }

    public java.lang.Long total;
    public void setTotal(java.lang.Long total) {
        this.total = total;
    }
    public java.lang.Long getTotal() {
        return this.total;
    }

}
