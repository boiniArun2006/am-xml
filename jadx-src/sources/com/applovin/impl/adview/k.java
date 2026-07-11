package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.c2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class k extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f48064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48065b;

    interface a {
        void a();

        void b();
    }

    public boolean a() {
        return this.f48065b;
    }

    public void b() {
        a(null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63161a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(a aVar) {
        if (this.f48065b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f48064a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f48065b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public String getIdentifier() {
        return this.f48064a.b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f48064a = c2Var;
        setClickable(false);
        setFocusable(false);
    }
}
