package com.facebook.animated.gif;

import X1.Ml;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class GifFrame implements Ml {

    @Hh.Ml
    private long mNativeContext;

    @Hh.Ml
    private native void nativeDispose();

    @Hh.Ml
    private native void nativeFinalize();

    @Hh.Ml
    private native int nativeGetDisposalMode();

    @Hh.Ml
    private native int nativeGetDurationMs();

    @Hh.Ml
    private native int nativeGetHeight();

    @Hh.Ml
    private native int nativeGetTransparentPixelColor();

    @Hh.Ml
    private native int nativeGetWidth();

    @Hh.Ml
    private native int nativeGetXOffset();

    @Hh.Ml
    private native int nativeGetYOffset();

    @Hh.Ml
    private native boolean nativeHasTransparency();

    @Hh.Ml
    private native void nativeRenderFrame(int i2, int i3, Bitmap bitmap);

    @Hh.Ml
    GifFrame(long j2) {
        this.mNativeContext = j2;
    }

    public int O() {
        return nativeGetDisposalMode();
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
