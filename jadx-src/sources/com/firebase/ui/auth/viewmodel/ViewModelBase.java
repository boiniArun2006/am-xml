package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.view.AndroidViewModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public abstract class ViewModelBase<T> extends AndroidViewModel {
    private T mArguments;
    private final AtomicBoolean mIsInitialized;

    protected void onCreate() {
    }

    protected T getArguments() {
        return this.mArguments;
    }

    public void init(T t3) {
        if (this.mIsInitialized.compareAndSet(false, true)) {
            this.mArguments = t3;
            onCreate();
        }
    }

    @Override // androidx.view.ViewModel
    @CallSuper
    protected void onCleared() {
        this.mIsInitialized.set(false);
    }

    protected ViewModelBase(Application application) {
        super(application);
        this.mIsInitialized = new AtomicBoolean();
    }
}
