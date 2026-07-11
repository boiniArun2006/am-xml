package io.grpc;

import com.google.common.collect.u;
import io.grpc.AbstractC2170c;
import io.grpc.internal.nKK;
import io.grpc.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc {
    private static UGc J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Logger f68212O = Logger.getLogger(UGc.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC2170c.w6 f68213n = new n();
    private String rl = "unknown";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LinkedHashSet f68214t = new LinkedHashSet();
    private u nr = u.ty();

    private final class n extends AbstractC2170c.w6 {
        private n() {
        }
    }

    private synchronized void Uo() {
        try {
            HashMap map = new HashMap();
            String strNr = "unknown";
            int iJ2 = Integer.MIN_VALUE;
            for (s4 s4Var : this.f68214t) {
                String strNr2 = s4Var.nr();
                s4 s4Var2 = (s4) map.get(strNr2);
                if (s4Var2 == null || s4Var2.J2() < s4Var.J2()) {
                    map.put(strNr2, s4Var);
                }
                if (iJ2 < s4Var.J2()) {
                    iJ2 = s4Var.J2();
                    strNr = s4Var.nr();
                }
            }
            this.nr = u.Uo(map);
            this.rl = strNr;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void n(s4 s4Var) {
        t1.Xo.O(s4Var.O(), "isAvailable() returned false");
        this.f68214t.add(s4Var);
    }

    synchronized Map J2() {
        return this.nr;
    }

    public synchronized String t() {
        return this.rl;
    }

    private static final class w6 implements r.n {
        private w6() {
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public boolean n(s4 s4Var) {
            return s4Var.O();
        }

        @Override // io.grpc.r.n
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int rl(s4 s4Var) {
            return s4Var.J2();
        }
    }

    static List nr() {
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = nKK.rl;
            arrayList.add(nKK.class);
        } catch (ClassNotFoundException e2) {
            f68212O.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized UGc rl() {
        try {
            if (J2 == null) {
                List<s4> listO = r.O(s4.class, nr(), s4.class.getClassLoader(), new w6());
                if (listO.isEmpty()) {
                    f68212O.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                J2 = new UGc();
                for (s4 s4Var : listO) {
                    f68212O.fine("Service loader found " + s4Var);
                    J2.n(s4Var);
                }
                J2.Uo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return J2;
    }

    public s4 O(String str) {
        if (str == null) {
            return null;
        }
        return (s4) J2().get(str.toLowerCase(Locale.US));
    }
}
