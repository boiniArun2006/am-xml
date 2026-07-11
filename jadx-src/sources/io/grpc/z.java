package io.grpc;

import JP.nKK;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class z {
    public abstract nKK n();

    public z nr() {
        throw new UnsupportedOperationException();
    }

    public z t(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public static z rl(String str) {
        return ManagedChannelProvider.nr().n(str);
    }
}
