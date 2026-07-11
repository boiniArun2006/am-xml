package jEU;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.ViewModelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class qz extends FXi.fuX implements j9J.w6 {
    private volatile BGJ.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f69361O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ContextWrapper f69364t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f69363r = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69362o = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        jB();
        U();
    }

    private void jB() {
        if (this.f69364t == null) {
            this.f69364t = BGJ.Wre.rl(super.getContext(), this);
            this.f69361O = Z7.j.n(super.getContext());
        }
    }

    protected void U() {
        if (this.f69362o) {
            return;
        }
        this.f69362o = true;
        ((w6) Z()).g((n) j9J.I28.n(this));
    }

    protected BGJ.Wre Xw() {
        return new BGJ.Wre(this);
    }

    public final BGJ.Wre bzg() {
        if (this.J2 == null) {
            synchronized (this.f69363r) {
                try {
                    if (this.J2 == null) {
                        this.J2 = Xw();
                    }
                } finally {
                }
            }
        }
        return this.J2;
    }

    @Override // j9J.n
    public final Object Z() {
        return bzg().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f69361O) {
            return null;
        }
        jB();
        return this.f69364t;
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
        ContextWrapper contextWrapper = this.f69364t;
        j9J.Ml.t(contextWrapper == null || BGJ.Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jB();
        U();
    }
}
