package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f50197h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Float f50198i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f50199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f50200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1802k f50201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f50202d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50203e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50205g;

    public interface a {
        void a(int i2);
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public Float b() {
        if (this.f50199a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.f50201c.O();
            if (C1804o.a()) {
                this.f50201c.O().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f50199a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f50199a == null) {
            return f50198i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f50201c.O();
            if (C1804o.a()) {
                this.f50201c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f50198i;
        }
    }

    private void d() {
        this.f50201c.O();
        if (C1804o.a()) {
            this.f50201c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f50205g = f50197h;
        this.f50200b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f50201c.O();
        if (C1804o.a()) {
            this.f50201c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f50200b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f50199a.getRingerMode();
    }

    i(C1802k c1802k) {
        this.f50201c = c1802k;
        Context contextO = C1802k.o();
        this.f50200b = contextO;
        this.f50199a = (AudioManager) contextO.getSystemService("audio");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f50204f = true;
            this.f50205g = this.f50199a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f50204f = false;
            if (this.f50205g != this.f50199a.getRingerMode()) {
                this.f50205g = f50197h;
                b(this.f50199a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f50203e) {
            try {
                if (this.f50202d.contains(aVar)) {
                    this.f50202d.remove(aVar);
                    if (this.f50202d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f50203e) {
            try {
                if (this.f50202d.contains(aVar)) {
                    return;
                }
                this.f50202d.add(aVar);
                if (this.f50202d.size() == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(final int i2) {
        if (this.f50204f) {
            return;
        }
        this.f50201c.O();
        if (C1804o.a()) {
            this.f50201c.O().a("AudioSessionManager", "Ringer mode is " + i2);
        }
        synchronized (this.f50203e) {
            try {
                for (final a aVar : this.f50202d) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.s4
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.a(i2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
