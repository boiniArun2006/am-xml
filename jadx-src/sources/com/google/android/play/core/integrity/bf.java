package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f59493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f59495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f59495c = bnVar;
        this.f59493a = j2;
        this.f59494b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        if (bn.k(this.f59495c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f59495c;
            ((UGc) bnVar.f59515a.O()).B(bn.b(bnVar, this.f59493a, 0), new bl(this.f59495c, this.f59494b));
        } catch (RemoteException e2) {
            this.f59495c.f59516b.t(e2, "warmUpIntegrityToken(%s)", Long.valueOf(this.f59493a));
            this.f59494b.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
