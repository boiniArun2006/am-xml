package com.alightcreative.app.motion.activities.audiobrowser;

import BGJ.CN3;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import j9J.I28;
import m.InterfaceC2284fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CN3 f44892n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f44893t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f44891O = new Object();
    private boolean J2 = false;

    class j implements OnContextAvailableListener {
        j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            Ml.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new j());
    }

    public final BGJ.j ijL() {
        if (this.f44893t == null) {
            synchronized (this.f44891O) {
                try {
                    if (this.f44893t == null) {
                        this.f44893t = m();
                    }
                } finally {
                }
            }
        }
        return this.f44893t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((InterfaceC2284fuX) Z()).qie((AudioBrowserActivity) I28.n(this));
    }

    Ml() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            CN3 cn3Rl = ijL().rl();
            this.f44892n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f44892n.t(getDefaultViewModelCreationExtras());
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
        CN3 cn3 = this.f44892n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
