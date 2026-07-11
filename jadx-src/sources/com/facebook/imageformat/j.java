package com.facebook.imageformat;

import com.facebook.imageformat.w6;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements w6.n {
    private static final byte[] HI;
    private static final int Ik;
    private static final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f52408O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final byte[] f52409Z;
    private static final byte[] az;
    private static final byte[] ck;
    private static final byte[] gh;
    private static final int mUb;
    private static final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f52410o;
    private static final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f52411r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f52412t;
    private static final byte[][] ty;
    private static final byte[] xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f52413n;
    public static final C0748j rl = new C0748j(null);
    private static final byte[] Uo = Wre.n("GIF87a");
    private static final byte[] KN = Wre.n("GIF89a");

    /* JADX INFO: renamed from: com.facebook.imageformat.j$j, reason: collision with other inner class name */
    public static final class C0748j {
        public /* synthetic */ C0748j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean Ik(byte[] bArr, int i2) {
            if (i2 < 6) {
                return false;
            }
            return Wre.t(bArr, j.Uo) || Wre.t(bArr, j.KN);
        }

        private final int gh(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & UByte.MAX_VALUE) | ((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final w6 qie(byte[] bArr, int i2) {
            if (uK.w6.KN(bArr, 0, i2)) {
                return uK.w6.Uo(bArr, 0) ? n.Uo : uK.w6.J2(bArr, 0) ? n.KN : uK.w6.t(bArr, 0, i2) ? uK.w6.rl(bArr, 0) ? n.gh : uK.w6.nr(bArr, 0) ? n.mUb : n.xMQ : w6.nr;
            }
            throw new IllegalStateException("Check failed.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean ty(byte[] bArr, int i2) {
            return i2 >= 4 && Wre.t(bArr, j.f52411r);
        }

        private C0748j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean az(byte[] bArr, int i2) {
            if (i2 >= 12 && gh(bArr) >= 8 && Wre.rl(bArr, j.f52410o, 4)) {
                return Wre.rl(bArr, j.f52409Z, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] bArr, int i2) {
            if (i2 < 12 || bArr[3] < 8 || !Wre.rl(bArr, j.az, 4)) {
                return false;
            }
            for (byte[] bArr2 : j.ty) {
                if (Wre.rl(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean HI(byte[] bArr, int i2) {
            if (i2 < j.xMQ.length) {
                return false;
            }
            return Wre.t(bArr, j.xMQ);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean XQ(byte[] bArr, int i2) {
            if (i2 >= j.f52408O.length && Wre.t(bArr, j.f52408O)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean Z(byte[] bArr, int i2) {
            if (i2 >= j.f52412t.length && Wre.t(bArr, j.f52412t)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean ck(byte[] bArr, int i2) {
            if (i2 >= j.Ik) {
                if (Wre.t(bArr, j.HI) || Wre.t(bArr, j.ck)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i2) {
            if (i2 < j.gh.length) {
                return false;
            }
            return Wre.t(bArr, j.gh);
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f52412t = bArr;
        nr = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f52408O = bArr2;
        J2 = bArr2.length;
        byte[] bArrN = Wre.n("BM");
        xMQ = bArrN;
        mUb = bArrN.length;
        byte[] bArr3 = {0, 0, 1, 0};
        gh = bArr3;
        qie = bArr3.length;
        az = Wre.n("ftyp");
        ty = new byte[][]{Wre.n("heic"), Wre.n("heix"), Wre.n("hevc"), Wre.n("hevx"), Wre.n("mif1"), Wre.n("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        HI = bArr4;
        ck = new byte[]{77, 77, 0, 42};
        Ik = bArr4.length;
        f52411r = new byte[]{3, 0, 8, 0};
        f52410o = Wre.n("ftyp");
        f52409Z = Wre.n("avif");
    }

    @Override // com.facebook.imageformat.w6.n
    public w6 n(byte[] headerBytes, int i2) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (uK.w6.KN(headerBytes, 0, i2)) {
            return rl.qie(headerBytes, i2);
        }
        C0748j c0748j = rl;
        return c0748j.Z(headerBytes, i2) ? n.rl : c0748j.XQ(headerBytes, i2) ? n.f52416t : c0748j.Ik(headerBytes, i2) ? n.nr : c0748j.HI(headerBytes, i2) ? n.f52414O : c0748j.o(headerBytes, i2) ? n.J2 : c0748j.az(headerBytes, i2) ? n.HI : c0748j.r(headerBytes, i2) ? n.qie : c0748j.ty(headerBytes, i2) ? n.ty : c0748j.ck(headerBytes, i2) ? n.az : w6.nr;
    }

    @Override // com.facebook.imageformat.w6.n
    public int rl() {
        return this.f52413n;
    }

    public j() {
        Object objMaxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(nr), Integer.valueOf(J2), 6, Integer.valueOf(mUb), Integer.valueOf(qie), 12, 4, 12});
        if (objMaxOrNull != null) {
            this.f52413n = ((Number) objMaxOrNull).intValue();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
