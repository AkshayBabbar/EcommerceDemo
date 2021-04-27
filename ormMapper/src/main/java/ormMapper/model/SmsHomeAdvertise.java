package ormMapper.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class SmsHomeAdvertise implements Serializable {

    private long id;
    private String name;

    @ApiModelProperty(value = "Carousel position: 0->PC homepage carousel; 1->app homepage carousel")
    private Integer type;

    private String pic;

    private Date startDate;

    private Date endDate;
    @ApiModelProperty(value = "Online and offline status: 0-> offline; 1-> online")
    private Integer status;

    @ApiModelProperty(value = "Hits")
    private Integer clickCount;

    @ApiModelProperty(value = "Order number")
    private Integer orderCount;

    @ApiModelProperty(value = "link address")
    private String url;

    @ApiModelProperty(value = "Remarks")
    private String note;

    @ApiModelProperty(value = "Sort")
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getendDate() {
        return endDate;
    }

    public void setendDate(Date endDate) {
        this.endDate = SmsHomeAdvertise.this.endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", pic=").append(pic);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", url=").append(url);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

}
