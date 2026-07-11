package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class UGc implements fuX, stX.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Integer f72541O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f72542n;
    private Integer nr;
    private Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f72543t;

    public UGc(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.f72542n = num;
        this.rl = num2;
        this.f72543t = num3;
        this.nr = num4;
        this.f72541O = num5;
    }

    @Override // qwH.fuX
    public Integer E2() {
        return this.rl;
    }

    @Override // qwH.fuX
    public Integer KN() {
        return this.nr;
    }

    @Override // qwH.fuX
    public void S(Integer num) {
        this.rl = num;
    }

    @Override // qwH.fuX
    public Integer ViF() {
        return this.f72542n;
    }

    @Override // qwH.fuX
    public void X(Integer num) {
        this.nr = num;
    }

    @Override // qwH.fuX
    public void ck(Integer num) {
        this.f72541O = num;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UGc)) {
            return false;
        }
        UGc uGc = (UGc) obj;
        return Intrinsics.areEqual(ViF(), uGc.ViF()) && Intrinsics.areEqual(E2(), uGc.E2()) && Intrinsics.areEqual(fD(), uGc.fD()) && Intrinsics.areEqual(KN(), uGc.KN()) && Intrinsics.areEqual(te(), uGc.te());
    }

    @Override // qwH.fuX
    public Integer fD() {
        return this.f72543t;
    }

    @Override // qwH.fuX
    public void iF(Integer num) {
        this.f72542n = num;
    }

    @Override // stX.w6
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UGc nr() {
        return new UGc(ViF(), E2(), fD(), KN(), te());
    }

    @Override // qwH.fuX
    public void nY(Integer num) {
        this.f72543t = num;
    }

    @Override // qwH.fuX
    public Integer te() {
        return this.f72541O;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object objViF = ViF();
        if (objViF == null) {
            objViF = "??";
        }
        sb.append(objViF);
        sb.append('-');
        Object objE2 = E2();
        if (objE2 == null) {
            objE2 = "??";
        }
        sb.append(objE2);
        sb.append('-');
        Object objFD = fD();
        if (objFD == null) {
            objFD = "??";
        }
        sb.append(objFD);
        sb.append(" (day of week is ");
        Integer numKN = KN();
        sb.append(numKN != null ? numKN : "??");
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        Integer numViF = ViF();
        int iHashCode5 = 0;
        if (numViF != null) {
            iHashCode = numViF.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 923521;
        Integer numE2 = E2();
        if (numE2 != null) {
            iHashCode2 = numE2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i3 = i2 + (iHashCode2 * 29791);
        Integer numFD = fD();
        if (numFD != null) {
            iHashCode3 = numFD.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i5 = i3 + (iHashCode3 * 961);
        Integer numKN = KN();
        if (numKN != null) {
            iHashCode4 = numKN.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i7 = i5 + (iHashCode4 * 31);
        Integer numTe = te();
        if (numTe != null) {
            iHashCode5 = numTe.hashCode();
        }
        return i7 + iHashCode5;
    }

    public final Ba.I28 rl() {
        Ba.I28 i28;
        int iIntValue;
        int iIntValue2 = ((Number) ci.nr(ViF(), "year")).intValue();
        Integer numTe = te();
        if (numTe == null) {
            i28 = new Ba.I28(iIntValue2, ((Number) ci.nr(E2(), "monthNumber")).intValue(), ((Number) ci.nr(fD(), "dayOfMonth")).intValue());
        } else {
            Ba.I28 i28Rl = Ba.Wre.rl(new Ba.I28(iIntValue2, 1, 1), numTe.intValue() - 1, Ba.n.INSTANCE.n());
            if (i28Rl.KN() == iIntValue2) {
                if (E2() != null) {
                    int iJ2 = i28Rl.J2();
                    Integer numE2 = E2();
                    if (numE2 == null || iJ2 != numE2.intValue()) {
                        throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + numTe + ", which is " + i28Rl.nr() + ", but " + E2() + " was specified as the month number");
                    }
                }
                if (fD() != null) {
                    int iRl = i28Rl.rl();
                    Integer numFD = fD();
                    if (numFD == null || iRl != numFD.intValue()) {
                        throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + numTe + ", which is the day " + i28Rl.rl() + " of " + i28Rl.nr() + ", but " + fD() + " was specified as the day of month");
                    }
                }
                i28 = i28Rl;
            } else {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + numTe + ", which is not a valid day of year for the year " + iIntValue2);
            }
        }
        Integer numKN = KN();
        if (numKN != null && (iIntValue = numKN.intValue()) != Ba.w6.rl(i28.t())) {
            throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of week is " + Ba.w6.n(iIntValue) + " but the date is " + i28 + ", which is a " + i28.t());
        }
        return i28;
    }

    public /* synthetic */ UGc(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : num3, (i2 & 8) != 0 ? null : num4, (i2 & 16) != 0 ? null : num5);
    }
}
