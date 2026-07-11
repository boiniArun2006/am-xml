package YHx;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements Dsr {
    private final I28 HI;
    private w6 J2;
    private Function2 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private aC f12061O;
    private Function2 Uo;
    private float[] az;
    private Function2 gh;
    private Function2 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f12062n;
    private int nr;
    private long qie;
    private double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Exception f12063t;
    private int ty;
    private Function1 xMQ;

    public fuX(double d2, double d4, Exception exc, int i2, aC aCVar, w6 w6Var, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24, j jVar, long j2, float[] fArr, int i3, I28 scratchSrcData) {
        Intrinsics.checkNotNullParameter(scratchSrcData, "scratchSrcData");
        this.f12062n = d2;
        this.rl = d4;
        this.f12063t = exc;
        this.nr = i2;
        this.f12061O = aCVar;
        this.J2 = w6Var;
        this.Uo = function2;
        this.KN = function22;
        this.xMQ = function1;
        this.mUb = function23;
        this.gh = function24;
        this.qie = j2;
        this.az = fArr;
        this.ty = i3;
        this.HI = scratchSrcData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Double.compare(this.f12062n, fux.f12062n) == 0 && Double.compare(this.rl, fux.rl) == 0 && Intrinsics.areEqual(this.f12063t, fux.f12063t) && this.nr == fux.nr && this.f12061O == fux.f12061O && Intrinsics.areEqual(this.J2, fux.J2) && Intrinsics.areEqual(this.Uo, fux.Uo) && Intrinsics.areEqual(this.KN, fux.KN) && Intrinsics.areEqual(this.xMQ, fux.xMQ) && Intrinsics.areEqual(this.mUb, fux.mUb) && Intrinsics.areEqual(this.gh, fux.gh) && Intrinsics.areEqual((Object) null, (Object) null) && this.qie == fux.qie && Intrinsics.areEqual(this.az, fux.az) && this.ty == fux.ty && Intrinsics.areEqual(this.HI, fux.HI);
    }

    public final void HI(w6 w6Var) {
        this.J2 = w6Var;
    }

    public final void Ik(float[] fArr) {
        this.az = fArr;
    }

    public final w6 J2() {
        return this.J2;
    }

    public final Function2 KN() {
        return this.Uo;
    }

    public final aC O() {
        return this.f12061O;
    }

    public final Function1 Uo() {
        return this.xMQ;
    }

    public final void Z(Function2 function2) {
        this.Uo = function2;
    }

    public final void az(double d2) {
        this.f12062n = d2;
    }

    public final void ck(Function1 function1) {
        this.xMQ = function1;
    }

    public final void gh(Function2 function2) {
        this.mUb = function2;
    }

    public int hashCode() {
        int iHashCode = ((Double.hashCode(this.f12062n) * 31) + Double.hashCode(this.rl)) * 31;
        Exception exc = this.f12063t;
        int iHashCode2 = (((iHashCode + (exc == null ? 0 : exc.hashCode())) * 31) + Integer.hashCode(this.nr)) * 31;
        aC aCVar = this.f12061O;
        int iHashCode3 = (iHashCode2 + (aCVar == null ? 0 : aCVar.hashCode())) * 31;
        w6 w6Var = this.J2;
        int iHashCode4 = (iHashCode3 + (w6Var == null ? 0 : w6Var.hashCode())) * 31;
        Function2 function2 = this.Uo;
        int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2 function22 = this.KN;
        int iHashCode6 = (iHashCode5 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function1 function1 = this.xMQ;
        int iHashCode7 = (iHashCode6 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2 function23 = this.mUb;
        int iHashCode8 = (iHashCode7 + (function23 == null ? 0 : function23.hashCode())) * 31;
        Function2 function24 = this.gh;
        int iHashCode9 = (((iHashCode8 + (function24 == null ? 0 : function24.hashCode())) * 961) + Long.hashCode(this.qie)) * 31;
        float[] fArr = this.az;
        return ((((iHashCode9 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + Integer.hashCode(this.ty)) * 31) + this.HI.hashCode();
    }

    public final void mUb(Function2 function2) {
        this.KN = function2;
    }

    public final int n() {
        return this.nr;
    }

    public final double nr() {
        return this.f12062n;
    }

    public final void o(long j2) {
        this.qie = j2;
    }

    public final void qie(double d2) {
        this.rl = d2;
    }

    public final void r(int i2) {
        this.ty = i2;
    }

    public final Function2 rl() {
        return this.KN;
    }

    public final double t() {
        return this.rl;
    }

    public String toString() {
        return "SRCPrivate(lastRatio=" + this.f12062n + ", lastPosition=" + this.rl + ", error=" + this.f12063t + ", channels=" + this.nr + ", mode=" + this.f12061O + ", privateData=" + this.J2 + ", variProcess=" + this.Uo + ", constProcess=" + this.KN + ", reset=" + this.xMQ + ", copy=" + this.mUb + ", callbackFunc=" + this.gh + ", userCallbackData=" + ((Object) null) + ", savedFrames=" + this.qie + ", savedData=" + Arrays.toString(this.az) + ", savedDataInset=" + this.ty + ", scratchSrcData=" + this.HI + ')';
    }

    public final void ty(aC aCVar) {
        this.f12061O = aCVar;
    }

    public final void xMQ(int i2) {
        this.nr = i2;
    }

    public /* synthetic */ fuX(double d2, double d4, Exception exc, int i2, aC aCVar, w6 w6Var, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24, j jVar, long j2, float[] fArr, int i3, I28 i28, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0.0d : d2, (i5 & 2) == 0 ? d4 : 0.0d, (i5 & 4) != 0 ? null : exc, (i5 & 8) != 0 ? 1 : i2, (i5 & 16) != 0 ? null : aCVar, (i5 & 32) != 0 ? null : w6Var, (i5 & 64) != 0 ? null : function2, (i5 & 128) != 0 ? null : function22, (i5 & 256) != 0 ? null : function1, (i5 & 512) != 0 ? null : function23, (i5 & 1024) != 0 ? null : function24, (i5 & 2048) != 0 ? null : jVar, (i5 & 4096) != 0 ? 0L : j2, (i5 & 8192) != 0 ? null : fArr, (i5 & 16384) != 0 ? 0 : i3, (i5 & 32768) != 0 ? new I28(null, 0, null, 0, 0L, 0L, 0L, 0L, 0, 0.0d, 1023, null) : i28);
    }
}
