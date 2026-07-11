package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Pmq {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pmq f68358n = new j();

    class j implements Pmq {
        @Override // io.grpc.internal.Pmq
        public long n() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }

        j() {
        }
    }

    long n();
}
