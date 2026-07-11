package com.google.firebase.storage;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class Xo implements OnSuccessListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f60863n;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f60863n.setResult(obj);
    }
}
