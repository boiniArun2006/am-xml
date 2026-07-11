package com.alightcreative.monetization.ui;

import BGJ.CN3;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import cd.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CN3 f46881n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f46882t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f46880O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.monetization.ui.j$j, reason: collision with other inner class name */
    class C0676j implements OnContextAvailableListener {
        C0676j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0676j());
    }

    public final BGJ.j ijL() {
        if (this.f46882t == null) {
            synchronized (this.f46880O) {
                try {
                    if (this.f46882t == null) {
                        this.f46882t = m();
                    }
                } finally {
                }
            }
        }
        return this.f46882t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((QJ) Z()).aYN((PaywallActivity) j9J.I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            CN3 cn3Rl = ijL().rl();
            this.f46881n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f46881n.t(getDefaultViewModelCreationExtras());
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
        CN3 cn3 = this.f46881n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
