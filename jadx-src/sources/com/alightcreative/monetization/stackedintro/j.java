package com.alightcreative.monetization.stackedintro;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j extends ComponentActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f46807n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f46808t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f46806O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.monetization.stackedintro.j$j, reason: collision with other inner class name */
    class C0672j implements OnContextAvailableListener {
        C0672j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.dR0();
        }
    }

    private void GR() {
        addOnContextAvailableListener(new C0672j());
    }

    public final BGJ.j Nxk() {
        if (this.f46808t == null) {
            synchronized (this.f46806O) {
                try {
                    if (this.f46808t == null) {
                        this.f46808t = Y();
                    }
                } finally {
                }
            }
        }
        return this.f46808t;
    }

    protected BGJ.j Y() {
        return new BGJ.j(this);
    }

    protected void dR0() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((K.n) Z()).ViF((StackedOffersPaywallActivity) j9J.I28.n(this));
    }

    j() {
        GR();
    }

    private void k() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = Nxk().rl();
            this.f46807n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f46807n.t(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // j9J.n
    public final Object Z() {
        return Nxk().Z();
    }

    @Override // androidx.view.ComponentActivity, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.n(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f46807n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
