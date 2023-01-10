package com.example.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMsg {

    public static void SimpleToast(Context context, String msg){
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
