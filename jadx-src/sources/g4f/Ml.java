package g4f;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ml implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f67041O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f67042n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f67043t;

    public interface j {
        void a(boolean z2);
    }

    protected void J2(boolean z2) {
    }

    protected boolean KN() {
        return false;
    }

    public void mUb() {
        this.f67042n = false;
        this.f67041O = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        t(true);
    }

    public void xMQ() {
        this.f67042n = true;
        boolean zNr = nr();
        this.f67043t = zNr;
        J2(zNr);
    }

    private void t(boolean z2) {
        if (this.f67043t != z2) {
            this.f67043t = z2;
            if (this.f67042n) {
                J2(z2);
                j jVar = this.f67041O;
                if (jVar != null) {
                    jVar.a(z2);
                }
            }
        }
    }

    ActivityManager.RunningAppProcessInfo O() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean Uo() {
        return this.f67043t;
    }

    public void n(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void rl(j jVar) {
        this.f67041O = jVar;
    }

    private boolean nr() {
        if (O().importance == 100 || KN()) {
            return true;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t(nr());
    }
}
