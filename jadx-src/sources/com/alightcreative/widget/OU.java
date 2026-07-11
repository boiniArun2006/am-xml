package com.alightcreative.widget;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class OU {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Vibrator f47173n;

    public final void n() {
        Vibrator vibrator = this.f47173n;
        if (vibrator == null || Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
            return;
        }
        this.f47173n.vibrate(VibrationEffect.createOneShot(5L, 50));
    }

    public OU(Vibrator vibrator) {
        this.f47173n = vibrator;
    }
}
