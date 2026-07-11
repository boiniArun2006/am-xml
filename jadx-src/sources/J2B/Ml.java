package J2B;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Ml implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f4420O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4421n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f4422t;

    public interface j {
        void a(boolean z2);
    }

    protected void J2(boolean z2) {
    }

    protected boolean KN() {
        return false;
    }

    public void mUb() {
        this.f4421n = false;
        this.f4420O = null;
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
        this.f4421n = true;
        boolean zNr = nr();
        this.f4422t = zNr;
        J2(zNr);
    }

    private void t(boolean z2) {
        if (this.f4422t != z2) {
            this.f4422t = z2;
            if (this.f4421n) {
                J2(z2);
                j jVar = this.f4420O;
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
        return this.f4422t;
    }

    public void n(j jVar) {
        this.f4420O = jVar;
    }

    public void rl(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
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
