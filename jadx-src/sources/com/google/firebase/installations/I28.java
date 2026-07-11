package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class I28 implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TaskCompletionSource f60548n;

    @Override // com.google.firebase.installations.CN3
    public boolean n(Exception exc) {
        return false;
    }

    public I28(TaskCompletionSource taskCompletionSource) {
        this.f60548n = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.CN3
    public boolean rl(X7.Ml ml) {
        if (!ml.qie() && !ml.gh() && !ml.xMQ()) {
            return false;
        }
        this.f60548n.trySetResult(ml.nr());
        return true;
    }
}
