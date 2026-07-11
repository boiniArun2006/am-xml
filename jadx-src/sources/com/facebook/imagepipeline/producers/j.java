package com.facebook.imagepipeline.producers;

import bA.C1653C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l4Z f52575n;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$j, reason: collision with other inner class name */
    private static class C0751j extends AbstractC1863c {
        private C0751j(Pl pl) {
            super(pl);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            if (c1653c == null) {
                HI().rl(null, i2);
                return;
            }
            if (!C1653C.n1(c1653c)) {
                c1653c.Org();
            }
            HI().rl(c1653c, i2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        this.f52575n.n(new C0751j(pl), mzVar);
    }

    public j(l4Z l4z) {
        this.f52575n = l4z;
    }
}
