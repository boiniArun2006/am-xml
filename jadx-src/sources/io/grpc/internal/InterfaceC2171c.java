package io.grpc.internal;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.grpc.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface InterfaceC2171c extends JP.g9s {

    /* JADX INFO: renamed from: io.grpc.internal.c$j */
    public interface j {
        void n(long j2);

        void onFailure(Throwable th);
    }

    void O(j jVar, Executor executor);

    QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr);
}
