package Mgn;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class QJ implements l3D {
    private final eO HI;
    private CN3 J2;
    private Function2 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EnumC1413c f6623O;
    private Function2 Uo;
    private float[] az;
    private Function2 gh;
    private Function2 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double f6624n;
    private int nr;
    private long qie;
    private double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Exception f6625t;
    private int ty;
    private Function1 xMQ;

    public QJ(double d2, double d4, Exception exc, int i2, EnumC1413c enumC1413c, CN3 cn3, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24, SPz sPz, long j2, float[] fArr, int i3, eO scratch_src_data) {
        Intrinsics.checkNotNullParameter(scratch_src_data, "scratch_src_data");
        this.f6624n = d2;
        this.rl = d4;
        this.f6625t = exc;
        this.nr = i2;
        this.f6623O = enumC1413c;
        this.J2 = cn3;
        this.Uo = function2;
        this.KN = function22;
        this.xMQ = function1;
        this.mUb = function23;
        this.gh = function24;
        this.qie = j2;
        this.az = fArr;
        this.ty = i3;
        this.HI = scratch_src_data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QJ)) {
            return false;
        }
        QJ qj = (QJ) obj;
        return Double.compare(this.f6624n, qj.f6624n) == 0 && Double.compare(this.rl, qj.rl) == 0 && Intrinsics.areEqual(this.f6625t, qj.f6625t) && this.nr == qj.nr && this.f6623O == qj.f6623O && Intrinsics.areEqual(this.J2, qj.J2) && Intrinsics.areEqual(this.Uo, qj.Uo) && Intrinsics.areEqual(this.KN, qj.KN) && Intrinsics.areEqual(this.xMQ, qj.xMQ) && Intrinsics.areEqual(this.mUb, qj.mUb) && Intrinsics.areEqual(this.gh, qj.gh) && Intrinsics.areEqual((Object) null, (Object) null) && this.qie == qj.qie && Intrinsics.areEqual(this.az, qj.az) && this.ty == qj.ty && Intrinsics.areEqual(this.HI, qj.HI);
    }

    public final void HI(CN3 cn3) {
        this.J2 = cn3;
    }

    public final void Ik(float[] fArr) {
        this.az = fArr;
    }

    public final CN3 J2() {
        return this.J2;
    }

    public final Function2 KN() {
        return this.Uo;
    }

    public final EnumC1413c O() {
        return this.f6623O;
    }

    public final Function1 Uo() {
        return this.xMQ;
    }

    public final void Z(Function2 function2) {
        this.Uo = function2;
    }

    public final void az(double d2) {
        this.f6624n = d2;
    }

    public final void ck(Function1 function1) {
        this.xMQ = function1;
    }

    public final void gh(Function2 function2) {
        this.mUb = function2;
    }

    public int hashCode() {
        int iHashCode = ((Double.hashCode(this.f6624n) * 31) + Double.hashCode(this.rl)) * 31;
        Exception exc = this.f6625t;
        int iHashCode2 = (((iHashCode + (exc == null ? 0 : exc.hashCode())) * 31) + Integer.hashCode(this.nr)) * 31;
        EnumC1413c enumC1413c = this.f6623O;
        int iHashCode3 = (iHashCode2 + (enumC1413c == null ? 0 : enumC1413c.hashCode())) * 31;
        CN3 cn3 = this.J2;
        int iHashCode4 = (iHashCode3 + (cn3 == null ? 0 : cn3.hashCode())) * 31;
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
        return this.f6624n;
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
        return "SRC_PRIVATE(last_ratio=" + this.f6624n + ", last_position=" + this.rl + ", error=" + this.f6625t + ", channels=" + this.nr + ", mode=" + this.f6623O + ", private_data=" + this.J2 + ", vari_process=" + this.Uo + ", const_process=" + this.KN + ", reset=" + this.xMQ + ", copy=" + this.mUb + ", callback_func=" + this.gh + ", user_callback_data=" + ((Object) null) + ", saved_frames=" + this.qie + ", saved_data=" + Arrays.toString(this.az) + ", saved_data_inset=" + this.ty + ", scratch_src_data=" + this.HI + ")";
    }

    public final void ty(EnumC1413c enumC1413c) {
        this.f6623O = enumC1413c;
    }

    public final void xMQ(int i2) {
        this.nr = i2;
    }

    public /* synthetic */ QJ(double d2, double d4, Exception exc, int i2, EnumC1413c enumC1413c, CN3 cn3, Function2 function2, Function2 function22, Function1 function1, Function2 function23, Function2 function24, SPz sPz, long j2, float[] fArr, int i3, eO eOVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0.0d : d2, (i5 & 2) == 0 ? d4 : 0.0d, (i5 & 4) != 0 ? null : exc, (i5 & 8) != 0 ? 1 : i2, (i5 & 16) != 0 ? null : enumC1413c, (i5 & 32) != 0 ? null : cn3, (i5 & 64) != 0 ? null : function2, (i5 & 128) != 0 ? null : function22, (i5 & 256) != 0 ? null : function1, (i5 & 512) != 0 ? null : function23, (i5 & 1024) != 0 ? null : function24, (i5 & 2048) != 0 ? null : sPz, (i5 & 4096) != 0 ? 0L : j2, (i5 & 8192) != 0 ? null : fArr, (i5 & 16384) != 0 ? 0 : i3, (i5 & 32768) != 0 ? new eO(null, 0, null, 0, 0L, 0L, 0L, 0L, 0, 0.0d, 1023, null) : eOVar);
    }
}
