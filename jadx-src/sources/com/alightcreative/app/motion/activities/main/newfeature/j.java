package com.alightcreative.app.motion.activities.main.newfeature;

import BGJ.CN3;
import TX.fuX;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import j9J.I28;
import j9J.n;
import j9J.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j extends AppCompatActivity implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CN3 f45461n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f45462t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f45460O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.newfeature.j$j, reason: collision with other inner class name */
    class C0641j implements OnContextAvailableListener {
        C0641j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0641j());
    }

    public final BGJ.j ijL() {
        if (this.f45462t == null) {
            synchronized (this.f45460O) {
                try {
                    if (this.f45462t == null) {
                        this.f45462t = m();
                    }
                } finally {
                }
            }
        }
        return this.f45462t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((fuX) Z()).XQ((NewFeaturePagerActivity) I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof n) {
            CN3 cn3Rl = ijL().rl();
            this.f45461n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f45461n.t(getDefaultViewModelCreationExtras());
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
        CN3 cn3 = this.f45461n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
