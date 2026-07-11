package YHx;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements w6 {
    private long J2;
    private float[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f12053O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12054n;
    private long nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12055t;

    public Ml(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr) {
        this.f12054n = i2;
        this.rl = i3;
        this.f12055t = i5;
        this.nr = j2;
        this.f12053O = j3;
        this.J2 = j4;
        this.Uo = j5;
        this.KN = fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return this.f12054n == ml.f12054n && this.rl == ml.rl && this.f12055t == ml.f12055t && this.nr == ml.nr && this.f12053O == ml.f12053O && this.J2 == ml.J2 && this.Uo == ml.Uo && Intrinsics.areEqual(this.KN, ml.KN);
    }

    public static /* synthetic */ Ml rl(Ml ml, int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = ml.f12054n;
        }
        if ((i7 & 2) != 0) {
            i3 = ml.rl;
        }
        if ((i7 & 4) != 0) {
            i5 = ml.f12055t;
        }
        if ((i7 & 8) != 0) {
            j2 = ml.nr;
        }
        if ((i7 & 16) != 0) {
            j3 = ml.f12053O;
        }
        if ((i7 & 32) != 0) {
            j4 = ml.J2;
        }
        if ((i7 & 64) != 0) {
            j5 = ml.Uo;
        }
        if ((i7 & 128) != 0) {
            fArr = ml.KN;
        }
        float[] fArr2 = fArr;
        long j6 = j5;
        long j7 = j4;
        long j9 = j3;
        int i8 = i5;
        return ml.n(i2, i3, i8, j2, j9, j7, j6, fArr2);
    }

    public final void HI(int i2) {
        this.f12054n = i2;
    }

    public final void Ik(long j2) {
        this.Uo = j2;
    }

    public final long J2() {
        return this.f12053O;
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
        this.f12053O = j2;
    }

    public final void ck(long j2) {
        this.J2 = j2;
    }

    public final void gh(int i2) {
        this.rl = i2;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.f12054n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f12055t)) * 31) + Long.hashCode(this.nr)) * 31) + Long.hashCode(this.f12053O)) * 31) + Long.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31;
        float[] fArr = this.KN;
        return iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr));
    }

    public final int mUb() {
        return this.f12055t;
    }

    public final Ml n(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr) {
        return new Ml(i2, i3, i5, j2, j3, j4, j5, fArr);
    }

    public final int nr() {
        return this.rl;
    }

    public final void qie(long j2) {
        this.nr = j2;
    }

    public final void r(int i2) {
        this.f12055t = i2;
    }

    public final Ml t() {
        float[] fArrCopyOf;
        float[] fArr = this.KN;
        if (fArr != null) {
            fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        } else {
            fArrCopyOf = null;
        }
        return rl(this, 0, 0, 0, 0L, 0L, 0L, 0L, fArrCopyOf, 127, null);
    }

    public String toString() {
        return "LinearData(linearMagicMarker=" + this.f12054n + ", channels=" + this.rl + ", reset=" + this.f12055t + ", inCount=" + this.nr + ", inUsed=" + this.f12053O + ", outCount=" + this.J2 + ", outGen=" + this.Uo + ", lastValue=" + Arrays.toString(this.KN) + ')';
    }

    public final void ty(float[] fArr) {
        this.KN = fArr;
    }

    public final long xMQ() {
        return this.Uo;
    }

    public /* synthetic */ Ml(int i2, int i3, int i5, long j2, long j3, long j4, long j5, float[] fArr, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) == 0 ? i5 : 0, (i7 & 8) != 0 ? 0L : j2, (i7 & 16) != 0 ? 0L : j3, (i7 & 32) != 0 ? 0L : j4, (i7 & 64) == 0 ? j5 : 0L, (i7 & 128) != 0 ? null : fArr);
    }
}
