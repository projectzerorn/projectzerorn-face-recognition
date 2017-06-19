package com.fjl.face;
import android.view.View;
import com.fjl.face.R;
public class RecoView extends View {

    public RecoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 加载布局
        View reoView = LayoutInflater.from(context).inflate(R.layout.layout_reco_face, null); 


    }
}