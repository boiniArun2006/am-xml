package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class Ml implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f60549n;
    private final TaskCompletionSource rl;

    @Override // com.google.firebase.installations.CN3
    public boolean n(Exception exc) {
        this.rl.trySetException(exc);
        return true;
    }

    public Ml(fuX fux, TaskCompletionSource taskCompletionSource) {
        this.f60549n = fux;
        this.rl = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.CN3
    public boolean rl(X7.Ml ml) {
        if (ml.gh() && !this.f60549n.J2(ml)) {
            this.rl.setResult(Wre.n().rl(ml.rl()).nr(ml.t()).t(ml.KN()).n());
            return true;
        }
        return false;
    }
}
