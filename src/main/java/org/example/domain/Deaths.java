package org.example.domain;

/*public record Deaths(
        Integer newCases,
        Integer oneM_pop,
        Integer total)*/
public class Deaths {
    private Integer newCases;
    private Integer oneM_pop;
    private Integer total;

    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
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
        return "Deaths{" +
                "newCases=" + newCases +
                ", oneM_pop=" + oneM_pop +
                ", total=" + total +
                '}';
    }
}
