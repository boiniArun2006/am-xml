package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f59496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f59497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f59498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f59500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, String str, long j2, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f59500e = bnVar;
        this.f59496a = str;
        this.f59497b = j2;
        this.f59498c = j3;
        this.f59499d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        if (bn.k(this.f59500e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f59500e;
            ((UGc) bnVar.f59515a.O()).Y(bn.a(bnVar, this.f59496a, this.f59497b, this.f59498c, 0), new bk(this.f59500e, this.f59499d, this.f59497b));
        } catch (RemoteException e2) {
            this.f59500e.f59516b.t(e2, "requestExpressIntegrityToken(%s, %s)", this.f59496a, Long.valueOf(this.f59497b));
            this.f59499d.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
