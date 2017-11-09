package org.swsd.stardust.view.activity;

import android.os.Bundle;

import org.swsd.stardust.R;
import org.swsd.stardust.base.BaseActivity;

public class MyInformationActivity extends BaseActivity {

    @Override
    public int bindLayout() {
        setContentView(R.layout.activity_my_information);
        return 0;
    }

    @Override
    public void initView() {
        //沉浸式顶部栏，继承基类的方法
        steepStatusBar();
    }

    @Override
    public void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化界面,实现沉浸式顶部栏
        initView();
        //绑定并加载登录界面布局
        bindLayout();
    }
}
