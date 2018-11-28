package com.ocr.ocrbeans.ali.beans;

public class Prism_TablesInfo {
    private int tableId;
    private int xCellSize;
    private int yCellSize;
    private CellInfos cellInfos;

    @Override
    public String toString() {
        return "Prism_TablesInfo{" +
                "tableId=" + tableId +
                ", xCellSize=" + xCellSize +
                ", yCellSize=" + yCellSize +
                ", cellInfos=" + cellInfos +
                '}';
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getxCellSize() {
        return xCellSize;
    }

    public void setxCellSize(int xCellSize) {
        this.xCellSize = xCellSize;
    }

    public int getyCellSize() {
        return yCellSize;
    }

    public void setyCellSize(int yCellSize) {
        this.yCellSize = yCellSize;
    }

    public CellInfos getCellInfos() {
        return cellInfos;
    }

    public void setCellInfos(CellInfos cellInfos) {
        this.cellInfos = cellInfos;
    }
}
