package com.palette.model;

public class InterBigDto {

    private int interBigSeq;
    private String bigName;

    public InterBigDto() {
    }

    public InterBigDto(int interBigSeq, String bigName) {
        this.interBigSeq = interBigSeq;
        this.bigName = bigName;
    }

    public int getInterBigSeq() {
        return this.interBigSeq;
    }

    public void setInterBigSeq(int interBigSeq) {
        this.interBigSeq = interBigSeq;
    }

    public String getBigName() {
        return this.bigName;
    }

    public void setBigName(String bigName) {
        this.bigName = bigName;
    }

    public InterBigDto interBigSeq(int interBigSeq) {
        this.interBigSeq = interBigSeq;
        return this;
    }

    public InterBigDto bigName(String bigName) {
        this.bigName = bigName;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " interBigSeq='" + getInterBigSeq() + "'" +
            ", bigName='" + getBigName() + "'" +
            "}";
    }

}