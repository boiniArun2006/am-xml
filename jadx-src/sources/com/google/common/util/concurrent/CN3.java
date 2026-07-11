package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 extends Wre implements Xo {

    public static abstract class j extends CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Xo f59817n;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.Wre
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final Xo t() {
            return this.f59817n;
        }

        protected j(Xo xo) {
            this.f59817n = (Xo) t1.Xo.HI(xo);
        }
    }

    /* JADX INFO: renamed from: J2 */
    protected abstract Xo delegate();

    protected CN3() {
    }

    @Override // com.google.common.util.concurrent.Xo
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }
}
