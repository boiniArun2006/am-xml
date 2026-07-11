package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class psW implements l4Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f52598O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Map f52599n;
    private final String nr;
    private final l4Z rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f52600t;

    class j {
        private I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f52601O;
        private n Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f52602n;
        private float nr;
        private final CopyOnWriteArraySet rl = Hh.o.n();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Closeable f52603t;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.psW$j$j, reason: collision with other inner class name */
        class C0753j extends Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pair f52604n;

            C0753j(Pair pair) {
                this.f52604n = pair;
            }

            @Override // com.facebook.imagepipeline.producers.Wre, com.facebook.imagepipeline.producers.OU
            public void n() {
                I28.nr(j.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.Wre, com.facebook.imagepipeline.producers.OU
            public void nr() {
                I28.O(j.this.o());
            }

            @Override // com.facebook.imagepipeline.producers.OU
            public void rl() {
                boolean zRemove;
                List list;
                I28 i28;
                List listZ;
                List listR;
                synchronized (j.this) {
                    try {
                        zRemove = j.this.rl.remove(this.f52604n);
                        list = null;
                        if (!zRemove) {
                            i28 = null;
                            listZ = null;
                        } else if (j.this.rl.isEmpty()) {
                            i28 = j.this.J2;
                            listZ = null;
                        } else {
                            List listO = j.this.o();
                            listZ = j.this.Z();
                            listR = j.this.r();
                            i28 = null;
                            list = listO;
                        }
                        listR = listZ;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                I28.O(list);
                I28.J2(listZ);
                I28.nr(listR);
                if (i28 != null) {
                    if (!psW.this.f52600t || i28.a()) {
                        i28.KN();
                    } else {
                        I28.J2(i28.qie(dX.Wre.f63517t));
                    }
                }
                if (zRemove) {
                    ((Pl) this.f52604n.first).n();
                }
            }

            @Override // com.facebook.imagepipeline.producers.Wre, com.facebook.imagepipeline.producers.OU
            public void t() {
                I28.J2(j.this.Z());
            }
        }

        private class n extends w6 {
            private n() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.w6
            /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
            public void KN(Closeable closeable, int i2) {
                try {
                    if (T5.n.nr()) {
                        T5.n.n("MultiplexProducer#onNewResult");
                    }
                    j.this.HI(this, closeable, i2);
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                } catch (Throwable th) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.imagepipeline.producers.w6
            protected void J2() {
                try {
                    if (T5.n.nr()) {
                        T5.n.n("MultiplexProducer#onCancellation");
                    }
                    j.this.az(this);
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                } catch (Throwable th) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.imagepipeline.producers.w6
            protected void Uo(Throwable th) {
                try {
                    if (T5.n.nr()) {
                        T5.n.n("MultiplexProducer#onFailure");
                    }
                    j.this.ty(this, th);
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                } catch (Throwable th2) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.w6
            protected void xMQ(float f3) {
                try {
                    if (T5.n.nr()) {
                        T5.n.n("MultiplexProducer#onProgressUpdate");
                    }
                    j.this.ck(this, f3);
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                } catch (Throwable th) {
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Ik(vn.Ml ml) {
            synchronized (this) {
                try {
                    Hh.C.rl(Boolean.valueOf(this.J2 == null));
                    Hh.C.rl(Boolean.valueOf(this.Uo == null));
                    if (this.rl.isEmpty()) {
                        psW.this.gh(this.f52602n, this);
                        return;
                    }
                    mz mzVar = (mz) ((Pair) this.rl.iterator().next()).second;
                    I28 i28 = new I28(mzVar.M(), mzVar.getId(), mzVar.M7(), mzVar.n(), mzVar.Mx(), gh(), mUb(), qie(), mzVar.Uo());
                    this.J2 = i28;
                    i28.FX(mzVar.getExtras());
                    if (ml.rl()) {
                        this.J2.jB("started_as_prefetch", Boolean.valueOf(ml.n()));
                    }
                    n nVar = new n();
                    this.Uo = nVar;
                    psW.this.rl.n(nVar, this.J2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List Z() {
            I28 i28 = this.J2;
            if (i28 == null) {
                return null;
            }
            return i28.qie(qie());
        }

        private synchronized boolean gh() {
            Iterator it = this.rl.iterator();
            while (it.hasNext()) {
                if (!((mz) ((Pair) it.next()).second).a()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized boolean mUb() {
            Iterator it = this.rl.iterator();
            while (it.hasNext()) {
                if (((mz) ((Pair) it.next()).second).p5()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List o() {
            I28 i28 = this.J2;
            if (i28 == null) {
                return null;
            }
            return i28.gh(gh());
        }

        private synchronized dX.Wre qie() {
            dX.Wre wreRl;
            wreRl = dX.Wre.f63517t;
            Iterator it = this.rl.iterator();
            while (it.hasNext()) {
                wreRl = dX.Wre.rl(wreRl, ((mz) ((Pair) it.next()).second).eF());
            }
            return wreRl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            I28 i28 = this.J2;
            if (i28 == null) {
                return null;
            }
            return i28.mUb(mUb());
        }

        public void HI(n nVar, Closeable closeable, int i2) {
            synchronized (this) {
                try {
                    if (this.Uo != nVar) {
                        return;
                    }
                    xMQ(this.f52603t);
                    this.f52603t = null;
                    int size = this.rl.size();
                    if (w6.O(i2)) {
                        this.f52603t = psW.this.Uo(closeable);
                        this.f52601O = i2;
                    } else {
                        this.rl.clear();
                        psW.this.gh(this.f52602n, this);
                    }
                    for (Pair pair : this.rl) {
                        synchronized (pair) {
                            try {
                                if (w6.nr(i2)) {
                                    ((mz) pair.second).M7().mUb((mz) pair.second, psW.this.nr, null);
                                    I28 i28 = this.J2;
                                    if (i28 != null) {
                                        ((mz) pair.second).FX(i28.getExtras());
                                    }
                                    ((mz) pair.second).jB(psW.this.f52598O, Integer.valueOf(size));
                                }
                                ((Pl) pair.first).rl(closeable, i2);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void az(n nVar) {
            synchronized (this) {
                try {
                    if (this.Uo != nVar) {
                        return;
                    }
                    this.Uo = null;
                    this.J2 = null;
                    xMQ(this.f52603t);
                    this.f52603t = null;
                    Ik(vn.Ml.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void ck(n nVar, float f3) {
            synchronized (this) {
                try {
                    if (this.Uo != nVar) {
                        return;
                    }
                    this.nr = f3;
                    for (Pair pair : this.rl) {
                        synchronized (pair) {
                            ((Pl) pair.first).t(f3);
                        }
                    }
                } finally {
                }
            }
        }

        public void ty(n nVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.Uo != nVar) {
                        return;
                    }
                    this.rl.clear();
                    psW.this.gh(this.f52602n, this);
                    xMQ(this.f52603t);
                    this.f52603t = null;
                    for (Pair pair : this.rl) {
                        synchronized (pair) {
                            try {
                                ((mz) pair.second).M7().gh((mz) pair.second, psW.this.nr, th, null);
                                I28 i28 = this.J2;
                                if (i28 != null) {
                                    ((mz) pair.second).FX(i28.getExtras());
                                }
                                ((Pl) pair.first).onFailure(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public j(Object obj) {
            this.f52602n = obj;
        }

        private void Uo(Pair pair, mz mzVar) {
            mzVar.rl(new C0753j(pair));
        }

        private void xMQ(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public boolean KN(Pl pl, mz mzVar) {
            Pair pairCreate = Pair.create(pl, mzVar);
            synchronized (this) {
                try {
                    if (psW.this.xMQ(this.f52602n) != this) {
                        return false;
                    }
                    this.rl.add(pairCreate);
                    List listO = o();
                    List listZ = Z();
                    List listR = r();
                    Closeable closeableUo = this.f52603t;
                    float f3 = this.nr;
                    int i2 = this.f52601O;
                    I28.O(listO);
                    I28.J2(listZ);
                    I28.nr(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableUo != this.f52603t) {
                                    closeableUo = null;
                                } else if (closeableUo != null) {
                                    closeableUo = psW.this.Uo(closeableUo);
                                }
                            }
                            if (closeableUo != null) {
                                if (f3 > 0.0f) {
                                    pl.t(f3);
                                }
                                pl.rl(closeableUo, i2);
                                xMQ(closeableUo);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    Uo(pairCreate, mzVar);
                    return true;
                } finally {
                }
            }
        }
    }

    protected psW(l4Z l4z, String str, String str2) {
        this(l4z, str, str2, false);
    }

    private synchronized j KN(Object obj) {
        j jVar;
        jVar = new j(obj);
        this.f52599n.put(obj, jVar);
        return jVar;
    }

    protected abstract Closeable Uo(Closeable closeable);

    protected synchronized void gh(Object obj, j jVar) {
        if (this.f52599n.get(obj) == jVar) {
            this.f52599n.remove(obj);
        }
    }

    protected abstract Object mUb(mz mzVar);

    protected synchronized j xMQ(Object obj) {
        return (j) this.f52599n.get(obj);
    }

    protected psW(l4Z l4z, String str, String str2, boolean z2) {
        this.rl = l4z;
        this.f52599n = new HashMap();
        this.f52600t = z2;
        this.nr = str;
        this.f52598O = str2;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        j jVarXMQ;
        boolean z2;
        try {
            if (T5.n.nr()) {
                T5.n.n("MultiplexProducer#produceResults");
            }
            mzVar.M7().nr(mzVar, this.nr);
            Object objMUb = mUb(mzVar);
            do {
                synchronized (this) {
                    try {
                        jVarXMQ = xMQ(objMUb);
                        if (jVarXMQ == null) {
                            jVarXMQ = KN(objMUb);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } finally {
                    }
                }
            } while (!jVarXMQ.KN(pl, mzVar));
            if (z2) {
                jVarXMQ.Ik(vn.Ml.t(mzVar.a()));
            }
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } catch (Throwable th) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th;
        }
    }
}
