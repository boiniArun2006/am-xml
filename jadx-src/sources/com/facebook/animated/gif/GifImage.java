package com.facebook.animated.gif;

import Hh.C;
import Hh.Ml;
import X1.n;
import X1.w6;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import y5Y.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Ml
public class GifImage implements w6, YqR.w6 {
    private static volatile boolean rl;

    @Ml
    private long mNativeContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Bitmap.Config f52262n = null;

    @Ml
    public GifImage() {
    }

    @Ml
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i2, boolean z2);

    @Ml
    private static native GifImage nativeCreateFromFileDescriptor(int i2, int i3, boolean z2);

    @Ml
    private static native GifImage nativeCreateFromNativeMemory(long j2, int i2, int i3, boolean z2);

    @Ml
    private native void nativeDispose();

    @Ml
    private native void nativeFinalize();

    @Ml
    private native int nativeGetDuration();

    @Ml
    private native GifFrame nativeGetFrame(int i2);

    @Ml
    private native int nativeGetFrameCount();

    @Ml
    private native int[] nativeGetFrameDurations();

    @Ml
    private native int nativeGetHeight();

    @Ml
    private native int nativeGetLoopCount();

    @Ml
    private native int nativeGetSizeInBytes();

    @Ml
    private native int nativeGetWidth();

    @Ml
    private native boolean nativeIsAnimated();

    @Override // X1.w6
    public boolean t() {
        return false;
    }

    private static n.EnumC0422n az(int i2) {
        return i2 == 0 ? n.EnumC0422n.DISPOSE_DO_NOT : i2 == 1 ? n.EnumC0422n.DISPOSE_DO_NOT : i2 == 2 ? n.EnumC0422n.DISPOSE_TO_BACKGROUND : i2 == 3 ? n.EnumC0422n.DISPOSE_TO_PREVIOUS : n.EnumC0422n.DISPOSE_DO_NOT;
    }

    private static synchronized void qie() {
        if (!rl) {
            rl = true;
            j.nr("gifimage");
        }
    }

    @Override // X1.w6
    public Bitmap.Config J2() {
        return this.f52262n;
    }

    @Ml
    GifImage(long j2) {
        this.mNativeContext = j2;
    }

    public static GifImage gh(long j2, int i2, dX.Ml ml) {
        boolean z2;
        qie();
        if (j2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j2, i2, ml.rl, ml.Uo);
        gifImageNativeCreateFromNativeMemory.f52262n = ml.xMQ;
        return gifImageNativeCreateFromNativeMemory;
    }

    public static GifImage mUb(ByteBuffer byteBuffer, dX.Ml ml) {
        qie();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, ml.rl, ml.Uo);
        gifImageNativeCreateFromDirectByteBuffer.f52262n = ml.xMQ;
        return gifImageNativeCreateFromDirectByteBuffer;
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
        GifFrame gifFrameUo = Uo(i2);
        try {
            return new n(i2, gifFrameUo.t(), gifFrameUo.nr(), gifFrameUo.getWidth(), gifFrameUo.getHeight(), n.j.BLEND_WITH_PREVIOUS, az(gifFrameUo.O()));
        } finally {
            gifFrameUo.n();
        }
    }

    @Override // X1.w6
    public int rl() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // X1.w6
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public GifFrame Uo(int i2) {
        return nativeGetFrame(i2);
    }

    @Override // X1.w6
    public int[] xMQ() {
        return nativeGetFrameDurations();
    }
}
