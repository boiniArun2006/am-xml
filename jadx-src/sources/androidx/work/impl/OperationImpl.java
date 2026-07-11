package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.view.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class OperationImpl implements Operation {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MutableLiveData f42770t = new MutableLiveData();
    private final SettableFuture nr = SettableFuture.o();

    public void n(Operation.State state) {
        this.f42770t.ty(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.nr.HI((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.nr.ck(((Operation.State.FAILURE) state).n());
        }
    }

    public OperationImpl() {
        n(Operation.rl);
    }
}
