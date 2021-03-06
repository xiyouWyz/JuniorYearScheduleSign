package com.example.wyz.schedulesign.Mvp.IView;

import android.widget.EditText;

import com.example.wyz.schedulesign.Mvp.Entity.StudioEntity;
import com.example.wyz.schedulesign.Mvp.IView.base.BaseView;

/**
 * Created by WYZ on 2017/6/6.
 */

public interface IPlayAddView extends BaseView {
    boolean isEmpty(EditText editText);
    void initAllStudioSpinner();
    void initAllStudioSpinnerView(StudioEntity studioEntity);
    void addCompleted();
    void getInputData();
    void initDatePicker();
    void setDatePicker();

}
