package com.dmp.application10viewpager;

public enum ModelObject {
    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);

    private int mTitleResId,mLayoutResId;

    ModelObject(int mTitleResId, int mLayoutResId) {
        this.mTitleResId = mTitleResId;
        this.mLayoutResId = mLayoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }
    public int getLayoutResId() {
        return mLayoutResId;
    }


}
