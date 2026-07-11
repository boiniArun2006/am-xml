package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class XBq extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BGJ.CN3 f44818n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f44819t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f44817O = new Object();
    private boolean J2 = false;

    class j implements OnContextAvailableListener {
        j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            XBq.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new j());
    }

    public final BGJ.j ijL() {
        if (this.f44819t == null) {
            synchronized (this.f44817O) {
                try {
                    if (this.f44819t == null) {
                        this.f44819t = m();
                    }
                } finally {
                }
            }
        }
        return this.f44819t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((InterfaceC1736t) Z()).J2((DevSettingsActivity) j9J.I28.n(this));
    }

    XBq() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f44818n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f44818n.t(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eTf();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f44818n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
