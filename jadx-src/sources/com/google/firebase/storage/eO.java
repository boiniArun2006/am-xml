package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class eO implements OnFailureListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f60872n;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f60872n.setException(exc);
    }
}
