package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class ag extends com.google.android.play.integrity.internal.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f59443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f59444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f59446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f59447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.f59447e = ajVar;
        this.f59443a = bundle;
        this.f59444b = activity;
        this.f59445c = taskCompletionSource2;
        this.f59446d = i2;
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        try {
            g9s g9sVar = (g9s) this.f59447e.f59452a.O();
            Bundle bundle = this.f59443a;
            aj ajVar = this.f59447e;
            g9sVar.n(bundle, ajVar.f59455d.a(this.f59444b, this.f59445c, ajVar.f59452a));
        } catch (RemoteException e2) {
            this.f59447e.f59453b.t(e2, "requestAndShowDialog(%s)", Integer.valueOf(this.f59446d));
            this.f59445c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
