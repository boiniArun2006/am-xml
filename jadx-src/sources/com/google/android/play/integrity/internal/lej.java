package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class lej extends u {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Wre f59579O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59580n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ u f59581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lej(Wre wre, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, u uVar) {
        super(taskCompletionSource);
        this.f59579O = wre;
        this.f59580n = taskCompletionSource2;
        this.f59581t = uVar;
    }

    @Override // com.google.android.play.integrity.internal.u
    public final void b() {
        synchronized (this.f59579O.J2) {
            try {
                Wre.HI(this.f59579O, this.f59580n);
                if (this.f59579O.qie.getAndIncrement() > 0) {
                    this.f59579O.rl.nr("Already connected to the service.", new Object[0]);
                }
                Wre.Ik(this.f59579O, this.f59581t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
