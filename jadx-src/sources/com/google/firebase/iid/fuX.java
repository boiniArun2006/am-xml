package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final /* synthetic */ class fuX implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Executor f60531n = new fuX();

    private fuX() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
