package com.esdemo;

import java.util.List;

public class ACBean {
    private List<AccessInfoModel> rows;
    private Integer total;

    @Override
    public String toString() {
        return "ACBean{" +
                "rows=" + rows +
                ", total=" + total +
                '}';
    }

    public List<AccessInfoModel> getRows() {
        return rows;
    }

    public void setRows(List<AccessInfoModel> rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
