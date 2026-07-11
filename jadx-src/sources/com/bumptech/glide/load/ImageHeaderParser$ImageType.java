package com.bumptech.glide.load;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f51578n;

    public boolean hasAlpha() {
        return this.f51578n;
    }

    public boolean isWebp() {
        int i2 = j.f51586n[ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    ImageHeaderParser$ImageType(boolean z2) {
        this.f51578n = z2;
    }
}
