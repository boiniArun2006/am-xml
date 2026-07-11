package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.view.LiveData;
import androidx.view.MutableLiveData;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public abstract class OperableViewModel<I, O> extends ViewModelBase<I> {
    private MutableLiveData<O> mOperation;

    public LiveData<O> getOperation() {
        return this.mOperation;
    }

    protected void setResult(O o2) {
        this.mOperation.ck(o2);
    }

    protected OperableViewModel(Application application) {
        super(application);
        this.mOperation = new MutableLiveData<>();
    }
}
