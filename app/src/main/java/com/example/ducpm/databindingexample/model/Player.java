package com.example.ducpm.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.example.ducpm.databindingexample.BR;

/**
 * Created by ducpm on 13/07/17.
 */

public class Player extends BaseObservable {
    private String mRealName;
    private String mNickName;

    public Player(String realName, String nickName) {
        mRealName = realName;
        mNickName = nickName;
    }

    @Bindable
    public String getNickName() {
        return mNickName;
    }

    void setNickName(String nickName) {
        this.mNickName = nickName;
        notifyPropertyChanged(BR.nickName);
    }

    @Bindable
    public String getRealName() {
        return mRealName;
    }

    void setRealName(String realName) {
        this.mRealName = realName;
        notifyPropertyChanged(BR.realName);
    }
}
