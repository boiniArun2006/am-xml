package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f59825n = new Object();
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile Logger f59826t;

    Logger n() {
        Logger logger = this.f59826t;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f59825n) {
            try {
                Logger logger2 = this.f59826t;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.rl);
                this.f59826t = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Pl(Class cls) {
        this.rl = cls.getName();
    }
}
