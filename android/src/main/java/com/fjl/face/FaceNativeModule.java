package com.fjl.face;

import android.content.Context;
import android.widget.Toast;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import android.content.Intent;

import com.facebook.react.bridge.ReactContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import android.app.Activity;

public class FaceNativeModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FaceNativeModule";
    private ReactContext mContext;
    private static final int FACE_IMAGE = 0x1;

    public FaceNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @ReactMethod
    public void startFaceRecognition() {
        Activity currentActivity = getCurrentActivity();
        Intent intent = new Intent();
        intent.setClass(currentActivity, VideoDemo.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        currentActivity.startActivityForResult(intent, FACE_IMAGE);
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void sendEvent(WritableMap params) {
        mContext.getJSModule(RCTNativeAppEventEmitter.class)
                .emit("faceResult", params);
    }

}
