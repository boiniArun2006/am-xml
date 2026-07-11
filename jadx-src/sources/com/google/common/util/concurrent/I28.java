package com.google.common.util.concurrent;

import com.google.common.util.concurrent.j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 extends aC {

    static abstract class j extends I28 implements j.Dsr {
        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final Object get(long j2, TimeUnit timeUnit) {
            return super.get(j2, timeUnit);
        }

        j() {
        }

        @Override // com.google.common.util.concurrent.j, com.google.common.util.concurrent.Xo
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            return super.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    I28() {
    }
}
