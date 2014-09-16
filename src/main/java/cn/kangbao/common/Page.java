/**
 * 
 */
package cn.kangbao.common;

import java.util.List;

import cn.kangbao.common.util.FrameWorkConstants;

/**
 * <Description>分页类：分页参数及查询结果的封装 <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月14日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.common <br>
 */

public class Page<T> {
    // 当前页码
    private int page = 1;

    // 每页记录数
    private int pageSize = FrameWorkConstants.DEFAULT_PAGE_SIZE;

    // 总页面
    private int totalPages;

    // 总记录数
    private int total;

    // 记录封装
    private List<T> rows;

    public Page() {

    }

    public Page(int pageNo, int pageSize) {
        setPage(pageNo);
        setPageSize(pageSize);
    }

    public void initOtherData() {
        setTotalPages((int) ((total - 1) / pageSize) + 1);

    }

    /**
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages the totalPages to set
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the rows
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(List<T> rows) {
        this.rows = rows;
    }

}
