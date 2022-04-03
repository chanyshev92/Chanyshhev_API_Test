
package ru.reqresin.data.userspage;


import java.util.List;


public class UsersPage {

    private Integer page;
    private Integer perPage;
    private Integer total;
    private Integer totalPages;
    private List<Datum> data = null;
    private Support support;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UsersPage() {
        super();
    }

    /**
     * 
     * @param total
     * @param perPage
     * @param data
     * @param totalPages
     * @param page
     * @param support
     */
    public UsersPage(Integer page, Integer perPage, Integer total, Integer totalPages, List<Datum> data, Support support) {
        super();
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.support = support;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

}
