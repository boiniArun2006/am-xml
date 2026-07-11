package IRN;

import IRN.eO;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f4214n;
    private final Zlm.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f4215t;
    private final j nr = new j(false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f4213O = new j(true);
    private final C J2 = new C(128);
    private final AtomicMarkableReference Uo = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicMarkableReference f4216n;
        private final AtomicReference rl = new AtomicReference(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f4217t;

        private void nr() throws Throwable {
            Map mapN;
            synchronized (this) {
                try {
                    if (this.f4216n.isMarked()) {
                        mapN = ((I28) this.f4216n.getReference()).n();
                        AtomicMarkableReference atomicMarkableReference = this.f4216n;
                        atomicMarkableReference.set((I28) atomicMarkableReference.getReference(), false);
                    } else {
                        mapN = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapN != null) {
                eO.this.f4214n.r(eO.this.f4215t, mapN, this.f4217t);
            }
        }

        public boolean O(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((I28) this.f4216n.getReference()).nr(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f4216n;
                    atomicMarkableReference.set((I28) atomicMarkableReference.getReference(), true);
                    t();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public j(boolean z2) {
            this.f4217t = z2;
            this.f4216n = new AtomicMarkableReference(new I28(64, z2 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void n(j jVar) throws Throwable {
            jVar.rl.set(null);
            jVar.nr();
        }

        private void t() {
            Runnable runnable = new Runnable() { // from class: IRN.Xo
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    eO.j.n(this.f4211n);
                }
            };
            if (androidx.compose.animation.core.fuX.n(this.rl, null, runnable)) {
                eO.this.rl.rl.nr(runnable);
            }
        }

        public Map rl() {
            return ((I28) this.f4216n.getReference()).n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() throws Throwable {
        boolean z2;
        String strMUb;
        synchronized (this.Uo) {
            try {
                z2 = false;
                if (this.Uo.isMarked()) {
                    strMUb = mUb();
                    this.Uo.set(strMUb, false);
                    z2 = true;
                } else {
                    strMUb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.f4214n.Z(this.f4215t, strMUb);
        }
    }

    public static eO gh(String str, E8K.CN3 cn3, Zlm.Wre wre) {
        CN3 cn32 = new CN3(cn3);
        eO eOVar = new eO(str, cn3, wre);
        ((I28) eOVar.nr.f4216n.getReference()).O(cn32.xMQ(str, false));
        ((I28) eOVar.f4213O.f4216n.getReference()).O(cn32.xMQ(str, true));
        eOVar.Uo.set(cn32.gh(str), false);
        eOVar.J2.t(cn32.mUb(str));
        return eOVar;
    }

    public static String qie(String str, E8K.CN3 cn3) {
        return new CN3(cn3).gh(str);
    }

    public boolean HI(String str, String str2) {
        return this.f4213O.O(str, str2);
    }

    public void Ik(String str) {
        String strT = I28.t(str, 1024);
        synchronized (this.Uo) {
            try {
                if (QNA.Dsr.nY(strT, (String) this.Uo.getReference())) {
                    return;
                }
                this.Uo.set(strT, true);
                this.rl.rl.nr(new Runnable() { // from class: IRN.Pl
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f4208n.az();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map KN() {
        return this.f4213O.rl();
    }

    public void ck(final String str) {
        synchronized (this.f4215t) {
            this.f4215t = str;
            final Map mapRl = this.nr.rl();
            final List listRl = this.J2.rl();
            this.rl.rl.nr(new Runnable() { // from class: IRN.o
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    eO.t(this.f4238n, str, mapRl, listRl);
                }
            });
        }
    }

    public String mUb() {
        return (String) this.Uo.getReference();
    }

    public boolean r(List list) {
        synchronized (this.J2) {
            try {
                if (!this.J2.t(list)) {
                    return false;
                }
                final List listRl = this.J2.rl();
                this.rl.rl.nr(new Runnable() { // from class: IRN.qz
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        eO eOVar = this.f4240n;
                        eOVar.f4214n.o(eOVar.f4215t, listRl);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ty(String str, String str2) {
        return this.nr.O(str, str2);
    }

    public List xMQ() {
        return this.J2.n();
    }

    public eO(String str, E8K.CN3 cn3, Zlm.Wre wre) {
        this.f4215t = str;
        this.f4214n = new CN3(cn3);
        this.rl = wre;
    }

    public static /* synthetic */ void t(eO eOVar, String str, Map map, List list) throws Throwable {
        if (eOVar.mUb() != null) {
            eOVar.f4214n.Z(str, eOVar.mUb());
        }
        if (!map.isEmpty()) {
            eOVar.f4214n.Ik(str, map);
        }
        if (!list.isEmpty()) {
            eOVar.f4214n.o(str, list);
        }
    }

    public Map Uo(Map map) {
        if (map.isEmpty()) {
            return this.nr.rl();
        }
        HashMap map2 = new HashMap(this.nr.rl());
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strT = I28.t((String) entry.getKey(), 1024);
            if (map2.size() >= 64 && !map2.containsKey(strT)) {
                i2++;
            } else {
                map2.put(strT, I28.t((String) entry.getValue(), 1024));
            }
        }
        if (i2 > 0) {
            h1M.CN3.J2().gh("Ignored " + i2 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }
}
