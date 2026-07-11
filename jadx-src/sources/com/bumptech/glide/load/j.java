package com.bumptech.glide.load;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ int[] f51586n;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f51586n = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f51586n[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f51586n[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
