package com.coolweather.android.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    //提示工具类
    public static Toast mToast;

    public static void showShortToast(String content) {
        if (mToast == null) {
            mToast = Toast.makeText(MyApplication.getContext(), content, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(content);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

}
