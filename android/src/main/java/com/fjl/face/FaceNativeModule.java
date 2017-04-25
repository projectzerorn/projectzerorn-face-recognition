package com.fjl.face;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import android.content.Intent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaceNativeModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FaceNativeModule";
    private Context mContext;

    public FaceNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);

        mContext = reactContext;
    }

    @ReactMethod
    public void startFaceRecognition() {
        //  Activity currentActivity = getCurrentActivity();
        Intent intent = new Intent();
        intent.setClass(mContext, VideoDemo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
