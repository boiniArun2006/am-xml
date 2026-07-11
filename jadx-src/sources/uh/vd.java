package uh;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import pUk.C2331c;
import pUk.eO;
import uh.eO;
import uh.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class vd {
    private final long J2;
    private final Dsr KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f74550O;
    private final Dsr Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f74551n;
    private final C2331c nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f74552t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vd.class == obj.getClass()) {
            vd vdVar = (vd) obj;
            String str = this.f74550O;
            if (str == null ? vdVar.f74550O != null : !str.equals(vdVar.f74550O)) {
                return false;
            }
            if (this.J2 != vdVar.J2 || !this.rl.equals(vdVar.rl) || !this.f74552t.equals(vdVar.f74552t) || !this.nr.equals(vdVar.nr)) {
                return false;
            }
            Dsr dsr = this.Uo;
            if (dsr == null ? vdVar.Uo != null : !dsr.equals(vdVar.Uo)) {
                return false;
            }
            Dsr dsr2 = this.KN;
            Dsr dsr3 = vdVar.KN;
            if (dsr2 != null) {
                return dsr2.equals(dsr3);
            }
            if (dsr3 == null) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74553n;

        static {
            int[] iArr = new int[eO.n.values().length];
            f74553n = iArr;
            try {
                iArr[eO.n.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74553n[eO.n.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74553n[eO.n.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74553n[eO.n.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74553n[eO.n.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74553n[eO.n.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74553n[eO.n.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74553n[eO.n.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74553n[eO.n.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74553n[eO.n.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private Pair O(eO.w6 w6Var, Dsr dsr) {
        uB.s4 s4Var = pUk.SPz.f72003O;
        Iterator it = Uo(w6Var.t()).iterator();
        boolean zT2 = true;
        while (true) {
            int i2 = 0;
            z = false;
            boolean z2 = false;
            if (!it.hasNext()) {
                if (dsr != null) {
                    while (true) {
                        if (i2 < this.rl.size()) {
                            if (((qf) this.rl.get(i2)).t().equals(w6Var.t())) {
                                uB.s4 s4Var2 = (uB.s4) dsr.rl().get(i2);
                                if (pUk.SPz.nHg(s4Var, zT2, s4Var2, dsr.t()) > 0) {
                                    zT2 = dsr.t();
                                    s4Var = s4Var2;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return new Pair(s4Var, Boolean.valueOf(zT2));
            }
            eO eOVar = (eO) it.next();
            uB.s4 s4VarKN = pUk.SPz.f72003O;
            switch (j.f74553n[eOVar.Uo().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    s4VarKN = eOVar.KN();
                case 5:
                case 6:
                default:
                    z2 = true;
                    break;
                case 7:
                    s4VarKN = eOVar.KN();
                    break;
                case 9:
                case 10:
                    s4VarKN = pUk.SPz.Z(eOVar.KN());
                    break;
            }
            if (pUk.SPz.nHg(s4Var, zT2, s4VarKN, z2) > 0) {
                zT2 = z2;
                s4Var = s4VarKN;
            }
        }
    }

    private List Uo(pUk.z zVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC2405z abstractC2405z : this.f74552t) {
            if (abstractC2405z instanceof eO) {
                eO eOVar = (eO) abstractC2405z;
                if (eOVar.J2().equals(zVar)) {
                    arrayList.add(eOVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair rl(eO.w6 w6Var, Dsr dsr) {
        uB.s4 s4Var = pUk.SPz.f72005t;
        Iterator it = Uo(w6Var.t()).iterator();
        boolean zT2 = true;
        while (true) {
            int i2 = 0;
            boolean z2 = false;
            if (!it.hasNext()) {
                if (dsr != null) {
                    while (true) {
                        if (i2 < this.rl.size()) {
                            if (((qf) this.rl.get(i2)).t().equals(w6Var.t())) {
                                uB.s4 s4Var2 = (uB.s4) dsr.rl().get(i2);
                                if (pUk.SPz.E2(s4Var, zT2, s4Var2, dsr.t()) < 0) {
                                    zT2 = dsr.t();
                                    s4Var = s4Var2;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return new Pair(s4Var, Boolean.valueOf(zT2));
            }
            eO eOVar = (eO) it.next();
            uB.s4 s4VarKN = pUk.SPz.f72005t;
            switch (j.f74553n[eOVar.Uo().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    s4VarKN = eOVar.KN();
                    z2 = true;
                    break;
                case 5:
                case 6:
                default:
                    z2 = true;
                    break;
                case 7:
                case 8:
                    s4VarKN = pUk.SPz.o(eOVar.KN());
                    z2 = true;
                    break;
                case 10:
                    s4VarKN = eOVar.KN();
                    break;
            }
            if (pUk.SPz.E2(s4Var, zT2, s4VarKN, z2) < 0) {
                zT2 = z2;
                s4Var = s4VarKN;
            }
        }
    }

    public int HI() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f74552t.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            for (eO eOVar : ((AbstractC2405z) it.next()).t()) {
                if (!eOVar.J2().XQ()) {
                    if (eOVar.Uo().equals(eO.n.ARRAY_CONTAINS) || eOVar.Uo().equals(eO.n.ARRAY_CONTAINS_ANY)) {
                        i2 = 1;
                    } else {
                        hashSet.add(eOVar.J2());
                    }
                }
            }
        }
        for (qf qfVar : this.rl) {
            if (!qfVar.t().XQ()) {
                hashSet.add(qfVar.t());
            }
        }
        return hashSet.size() + i2;
    }

    public Dsr Ik(pUk.eO eOVar) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (eO.w6 w6Var : eOVar.O()) {
            Pair pairO = w6Var.nr().equals(eO.w6.j.ASCENDING) ? O(w6Var, this.KN) : rl(w6Var, this.KN);
            arrayList.add((uB.s4) pairO.first);
            zBooleanValue &= ((Boolean) pairO.second).booleanValue();
        }
        return new Dsr(arrayList, zBooleanValue);
    }

    public Dsr J2() {
        return this.KN;
    }

    public List KN() {
        return this.f74552t;
    }

    public List az() {
        return this.rl;
    }

    public Dsr ck() {
        return this.Uo;
    }

    public Dsr gh(pUk.eO eOVar) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (eO.w6 w6Var : eOVar.O()) {
            Pair pairRl = w6Var.nr().equals(eO.w6.j.ASCENDING) ? rl(w6Var, this.Uo) : O(w6Var, this.Uo);
            arrayList.add((uB.s4) pairRl.first);
            zBooleanValue &= ((Boolean) pairRl.second).booleanValue();
        }
        return new Dsr(arrayList, zBooleanValue);
    }

    public int hashCode() {
        int iHashCode = this.rl.hashCode() * 31;
        String str = this.f74550O;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f74552t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        long j2 = this.J2;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Dsr dsr = this.Uo;
        int iHashCode3 = (i2 + (dsr != null ? dsr.hashCode() : 0)) * 31;
        Dsr dsr2 = this.KN;
        return iHashCode3 + (dsr2 != null ? dsr2.hashCode() : 0);
    }

    public long mUb() {
        return this.J2;
    }

    public String nr() {
        return this.f74550O;
    }

    public boolean o() {
        return pUk.C.ty(this.nr) && this.f74550O == null && this.f74552t.isEmpty();
    }

    public Collection qie(pUk.eO eOVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (eO.w6 w6Var : eOVar.O()) {
            for (eO eOVar2 : Uo(w6Var.t())) {
                int i2 = j.f74553n[eOVar2.Uo().ordinal()];
                if (i2 == 3 || i2 == 4) {
                    linkedHashMap.put(w6Var.t(), eOVar2.KN());
                } else if (i2 == 5 || i2 == 6) {
                    linkedHashMap.put(w6Var.t(), eOVar2.KN());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public boolean r() {
        return this.J2 != -1;
    }

    public String t() {
        String str = this.f74551n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ty().t());
        if (this.f74550O != null) {
            sb.append("|cg:");
            sb.append(this.f74550O);
        }
        sb.append("|f:");
        Iterator it = KN().iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC2405z) it.next()).n());
        }
        sb.append("|ob:");
        for (qf qfVar : az()) {
            sb.append(qfVar.t().t());
            sb.append(qfVar.rl().equals(qf.j.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb.append("|l:");
            sb.append(mUb());
        }
        if (this.Uo != null) {
            sb.append("|lb:");
            sb.append(this.Uo.t() ? "b:" : "a:");
            sb.append(this.Uo.nr());
        }
        if (this.KN != null) {
            sb.append("|ub:");
            sb.append(this.KN.t() ? "a:" : "b:");
            sb.append(this.KN.nr());
        }
        String string = sb.toString();
        this.f74551n = string;
        return string;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.nr.t());
        if (this.f74550O != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f74550O);
        }
        if (!this.f74552t.isEmpty()) {
            sb.append(" where ");
            for (int i2 = 0; i2 < this.f74552t.size(); i2++) {
                if (i2 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f74552t.get(i2));
            }
        }
        if (!this.rl.isEmpty()) {
            sb.append(" order by ");
            for (int i3 = 0; i3 < this.rl.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(this.rl.get(i3));
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public C2331c ty() {
        return this.nr;
    }

    public qf.j xMQ() {
        return ((qf) this.rl.get(r0.size() - 1)).rl();
    }

    public vd(C2331c c2331c, String str, List list, List list2, long j2, Dsr dsr, Dsr dsr2) {
        this.nr = c2331c;
        this.f74550O = str;
        this.rl = list2;
        this.f74552t = list;
        this.J2 = j2;
        this.Uo = dsr;
        this.KN = dsr2;
    }

    public List n(pUk.eO eOVar) {
        eO.w6 w6VarT = eOVar.t();
        if (w6VarT == null) {
            return null;
        }
        for (eO eOVar2 : Uo(w6VarT.t())) {
            int i2 = j.f74553n[eOVar2.Uo().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return Collections.singletonList(eOVar2.KN());
                }
            } else {
                return eOVar2.KN().Z().KN();
            }
        }
        return null;
    }
}
