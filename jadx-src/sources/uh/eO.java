package uh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class eO extends AbstractC2405z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f74498n;
    private final uB.s4 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pUk.z f74499t;

    public enum n {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f74510n;

        @Override // java.lang.Enum
        public String toString() {
            return this.f74510n;
        }

        n(String str) {
            this.f74510n = str;
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof eO)) {
            eO eOVar = (eO) obj;
            if (this.f74498n == eOVar.f74498n && this.f74499t.equals(eOVar.f74499t) && this.rl.equals(eOVar.rl)) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74500n;

        static {
            int[] iArr = new int[n.values().length];
            f74500n = iArr;
            try {
                iArr[n.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74500n[n.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74500n[n.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74500n[n.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74500n[n.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74500n[n.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public pUk.z J2() {
        return this.f74499t;
    }

    public uB.s4 KN() {
        return this.rl;
    }

    public n Uo() {
        return this.f74498n;
    }

    public int hashCode() {
        return ((((1147 + this.f74498n.hashCode()) * 31) + this.f74499t.hashCode()) * 31) + this.rl.hashCode();
    }

    protected boolean mUb(int i2) {
        switch (j.f74500n[this.f74498n.ordinal()]) {
            case 1:
                return i2 < 0;
            case 2:
                return i2 <= 0;
            case 3:
                return i2 == 0;
            case 4:
                return i2 != 0;
            case 5:
                return i2 > 0;
            case 6:
                return i2 >= 0;
            default:
                throw wqP.n.n("Unknown FieldFilter operator: %s", this.f74498n);
        }
    }

    @Override // uh.AbstractC2405z
    public String n() {
        return J2().t() + Uo().toString() + pUk.SPz.rl(KN());
    }

    @Override // uh.AbstractC2405z
    public boolean nr(pUk.fuX fux) {
        uB.s4 s4VarNr = fux.nr(this.f74499t);
        return this.f74498n == n.NOT_EQUAL ? (s4VarNr == null || s4VarNr.e() || !mUb(pUk.SPz.xMQ(s4VarNr, this.rl))) ? false : true : s4VarNr != null && pUk.SPz.N(s4VarNr) == pUk.SPz.N(this.rl) && mUb(pUk.SPz.xMQ(s4VarNr, this.rl));
    }

    public boolean xMQ() {
        return Arrays.asList(n.LESS_THAN, n.LESS_THAN_OR_EQUAL, n.GREATER_THAN, n.GREATER_THAN_OR_EQUAL, n.NOT_EQUAL, n.NOT_IN).contains(this.f74498n);
    }

    protected eO(pUk.z zVar, n nVar, uB.s4 s4Var) {
        this.f74499t = zVar;
        this.f74498n = nVar;
        this.rl = s4Var;
    }

    public static eO O(pUk.z zVar, n nVar, uB.s4 s4Var) {
        boolean z2;
        if (zVar.XQ()) {
            if (nVar == n.IN) {
                return new g9s(zVar, s4Var);
            }
            if (nVar == n.NOT_IN) {
                return new afx(zVar, s4Var);
            }
            if (nVar != n.ARRAY_CONTAINS && nVar != n.ARRAY_CONTAINS_ANY) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, nVar.toString() + "queries don't make sense on document keys", new Object[0]);
            return new ci(zVar, nVar, s4Var);
        }
        if (nVar == n.ARRAY_CONTAINS) {
            return new Wre(zVar, s4Var);
        }
        if (nVar == n.IN) {
            return new SPz(zVar, s4Var);
        }
        if (nVar == n.ARRAY_CONTAINS_ANY) {
            return new I28(zVar, s4Var);
        }
        if (nVar == n.NOT_IN) {
            return new DAz(zVar, s4Var);
        }
        return new eO(zVar, nVar, s4Var);
    }

    @Override // uh.AbstractC2405z
    public List rl() {
        return Collections.singletonList(this);
    }

    @Override // uh.AbstractC2405z
    public List t() {
        return Collections.singletonList(this);
    }

    public String toString() {
        return n();
    }
}
