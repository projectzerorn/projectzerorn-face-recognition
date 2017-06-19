package com.fjl.face;

import android.app.Activity; 
import android.util.Log;
 import android.view.LayoutInflater; 
import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.fjl.face.R;
public class RecoFaceViewManager extends SimpleViewManager<View> {
    public static final String RCT_CLASS = "RCTRecoFaceView";
     
    public static final String TAG = "RCTRecoFaceView";
    private static Activity mActivity;

    @Override
    public String getName() { 
        return RCT_CLASS; 
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) { 
        this.reactContext = reactContext; 
        return getRecoFaceView(); 
    }

    public RecoFaceViewManager(Activity activity) { 
        mActivity = activity; 

    }

    private View getRecoFaceView() {   
        View reoView = LayoutInflater.from(mActivity.getApplicationContext()).inflate(R.layout.layout_reco_face, null); 
        return reoView; 
    }

     
}