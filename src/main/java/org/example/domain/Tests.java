package org.example.domain;

/*public record Tests (Integer oneM_pop, Integer total) {*/
public class Tests {
    private Integer oneM_pop;
    private Integer total;

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
        return "Tests{" +
                "oneM_pop=" + oneM_pop +
                ", total=" + total +
                '}';
    }
}
