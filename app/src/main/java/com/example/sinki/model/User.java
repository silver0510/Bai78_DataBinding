package com.example.sinki.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Sinki on 9/15/2017.
 */

public class User extends BaseObservable{
    private String firstName;
    private String lastname;

    public User(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public User() {
    }
    @Bindable
    public String getFirstName() {
        return firstName;
    }
    @Bindable
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Bindable
    public String getLastname() {
        return lastname;
    }
    @Bindable
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
