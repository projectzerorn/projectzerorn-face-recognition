package com.fjl.face;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;

public class RecoFaceViewModule extends ReactContextBaseJavaModule {

    public RecoFaceViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RecoFaceViewMoudle";
    }
}



