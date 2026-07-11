package IzQ;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.view.BackEventCompat;
import com.safedk.android.internal.d;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    private BackEventCompat J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final int f4405O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TimeInterpolator f4406n;
    protected final int nr;
    protected final View rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f4407t;

    protected BackEventCompat O(BackEventCompat backEventCompat) {
        if (this.J2 == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.J2;
        this.J2 = backEventCompat;
        return backEventCompat2;
    }

    public float n(float f3) {
        return this.f4406n.getInterpolation(f3);
    }

    protected void nr(BackEventCompat backEventCompat) {
        this.J2 = backEventCompat;
    }

    protected BackEventCompat rl() {
        if (this.J2 == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.J2;
        this.J2 = null;
        return backEventCompat;
    }

    public BackEventCompat t() {
        BackEventCompat backEventCompat = this.J2;
        this.J2 = null;
        return backEventCompat;
    }

    public j(View view) {
        this.rl = view;
        Context context = view.getContext();
        this.f4406n = fuX.Uo(context, Rxk.n.wTp, PathInterpolatorCompat.n(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4407t = fuX.J2(context, Rxk.n.fD, d.f62986a);
        this.nr = fuX.J2(context, Rxk.n.f8803X, 150);
        this.f4405O = fuX.J2(context, Rxk.n.f8805e, 100);
    }
}
