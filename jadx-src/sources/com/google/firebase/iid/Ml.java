package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class Ml implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Executor f60515n = new Ml();

    private Ml() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
