package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class eO extends AbstractResolvableFuture implements ScheduledFuture {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final ScheduledFuture f60261S;

    class j implements n {
        j() {
        }

        @Override // com.google.firebase.concurrent.eO.n
        public void n(Throwable th) {
            eO.this.Ik(th);
        }

        @Override // com.google.firebase.concurrent.eO.n
        public void set(Object obj) {
            eO.this.ck(obj);
        }
    }

    interface n {
        void n(Throwable th);

        void set(Object obj);
    }

    interface w6 {
        ScheduledFuture n(n nVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f60261S.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f60261S.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected void rl() {
        this.f60261S.cancel(o());
    }

    eO(w6 w6Var) {
        this.f60261S = w6Var.n(new j());
    }
}
