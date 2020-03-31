package com.palette.model;

import org.apache.ibatis.type.Alias;

/**
 * MemberDto
 */
@Alias("MemberDto")
public class MemberDto {

    private String name;
    private String pwd;
    private String id;
    private String email;

    public MemberDto() {
    }

    public MemberDto(String name, String pwd, String id, String email) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberDto name(String name) {
        this.name = name;
        return this;
    }

    public MemberDto pwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public MemberDto id(String id) {
        this.id = id;
        return this;
    }

    public MemberDto email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", pwd='" + getPwd() + "'" +
            ", id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }


}