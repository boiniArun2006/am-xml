package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

/* JADX INFO: renamed from: com.google.firebase.storage.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final /* synthetic */ class C1918z implements OnCanceledListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f60906n;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f60906n.cancel();
    }
}
