package HI0;

import android.os.AsyncTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: HI0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class AsyncTaskC1374z extends AsyncTask {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f3887n;
    private Function0 nr;
    private Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Function0 f3888t;

    public AsyncTaskC1374z(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f3887n = action;
        this.f3888t = new Function0() { // from class: HI0.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AsyncTaskC1374z.KN(this.f3830n);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object KN(AsyncTaskC1374z asyncTaskC1374z) {
        return asyncTaskC1374z.f3887n.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O() {
        return "pendingErrorBlock";
    }

    public final void J2(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f3888t = function0;
    }

    public final AsyncTaskC1374z Uo(Function1 resultHandler) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        if (getStatus() != AsyncTask.Status.PENDING) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.rl != null) {
            throw new IllegalStateException("multiple 'then' blocks not allowed");
        }
        this.rl = resultHandler;
        return this;
    }

    public final Function0 nr() {
        return this.f3888t;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        if (obj == null) {
            XoT.C.Uo(this, new Function0() { // from class: HI0.Xo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AsyncTaskC1374z.O();
                }
            });
            Function0 function0 = this.nr;
            if (function0 != null) {
                function0.invoke();
            } else {
                Function1 function1 = this.rl;
                if (function1 != null) {
                    function1.invoke(obj);
                }
            }
        } else {
            Function1 function12 = this.rl;
            if (function12 != null) {
                function12.invoke(obj);
            }
        }
        super.onPostExecute(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object doInBackground(Void... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return this.f3888t.invoke();
        } catch (Dsr e2) {
            this.nr = e2.n();
            return null;
        }
    }
}
