package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f56759a;

    public j(n nVar) {
        this.f56759a = nVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f56759a.f56763B == null) {
            return;
        }
        int i12 = i11 - i9;
        int i13 = i5 - i2;
        int i14 = i7 - i3;
        if ((i10 - i8 == i13 && i12 == i14) || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = i13;
        layoutParams.height = i14;
        this.f56759a.f56763B.setLayoutParams(layoutParams);
    }
}
