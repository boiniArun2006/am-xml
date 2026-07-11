package FSZ;

import bA.C1653C;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class afx {
    private static final Class rl = afx.class;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f2608n = new HashMap();

    private synchronized void t() {
        Dzy.j.HI(rl, "Count = %d", Integer.valueOf(this.f2608n.size()));
    }

    public synchronized boolean J2(lN.Ml ml, C1653C c1653c) {
        Hh.C.Uo(ml);
        Hh.C.Uo(c1653c);
        Hh.C.rl(Boolean.valueOf(C1653C.qm(c1653c)));
        C1653C c1653c2 = (C1653C) this.f2608n.get(ml);
        if (c1653c2 == null) {
            return false;
        }
        Pj0.j jVarT = c1653c2.T();
        Pj0.j jVarT2 = c1653c.T();
        if (jVarT != null && jVarT2 != null) {
            try {
                if (jVarT.eF() == jVarT2.eF()) {
                    this.f2608n.remove(ml);
                    Pj0.j.M7(jVarT2);
                    Pj0.j.M7(jVarT);
                    C1653C.Uo(c1653c2);
                    t();
                    return true;
                }
            } finally {
                Pj0.j.M7(jVarT2);
                Pj0.j.M7(jVarT);
                C1653C.Uo(c1653c2);
            }
        }
        return false;
    }

    public synchronized C1653C n(lN.Ml ml) {
        Hh.C.Uo(ml);
        C1653C c1653cRl = (C1653C) this.f2608n.get(ml);
        if (c1653cRl != null) {
            synchronized (c1653cRl) {
                if (!C1653C.qm(c1653cRl)) {
                    this.f2608n.remove(ml);
                    Dzy.j.WPU(rl, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c1653cRl)), ml.n(), Integer.valueOf(System.identityHashCode(ml)));
                    return null;
                }
                c1653cRl = C1653C.rl(c1653cRl);
            }
        }
        return c1653cRl;
    }

    public synchronized void nr(lN.Ml ml, C1653C c1653c) {
        Hh.C.Uo(ml);
        Hh.C.rl(Boolean.valueOf(C1653C.qm(c1653c)));
        C1653C.Uo((C1653C) this.f2608n.put(ml, C1653C.rl(c1653c)));
        t();
    }

    public static afx rl() {
        return new afx();
    }

    private afx() {
    }

    public boolean O(lN.Ml ml) {
        C1653C c1653c;
        Hh.C.Uo(ml);
        synchronized (this) {
            c1653c = (C1653C) this.f2608n.remove(ml);
        }
        if (c1653c == null) {
            return false;
        }
        try {
            return c1653c.isValid();
        } finally {
            c1653c.close();
        }
    }
}
