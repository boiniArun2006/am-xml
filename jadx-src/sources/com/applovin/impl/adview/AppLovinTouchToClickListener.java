package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f47944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f47946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f47948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f47949i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f47949i.onClick(view, motionEvent);
        this.f47947g = true;
    }

    public AppLovinTouchToClickListener(C1802k c1802k, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f47941a = ((Long) c1802k.a(x4.f50811c0)).longValue();
        this.f47942b = ((Integer) c1802k.a(x4.d0)).intValue();
        this.f47943c = AppLovinSdkUtils.dpToPx(context, ((Integer) c1802k.a(x4.h0)).intValue());
        this.f47944d = ClickRecognitionState.values()[((Integer) c1802k.a(x4Var)).intValue()];
        this.f47948h = context;
        this.f47949i = onClickListener;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f3 = pointF.x - pointF2.x;
        float f4 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f3 * f3) + (f4 * f4)));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f47947g && this.f47944d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f47947g && this.f47944d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f47944d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f47945e;
                float fA2 = a(this.f47946f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f47947g) {
                    long j2 = this.f47941a;
                    if ((j2 < 0 || jElapsedRealtime < j2) && ((i2 = this.f47942b) < 0 || fA2 < i2)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f47944d == ClickRecognitionState.ACTION_DOWN) {
            if (a(motionEvent)) {
                a(view, motionEvent);
            }
        } else {
            this.f47945e = SystemClock.elapsedRealtime();
            this.f47946f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f47947g = false;
        }
        return true;
    }

    private float a(float f3) {
        return f3 / this.f47948h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f47943c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f47948h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i2 = this.f47943c;
        float f3 = i2;
        return rawX >= f3 && rawY >= f3 && rawX <= ((float) (pointB.x - i2)) && rawY <= ((float) (pointB.y - i2));
    }
}
