package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@VisibleForTesting
final class zzfvp implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfwj zza;
    private final String zzb;
    private final String zzc;
    private final zzbch zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfvh zzg;
    private final long zzh;

    public final zzfwv zza(int i2) {
        zzfwv zzfwvVar;
        try {
            zzfwvVar = (zzfwv) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zzd(2009, this.zzh, e2);
            zzfwvVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfwvVar != null) {
            if (zzfwvVar.zzc == 7) {
                zzfvh.zzg(3);
            } else {
                zzfvh.zzg(2);
            }
        }
        return zzfwvVar == null ? new zzfwv(null, 1) : zzfwvVar;
    }

    private final void zzd(int i2, long j2, Exception exc) {
        zzfvh zzfvhVar = this.zzg;
        if (zzfvhVar != null) {
            zzfvhVar.zzc(i2, System.currentTimeMillis() - j2, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void zzb() {
        zzfwj zzfwjVar = this.zza;
        if (zzfwjVar != null) {
            if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                zzfwjVar.disconnect();
            }
        }
    }

    protected final zzfwo zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public zzfvp(Context context, int i2, zzbch zzbchVar, String str, String str2, String str3, zzfvh zzfvhVar) {
        this.zzb = str;
        this.zzd = zzbchVar;
        this.zzc = str2;
        this.zzg = zzfvhVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfwj zzfwjVar = new zzfwj(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfwjVar;
        this.zze = new LinkedBlockingQueue();
        zzfwjVar.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfwo zzfwoVarZzc = zzc();
        if (zzfwoVarZzc != null) {
            try {
                zzfwv zzfwvVarZzg = zzfwoVarZzc.zzg(new zzfwt(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzfwvVarZzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
