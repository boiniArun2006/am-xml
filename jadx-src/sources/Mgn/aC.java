package Mgn;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements CN3 {
    private int HI;
    private double[] Ik;
    private long J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f6630O;
    private int Uo;
    private int az;
    private double[] ck;
    private float[] gh;
    private double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6631n;
    private long nr;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f6632r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f6633t;
    private int ty;
    private double xMQ;

    public aC(int i2, int i3, long j2, long j3, long j4, long j5, int i5, int i7, double d2, double d4, float[] fArr, int i8, int i9, int i10, int i11, double[] left_calc, double[] right_calc, float[] fArr2) {
        Intrinsics.checkNotNullParameter(left_calc, "left_calc");
        Intrinsics.checkNotNullParameter(right_calc, "right_calc");
        this.f6631n = i2;
        this.rl = i3;
        this.f6633t = j2;
        this.nr = j3;
        this.f6630O = j4;
        this.J2 = j5;
        this.Uo = i5;
        this.KN = i7;
        this.xMQ = d2;
        this.mUb = d4;
        this.gh = fArr;
        this.qie = i8;
        this.az = i9;
        this.ty = i10;
        this.HI = i11;
        this.ck = left_calc;
        this.Ik = right_calc;
        this.f6632r = fArr2;
    }

    public static /* synthetic */ aC rl(aC aCVar, int i2, int i3, long j2, long j3, long j4, long j5, int i5, int i7, double d2, double d4, float[] fArr, int i8, int i9, int i10, int i11, double[] dArr, double[] dArr2, float[] fArr2, int i12, Object obj) {
        float[] fArr3;
        double[] dArr3;
        int i13 = (i12 & 1) != 0 ? aCVar.f6631n : i2;
        int i14 = (i12 & 2) != 0 ? aCVar.rl : i3;
        long j6 = (i12 & 4) != 0 ? aCVar.f6633t : j2;
        long j7 = (i12 & 8) != 0 ? aCVar.nr : j3;
        long j9 = (i12 & 16) != 0 ? aCVar.f6630O : j4;
        long j10 = (i12 & 32) != 0 ? aCVar.J2 : j5;
        int i15 = (i12 & 64) != 0 ? aCVar.Uo : i5;
        int i16 = (i12 & 128) != 0 ? aCVar.KN : i7;
        double d5 = (i12 & 256) != 0 ? aCVar.xMQ : d2;
        int i17 = i13;
        int i18 = i14;
        double d6 = (i12 & 512) != 0 ? aCVar.mUb : d4;
        float[] fArr4 = (i12 & 1024) != 0 ? aCVar.gh : fArr;
        int i19 = (i12 & 2048) != 0 ? aCVar.qie : i8;
        float[] fArr5 = fArr4;
        int i20 = (i12 & 4096) != 0 ? aCVar.az : i9;
        int i21 = (i12 & 8192) != 0 ? aCVar.ty : i10;
        int i22 = (i12 & 16384) != 0 ? aCVar.HI : i11;
        double[] dArr4 = (i12 & 32768) != 0 ? aCVar.ck : dArr;
        double[] dArr5 = (i12 & 65536) != 0 ? aCVar.Ik : dArr2;
        if ((i12 & 131072) != 0) {
            dArr3 = dArr5;
            fArr3 = aCVar.f6632r;
        } else {
            fArr3 = fArr2;
            dArr3 = dArr5;
        }
        return aCVar.n(i17, i18, j6, j7, j9, j10, i15, i16, d5, d6, fArr5, i19, i20, i21, i22, dArr4, dArr3, fArr3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return this.f6631n == aCVar.f6631n && this.rl == aCVar.rl && this.f6633t == aCVar.f6633t && this.nr == aCVar.nr && this.f6630O == aCVar.f6630O && this.J2 == aCVar.J2 && this.Uo == aCVar.Uo && this.KN == aCVar.KN && Double.compare(this.xMQ, aCVar.xMQ) == 0 && Double.compare(this.mUb, aCVar.mUb) == 0 && Intrinsics.areEqual(this.gh, aCVar.gh) && this.qie == aCVar.qie && this.az == aCVar.az && this.ty == aCVar.ty && this.HI == aCVar.HI && Intrinsics.areEqual(this.ck, aCVar.ck) && Intrinsics.areEqual(this.Ik, aCVar.Ik) && Intrinsics.areEqual(this.f6632r, aCVar.f6632r);
    }

    public final aC n(int i2, int i3, long j2, long j3, long j4, long j5, int i5, int i7, double d2, double d4, float[] fArr, int i8, int i9, int i10, int i11, double[] left_calc, double[] right_calc, float[] fArr2) {
        Intrinsics.checkNotNullParameter(left_calc, "left_calc");
        Intrinsics.checkNotNullParameter(right_calc, "right_calc");
        return new aC(i2, i3, j2, j3, j4, j5, i5, i7, d2, d4, fArr, i8, i9, i10, i11, left_calc, right_calc, fArr2);
    }

    public final void E2(long j2) {
        this.f6630O = j2;
    }

    public final double[] HI() {
        return this.ck;
    }

    public final long Ik() {
        return this.J2;
    }

    public final int J2() {
        return this.HI;
    }

    public final float[] KN() {
        return this.f6632r;
    }

    public final int O() {
        return this.az;
    }

    public final void S(int i2) {
        this.ty = i2;
    }

    public final void T(double d2) {
        this.xMQ = d2;
    }

    public final int Uo() {
        return this.ty;
    }

    public final void ViF(int i2) {
        this.Uo = i2;
    }

    public final void WPU(float[] fArr) {
        this.f6632r = fArr;
    }

    public final void X(int i2) {
        this.f6631n = i2;
    }

    public final void XQ(int i2) {
        this.HI = i2;
    }

    public final void Z(int i2) {
        this.az = i2;
    }

    public final void aYN(int i2) {
        this.rl = i2;
    }

    public final long az() {
        return this.nr;
    }

    public final long ck() {
        return this.f6630O;
    }

    public final void e(long j2) {
        this.J2 = j2;
    }

    public final void fD(double d2) {
        this.mUb = d2;
    }

    public final void g(long j2) {
        this.f6633t = j2;
    }

    public final float[] gh() {
        return this.gh;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.f6631n) * 31) + Integer.hashCode(this.rl)) * 31) + Long.hashCode(this.f6633t)) * 31) + Long.hashCode(this.nr)) * 31) + Long.hashCode(this.f6630O)) * 31) + Long.hashCode(this.J2)) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31) + Double.hashCode(this.xMQ)) * 31) + Double.hashCode(this.mUb)) * 31;
        float[] fArr = this.gh;
        int iHashCode2 = (((((((((((((iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + Integer.hashCode(this.qie)) * 31) + Integer.hashCode(this.az)) * 31) + Integer.hashCode(this.ty)) * 31) + Integer.hashCode(this.HI)) * 31) + Arrays.hashCode(this.ck)) * 31) + Arrays.hashCode(this.Ik)) * 31;
        float[] fArr2 = this.f6632r;
        return iHashCode2 + (fArr2 != null ? Arrays.hashCode(fArr2) : 0);
    }

    public final void iF(int i2) {
        this.KN = i2;
    }

    public final int mUb() {
        return this.Uo;
    }

    public final void nY(float[] fArr) {
        this.gh = fArr;
    }

    public final int nr() {
        return this.qie;
    }

    public final void o(int i2) {
        this.qie = i2;
    }

    public final long qie() {
        return this.f6633t;
    }

    public final double[] r() {
        return this.Ik;
    }

    public final aC t() {
        float[] fArr;
        float[] fArr2 = this.gh;
        float[] fArrCopyOf = null;
        if (fArr2 != null) {
            float[] fArrCopyOf2 = Arrays.copyOf(fArr2, fArr2.length);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(...)");
            fArr = fArrCopyOf2;
        } else {
            fArr = null;
        }
        double[] dArr = this.ck;
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        double[] dArr2 = this.Ik;
        double[] dArrCopyOf2 = Arrays.copyOf(dArr2, dArr2.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf2, "copyOf(...)");
        float[] fArr3 = this.f6632r;
        if (fArr3 != null) {
            fArrCopyOf = Arrays.copyOf(fArr3, fArr3.length);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        }
        return rl(this, 0, 0, 0L, 0L, 0L, 0L, 0, 0, 0.0d, 0.0d, fArr, 0, 0, 0, 0, dArrCopyOf, dArrCopyOf2, fArrCopyOf, 31743, null);
    }

    public final void te(long j2) {
        this.nr = j2;
    }

    public String toString() {
        return "SINC_FILTER(sinc_magic_marker=" + this.f6631n + ", channels=" + this.rl + ", in_count=" + this.f6633t + ", in_used=" + this.nr + ", out_count=" + this.f6630O + ", out_gen=" + this.J2 + ", coeff_half_len=" + this.Uo + ", index_inc=" + this.KN + ", src_ratio=" + this.xMQ + ", input_index=" + this.mUb + ", coeffs=" + Arrays.toString(this.gh) + ", b_current=" + this.qie + ", b_end=" + this.az + ", b_real_end=" + this.ty + ", b_len=" + this.HI + ", left_calc=" + Arrays.toString(this.ck) + ", right_calc=" + Arrays.toString(this.Ik) + ", buffer=" + Arrays.toString(this.f6632r) + ")";
    }

    public final int ty() {
        return this.KN;
    }

    public final int xMQ() {
        return this.rl;
    }

    public /* synthetic */ aC(int i2, int i3, long j2, long j3, long j4, long j5, int i5, int i7, double d2, double d4, float[] fArr, int i8, int i9, int i10, int i11, double[] dArr, double[] dArr2, float[] fArr2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i2, (i12 & 2) != 0 ? 0 : i3, (i12 & 4) != 0 ? 0L : j2, (i12 & 8) != 0 ? 0L : j3, (i12 & 16) != 0 ? 0L : j4, (i12 & 32) == 0 ? j5 : 0L, (i12 & 64) != 0 ? 0 : i5, (i12 & 128) != 0 ? 0 : i7, (i12 & 256) != 0 ? 0.0d : d2, (i12 & 512) == 0 ? d4 : 0.0d, (i12 & 1024) != 0 ? null : fArr, (i12 & 2048) != 0 ? 0 : i8, (i12 & 4096) != 0 ? 0 : i9, (i12 & 8192) != 0 ? 0 : i10, (i12 & 16384) != 0 ? 0 : i11, (i12 & 32768) != 0 ? new double[128] : dArr, (i12 & 65536) != 0 ? new double[128] : dArr2, (i12 & 131072) != 0 ? null : fArr2);
    }
}
