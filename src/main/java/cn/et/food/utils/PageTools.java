package cn.et.food.utils;

import java.util.List;

import cn.et.food.entity.Food;

public class PageTools {

	public PageTools(Integer curPage, Integer pageCount, Integer total) {
		this.curPage = curPage;
		this.total=total;
		this.pageCount = (pageCount == null ? this.pageCount : pageCount);
		this.totalPage = (total % this.pageCount == 0 ? total	/ this.pageCount : total / this.pageCount + 1);
		this.prePage = (curPage == 1 ? curPage : curPage - 1);
		
		this.nextPage = (curPage == totalPage ? totalPage : curPage + 1);
		this.startIndex = (curPage - 1) * this.pageCount + 1;
		this.endIndex = curPage * this.pageCount;
	}

	private Integer curPage;

	public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public Integer getPrePage() {
		return prePage;
	}

	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	private Integer prePage;

	private Integer nextPage;

	private Integer totalPage;

	private Integer total;

	private Integer pageCount = 5;

	private List rows;

	private Integer startIndex;

	private Integer endIndex;

	
}
