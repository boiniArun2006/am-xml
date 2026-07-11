package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhi implements ServiceConnection {
    final /* synthetic */ zzhj zza;
    private final String zzb;

    final /* synthetic */ String zza() {
        return this.zzb;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzaV().zze().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbq zzbqVarZzb = com.google.android.gms.internal.measurement.zzbp.zzb(iBinder);
            if (zzbqVarZzb == null) {
                this.zza.zza.zzaV().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
            zzib zzibVar = this.zza.zza;
            zzibVar.zzaV().zzk().zza("Install Referrer Service connected");
            zzibVar.zzaW().zzj(new zzhh(this, zzbqVarZzb, this));
        } catch (RuntimeException e2) {
            this.zza.zza.zzaV().zze().zzb("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
    }

    zzhi(zzhj zzhjVar, String str) {
        Objects.requireNonNull(zzhjVar);
        this.zza = zzhjVar;
        this.zzb = str;
    }
}
