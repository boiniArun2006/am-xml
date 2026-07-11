package YHx;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {
    private long J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f12050O;
    private long Uo;
    private double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f12051n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f12052t;
    private int xMQ;

    public I28(float[] fArr, int i2, float[] fArr2, int i3, long j2, long j3, long j4, long j5, int i5, double d2) {
        this.f12051n = fArr;
        this.rl = i2;
        this.f12052t = fArr2;
        this.nr = i3;
        this.f12050O = j2;
        this.J2 = j3;
        this.Uo = j4;
        this.KN = j5;
        this.xMQ = i5;
        this.mUb = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f12051n, i28.f12051n) && this.rl == i28.rl && Intrinsics.areEqual(this.f12052t, i28.f12052t) && this.nr == i28.nr && this.f12050O == i28.f12050O && this.J2 == i28.J2 && this.Uo == i28.Uo && this.KN == i28.KN && this.xMQ == i28.xMQ && Double.compare(this.mUb, i28.mUb) == 0;
    }

    public final void HI(long j2) {
        this.J2 = j2;
    }

    public final void Ik(double d2) {
        this.mUb = d2;
    }

    public final long J2() {
        return this.Uo;
    }

    public final long KN() {
        return this.KN;
    }

    public final long O() {
        return this.f12050O;
    }

    public final long Uo() {
        return this.J2;
    }

    public final void az(long j2) {
        this.f12050O = j2;
    }

    public final void ck(long j2) {
        this.KN = j2;
    }

    public final void gh(float[] fArr) {
        this.f12052t = fArr;
    }

    public int hashCode() {
        float[] fArr = this.f12051n;
        int iHashCode = (((fArr == null ? 0 : Arrays.hashCode(fArr)) * 31) + Integer.hashCode(this.rl)) * 31;
        float[] fArr2 = this.f12052t;
        return ((((((((((((((iHashCode + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31) + Integer.hashCode(this.nr)) * 31) + Long.hashCode(this.f12050O)) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ)) * 31) + Double.hashCode(this.mUb);
    }

    public final void mUb(float[] fArr) {
        this.f12051n = fArr;
    }

    public final float[] n() {
        return this.f12051n;
    }

    public final int nr() {
        return this.nr;
    }

    public final void qie(int i2) {
        this.xMQ = i2;
    }

    public final int rl() {
        return this.rl;
    }

    public final float[] t() {
        return this.f12052t;
    }

    public String toString() {
        return "SRCData(dataIn=" + Arrays.toString(this.f12051n) + ", dataInInset=" + this.rl + ", dataOut=" + Arrays.toString(this.f12052t) + ", dataOutInset=" + this.nr + ", inputFrames=" + this.f12050O + ", outputFrames=" + this.J2 + ", inputFramesUsed=" + this.Uo + ", outputFramesGen=" + this.KN + ", endOfInput=" + this.xMQ + ", srcRatio=" + this.mUb + ')';
    }

    public final void ty(long j2) {
        this.Uo = j2;
    }

    public final double xMQ() {
        return this.mUb;
    }

    public /* synthetic */ I28(float[] fArr, int i2, float[] fArr2, int i3, long j2, long j3, long j4, long j5, int i5, double d2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fArr, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) == 0 ? fArr2 : null, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0L : j2, (i7 & 32) != 0 ? 0L : j3, (i7 & 64) != 0 ? 0L : j4, (i7 & 128) == 0 ? j5 : 0L, (i7 & 256) == 0 ? i5 : 0, (i7 & 512) != 0 ? 0.0d : d2);
    }
}
