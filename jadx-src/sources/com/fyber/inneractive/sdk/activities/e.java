package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f53095a;

    public e(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f53095a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i2) {
        if ((i2 & 2) == 0) {
            r.f57026b.postDelayed(this.f53095a.mHideNavigationBarTask, 3000L);
        }
    }
}
