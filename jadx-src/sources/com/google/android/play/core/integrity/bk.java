package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f59509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DAz f59510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f59511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j2) {
        super(bnVar, taskCompletionSource);
        this.f59509c = bnVar;
        this.f59510d = new DAz("OnRequestIntegrityTokenCallback");
        this.f59511e = j2;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.r
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f59510d.nr("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f59509c.f59520f.a(bundle);
        if (apiExceptionA != null) {
            this.f59506a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f59509c.f59517c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f59506a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
