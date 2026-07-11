package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzha extends BroadcastReceiver {
    private final zzpf zza;
    private boolean zzb;
    private boolean zzc;

    final /* synthetic */ zzpf zzc() {
        return this.zza;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        String action = intent.getAction();
        zzpfVar.zzaV().zzk().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpfVar.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzb = zzpfVar.zzi().zzb();
        if (this.zzc != zZzb) {
            this.zzc = zZzb;
            zzpfVar.zzaW().zzj(new zzgz(this, zZzb));
        }
    }

    @WorkerThread
    public final void zza() {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        zzpfVar.zzaW().zzg();
        if (this.zzb) {
            return;
        }
        zzpfVar.zzaY().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpfVar.zzi().zzb();
        zzpfVar.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    @WorkerThread
    public final void zzb() {
        zzpf zzpfVar = this.zza;
        zzpfVar.zzu();
        zzpfVar.zzaW().zzg();
        zzpfVar.zzaW().zzg();
        if (this.zzb) {
            zzpfVar.zzaV().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpfVar.zzaY().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    zzha(zzpf zzpfVar) {
        Preconditions.checkNotNull(zzpfVar);
        this.zza = zzpfVar;
    }
}
