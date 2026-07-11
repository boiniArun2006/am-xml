package uh;

import com.google.firebase.firestore.EnumC1910c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uh.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Xo implements rv6.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rv6 f74473n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f74474t = new HashSet();
    private u nr = u.UNKNOWN;
    private final Map rl = new HashMap();

    private static class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f74475n = new ArrayList();
        private Md rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f74476t;

        boolean J2() {
            Iterator it = this.f74475n.iterator();
            while (it.hasNext()) {
                if (((lej) it.next()).rl()) {
                    return true;
                }
            }
            return false;
        }

        I28() {
        }
    }

    private enum Ml {
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION,
        INITIALIZE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_CONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f74482n;
        public EnumC1910c nr = EnumC1910c.DEFAULT;
        public boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f74483t;
    }

    private enum w6 {
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION,
        TERMINATE_LOCAL_LISTEN_ONLY,
        REQUIRE_WATCH_DISCONNECTION_ONLY,
        NO_ACTION_REQUIRED
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f74481n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[w6.values().length];
            rl = iArr;
            try {
                iArr[w6.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[w6.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[w6.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Ml.values().length];
            f74481n = iArr2;
            try {
                iArr2[Ml.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74481n[Ml.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74481n[Ml.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void O() {
        Iterator it = this.f74474t.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.firestore.Dsr) it.next()).n(null, null);
        }
    }

    @Override // uh.rv6.w6
    public void n(u uVar) {
        this.nr = uVar;
        Iterator it = this.rl.values().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Iterator it2 = ((I28) it.next()).f74475n.iterator();
            while (it2.hasNext()) {
                if (((lej) it2.next()).nr(uVar)) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            O();
        }
    }

    @Override // uh.rv6.w6
    public void rl(Ln ln2, io.grpc.SPz sPz) {
        I28 i28 = (I28) this.rl.get(ln2);
        if (i28 != null) {
            Iterator it = i28.f74475n.iterator();
            while (it.hasNext()) {
                ((lej) it.next()).t(wqP.Z.o(sPz));
            }
        }
        this.rl.remove(ln2);
    }

    public Xo(rv6 rv6Var) {
        this.f74473n = rv6Var;
        rv6Var.XQ(this);
    }

    public void J2(lej lejVar) {
        w6 w6Var;
        Ln lnN = lejVar.n();
        I28 i28 = (I28) this.rl.get(lnN);
        w6 w6Var2 = w6.NO_ACTION_REQUIRED;
        if (i28 != null) {
            i28.f74475n.remove(lejVar);
            if (i28.f74475n.isEmpty()) {
                if (lejVar.rl()) {
                    w6Var = w6.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION;
                } else {
                    w6Var = w6.TERMINATE_LOCAL_LISTEN_ONLY;
                }
                w6Var2 = w6Var;
            } else if (!i28.J2() && lejVar.rl()) {
                w6Var2 = w6.REQUIRE_WATCH_DISCONNECTION_ONLY;
            }
            int i2 = j.rl[w6Var2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.f74473n.WPU(lnN);
                    return;
                } else {
                    this.rl.remove(lnN);
                    this.f74473n.S(lnN, false);
                    return;
                }
            }
            this.rl.remove(lnN);
            this.f74473n.S(lnN, true);
        }
    }

    public int nr(lej lejVar) {
        Ln lnN = lejVar.n();
        Ml ml = Ml.NO_ACTION_REQUIRED;
        I28 i28 = (I28) this.rl.get(lnN);
        if (i28 == null) {
            i28 = new I28();
            this.rl.put(lnN, i28);
            ml = lejVar.rl() ? Ml.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : Ml.INITIALIZE_LOCAL_LISTEN_ONLY;
        } else if (!i28.J2() && lejVar.rl()) {
            ml = Ml.REQUIRE_WATCH_CONNECTION_ONLY;
        }
        i28.f74475n.add(lejVar);
        wqP.n.t(!lejVar.nr(this.nr), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (i28.rl != null && lejVar.O(i28.rl)) {
            O();
        }
        int i2 = j.f74481n[ml.ordinal()];
        if (i2 == 1) {
            i28.f74476t = this.f74473n.az(lnN, true);
        } else if (i2 == 2) {
            i28.f74476t = this.f74473n.az(lnN, false);
        } else if (i2 == 3) {
            this.f74473n.ty(lnN);
        }
        return i28.f74476t;
    }

    @Override // uh.rv6.w6
    public void t(List list) {
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Md md = (Md) it.next();
            I28 i28 = (I28) this.rl.get(md.KN());
            if (i28 != null) {
                Iterator it2 = i28.f74475n.iterator();
                while (it2.hasNext()) {
                    if (((lej) it2.next()).O(md)) {
                        z2 = true;
                    }
                }
                i28.rl = md;
            }
        }
        if (z2) {
            O();
        }
    }
}
