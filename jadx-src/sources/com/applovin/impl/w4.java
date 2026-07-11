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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f50700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f50701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f50702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1802k f50703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f50704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f50705h;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public float a() {
        if (this.f50704g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f50705h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f50703f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f50700c.b(this);
        if (((Boolean) this.f50703f.o0().a(x4.e4)).booleanValue()) {
            this.f50700c.b(this, this.f50701d, (int) TimeUnit.MILLISECONDS.toMicros(this.f50698a), this.f50703f.O());
        }
        if (((Boolean) this.f50703f.o0().a(x4.f4)).booleanValue()) {
            this.f50700c.b(this, this.f50702e, (int) TimeUnit.MILLISECONDS.toMicros(this.f50698a), this.f50703f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f50704g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f3 = this.f50705h * this.f50699b;
            this.f50705h = f3;
            this.f50705h = f3 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    public w4(C1802k c1802k) {
        this.f50703f = c1802k;
        f0 f0Var = new f0();
        this.f50700c = f0Var;
        this.f50701d = f0Var.a(9);
        this.f50702e = f0Var.a(4);
        this.f50698a = ((Integer) c1802k.a(x4.h4)).intValue();
        this.f50699b = ((Float) c1802k.a(x4.g4)).floatValue();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f50700c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }
}
