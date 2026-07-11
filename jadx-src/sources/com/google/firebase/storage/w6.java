package com.google.firebase.storage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class w6 implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private O6.w6 f60903O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o f60904n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TaskCompletionSource f60905t;

    @Override // java.lang.Runnable
    public void run() {
        X3O.j jVar = new X3O.j(this.f60904n.HI(), this.f60904n.J2());
        this.f60903O.nr(jVar);
        jVar.n(this.f60905t, null);
    }

    public w6(o oVar, TaskCompletionSource taskCompletionSource) {
        Preconditions.checkNotNull(oVar);
        Preconditions.checkNotNull(taskCompletionSource);
        this.f60904n = oVar;
        this.f60905t = taskCompletionSource;
        I28 i28Ty = oVar.ty();
        this.f60903O = new O6.w6(i28Ty.n().qie(), i28Ty.t(), i28Ty.rl(), i28Ty.gh());
    }
}
