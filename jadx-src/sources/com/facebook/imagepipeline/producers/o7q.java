package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class o7q implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52589n;

    class j extends AbstractC1863c {
        j(Pl pl) {
            super(pl);
        }

        @Override // com.facebook.imagepipeline.producers.w6
        protected void KN(Object obj, int i2) {
            if (w6.nr(i2)) {
                HI().rl(null, i2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        this.f52589n.n(new j(pl), mzVar);
    }

    public o7q(l4Z l4z) {
        this.f52589n = l4z;
    }
}
