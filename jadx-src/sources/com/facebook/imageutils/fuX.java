package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f52659n = new fuX();

    public static final int n(InputStream stream, int i2, boolean z2) throws IOException {
        int i3;
        Intrinsics.checkNotNullParameter(stream, "stream");
        int i5 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = stream.read();
            if (i8 == -1) {
                throw new IOException("no more bytes");
            }
            if (z2) {
                i3 = (i8 & 255) << (i7 * 8);
            } else {
                i5 <<= 8;
                i3 = i8 & 255;
            }
            i5 |= i3;
        }
        return i5;
    }

    private fuX() {
    }
}
