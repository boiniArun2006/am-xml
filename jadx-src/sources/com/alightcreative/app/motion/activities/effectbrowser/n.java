package com.alightcreative.app.motion.activities.effectbrowser;

import BGJ.CN3;
import Y.eO;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import j9J.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n extends FragmentActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CN3 f45218n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f45219t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f45217O = new Object();
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
        if (this.f45219t == null) {
            synchronized (this.f45217O) {
                try {
                    if (this.f45219t == null) {
                        this.f45219t = m();
                    }
                } finally {
                }
            }
        }
        return this.f45219t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((eO) Z()).mUb((EffectBrowserActivity) I28.n(this));
    }

    n() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            CN3 cn3Rl = ijL().rl();
            this.f45218n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f45218n.t(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        CN3 cn3 = this.f45218n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
