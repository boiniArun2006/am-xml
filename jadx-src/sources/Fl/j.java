package Fl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.ViewModelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j extends Fragment implements j9J.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile BGJ.Wre f3101O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ContextWrapper f3102n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f3104t;
    private final Object J2 = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f3103r = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ViF();
        nY();
    }

    private void ViF() {
        if (this.f3102n == null) {
            this.f3102n = BGJ.Wre.rl(super.getContext(), this);
            this.f3104t = Z7.j.n(super.getContext());
        }
    }

    public final BGJ.Wre WPU() {
        if (this.f3101O == null) {
            synchronized (this.J2) {
                try {
                    if (this.f3101O == null) {
                        this.f3101O = aYN();
                    }
                } finally {
                }
            }
        }
        return this.f3101O;
    }

    protected BGJ.Wre aYN() {
        return new BGJ.Wre(this);
    }

    protected void nY() {
        if (this.f3103r) {
            return;
        }
        this.f3103r = true;
        ((Xo) Z()).Ik((Wre) j9J.I28.n(this));
    }

    j() {
    }

    @Override // j9J.n
    public final Object Z() {
        return WPU().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f3104t) {
            return null;
        }
        ViF();
        return this.f3102n;
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
        ContextWrapper contextWrapper = this.f3102n;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ViF();
        nY();
    }
}
