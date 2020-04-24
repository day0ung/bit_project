package com.palette.s3;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ReferenceVo {

    private int gorupSeq;
    private int memberSeq;
    private String memberId;
    private String title;
    private String content;
    private List<MultipartFile> files;

    public ReferenceVo() {
    }

    public ReferenceVo(int gorupSeq, int memberSeq, String title, String content, String memberId, List<MultipartFile> files) {
        this.gorupSeq = gorupSeq;
        this.memberSeq = memberSeq;
        this.title = title;
        this.content = content;
        this.memberId = memberId;
        this.files = files;
    }

    public int getGorupSeq() {
        return this.gorupSeq;
    }

    public void setGorupSeq(int gorupSeq) {
        this.gorupSeq = gorupSeq;
    }

    public int getMemberSeq() {
        return this.memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<MultipartFile> getFiles() {
        return this.files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    public ReferenceVo gorupSeq(int gorupSeq) {
        this.gorupSeq = gorupSeq;
        return this;
    }

    public ReferenceVo memberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
        return this;
    }

    public ReferenceVo title(String title) {
        this.title = title;
        return this;
    }

    public ReferenceVo content(String content) {
        this.content = content;
        return this;
    }

    public ReferenceVo memberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public ReferenceVo files(List<MultipartFile> files) {
        this.files = files;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " gorupSeq='" + getGorupSeq() + "'" +
            ", memberSeq='" + getMemberSeq() + "'" +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", memberId='" + getMemberId() + "'" +
            ", files='" + getFiles() + "'" +
            "}";
    }

}