package org.example.domain;

/*public record Cases(
        Integer newCases,
        Integer active,
        Integer critical,
        Integer recovered,
        Integer oneM_pop,
        Integer total) {*/

public class Cases {
    private Integer newCases;
    private Integer active;
    private Integer critical;
    private Integer recovered;
    private Integer oneM_pop;
    private Integer total;

    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getOneM_pop() {
        return oneM_pop;
    }

    public void setOneM_pop(Integer oneM_pop) {
        this.oneM_pop = oneM_pop;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cases{" +
                "newCases=" + newCases +
                ", active=" + active +
                ", critical=" + critical +
                ", recovered=" + recovered +
                ", oneM_pop=" + oneM_pop +
                ", total=" + total +
                '}';
    }
}
