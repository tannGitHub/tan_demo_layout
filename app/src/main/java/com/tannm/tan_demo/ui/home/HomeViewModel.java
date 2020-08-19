package com.tannm.tan_demo.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText, nButtonText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

        nButtonText = new MutableLiveData<>();
        nButtonText.setValue("Go to Introduce screen");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getTextButton() {
        return nButtonText;
    }
}