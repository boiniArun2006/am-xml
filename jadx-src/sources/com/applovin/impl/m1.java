package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class m1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f48932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f48933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f48934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f48935e;

    public interface a {
        void a();

        void b();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void a() {
        if (Boolean.parseBoolean(this.f48931a.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f48932b.b(this);
        this.f48932b.b(this, this.f48933c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f48931a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f3 = this.f48935e;
            float f4 = (f3 * 0.5f) + (fMax * 0.5f);
            this.f48935e = f4;
            if (f3 < 0.8f && f4 > 0.8f) {
                this.f48934d.a();
            } else {
                if (f3 <= -0.8f || f4 >= -0.8f) {
                    return;
                }
                this.f48934d.b();
            }
        }
    }

    public m1(C1802k c1802k, a aVar) {
        this.f48931a = c1802k;
        f0 f0Var = new f0();
        this.f48932b = f0Var;
        this.f48933c = f0Var.a(1);
        this.f48934d = aVar;
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f48932b.b(this);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f48932b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }
}
