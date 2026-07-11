package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface h {
    void KN(int i2);

    void close();

    void flush();

    boolean isClosed();

    h n(JP.C c2);

    void rl(InputStream inputStream);
}
