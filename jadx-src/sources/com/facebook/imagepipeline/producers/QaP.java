package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class QaP implements l4Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f52507O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52508n;
    private final int rl;
    private final ConcurrentLinkedQueue nr = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f52509t = 0;

    private class j extends AbstractC1863c {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.QaP$j$j, reason: collision with other inner class name */
        class RunnableC0749j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pair f52511n;

            RunnableC0749j(Pair pair) {
                this.f52511n = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                QaP qaP = QaP.this;
                Pair pair = this.f52511n;
                qaP.Uo((Pl) pair.first, (mz) pair.second);
            }
        }

        private j(Pl pl) {
            super(pl);
        }

        private void ck() {
            Pair pair;
            synchronized (QaP.this) {
                try {
                    pair = (Pair) QaP.this.nr.poll();
                    if (pair == null) {
                        QaP qaP = QaP.this;
                        qaP.f52509t--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                QaP.this.f52507O.execute(new RunnableC0749j(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void J2() {
            HI().n();
            ck();
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void KN(Object obj, int i2) {
            HI().rl(obj, i2);
            if (w6.nr(i2)) {
                ck();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void Uo(Throwable th) {
            HI().onFailure(th);
            ck();
        }
    }

    public QaP(int i2, Executor executor, l4Z l4z) {
        this.rl = i2;
        this.f52507O = (Executor) Hh.C.Uo(executor);
        this.f52508n = (l4Z) Hh.C.Uo(l4z);
    }

    void Uo(Pl pl, mz mzVar) {
        mzVar.M7().mUb(mzVar, "ThrottlingProducer", null);
        this.f52508n.n(new j(pl), mzVar);
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        boolean z2;
        mzVar.M7().nr(mzVar, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i2 = this.f52509t;
                z2 = true;
                if (i2 >= this.rl) {
                    this.nr.add(Pair.create(pl, mzVar));
                } else {
                    this.f52509t = i2 + 1;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            Uo(pl, mzVar);
        }
    }
}
