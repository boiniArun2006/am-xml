package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgpz implements ServiceConnection {
    final /* synthetic */ zzgqf zza;

    /* synthetic */ zzgpz(zzgqf zzgqfVar, byte[] bArr) {
        Objects.requireNonNull(zzgqfVar);
        this.zza = zzgqfVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgqfVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface iInterfaceZzm;
                zzgoj zzgojVarZzb = zzgoi.zzb(iBinder);
                zzgpz zzgpzVar = this.zza;
                zzgqf zzgqfVar2 = zzgpzVar.zza;
                zzgqfVar2.zzn(zzgojVarZzb);
                zzgqfVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    iInterfaceZzm = zzgqfVar2.zzm();
                } catch (RemoteException e2) {
                    zzgpzVar.zza.zzi().zzd(e2, "linkToDeath failed", new Object[0]);
                }
                if (iInterfaceZzm == null) {
                    throw null;
                }
                iInterfaceZzm.asBinder().linkToDeath(zzgqfVar2.zzl(), 0);
                zzgqf zzgqfVar3 = zzgpzVar.zza;
                zzgqfVar3.zzk(false);
                synchronized (zzgqfVar3.zzj()) {
                    try {
                        Iterator it = zzgqfVar3.zzj().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzgqfVar3.zzj().clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgqf zzgqfVar = this.zza;
        zzgqfVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgqfVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgqf zzgqfVar2 = this.zza.zza;
                zzgqfVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgqfVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgqfVar2.zzl(), 0);
                zzgqfVar2.zzn(null);
                zzgqfVar2.zzk(false);
            }
        });
    }
}
