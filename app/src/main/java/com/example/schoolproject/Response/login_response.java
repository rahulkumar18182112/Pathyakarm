package com.example.schoolproject.Response;

public class login_response {

    String error,status;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public login_response(String error, String status) {
        this.error = error;
        this.status = status;
    }
}
