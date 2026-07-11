package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzne implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zznk zza;
    private volatile boolean zzb;
    private volatile zzgn zzc;

    final /* synthetic */ void zzd(boolean z2) {
        this.zzb = false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzu.zzaW().zzj(new zzmz(this, (zzga) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zznk zznkVar = this.zza;
        zznkVar.zzu.zzaW().zzd();
        zzgt zzgtVarZzf = zznkVar.zzu.zzf();
        if (zzgtVarZzf != null) {
            zzgtVarZzf.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaW().zzj(new zznd(this, connectionResult));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i2) {
        zzib zzibVar = this.zza.zzu;
        zzibVar.zzaW().zzd();
        zzibVar.zzaV().zzj().zza("Service connection suspended");
        zzibVar.zzaW().zzj(new zzna(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
            zzga zzfyVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfyVar = iInterfaceQueryLocalInterface instanceof zzga ? (zzga) iInterfaceQueryLocalInterface : new zzfy(iBinder);
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzu.zzaV().zzb().zza("Service connect failed to get IMeasurementService");
            }
            if (zzfyVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    zznk zznkVar = this.zza;
                    connectionTracker.unbindService(zznkVar.zzu.zzaY(), zznkVar.zzY());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaW().zzj(new zzmx(this, zzfyVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        zzib zzibVar = this.zza.zzu;
        zzibVar.zzaW().zzd();
        zzibVar.zzaV().zzj().zza("Service disconnected");
        zzibVar.zzaW().zzj(new zzmy(this, componentName));
    }

    @WorkerThread
    public final void zza(Intent intent) {
        zznk zznkVar = this.zza;
        zznkVar.zzg();
        Context contextZzaY = zznkVar.zzu.zzaY();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                zznk zznkVar2 = this.zza;
                zznkVar2.zzu.zzaV().zzk().zza("Using local app measurement service");
                this.zzb = true;
                connectionTracker.bindService(contextZzaY, intent, zznkVar2.zzY(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @WorkerThread
    public final void zzc() {
        zznk zznkVar = this.zza;
        zznkVar.zzg();
        Context contextZzaY = zznkVar.zzu.zzaY();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzgn(contextZzaY, Looper.getMainLooper(), this, this);
                this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected zzne(zznk zznkVar) {
        Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }
}
