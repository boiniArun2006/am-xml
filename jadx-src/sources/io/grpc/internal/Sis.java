package io.grpc.internal;

import io.grpc.internal.Ew;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Sis implements Ew.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Throwable f68377n = n();

    private static Throwable n() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e2) {
            return e2;
        } catch (Error e3) {
            return e3;
        } catch (RuntimeException e4) {
            return e4;
        }
    }
}
