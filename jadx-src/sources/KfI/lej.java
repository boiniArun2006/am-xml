package KfI;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class lej implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static nKK f5716O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lej f5717n = new lej();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f5718t;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void n(nKK nkk) {
        f5716O = nkk;
        if (nkk == null || !f5718t) {
            return;
        }
        f5718t = false;
        nkk.gh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        nKK nkk = f5716O;
        if (nkk != null) {
            nkk.KN();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        nKK nkk = f5716O;
        if (nkk != null) {
            nkk.gh();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            f5718t = true;
        }
    }

    private lej() {
    }
}
