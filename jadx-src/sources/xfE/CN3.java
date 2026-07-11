package xfE;

import KT.j;
import aL.InterfaceC1506j;
import aL.InterfaceC1507n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import lN.j;
import lN.w6;
import xfE.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CN3 implements C, InterfaceC1506j {
    private final Jv.j HI;
    private boolean Ik;
    final Set J2;
    private final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final lN.w6 f75370O;
    private long Uo;
    private final boolean az;
    private final Object ck = new Object();
    private final aC gh;
    private final Wre mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f75371n;
    private long nr;
    private final lN.j qie;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CountDownLatch f75372t;
    private final n ty;
    private final KT.j xMQ;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f75369r = CN3.class;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f75368o = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f75367Z = TimeUnit.MINUTES.toMillis(30);

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CN3.this.ck) {
                CN3.this.az();
            }
            CN3.this.Ik = true;
            CN3.this.f75372t.countDown();
        }
    }

    @Override // xfE.C
    public boolean nr(lN.Ml ml) throws Throwable {
        String str;
        IOException e2;
        String str2 = null;
        try {
            try {
                synchronized (this.ck) {
                    try {
                        List listRl = lN.I28.rl(ml);
                        int i2 = 0;
                        while (i2 < listRl.size()) {
                            String str3 = (String) listRl.get(i2);
                            if (this.mUb.rl(str3, ml)) {
                                this.J2.add(str3);
                                return true;
                            }
                            i2++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e3) {
                            e2 = e3;
                            o oVarKN = o.n().nr(ml).mUb(str).KN(e2);
                            lN.w6 w6Var = this.f75370O;
                            if (w6Var != null) {
                                w6Var.rl(oVarKN);
                            }
                            oVarKN.rl();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            str = null;
            e2 = e4;
        }
    }

    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f75374n = false;
        private long rl = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f75375t = -1;

        public synchronized void J2(long j2, long j3) {
            this.f75375t = j3;
            this.rl = j2;
            this.f75374n = true;
        }

        public synchronized void O() {
            this.f75374n = false;
            this.f75375t = -1L;
            this.rl = -1L;
        }

        public synchronized long n() {
            return this.f75375t;
        }

        public synchronized boolean nr() {
            return this.f75374n;
        }

        public synchronized long rl() {
            return this.rl;
        }

        public synchronized void t(long j2, long j3) {
            if (this.f75374n) {
                this.rl += j2;
                this.f75375t += j3;
            }
        }

        n() {
        }
    }

    public static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f75376n;
        public final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f75377t;

        public w6(long j2, long j3, long j4) {
            this.f75376n = j2;
            this.rl = j3;
            this.f75377t = j4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean az() {
        long jNow = this.HI.now();
        if (this.ty.nr()) {
            long j2 = this.Uo;
            if (j2 != -1 && jNow - j2 <= f75367Z) {
                return false;
            }
        }
        return ty();
    }

    private void ck() {
        if (this.xMQ.J2(this.mUb.isExternal() ? j.EnumC0178j.EXTERNAL : j.EnumC0178j.INTERNAL, this.rl - this.ty.rl())) {
            this.nr = this.f75371n;
        } else {
            this.nr = this.rl;
        }
    }

    private Collection gh(Collection collection) {
        long jNow = this.HI.now() + f75368o;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Wre.j jVar = (Wre.j) it.next();
            if (jVar.n() > jNow) {
                arrayList.add(jVar);
            } else {
                arrayList2.add(jVar);
            }
        }
        Collections.sort(arrayList2, this.gh.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void mUb(long j2, w6.j jVar) throws IOException {
        try {
            Collection<Wre.j> collectionGh = gh(this.mUb.getEntries());
            long jRl = this.ty.rl();
            long j3 = jRl - j2;
            int i2 = 0;
            long j4 = 0;
            for (Wre.j jVar2 : collectionGh) {
                if (j4 > j3) {
                    break;
                }
                long jNr = this.mUb.nr(jVar2);
                this.J2.remove(jVar2.getId());
                if (jNr > 0) {
                    i2++;
                    j4 += jNr;
                    o oVarO = o.n().mUb(jVar2.getId()).Uo(jVar).xMQ(jNr).J2(jRl - j4).O(j2);
                    lN.w6 w6Var = this.f75370O;
                    if (w6Var != null) {
                        w6Var.Uo(oVarO);
                    }
                    oVarO.rl();
                }
            }
            this.ty.t(-j4, -i2);
            this.mUb.n();
        } catch (IOException e2) {
            this.qie.n(j.EnumC1048j.EVICTION, f75369r, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    private void qie() {
        synchronized (this.ck) {
            try {
                boolean zAz = az();
                ck();
                long jRl = this.ty.rl();
                if (jRl > this.nr && !zAz) {
                    this.ty.O();
                    az();
                }
                long j2 = this.nr;
                if (jRl > j2) {
                    mUb((j2 * 9) / 10, w6.j.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean ty() {
        boolean z2;
        long j2;
        long jNow = this.HI.now();
        long j3 = f75368o + jNow;
        Set hashSet = (this.az && this.J2.isEmpty()) ? this.J2 : this.az ? new HashSet() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z3 = false;
            int i2 = 0;
            int i3 = 0;
            z2 = false;
            for (Wre.j jVar : this.mUb.getEntries()) {
                try {
                    i2++;
                    size += jVar.getSize();
                    if (jVar.n() > j3) {
                        i3++;
                        size2 = (int) (((long) size2) + jVar.getSize());
                        j2 = j3;
                        jMax = Math.max(jVar.n() - jNow, jMax);
                        z3 = true;
                    } else {
                        j2 = j3;
                        if (this.az) {
                            Hh.C.Uo(hashSet);
                            hashSet.add(jVar.getId());
                        }
                    }
                    j3 = j2;
                } catch (IOException e2) {
                    e = e2;
                    this.qie.n(j.EnumC1048j.GENERIC_IO, f75369r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z2;
                }
            }
            if (z3) {
                this.qie.n(j.EnumC1048j.READ_INVALID_ENTRY, f75369r, "Future timestamp found in " + i3 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j4 = i2;
            if (this.ty.n() != j4 || this.ty.rl() != size) {
                if (this.az && this.J2 != hashSet) {
                    Hh.C.Uo(hashSet);
                    this.J2.clear();
                    this.J2.addAll(hashSet);
                }
                this.ty.J2(size, j4);
            }
            this.Uo = jNow;
            return true;
        } catch (IOException e3) {
            e = e3;
            z2 = false;
        }
    }

    private com.facebook.binaryresource.j xMQ(Wre.n nVar, lN.Ml ml, String str) {
        com.facebook.binaryresource.j jVarN;
        synchronized (this.ck) {
            jVarN = nVar.n(ml);
            this.J2.add(str);
            this.ty.t(jVarN.size(), 1L);
        }
        return jVarN;
    }

    @Override // xfE.C
    public void t(lN.Ml ml) {
        synchronized (this.ck) {
            try {
                List listRl = lN.I28.rl(ml);
                for (int i2 = 0; i2 < listRl.size(); i2++) {
                    String str = (String) listRl.get(i2);
                    this.mUb.remove(str);
                    this.J2.remove(str);
                }
            } catch (IOException e2) {
                this.qie.n(j.EnumC1048j.DELETE_FILE, f75369r, "delete: " + e2.getMessage(), e2);
            }
        }
    }

    public CN3(Wre wre, aC aCVar, w6 w6Var, lN.w6 w6Var2, lN.j jVar, InterfaceC1507n interfaceC1507n, Executor executor, boolean z2) {
        this.f75371n = w6Var.rl;
        long j2 = w6Var.f75377t;
        this.rl = j2;
        this.nr = j2;
        this.xMQ = KT.j.nr();
        this.mUb = wre;
        this.gh = aCVar;
        this.Uo = -1L;
        this.f75370O = w6Var2;
        this.KN = w6Var.f75376n;
        this.qie = jVar;
        this.ty = new n();
        this.HI = Jv.Ml.n();
        this.az = z2;
        this.J2 = new HashSet();
        if (interfaceC1507n != null) {
            interfaceC1507n.n(this);
        }
        if (z2) {
            this.f75372t = new CountDownLatch(1);
            executor.execute(new j());
        } else {
            this.f75372t = new CountDownLatch(0);
        }
    }

    private Wre.n HI(String str, lN.Ml ml) {
        qie();
        return this.mUb.t(str, ml);
    }

    @Override // xfE.C
    public com.facebook.binaryresource.j n(lN.Ml ml, lN.Dsr dsr) {
        String strN;
        o oVarNr = o.n().nr(ml);
        lN.w6 w6Var = this.f75370O;
        if (w6Var != null) {
            w6Var.O(oVarNr);
        }
        synchronized (this.ck) {
            strN = lN.I28.n(ml);
        }
        oVarNr.mUb(strN);
        try {
            try {
                Wre.n nVarHI = HI(strN, ml);
                try {
                    nVarHI.rl(dsr, ml);
                    com.facebook.binaryresource.j jVarXMQ = xMQ(nVarHI, ml, strN);
                    oVarNr.xMQ(jVarXMQ.size()).J2(this.ty.rl());
                    lN.w6 w6Var2 = this.f75370O;
                    if (w6Var2 != null) {
                        w6Var2.J2(oVarNr);
                    }
                    return jVarXMQ;
                } finally {
                    if (!nVarHI.t()) {
                        Dzy.j.nr(f75369r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e2) {
                oVarNr.KN(e2);
                lN.w6 w6Var3 = this.f75370O;
                if (w6Var3 != null) {
                    w6Var3.nr(oVarNr);
                }
                Dzy.j.O(f75369r, "Failed inserting a file into the cache", e2);
                throw e2;
            }
        } finally {
            oVarNr.rl();
        }
    }

    @Override // xfE.C
    public com.facebook.binaryresource.j rl(lN.Ml ml) {
        com.facebook.binaryresource.j jVarO;
        o oVarNr = o.n().nr(ml);
        try {
            synchronized (this.ck) {
                try {
                    List listRl = lN.I28.rl(ml);
                    String str = null;
                    jVarO = null;
                    for (int i2 = 0; i2 < listRl.size(); i2++) {
                        str = (String) listRl.get(i2);
                        oVarNr.mUb(str);
                        jVarO = this.mUb.O(str, ml);
                        if (jVarO != null) {
                            break;
                        }
                    }
                    if (jVarO == null) {
                        lN.w6 w6Var = this.f75370O;
                        if (w6Var != null) {
                            w6Var.t(oVarNr);
                        }
                        this.J2.remove(str);
                    } else {
                        Hh.C.Uo(str);
                        lN.w6 w6Var2 = this.f75370O;
                        if (w6Var2 != null) {
                            w6Var2.n(oVarNr);
                        }
                        this.J2.add(str);
                    }
                } finally {
                }
            }
            return jVarO;
        } catch (IOException e2) {
            this.qie.n(j.EnumC1048j.GENERIC_IO, f75369r, "getResource", e2);
            oVarNr.KN(e2);
            lN.w6 w6Var3 = this.f75370O;
            if (w6Var3 != null) {
                w6Var3.rl(oVarNr);
            }
            return null;
        } finally {
            oVarNr.rl();
        }
    }
}
