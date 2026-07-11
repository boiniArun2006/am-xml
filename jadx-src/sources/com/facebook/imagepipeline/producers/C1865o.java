package com.facebook.imagepipeline.producers;

import bA.C1653C;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C1865o implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52587n;
    private final l4Z rl;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o$j */
    private class j extends AbstractC1863c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private mz f52588t;

        private j(Pl pl, mz mzVar) {
            super(pl);
            this.f52588t = mzVar;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void Uo(Throwable th) {
            C1865o.this.rl.n(HI(), this.f52588t);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            com.facebook.imagepipeline.request.j jVarM = this.f52588t.M();
            boolean zNr = w6.nr(i2);
            boolean zT2 = RzR.t(c1653c, jVarM.o());
            if (c1653c != null && (zT2 || jVarM.gh())) {
                if (zNr && zT2) {
                    HI().rl(c1653c, i2);
                } else {
                    HI().rl(c1653c, w6.ty(i2, 1));
                }
            }
            if (!zNr || zT2 || jVarM.mUb()) {
                return;
            }
            C1653C.Uo(c1653c);
            C1865o.this.rl.n(HI(), this.f52588t);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        this.f52587n.n(new j(pl, mzVar), mzVar);
    }

    public C1865o(l4Z l4z, l4Z l4z2) {
        this.f52587n = l4z;
        this.rl = l4z2;
    }
}
