package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.view.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    SystemForegroundDispatcher J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f42921O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    NotificationManager f42922r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Handler f42923t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f42920o = Logger.J2("SystemFgService");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static SystemForegroundService f42919Z = null;

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop() {
        this.f42921O = true;
        Logger.t().n(f42920o, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f42919Z = null;
        stopSelf();
    }

    private void O() {
        this.f42923t = new Handler(Looper.getMainLooper());
        this.f42922r = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.J2 = systemForegroundDispatcher;
        systemForegroundDispatcher.az(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void n(final int i2, final Notification notification) {
        this.f42923t.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.f42922r.notify(i2, notification);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void nr(final int i2) {
        this.f42923t.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.f42922r.cancel(i2);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void t(final int i2, final int i3, final Notification notification) {
        this.f42923t.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 29) {
                    SystemForegroundService.this.startForeground(i2, notification, i3);
                } else {
                    SystemForegroundService.this.startForeground(i2, notification);
                }
            }
        });
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f42919Z = this;
        O();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.J2.gh();
    }

    @Override // androidx.view.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f42921O) {
            Logger.t().nr(f42920o, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.J2.gh();
            O();
            this.f42921O = false;
        }
        if (intent != null) {
            this.J2.qie(intent);
            return 3;
        }
        return 3;
    }
}
