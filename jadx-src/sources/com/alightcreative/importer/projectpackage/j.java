package com.alightcreative.importer.projectpackage;

import BGJ.CN3;
import Fg.I28;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ViewModelProvider;
import androidx.view.contextaware.OnContextAvailableListener;
import j9J.n;
import j9J.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j extends AppCompatActivity implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CN3 f46633n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile BGJ.j f46634t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f46632O = new Object();
    private boolean J2 = false;

    /* JADX INFO: renamed from: com.alightcreative.importer.projectpackage.j$j, reason: collision with other inner class name */
    class C0658j implements OnContextAvailableListener {
        C0658j() {
        }

        @Override // androidx.view.contextaware.OnContextAvailableListener
        public void n(Context context) {
            j.this.xg();
        }
    }

    private void piY() {
        addOnContextAvailableListener(new C0658j());
    }

    public final BGJ.j ijL() {
        if (this.f46634t == null) {
            synchronized (this.f46632O) {
                try {
                    if (this.f46634t == null) {
                        this.f46634t = m();
                    }
                } finally {
                }
            }
        }
        return this.f46634t;
    }

    protected BGJ.j m() {
        return new BGJ.j(this);
    }

    protected void xg() {
        if (this.J2) {
            return;
        }
        this.J2 = true;
        ((I28) Z()).Uo((ElementDownloadActivity) j9J.I28.n(this));
    }

    j() {
        piY();
    }

    private void eTf() {
        if (getApplication() instanceof n) {
            CN3 cn3Rl = ijL().rl();
            this.f46633n = cn3Rl;
            if (cn3Rl.rl()) {
                this.f46633n.t(getDefaultViewModelCreationExtras());
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
        CN3 cn3 = this.f46633n;
        if (cn3 != null) {
            cn3.n();
        }
    }
}
