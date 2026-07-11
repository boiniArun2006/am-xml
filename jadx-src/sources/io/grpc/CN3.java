package io.grpc;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class CN3 extends Wre {
    private CN3 Uo() {
        return this;
    }

    @Override // io.grpc.Wre
    protected abstract z O();

    protected CN3() {
    }

    @Override // io.grpc.z
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public CN3 t(long j2, TimeUnit timeUnit) {
        O().t(j2, timeUnit);
        return Uo();
    }

    @Override // io.grpc.z
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public CN3 nr() {
        O().nr();
        return Uo();
    }
}
