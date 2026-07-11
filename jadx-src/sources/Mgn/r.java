package Mgn;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class r implements CN3 {
    private long J2;
    private float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f6672O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6673n;
    private long nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6674t;

    public r(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr) {
        this.f6673n = i2;
        this.rl = i3;
        this.f6674t = i5;
        this.nr = j2;
        this.f6672O = j3;
        this.J2 = j4;
        this.Uo = j5;
        this.KN = fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6673n == rVar.f6673n && this.rl == rVar.rl && this.f6674t == rVar.f6674t && this.nr == rVar.nr && this.f6672O == rVar.f6672O && this.J2 == rVar.J2 && this.Uo == rVar.Uo && Intrinsics.areEqual(this.KN, rVar.KN);
    }

    public static /* synthetic */ r rl(r rVar, int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = rVar.f6673n;
        }
        if ((i7 & 2) != 0) {
            i3 = rVar.rl;
        }
        if ((i7 & 4) != 0) {
            i5 = rVar.f6674t;
        }
        if ((i7 & 8) != 0) {
            j2 = rVar.nr;
        }
        if ((i7 & 16) != 0) {
            j3 = rVar.f6672O;
        }
        if ((i7 & 32) != 0) {
            j4 = rVar.J2;
        }
        if ((i7 & 64) != 0) {
            j5 = rVar.Uo;
        }
        if ((i7 & 128) != 0) {
            fArr = rVar.KN;
        }
        float[] fArr2 = fArr;
        long j6 = j5;
        long j7 = j4;
        long j9 = j3;
        int i8 = i5;
        return rVar.n(i2, i3, i8, j2, j9, j7, j6, fArr2);
    }

    public final void HI(long j2) {
        this.J2 = j2;
    }

    public final void Ik(int i2) {
        this.f6674t = i2;
    }

    public final long J2() {
        return this.f6672O;
    }

    public final long KN() {
        return this.J2;
    }

    public final long O() {
        return this.nr;
    }

    public final float[] Uo() {
        return this.KN;
    }

    public final void az(long j2) {
        this.f6672O = j2;
    }

    public final void ck(long j2) {
        this.Uo = j2;
    }

    public final void gh(int i2) {
        this.rl = i2;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.f6673n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f6674t)) * 31) + Long.hashCode(this.nr)) * 31) + Long.hashCode(this.f6672O)) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31;
        float[] fArr = this.KN;
        return iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr));
    }

    public final int mUb() {
        return this.f6674t;
    }

    public final r n(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr) {
        return new r(i2, i3, i5, j2, j3, j4, j5, fArr);
    }

    public final int nr() {
        return this.rl;
    }

    public final void qie(long j2) {
        this.nr = j2;
    }

    public final void r(int i2) {
        this.f6673n = i2;
    }

    public final r t() {
        float[] fArrCopyOf;
        float[] fArr = this.KN;
        if (fArr != null) {
            fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        } else {
            fArrCopyOf = null;
        }
        return rl(this, 0, 0, 0, 0L, 0L, 0L, 0L, fArrCopyOf, 127, null);
    }

    public String toString() {
        return "ZOH_DATA(zoh_magic_marker=" + this.f6673n + ", channels=" + this.rl + ", reset=" + this.f6674t + ", in_count=" + this.nr + ", in_used=" + this.f6672O + ", out_count=" + this.J2 + ", out_gen=" + this.Uo + ", last_value=" + Arrays.toString(this.KN) + ")";
    }

    public final void ty(float[] fArr) {
        this.KN = fArr;
    }

    public final long xMQ() {
        return this.Uo;
    }

    public /* synthetic */ r(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) == 0 ? i5 : 0, (i7 & 8) != 0 ? 0L : j2, (i7 & 16) != 0 ? 0L : j3, (i7 & 32) != 0 ? 0L : j4, (i7 & 64) == 0 ? j5 : 0L, (i7 & 128) != 0 ? null : fArr);
    }
}
