package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class fuX implements O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicLong f68488n = new AtomicLong();

    @Override // io.grpc.internal.O
    public void n(long j2) {
        this.f68488n.getAndAdd(j2);
    }

    fuX() {
    }
}
