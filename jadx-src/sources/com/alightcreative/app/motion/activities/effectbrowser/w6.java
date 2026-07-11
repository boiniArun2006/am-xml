package com.alightcreative.app.motion.activities.effectbrowser;

import BGJ.Wre;
import Y.ci;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.ViewModelProvider;
import j9J.I28;
import j9J.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 extends Fragment implements j9J.w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile Wre f45221O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ContextWrapper f45222n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f45224t;
    private final Object J2 = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f45223r = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ViF();
        nY();
    }

    private void ViF() {
        if (this.f45222n == null) {
            this.f45222n = Wre.rl(super.getContext(), this);
            this.f45224t = Z7.j.n(super.getContext());
        }
    }

    public final Wre WPU() {
        if (this.f45221O == null) {
            synchronized (this.J2) {
                try {
                    if (this.f45221O == null) {
                        this.f45221O = aYN();
                    }
                } finally {
                }
            }
        }
        return this.f45221O;
    }

    protected Wre aYN() {
        return new Wre(this);
    }

    protected void nY() {
        if (this.f45223r) {
            return;
        }
        this.f45223r = true;
        ((ci) Z()).nHg((j) I28.n(this));
    }

    w6() {
    }

    @Override // j9J.n
    public final Object Z() {
        return WPU().Z();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f45224t) {
            return null;
        }
        ViF();
        return this.f45222n;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return Dj9.j.rl(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(Wre.t(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f45222n;
        Ml.t(contextWrapper == null || Wre.nr(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ViF();
        nY();
    }
}
