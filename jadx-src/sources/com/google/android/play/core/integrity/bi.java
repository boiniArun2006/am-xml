package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class bi extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f59506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f59507b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f59507b = bnVar;
        this.f59506a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) throws RemoteException {
        this.f59507b.f59515a.S(this.f59506a);
    }

    @Override // com.google.android.play.integrity.internal.r
    public void c(Bundle bundle) throws RemoteException {
        this.f59507b.f59515a.S(this.f59506a);
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void d(Bundle bundle) throws RemoteException {
        this.f59507b.f59515a.S(this.f59506a);
    }

    @Override // com.google.android.play.integrity.internal.r
    public void e(Bundle bundle) throws RemoteException {
        this.f59507b.f59515a.S(this.f59506a);
    }
}
