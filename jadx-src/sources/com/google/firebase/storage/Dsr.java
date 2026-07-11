package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Dsr implements Runnable {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final O6.w6 f60837O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f60838n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Integer f60839r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TaskCompletionSource f60840t;

    @Override // java.lang.Runnable
    public void run() {
        fuX fuxN;
        X3O.Ml ml = new X3O.Ml(this.f60838n.HI(), this.f60838n.J2(), this.f60839r, this.J2);
        this.f60837O.nr(ml);
        if (ml.S()) {
            try {
                fuxN = fuX.n(this.f60838n.ty(), ml.ty());
            } catch (JSONException e2) {
                Log.e("ListTask", "Unable to parse response body. " + ml.az(), e2);
                this.f60840t.setException(StorageException.nr(e2));
                return;
            }
        } else {
            fuxN = null;
        }
        TaskCompletionSource taskCompletionSource = this.f60840t;
        if (taskCompletionSource != null) {
            ml.n(taskCompletionSource, fuxN);
        }
    }

    Dsr(o oVar, Integer num, String str, TaskCompletionSource taskCompletionSource) {
        Preconditions.checkNotNull(oVar);
        Preconditions.checkNotNull(taskCompletionSource);
        this.f60838n = oVar;
        this.f60839r = num;
        this.J2 = str;
        this.f60840t = taskCompletionSource;
        I28 i28Ty = oVar.ty();
        this.f60837O = new O6.w6(i28Ty.n().qie(), i28Ty.t(), i28Ty.rl(), i28Ty.gh());
    }
}
