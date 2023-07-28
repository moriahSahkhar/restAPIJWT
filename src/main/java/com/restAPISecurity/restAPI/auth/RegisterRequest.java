package com.restAPISecurity.restAPI.auth;

import lombok.Builder;

import java.util.Objects;

@Builder
public class RegisterRequest {
    private  String email;
    private String password;

    public RegisterRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RegisterRequest) obj;
        return Objects.equals(this.email, that.email) &&
                Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "RegisterRequest[" +
                "email=" + email + ", " +
                "password=" + password + ']';
    }


}
