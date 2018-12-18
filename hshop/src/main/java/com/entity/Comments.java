package com.entity;

import java.util.Date;

public class Comments {
    private Long commentid;

    private Date adddate;

    private String content;

    private String ipaddress;

    private Long isread;

    private Long productid;

    private String replycontent;

    private Date replydate;

    private Long replyid;

    private String title;

    private Long vipid;

    public Long getCommentid() {
        return commentid;
    }

    public void setCommentid(Long commentid) {
        this.commentid = commentid;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Long getIsread() {
        return isread;
    }

    public void setIsread(Long isread) {
        this.isread = isread;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public Date getReplydate() {
        return replydate;
    }

    public void setReplydate(Date replydate) {
        this.replydate = replydate;
    }

    public Long getReplyid() {
        return replyid;
    }

    public void setReplyid(Long replyid) {
        this.replyid = replyid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentid=" + commentid +
                ", adddate=" + adddate +
                ", content='" + content + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", isread=" + isread +
                ", productid=" + productid +
                ", replycontent='" + replycontent + '\'' +
                ", replydate=" + replydate +
                ", replyid=" + replyid +
                ", title='" + title + '\'' +
                ", vipid=" + vipid +
                '}';
    }
}