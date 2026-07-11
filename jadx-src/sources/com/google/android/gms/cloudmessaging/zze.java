package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zze {

    @Nullable
    private static zze zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzf zzd = new zzf(this);
    private int zze = 1;

    public static synchronized zze zza(Context context) {
        try {
            if (zza == null) {
                zza = new zze(context, com.google.android.gms.internal.cloudmessaging.zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.cloudmessaging.zzf.zzb));
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public final Task<Bundle> zzb(int i2, Bundle bundle) {
        return zza(new zzs(zza(), 1, bundle));
    }

    @VisibleForTesting
    private zze(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public final Task<Void> zza(int i2, Bundle bundle) {
        return zza(new zzn(zza(), 2, bundle));
    }

    private final synchronized <T> Task<T> zza(zzq<T> zzqVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(zzqVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.zzd.zza((zzq<?>) zzqVar)) {
                zzf zzfVar = new zzf(this);
                this.zzd = zzfVar;
                zzfVar.zza((zzq<?>) zzqVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzqVar.zzb.getTask();
    }

    private final synchronized int zza() {
        int i2;
        i2 = this.zze;
        this.zze = i2 + 1;
        return i2;
    }
}
