package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f47880a;

    public void a() {
        setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i2) {
        this.f47880a.getIndeterminateDrawable().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }

    public a(Context context, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i3);
        this.f47880a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i2 != -2 && i2 != -1) {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i2);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }
}
