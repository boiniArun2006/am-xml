package com.facebook.imageutils;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f52654n = new I28();

    public static final int n(InputStream inputStream) {
        if (inputStream == null) {
            Dzy.j.rl("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new ExifInterface(inputStream).Uo("Orientation", 1);
        } catch (IOException e2) {
            Dzy.j.t("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e2);
            return 0;
        }
    }

    private I28() {
    }
}
