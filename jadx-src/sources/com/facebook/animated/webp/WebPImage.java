package com.facebook.animated.webp;

import Hh.C;
import Hh.Ml;
import X1.n;
import X1.w6;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.I28;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Ml
public class WebPImage implements w6, YqR.w6 {

    @Ml
    private long mNativeContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Bitmap.Config f52263n = null;

    @Ml
    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j2, int i2);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i2);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X1.w6
    public boolean t() {
        return true;
    }

    @Override // X1.w6
    public Bitmap.Config J2() {
        return this.f52263n;
    }

    @Ml
    WebPImage(long j2) {
        this.mNativeContext = j2;
    }

    public static WebPImage gh(long j2, int i2, dX.Ml ml) {
        boolean z2;
        I28.n();
        if (j2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j2, i2);
        if (ml != null) {
            webPImageNativeCreateFromNativeMemory.f52263n = ml.xMQ;
        }
        return webPImageNativeCreateFromNativeMemory;
    }

    public static WebPImage mUb(ByteBuffer byteBuffer, dX.Ml ml) {
        I28.n();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (ml != null) {
            webPImageNativeCreateFromDirectByteBuffer.f52263n = ml.xMQ;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    @Override // YqR.w6
    public w6 KN(long j2, int i2, dX.Ml ml) {
        return gh(j2, i2, ml);
    }

    @Override // YqR.w6
    public w6 O(ByteBuffer byteBuffer, dX.Ml ml) {
        return mUb(byteBuffer, ml);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // X1.w6
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X1.w6
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X1.w6
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X1.w6
    public int n() {
        return nativeGetFrameCount();
    }

    @Override // X1.w6
    public n nr(int i2) {
        n.j jVar;
        n.EnumC0422n enumC0422n;
        WebPFrame webPFrameUo = Uo(i2);
        try {
            int iT = webPFrameUo.t();
            int iNr = webPFrameUo.nr();
            int width = webPFrameUo.getWidth();
            int height = webPFrameUo.getHeight();
            if (webPFrameUo.O()) {
                jVar = n.j.BLEND_WITH_PREVIOUS;
            } else {
                jVar = n.j.NO_BLEND;
            }
            n.j jVar2 = jVar;
            if (webPFrameUo.J2()) {
                enumC0422n = n.EnumC0422n.DISPOSE_TO_BACKGROUND;
            } else {
                enumC0422n = n.EnumC0422n.DISPOSE_DO_NOT;
            }
            n nVar = new n(i2, iT, iNr, width, height, jVar2, enumC0422n);
            webPFrameUo.n();
            return nVar;
        } catch (Throwable th) {
            webPFrameUo.n();
            throw th;
        }
    }

    @Override // X1.w6
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public WebPFrame Uo(int i2) {
        return nativeGetFrame(i2);
    }

    @Override // X1.w6
    public int rl() {
        return nativeGetLoopCount();
    }

    @Override // X1.w6
    public int[] xMQ() {
        return nativeGetFrameDurations();
    }
}
