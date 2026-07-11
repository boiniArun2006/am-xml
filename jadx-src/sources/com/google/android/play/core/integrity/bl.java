package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f59512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DAz f59513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f59512c = bnVar;
        this.f59513d = new DAz("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.r
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f59513d.nr("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f59512c.f59520f.a(bundle);
        if (apiExceptionA != null) {
            this.f59506a.trySetException(apiExceptionA);
        } else {
            this.f59506a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
