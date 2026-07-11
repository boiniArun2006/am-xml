package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface zzazc {
    void zzd(@Nullable MotionEvent motionEvent);

    @Deprecated
    void zze(int i2, int i3, int i5);

    String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity);

    String zzg(Context context, @Nullable String str, @Nullable View view);

    void zzh(@Nullable View view);

    void zzi(StackTraceElement[] stackTraceElementArr);

    String zzj(Context context, @Nullable View view, @Nullable Activity activity);

    String zzk(Context context);

    String zzl(Context context);
}
