package com.test.keyboarddemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import sj.keyboard.XhsEmoticonsKeyBoard;

/**
 * @project： KeyBoardDemo
 * @package： com.test.keyboarddemo
 * @class: MyKeyBoard
 * @author: 陆伟
 * @Date: 2017/4/20 22:37
 * @desc： TODO
 */
public class MyKeyBoard extends XhsEmoticonsKeyBoard {
    private static final String TAG = "MyKeyBoard";

    public MyKeyBoard(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void inflateKeyboardBar() {
        mInflater.inflate(R.layout.view_keyboard, this);
    }

    @Override
    protected View inflateFunc(){
        return mInflater.inflate(R.layout.view_func_emot_icon, null);
    }
}
