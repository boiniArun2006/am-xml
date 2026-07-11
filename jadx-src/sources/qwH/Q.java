package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.datetime.DateTimeFormatException;
import qwH.iwV;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Q implements iwV, stX.w6 {
    private Integer J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Integer f72536O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f72537n;
    private Integer nr;
    private Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CN3 f72538t;

    public Q(Integer num, Integer num2, CN3 cn3, Integer num3, Integer num4, Integer num5) {
        this.f72537n = num;
        this.rl = num2;
        this.f72538t = cn3;
        this.nr = num3;
        this.f72536O = num4;
        this.J2 = num5;
    }

    @Override // qwH.iwV
    public void HI(Integer num) {
        this.f72536O = num;
    }

    @Override // qwH.iwV
    public Integer J2() {
        return this.J2;
    }

    @Override // qwH.iwV
    public Integer Uo() {
        return this.rl;
    }

    @Override // qwH.iwV
    public void XQ(Integer num) {
        this.J2 = num;
    }

    @Override // qwH.iwV
    public void Z(Integer num) {
        this.rl = num;
    }

    @Override // qwH.iwV
    public void aYN(Integer num) {
        this.nr = num;
    }

    @Override // qwH.iwV
    public Integer az() {
        return this.f72536O;
    }

    @Override // qwH.iwV
    public void e(Integer num) {
        this.f72537n = num;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return Intrinsics.areEqual(t(), q2.t()) && Intrinsics.areEqual(Uo(), q2.Uo()) && o() == q2.o() && Intrinsics.areEqual(rl(), q2.rl()) && Intrinsics.areEqual(az(), q2.az()) && Intrinsics.areEqual(J2(), q2.J2());
    }

    @Override // qwH.iwV
    public void mUb(CN3 cn3) {
        this.f72538t = cn3;
    }

    @Override // stX.w6
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Q nr() {
        return new Q(t(), Uo(), o(), rl(), az(), J2());
    }

    @Override // qwH.iwV
    public CN3 o() {
        return this.f72538t;
    }

    @Override // qwH.iwV
    public Integer rl() {
        return this.nr;
    }

    @Override // qwH.iwV
    public Integer t() {
        return this.f72537n;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strPadStart;
        StringBuilder sb = new StringBuilder();
        Object objT = t();
        if (objT == null) {
            objT = "??";
        }
        sb.append(objT);
        sb.append(':');
        Object objRl = rl();
        if (objRl == null) {
            objRl = "??";
        }
        sb.append(objRl);
        sb.append(':');
        Integer numAz = az();
        sb.append(numAz != null ? numAz : "??");
        sb.append('.');
        Integer numJ2 = J2();
        if (numJ2 != null) {
            String strValueOf = String.valueOf(numJ2.intValue());
            strPadStart = StringsKt.padStart(strValueOf, 9 - strValueOf.length(), '0');
            if (strPadStart == null) {
                strPadStart = "???";
            }
        }
        sb.append(strPadStart);
        return sb.toString();
    }

    public final Ba.fuX O() {
        int iIntValue;
        int iIntValue2;
        boolean z2;
        int iIntValue3;
        Integer numT = t();
        int i2 = 12;
        int iIntValue4 = 0;
        if (numT != null) {
            iIntValue = numT.intValue();
            Integer numUo = Uo();
            boolean z3 = true;
            if (numUo != null && ((iIntValue + 11) % 12) + 1 != (iIntValue3 = numUo.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + iIntValue + ", but hour-of-am-pm is " + iIntValue3).toString());
            }
            CN3 cn3O = o();
            if (cn3O != null) {
                if (cn3O == CN3.f72509t) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (iIntValue < 12) {
                    z3 = false;
                }
                if (z2 != z3) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + cn3O).toString());
                }
            }
        } else {
            Integer numUo2 = Uo();
            Integer numValueOf = null;
            if (numUo2 != null) {
                int iIntValue5 = numUo2.intValue();
                CN3 cn3O2 = o();
                if (cn3O2 != null) {
                    if (iIntValue5 == 12) {
                        iIntValue5 = 0;
                    }
                    if (cn3O2 != CN3.f72509t) {
                        i2 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue5 + i2);
                }
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
        }
        int iIntValue6 = ((Number) ci.nr(rl(), "minute")).intValue();
        Integer numAz = az();
        if (numAz != null) {
            iIntValue2 = numAz.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numJ2 = J2();
        if (numJ2 != null) {
            iIntValue4 = numJ2.intValue();
        }
        return new Ba.fuX(iIntValue, iIntValue6, iIntValue2, iIntValue4);
    }

    @Override // qwH.iwV
    public fm.j g() {
        return iwV.j.n(this);
    }

    public int hashCode() {
        int iIntValue;
        int iIntValue2;
        int iHashCode;
        int iIntValue3;
        int iIntValue4;
        Integer numT = t();
        int iIntValue5 = 0;
        if (numT != null) {
            iIntValue = numT.intValue();
        } else {
            iIntValue = 0;
        }
        int i2 = iIntValue * 31;
        Integer numUo = Uo();
        if (numUo != null) {
            iIntValue2 = numUo.intValue();
        } else {
            iIntValue2 = 0;
        }
        int i3 = i2 + (iIntValue2 * 31);
        CN3 cn3O = o();
        if (cn3O != null) {
            iHashCode = cn3O.hashCode();
        } else {
            iHashCode = 0;
        }
        int i5 = i3 + (iHashCode * 31);
        Integer numRl = rl();
        if (numRl != null) {
            iIntValue3 = numRl.intValue();
        } else {
            iIntValue3 = 0;
        }
        int i7 = i5 + (iIntValue3 * 31);
        Integer numAz = az();
        if (numAz != null) {
            iIntValue4 = numAz.intValue();
        } else {
            iIntValue4 = 0;
        }
        int i8 = i7 + (iIntValue4 * 31);
        Integer numJ2 = J2();
        if (numJ2 != null) {
            iIntValue5 = numJ2.intValue();
        }
        return i8 + iIntValue5;
    }

    @Override // qwH.iwV
    public void qie(fm.j jVar) {
        iwV.j.rl(this, jVar);
    }

    public /* synthetic */ Q(Integer num, Integer num2, CN3 cn3, Integer num3, Integer num4, Integer num5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : cn3, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : num5);
    }
}
