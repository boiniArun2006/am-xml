package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class ai extends afx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f59449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DAz f59450b = new DAz("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f59451c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f59449a = ajVar;
        this.f59451c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.Z
    public final void b(Bundle bundle) {
        this.f59449a.f59452a.S(this.f59451c);
        this.f59450b.nr("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f59449a.f59456e.a(bundle);
        if (apiExceptionA != null) {
            this.f59451c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f59451c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f59449a.f59454c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f59451c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
