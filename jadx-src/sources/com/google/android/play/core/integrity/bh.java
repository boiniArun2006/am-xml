package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.UGc;
import com.google.android.play.integrity.internal.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f59501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f59502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f59503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f59504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f59505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(bnVar, taskCompletionSource);
        this.f59505e = bnVar;
        this.f59501a = bundle;
        this.f59502b = activity;
        this.f59503c = taskCompletionSource2;
        this.f59504d = i2;
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        if (bn.k(this.f59505e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f59505e;
            Wre wre = bnVar.f59515a;
            ((UGc) wre.O()).n(this.f59501a, bnVar.f59519e.a(this.f59502b, this.f59503c, wre));
        } catch (RemoteException e2) {
            this.f59505e.f59516b.t(e2, "requestAndShowDialog(%s)", Integer.valueOf(this.f59504d));
            this.f59503c.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
