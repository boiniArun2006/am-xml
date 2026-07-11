package com.facebook.imagepipeline.nativecode;

import Hh.C;
import android.graphics.ColorSpace;
import bA.C1653C;
import dX.CN3;
import dX.fuX;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Hh.Ml
public class NativeJpegTranscoder implements UM7.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f52439n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f52440t;

    @Hh.Ml
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i5) throws IOException;

    @Hh.Ml
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i5) throws IOException;

    @Override // UM7.w6
    public String n() {
        return "NativeJpegTranscoder";
    }

    @Override // UM7.w6
    public boolean nr(com.facebook.imageformat.w6 w6Var) {
        return w6Var == com.facebook.imageformat.n.rl;
    }

    @Override // UM7.w6
    public UM7.n rl(C1653C c1653c, OutputStream outputStream, fuX fux, CN3 cn3, com.facebook.imageformat.w6 w6Var, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (fux == null) {
            fux = fuX.t();
        }
        int iRl = UM7.j.rl(fux, cn3, c1653c, this.rl);
        try {
            int iJ2 = UM7.I28.J2(fux, cn3, c1653c, this.f52439n);
            int iN = UM7.I28.n(iRl);
            if (this.f52440t) {
                iJ2 = iN;
            }
            InputStream inputStreamEF = c1653c.eF();
            if (UM7.I28.rl.contains(Integer.valueOf(c1653c.Nxk()))) {
                J2((InputStream) C.KN(inputStreamEF, "Cannot transcode from null input stream!"), outputStream, UM7.I28.nr(fux, c1653c), iJ2, num.intValue());
            } else {
                O((InputStream) C.KN(inputStreamEF, "Cannot transcode from null input stream!"), outputStream, UM7.I28.O(fux, c1653c), iJ2, num.intValue());
            }
            Hh.n.rl(inputStreamEF);
            return new UM7.n(iRl != 1 ? 0 : 1);
        } catch (Throwable th) {
            Hh.n.rl(null);
            throw th;
        }
    }

    @Override // UM7.w6
    public boolean t(C1653C c1653c, fuX fux, CN3 cn3) {
        if (fux == null) {
            fux = fuX.t();
        }
        return UM7.I28.J2(fux, cn3, c1653c, this.f52439n) < 8;
    }

    public NativeJpegTranscoder(boolean z2, int i2, boolean z3, boolean z4) {
        this.f52439n = z2;
        this.rl = i2;
        this.f52440t = z3;
        if (z4) {
            Ml.n();
        }
    }

    public static void J2(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i5) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Ml.n();
        boolean z6 = false;
        if (i3 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        if (i3 <= 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        C.rl(Boolean.valueOf(z3));
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C.rl(Boolean.valueOf(z4));
        if (i5 <= 100) {
            z5 = true;
        } else {
            z5 = false;
        }
        C.rl(Boolean.valueOf(z5));
        C.rl(Boolean.valueOf(UM7.I28.xMQ(i2)));
        if (i3 != 8 || i2 != 1) {
            z6 = true;
        }
        C.t(z6, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C.Uo(inputStream), (OutputStream) C.Uo(outputStream), i2, i3, i5);
    }

    public static void O(InputStream inputStream, OutputStream outputStream, int i2, int i3, int i5) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Ml.n();
        boolean z6 = false;
        if (i3 >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C.rl(Boolean.valueOf(z2));
        if (i3 <= 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        C.rl(Boolean.valueOf(z3));
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C.rl(Boolean.valueOf(z4));
        if (i5 <= 100) {
            z5 = true;
        } else {
            z5 = false;
        }
        C.rl(Boolean.valueOf(z5));
        C.rl(Boolean.valueOf(UM7.I28.mUb(i2)));
        if (i3 != 8 || i2 != 0) {
            z6 = true;
        }
        C.t(z6, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C.Uo(inputStream), (OutputStream) C.Uo(outputStream), i2, i3, i5);
    }
}
