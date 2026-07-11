package io.grpc;

import io.grpc.internal.kO4;
import io.grpc.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eO {
    private static eO nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet f68230n = new LinkedHashSet();
    private final LinkedHashMap rl = new LinkedHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f68229t = Logger.getLogger(eO.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Iterable f68228O = t();

    private synchronized void O() {
        try {
            this.rl.clear();
            for (Xo xo : this.f68230n) {
                String strRl = xo.rl();
                Xo xo2 = (Xo) this.rl.get(strRl);
                if (xo2 == null || xo2.t() < xo.t()) {
                    this.rl.put(strRl, xo);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void n(Xo xo) {
        t1.Xo.O(xo.nr(), "isAvailable() returned false");
        this.f68230n.add(xo);
    }

    public synchronized Xo nr(String str) {
        return (Xo) this.rl.get(t1.Xo.ck(str, "policy"));
    }

    private static final class j implements r.n {
        j() {
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public boolean n(Xo xo) {
            return xo.nr();
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int rl(Xo xo) {
            return xo.t();
        }
    }

    public static synchronized eO rl() {
        try {
            if (nr == null) {
                List<Xo> listO = r.O(Xo.class, f68228O, Xo.class.getClassLoader(), new j());
                nr = new eO();
                for (Xo xo : listO) {
                    f68229t.fine("Service loader found " + xo);
                    nr.n(xo);
                }
                nr.O();
            }
        } catch (Throwable th) {
            throw th;
        }
        return nr;
    }

    static List t() {
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = kO4.f68624t;
            arrayList.add(kO4.class);
        } catch (ClassNotFoundException e2) {
            f68229t.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            int i3 = pL6.C.rl;
            arrayList.add(pL6.C.class);
        } catch (ClassNotFoundException e3) {
            f68229t.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
