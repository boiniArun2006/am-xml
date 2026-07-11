package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f53092a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f53092a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f53092a.onBackPressed();
    }
}
