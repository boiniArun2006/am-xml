package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class af extends com.google.android.play.integrity.internal.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f59438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f59439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f59441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f59442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l2, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f59442e = ajVar;
        this.f59438a = bArr;
        this.f59439b = l2;
        this.f59440c = taskCompletionSource2;
        this.f59441d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.u
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        try {
            ((g9s) this.f59442e.f59452a.O()).J2(aj.a(this.f59442e, this.f59438a, this.f59439b, null), new ai(this.f59442e, this.f59440c));
        } catch (RemoteException e2) {
            this.f59442e.f59453b.t(e2, "requestIntegrityToken(%s)", this.f59441d);
            this.f59440c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
