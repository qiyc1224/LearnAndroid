package com.qiyc.la.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.qiyc.la.BR;

public class DataBindingModel extends BaseObservable {
    @Bindable
    public String name;
    public ObservableField<String> age;
    public String img;

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    public void setAge(String age) {
        this.age = new ObservableField<>(age);
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }
}
