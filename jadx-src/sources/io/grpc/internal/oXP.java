package io.grpc.internal;

import io.grpc.internal.V1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class oXP implements FKk {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V1.Ml f68644n;

    public static oXP t(V1.Ml ml) {
        return new oXP(ml);
    }

    @Override // io.grpc.internal.FKk
    public Object n() {
        return V1.nr(this.f68644n);
    }

    @Override // io.grpc.internal.FKk
    public Object rl(Object obj) {
        V1.J2(this.f68644n, obj);
        return null;
    }

    private oXP(V1.Ml ml) {
        this.f68644n = ml;
    }
}
