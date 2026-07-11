package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.view.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.utils.WakeLocks;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.CommandsCompletedListener {
    public static final String J2 = Logger.J2("SystemAlarmService");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f42876O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SystemAlarmDispatcher f42877t;

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.CommandsCompletedListener
    public void rl() {
        this.f42876O = true;
        Logger.t().n(J2, "All commands completed in dispatcher", new Throwable[0]);
        WakeLocks.n();
        stopSelf();
    }

    private void O() {
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f42877t = systemAlarmDispatcher;
        systemAlarmDispatcher.az(this);
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        O();
        this.f42876O = false;
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f42876O = true;
        this.f42877t.mUb();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f42876O) {
            Logger.t().nr(J2, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f42877t.mUb();
            O();
            this.f42876O = false;
        }
        if (intent != null) {
            this.f42877t.n(intent, i3);
            return 3;
        }
        return 3;
    }
}
