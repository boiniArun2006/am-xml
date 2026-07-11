package com.facebook.imagepipeline.nativecode;

import Hh.C;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Hh.Ml
public class NativeRoundingFilter {
    @Hh.Ml
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i2, int i3, int i5, int i7);

    @Hh.Ml
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z2);

    @Hh.Ml
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z2);

    @Hh.Ml
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i2, int i3, boolean z2);

    static {
        n.n();
    }

    @Hh.Ml
    public static void toCircle(Bitmap bitmap, boolean z2) {
        C.Uo(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z2);
        }
    }

    @Hh.Ml
    public static void toCircleFast(Bitmap bitmap, boolean z2) {
        C.Uo(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z2);
        }
    }
}
