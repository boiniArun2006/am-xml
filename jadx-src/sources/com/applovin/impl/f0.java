package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f48511a = (SensorManager) C1802k.o().getSystemService("sensor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f48512b;

    public Sensor a(int i2) {
        return this.f48511a.getDefaultSensor(i2);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i2, final C1804o c1804o) {
        this.f48512b.post(new Runnable() { // from class: com.applovin.impl.Sis
            @Override // java.lang.Runnable
            public final void run() {
                this.f47829n.a(sensorEventListener, sensor, i2, c1804o);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i2, C1804o c1804o) {
        try {
            this.f48511a.registerListener(sensorEventListener, sensor, i2, this.f48512b);
        } catch (Throwable th) {
            if (C1804o.a()) {
                c1804o.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(final SensorEventListener sensorEventListener) {
        this.f48512b.post(new Runnable() { // from class: com.applovin.impl.pO
            @Override // java.lang.Runnable
            public final void run() {
                this.f49705n.a(sensorEventListener);
            }
        });
    }

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f48512b = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f48511a.unregisterListener(sensorEventListener);
    }
}
