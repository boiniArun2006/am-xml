package com.facebook.imagepipeline.nativecode;

import Hh.C;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Hh.Ml
public class Bitmaps {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f52435n = 0;

    @Hh.Ml
    private static native void nativeCopyBitmap(Bitmap bitmap, int i2, Bitmap bitmap2, int i3, int i5);

    static {
        j.n();
    }

    @Hh.Ml
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        C.rl(Boolean.valueOf(bitmap.isMutable()));
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C.rl(Boolean.valueOf(z3));
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z4 = true;
        }
        C.rl(Boolean.valueOf(z4));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
