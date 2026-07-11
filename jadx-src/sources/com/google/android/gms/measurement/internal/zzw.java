package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzql;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzw extends BroadcastReceiver {
    private final zzib zza;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // android.content.BroadcastReceiver
    @MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        byte b2;
        if (intent == null) {
            this.zza.zzaV().zze().zza("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzaV().zze().zza("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            b2 = (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) ? (byte) 1 : (byte) -1;
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b2 = 0;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                this.zza.zzaV().zze().zza("App receiver called with unknown action");
                return;
            }
            zzib zzibVar = this.zza;
            zzibVar.zzaV().zzk().zza("[sgtm] App Receiver notified batches are available");
            zzibVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza();
                }
            });
            return;
        }
        final zzib zzibVar2 = this.zza;
        zzql.zza();
        if (zzibVar2.zzc().zzp(null, zzfx.zzaQ)) {
            zzibVar2.zzaV().zzk().zza("App receiver notified triggers are available");
            zzibVar2.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzib zzibVar3 = zzibVar2;
                    if (!zzibVar3.zzk().zzS()) {
                        zzibVar3.zzaV().zze().zza("registerTrigger called but app not eligible");
                        return;
                    }
                    zzibVar3.zzj().zzv();
                    final zzli zzliVarZzj = zzibVar3.zzj();
                    Objects.requireNonNull(zzliVarZzj);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzliVarZzj.zzw();
                        }
                    }).start();
                }
            });
        }
    }

    final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((Long) zzfx.zzC.zzb(null)).longValue());
    }

    public zzw(zzib zzibVar) {
        this.zza = zzibVar;
    }
}
