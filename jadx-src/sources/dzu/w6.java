package dzu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f63582n = AtomicReferenceFieldUpdater.newUpdater(w6.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater rl = AtomicReferenceFieldUpdater.newUpdater(w6.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean gh();

    public w6(w6 w6Var) {
        this._prev$volatile = w6Var;
    }

    private final w6 O() {
        w6 w6VarJ2;
        w6 w6VarJ22 = J2();
        Intrinsics.checkNotNull(w6VarJ22);
        while (w6VarJ22.gh() && (w6VarJ2 = w6VarJ22.J2()) != null) {
            w6VarJ22 = w6VarJ2;
        }
        return w6VarJ22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Uo() {
        return f63582n.get(this);
    }

    private final w6 nr() {
        w6 w6VarKN = KN();
        while (w6VarKN != null && w6VarKN.gh()) {
            w6VarKN = (w6) rl.get(w6VarKN);
        }
        return w6VarKN;
    }

    public final boolean HI(w6 w6Var) {
        return androidx.concurrent.futures.j.n(f63582n, this, null, w6Var);
    }

    public final w6 J2() {
        Object objUo = Uo();
        if (objUo == n.f63571n) {
            return null;
        }
        return (w6) objUo;
    }

    public final w6 KN() {
        return (w6) rl.get(this);
    }

    public final boolean az() {
        return androidx.concurrent.futures.j.n(f63582n, this, null, n.f63571n);
    }

    public final boolean qie() {
        if (J2() == null) {
            return true;
        }
        return false;
    }

    public final void t() {
        rl.set(this, null);
    }

    public final void ty() {
        Object obj;
        w6 w6Var;
        if (qie()) {
            return;
        }
        while (true) {
            w6 w6VarNr = nr();
            w6 w6VarO = O();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rl;
            do {
                obj = atomicReferenceFieldUpdater.get(w6VarO);
                if (((w6) obj) == null) {
                    w6Var = null;
                } else {
                    w6Var = w6VarNr;
                }
            } while (!androidx.concurrent.futures.j.n(atomicReferenceFieldUpdater, w6VarO, obj, w6Var));
            if (w6VarNr != null) {
                f63582n.set(w6VarNr, w6VarO);
            }
            if (!w6VarO.gh() || w6VarO.qie()) {
                if (w6VarNr == null || !w6VarNr.gh()) {
                    return;
                }
            }
        }
    }
}
