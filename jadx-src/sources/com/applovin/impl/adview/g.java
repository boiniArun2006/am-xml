package com.applovin.impl.adview;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f48056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48057b;

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f48056a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f48056a.getLayoutParams();
        removeView(this.f48056a);
        e eVarA = e.a(aVar, getContext());
        this.f48056a = eVarA;
        addView(eVarA);
        this.f48056a.setLayoutParams(layoutParams);
        this.f48056a.a(this.f48057b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f48056a = eVarA;
        addView(eVarA);
    }

    public void a(int i2, int i3, int i5, int i7) {
        this.f48057b = i2;
        int i8 = i3 + i2 + i5;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i8;
            layoutParams.width = i8;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i8, i8));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2, i7);
        layoutParams2.setMargins(i5, i5, i5, 0);
        this.f48056a.setLayoutParams(layoutParams2);
        this.f48056a.a(i2);
    }
}
