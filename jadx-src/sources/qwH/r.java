package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class r implements vd, stX.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f72609n;
    private Integer nr;
    private Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f72610t;

    public r(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f72609n = bool;
        this.rl = num;
        this.f72610t = num2;
        this.nr = num3;
    }

    @Override // qwH.vd
    public void Ik(Integer num) {
        this.rl = num;
    }

    @Override // qwH.vd
    public Integer O() {
        return this.rl;
    }

    @Override // qwH.vd
    public Integer WPU() {
        return this.nr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(n(), rVar.n()) && Intrinsics.areEqual(O(), rVar.O()) && Intrinsics.areEqual(xMQ(), rVar.xMQ()) && Intrinsics.areEqual(WPU(), rVar.WPU());
    }

    @Override // qwH.vd
    public void gh(Boolean bool) {
        this.f72609n = bool;
    }

    @Override // qwH.vd
    public Boolean n() {
        return this.f72609n;
    }

    @Override // qwH.vd
    public void r(Integer num) {
        this.nr = num;
    }

    @Override // stX.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public r nr() {
        return new r(n(), O(), xMQ(), WPU());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean boolN = n();
        sb.append(boolN != null ? boolN.booleanValue() ? "-" : "+" : " ");
        Object objO = O();
        if (objO == null) {
            objO = "??";
        }
        sb.append(objO);
        sb.append(':');
        Object objXMQ = xMQ();
        if (objXMQ == null) {
            objXMQ = "??";
        }
        sb.append(objXMQ);
        sb.append(':');
        Integer numWPU = WPU();
        sb.append(numWPU != null ? numWPU : "??");
        return sb.toString();
    }

    @Override // qwH.vd
    public void ty(Integer num) {
        this.f72610t = num;
    }

    @Override // qwH.vd
    public Integer xMQ() {
        return this.f72610t;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        Boolean boolN = n();
        int iHashCode4 = 0;
        if (boolN != null) {
            iHashCode = boolN.hashCode();
        } else {
            iHashCode = 0;
        }
        Integer numO = O();
        if (numO != null) {
            iHashCode2 = numO.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i2 = iHashCode + iHashCode2;
        Integer numXMQ = xMQ();
        if (numXMQ != null) {
            iHashCode3 = numXMQ.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i3 = i2 + iHashCode3;
        Integer numWPU = WPU();
        if (numWPU != null) {
            iHashCode4 = numWPU.hashCode();
        }
        return i3 + iHashCode4;
    }

    public final Ba.aC t() {
        int i2;
        Integer numValueOf;
        Integer numValueOf2;
        if (Intrinsics.areEqual(n(), Boolean.TRUE)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Integer numO = O();
        Integer numValueOf3 = null;
        if (numO != null) {
            numValueOf = Integer.valueOf(numO.intValue() * i2);
        } else {
            numValueOf = null;
        }
        Integer numXMQ = xMQ();
        if (numXMQ != null) {
            numValueOf2 = Integer.valueOf(numXMQ.intValue() * i2);
        } else {
            numValueOf2 = null;
        }
        Integer numWPU = WPU();
        if (numWPU != null) {
            numValueOf3 = Integer.valueOf(numWPU.intValue() * i2);
        }
        return Ba.o.n(numValueOf, numValueOf2, numValueOf3);
    }

    public /* synthetic */ r(Boolean bool, Integer num, Integer num2, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3);
    }
}
