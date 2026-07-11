package com.alightcreative.template.importpreview.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f46947n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f46948t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f46946O = new Object();
    private boolean J2 = false;

    class j implements OnContextAvailableListener {
        j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            n.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new j());
    }

    public final BGJ.j ijL() {
        if (this.f46948t == null) {
            synchronized (this.f46946O) {
                try {
                    if (this.f46948t == null) {
                        this.f46948t = m();
                    }
                } finally {
                }
            }
        }
        return this.f46948t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((xr.C) Z()).WPU((TemplateImportPreviewActivity) j9J.I28.n(this));
    }

    n() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f46947n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f46947n.t(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // j9J.n
    public final Object Z() {
        return ijL().Z();
    }

    @Override // androidx.view.ComponentActivity, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.n(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eTf();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f46947n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
