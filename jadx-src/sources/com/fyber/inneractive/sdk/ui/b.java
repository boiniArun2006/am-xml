package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f56963a;

    public b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f56963a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
        this.f56963a.f56942q = this.f56963a.f56939n.getWidth() + r1.f56939n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f56963a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal.f56960k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal.f56942q *= -1.0f;
        }
        fyberAdIdentifierLocal.f56939n.setTranslationX(fyberAdIdentifierLocal.f56942q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f56963a;
        if (fyberAdIdentifierLocal2.f56940o) {
            fyberAdIdentifierLocal2.a();
        }
    }
}
