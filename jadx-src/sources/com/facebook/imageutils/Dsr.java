package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f52651n = new Dsr();
    private static final Class rl = Dsr.class;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f52652n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f52653t;

        public final void J2(boolean z2) {
            this.f52652n = z2;
        }

        public final void O(int i2) {
            this.f52653t = i2;
        }

        public final int n() {
            return this.rl;
        }

        public final void nr(int i2) {
            this.rl = i2;
        }

        public final int rl() {
            return this.f52653t;
        }

        public final boolean t() {
            return this.f52652n;
        }
    }

    private final int O(InputStream inputStream, int i2, j jVar) {
        if (i2 <= 8) {
            return 0;
        }
        jVar.nr(fuX.n(inputStream, 4, false));
        if (jVar.n() != 1229531648 && jVar.n() != 1296891946) {
            Dzy.j.nr(rl, "Invalid TIFF header");
            return 0;
        }
        jVar.J2(jVar.n() == 1229531648);
        jVar.O(fuX.n(inputStream, 4, jVar.t()));
        int i3 = i2 - 8;
        if (jVar.rl() >= 8 && jVar.rl() - 8 <= i3) {
            return i3;
        }
        Dzy.j.nr(rl, "Invalid offset");
        return 0;
    }

    public static final int n(int i2) {
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final int nr(InputStream stream, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        j jVar = new j();
        Dsr dsr = f52651n;
        int iO = dsr.O(stream, i2, jVar);
        int iRl = jVar.rl() - 8;
        if (iO == 0 || iRl > iO) {
            return 0;
        }
        stream.skip(iRl);
        return dsr.rl(stream, dsr.t(stream, iO - iRl, jVar.t(), 274), jVar.t());
    }

    private final int rl(InputStream inputStream, int i2, boolean z2) {
        if (i2 >= 10 && fuX.n(inputStream, 2, z2) == 3 && fuX.n(inputStream, 4, z2) == 1) {
            return fuX.n(inputStream, 2, z2);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int t(InputStream inputStream, int i2, boolean z2, int i3) throws IOException {
        if (i2 < 14) {
            return 0;
        }
        int iN = fuX.n(inputStream, 2, z2);
        int i5 = i2 - 2;
        while (true) {
            int i7 = iN - 1;
            if (iN <= 0 || i5 < 12) {
                break;
            }
            int i8 = i5 - 2;
            if (fuX.n(inputStream, 2, z2) == i3) {
                return i8;
            }
            inputStream.skip(10L);
            i5 -= 12;
            iN = i7;
        }
    }

    private Dsr() {
    }
}
