package GJW;

import kotlin.Unit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class c7r extends L0y implements g9s {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f3474O;

    public c7r(xuv xuvVar) {
        super(true);
        Y(xuvVar);
        this.f3474O = lLA();
    }

    @Override // GJW.L0y
    public boolean M7() {
        return true;
    }

    @Override // GJW.L0y
    public boolean U() {
        return this.f3474O;
    }

    @Override // GJW.g9s
    public boolean n(Throwable th) {
        return m(new Z(th, false, 2, null));
    }

    @Override // GJW.g9s
    public boolean rl() {
        return m(Unit.INSTANCE);
    }

    private final boolean lLA() {
        UGc uGc;
        L0y l0yXQ;
        UGc uGc2;
        s4 s4VarB = B();
        if (s4VarB instanceof UGc) {
            uGc = (UGc) s4VarB;
        } else {
            uGc = null;
        }
        if (uGc != null && (l0yXQ = uGc.XQ()) != null) {
            while (!l0yXQ.U()) {
                s4 s4VarB2 = l0yXQ.B();
                if (s4VarB2 instanceof UGc) {
                    uGc2 = (UGc) s4VarB2;
                } else {
                    uGc2 = null;
                }
                if (uGc2 == null || (l0yXQ = uGc2.XQ()) == null) {
                }
            }
            return true;
        }
        return false;
    }
}
