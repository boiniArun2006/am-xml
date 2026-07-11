package f52;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.ViewModelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n extends Fragment implements j9J.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile BGJ.Wre f66543O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ContextWrapper f66544n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f66546t;
    private final Object J2 = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f66545r = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ViF();
        nY();
    }

    private void ViF() {
        if (this.f66544n == null) {
            this.f66544n = BGJ.Wre.rl(super.getContext(), this);
            this.f66546t = Z7.j.n(super.getContext());
        }
    }

    public final BGJ.Wre WPU() {
        if (this.f66543O == null) {
            synchronized (this.J2) {
                try {
                    if (this.f66543O == null) {
                        this.f66543O = aYN();
                    }
                } finally {
                }
            }
        }
        return this.f66543O;
    }

    protected BGJ.Wre aYN() {
        return new BGJ.Wre(this);
    }

    protected void nY() {
        if (this.f66545r) {
            return;
        }
        this.f66545r = true;
        ((Wre) Z()).WPU((I28) j9J.I28.n(this));
    }

    n() {
    }

    @Override // j9J.n
    public final Object Z() {
        return WPU().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f66546t) {
            return null;
        }
        ViF();
        return this.f66544n;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.rl(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(BGJ.Wre.t(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f66544n;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ViF();
        nY();
    }
}
