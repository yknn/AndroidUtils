package com.yuknn.androidutils;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;

import com.yuknn.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setButterKnife() {
        super.setButterKnife();
        ButterKnife.bind(this);
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        this.initToolbar(toolbar, "bihc");
    }


}
