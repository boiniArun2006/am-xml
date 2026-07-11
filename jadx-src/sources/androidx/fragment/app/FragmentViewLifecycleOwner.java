package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleRegistry;
import androidx.view.SavedStateHandleSupport;
import androidx.view.SavedStateRegistry;
import androidx.view.SavedStateRegistryController;
import androidx.view.SavedStateRegistryOwner;
import androidx.view.SavedStateViewModelFactory;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.MutableCreationExtras;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    private ViewModelProvider.Factory J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f38665O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Fragment f38666n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ViewModelStore f38669t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LifecycleRegistry f38668r = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SavedStateRegistryController f38667o = null;

    void J2(Lifecycle.State state) {
        this.f38668r.ty(state);
    }

    void O(Bundle bundle) {
        this.f38667o.O(bundle);
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f38666n.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.t(ViewModelProvider.AndroidViewModelFactory.KN, application);
        }
        mutableCreationExtras.t(SavedStateHandleSupport.f38987n, this.f38666n);
        mutableCreationExtras.t(SavedStateHandleSupport.rl, this);
        if (this.f38666n.getArguments() != null) {
            mutableCreationExtras.t(SavedStateHandleSupport.f38988t, this.f38666n.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f38666n.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f38666n.mDefaultFactory)) {
            this.J2 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.J2 == null) {
            Context applicationContext = this.f38666n.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f38666n;
            this.J2 = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.J2;
    }

    void n(Lifecycle.Event event) {
        this.f38668r.xMQ(event);
    }

    void nr(Bundle bundle) {
        this.f38667o.nr(bundle);
    }

    void rl() {
        if (this.f38668r == null) {
            this.f38668r = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryControllerN = SavedStateRegistryController.n(this);
            this.f38667o = savedStateRegistryControllerN;
            savedStateRegistryControllerN.t();
            this.f38665O.run();
        }
    }

    boolean t() {
        return this.f38668r != null;
    }

    FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.f38666n = fragment;
        this.f38669t = viewModelStore;
        this.f38665O = runnable;
    }

    @Override // androidx.view.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public Lifecycle getLifecycleRegistry() {
        rl();
        return this.f38668r;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        rl();
        return this.f38667o.getSavedStateRegistry();
    }

    @Override // androidx.view.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        rl();
        return this.f38669t;
    }
}
