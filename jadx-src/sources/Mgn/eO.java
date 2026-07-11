package Mgn;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO {
    private long J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f6640O;
    private long Uo;
    private double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f6641n;
    private int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f6642t;
    private int xMQ;

    public eO(float[] fArr, int i2, float[] fArr2, int i3, long j2, long j3, long j4, long j5, int i5, double d2) {
        this.f6641n = fArr;
        this.rl = i2;
        this.f6642t = fArr2;
        this.nr = i3;
        this.f6640O = j2;
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
        if (!(obj instanceof eO)) {
            return false;
        }
        eO eOVar = (eO) obj;
        return Intrinsics.areEqual(this.f6641n, eOVar.f6641n) && this.rl == eOVar.rl && Intrinsics.areEqual(this.f6642t, eOVar.f6642t) && this.nr == eOVar.nr && this.f6640O == eOVar.f6640O && this.J2 == eOVar.J2 && this.Uo == eOVar.Uo && this.KN == eOVar.KN && this.xMQ == eOVar.xMQ && Double.compare(this.mUb, eOVar.mUb) == 0;
    }

    public final void HI(long j2) {
        this.Uo = j2;
    }

    public final void Ik(long j2) {
        this.KN = j2;
    }

    public final long J2() {
        return this.f6640O;
    }

    public final long KN() {
        return this.J2;
    }

    public final int O() {
        return this.xMQ;
    }

    public final long Uo() {
        return this.Uo;
    }

    public final void az(int i2) {
        this.xMQ = i2;
    }

    public final void ck(long j2) {
        this.J2 = j2;
    }

    public final void gh(float[] fArr) {
        this.f6641n = fArr;
    }

    public int hashCode() {
        float[] fArr = this.f6641n;
        int iHashCode = (((fArr == null ? 0 : Arrays.hashCode(fArr)) * 31) + Integer.hashCode(this.rl)) * 31;
        float[] fArr2 = this.f6642t;
        return ((((((((((((((iHashCode + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31) + Integer.hashCode(this.nr)) * 31) + Long.hashCode(this.f6640O)) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ)) * 31) + Double.hashCode(this.mUb);
    }

    public final double mUb() {
        return this.mUb;
    }

    public final float[] n() {
        return this.f6641n;
    }

    public final int nr() {
        return this.nr;
    }

    public final void qie(float[] fArr) {
        this.f6642t = fArr;
    }

    public final void r(double d2) {
        this.mUb = d2;
    }

    public final int rl() {
        return this.rl;
    }

    public final float[] t() {
        return this.f6642t;
    }

    public String toString() {
        return "SRC_DATA(data_in=" + Arrays.toString(this.f6641n) + ", data_in_inset=" + this.rl + ", data_out=" + Arrays.toString(this.f6642t) + ", data_out_inset=" + this.nr + ", input_frames=" + this.f6640O + ", output_frames=" + this.J2 + ", input_frames_used=" + this.Uo + ", output_frames_gen=" + this.KN + ", end_of_input=" + this.xMQ + ", src_ratio=" + this.mUb + ")";
    }

    public final void ty(long j2) {
        this.f6640O = j2;
    }

    public final long xMQ() {
        return this.KN;
    }

    public /* synthetic */ eO(float[] fArr, int i2, float[] fArr2, int i3, long j2, long j3, long j4, long j5, int i5, double d2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : fArr, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) == 0 ? fArr2 : null, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0L : j2, (i7 & 32) != 0 ? 0L : j3, (i7 & 64) != 0 ? 0L : j4, (i7 & 128) == 0 ? j5 : 0L, (i7 & 256) == 0 ? i5 : 0, (i7 & 512) != 0 ? 0.0d : d2);
    }
}
