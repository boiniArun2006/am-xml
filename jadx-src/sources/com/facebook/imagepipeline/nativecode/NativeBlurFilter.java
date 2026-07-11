package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Hh.Ml
public class NativeBlurFilter {
    @Hh.Ml
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i2, int i3);

    static {
        n.n();
    }
}
