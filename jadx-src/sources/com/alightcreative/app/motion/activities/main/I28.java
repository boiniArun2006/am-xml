package com.alightcreative.app.motion.activities.main;

import KC.yr;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 extends AppCompatActivity implements j9J.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BGJ.CN3 f45333n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile BGJ.j f45334t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Object f45332O = new Object();
    public boolean J2 = false;

    public class j implements OnContextAvailableListener {
        public j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            I28.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new j());
    }

    public final BGJ.j ijL() {
        if (this.f45334t == null) {
            synchronized (this.f45332O) {
                try {
                    if (this.f45334t == null) {
                        this.f45334t = m();
                    }
                } finally {
                }
            }
        }
        return this.f45334t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((yr) Z()).te((MainActivity) j9J.I28.n(this));
    }

    public I28() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof j9J.n) {
            BGJ.CN3 cn3Rl = ijL().rl();
            this.f45333n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f45333n.t(getDefaultViewModelCreationExtras());
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BGJ.CN3 cn3 = this.f45333n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
