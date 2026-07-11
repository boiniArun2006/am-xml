package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class g9s implements Serializable {
    private final EnumC1898o J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f59701O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final EnumC1898o f59702Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Comparator f59703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f59704o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f59705r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f59706t;

    static g9s n(Comparator comparator) {
        EnumC1898o enumC1898o = EnumC1898o.OPEN;
        return new g9s(comparator, false, null, enumC1898o, false, null, enumC1898o);
    }

    static g9s nr(Comparator comparator, Object obj, EnumC1898o enumC1898o) {
        return new g9s(comparator, true, obj, enumC1898o, false, null, EnumC1898o.OPEN);
    }

    static g9s ty(Comparator comparator, Object obj, EnumC1898o enumC1898o) {
        return new g9s(comparator, false, null, EnumC1898o.OPEN, true, obj, enumC1898o);
    }

    Object J2() {
        return this.f59701O;
    }

    Object KN() {
        return this.f59704o;
    }

    EnumC1898o O() {
        return this.J2;
    }

    EnumC1898o Uo() {
        return this.f59702Z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g9s) {
            g9s g9sVar = (g9s) obj;
            if (this.f59703n.equals(g9sVar.f59703n) && this.f59706t == g9sVar.f59706t && this.f59705r == g9sVar.f59705r && O().equals(g9sVar.O()) && Uo().equals(g9sVar.Uo()) && t1.C.n(J2(), g9sVar.J2()) && t1.C.n(KN(), g9sVar.KN())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return t1.C.rl(this.f59703n, J2(), O(), KN(), Uo());
    }

    boolean mUb() {
        return this.f59705r;
    }

    Comparator rl() {
        return this.f59703n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f59703n);
        sb.append(":");
        EnumC1898o enumC1898o = this.J2;
        EnumC1898o enumC1898o2 = EnumC1898o.CLOSED;
        sb.append(enumC1898o == enumC1898o2 ? '[' : '(');
        sb.append(this.f59706t ? this.f59701O : "-∞");
        sb.append(',');
        sb.append(this.f59705r ? this.f59704o : "∞");
        sb.append(this.f59702Z == enumC1898o2 ? ']' : ')');
        return sb.toString();
    }

    boolean xMQ() {
        return this.f59706t;
    }

    private g9s(Comparator comparator, boolean z2, Object obj, EnumC1898o enumC1898o, boolean z3, Object obj2, EnumC1898o enumC1898o2) {
        boolean z4;
        this.f59703n = (Comparator) t1.Xo.HI(comparator);
        this.f59706t = z2;
        this.f59705r = z3;
        this.f59701O = obj;
        this.J2 = (EnumC1898o) t1.Xo.HI(enumC1898o);
        this.f59704o = obj2;
        this.f59702Z = (EnumC1898o) t1.Xo.HI(enumC1898o2);
        if (z2) {
            comparator.compare(P.n(obj), P.n(obj));
        }
        if (z3) {
            comparator.compare(P.n(obj2), P.n(obj2));
        }
        if (z2 && z3) {
            int iCompare = comparator.compare(P.n(obj), P.n(obj2));
            if (iCompare <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            t1.Xo.qie(z4, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                EnumC1898o enumC1898o3 = EnumC1898o.OPEN;
                t1.Xo.nr((enumC1898o == enumC1898o3 && enumC1898o2 == enumC1898o3) ? false : true);
            }
        }
    }

    boolean az(Object obj) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!xMQ()) {
            return false;
        }
        int iCompare = this.f59703n.compare(obj, P.n(J2()));
        if (iCompare < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iCompare == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (O() == EnumC1898o.OPEN) {
            z4 = true;
        }
        return (z3 & z4) | z2;
    }

    g9s gh(g9s g9sVar) {
        int iCompare;
        int iCompare2;
        Object obj;
        int iCompare3;
        EnumC1898o enumC1898o;
        t1.Xo.HI(g9sVar);
        t1.Xo.nr(this.f59703n.equals(g9sVar.f59703n));
        boolean z2 = this.f59706t;
        Object objJ2 = J2();
        EnumC1898o enumC1898oO = O();
        if (!xMQ()) {
            z2 = g9sVar.f59706t;
            objJ2 = g9sVar.J2();
            enumC1898oO = g9sVar.O();
        } else if (g9sVar.xMQ() && ((iCompare = this.f59703n.compare(J2(), g9sVar.J2())) < 0 || (iCompare == 0 && g9sVar.O() == EnumC1898o.OPEN))) {
            objJ2 = g9sVar.J2();
            enumC1898oO = g9sVar.O();
        }
        boolean z3 = z2;
        boolean z4 = this.f59705r;
        Object objKN = KN();
        EnumC1898o enumC1898oUo = Uo();
        if (!mUb()) {
            z4 = g9sVar.f59705r;
            objKN = g9sVar.KN();
            enumC1898oUo = g9sVar.Uo();
        } else if (g9sVar.mUb() && ((iCompare2 = this.f59703n.compare(KN(), g9sVar.KN())) > 0 || (iCompare2 == 0 && g9sVar.Uo() == EnumC1898o.OPEN))) {
            objKN = g9sVar.KN();
            enumC1898oUo = g9sVar.Uo();
        }
        boolean z5 = z4;
        Object obj2 = objKN;
        if (z3 && z5 && ((iCompare3 = this.f59703n.compare(objJ2, obj2)) > 0 || (iCompare3 == 0 && enumC1898oO == (enumC1898o = EnumC1898o.OPEN) && enumC1898oUo == enumC1898o))) {
            enumC1898oO = EnumC1898o.OPEN;
            enumC1898oUo = EnumC1898o.CLOSED;
            obj = obj2;
        } else {
            obj = objJ2;
        }
        return new g9s(this.f59703n, z3, obj, enumC1898oO, z5, obj2, enumC1898oUo);
    }

    boolean qie(Object obj) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!mUb()) {
            return false;
        }
        int iCompare = this.f59703n.compare(obj, P.n(KN()));
        if (iCompare > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iCompare == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Uo() == EnumC1898o.OPEN) {
            z4 = true;
        }
        return (z3 & z4) | z2;
    }

    boolean t(Object obj) {
        if (!az(obj) && !qie(obj)) {
            return true;
        }
        return false;
    }
}
