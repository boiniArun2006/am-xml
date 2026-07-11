package com.facebook.animated.webp;

import X1.Ml;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class WebPFrame implements Ml {

    @Hh.Ml
    private long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i2, int i3, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Hh.Ml
    WebPFrame(long j2) {
        this.mNativeContext = j2;
    }

    public boolean J2() {
        return nativeShouldDisposeToBackgroundColor();
    }

    public boolean O() {
        return nativeIsBlendWithPreviousFrame();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // X1.Ml
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X1.Ml
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X1.Ml
    public void n() {
        nativeDispose();
    }

    @Override // X1.Ml
    public int nr() {
        return nativeGetYOffset();
    }

    @Override // X1.Ml
    public void rl(int i2, int i3, Bitmap bitmap) {
        nativeRenderFrame(i2, i3, bitmap);
    }

    @Override // X1.Ml
    public int t() {
        return nativeGetXOffset();
    }
}
