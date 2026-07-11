package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaqs implements ServiceConnection {
    final /* synthetic */ zzaqt zza;
    private final zzaqu zzb;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzaqw.zza("InstallReferrerClient", "Install Referrer service connected.");
        zzaqt zzaqtVar = this.zza;
        zzaqtVar.zzf(zzbcw.zzb(iBinder));
        zzaqtVar.zze(2);
        this.zzb.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzaqw.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        zzaqt zzaqtVar = this.zza;
        zzaqtVar.zzf(null);
        zzaqtVar.zze(0);
    }

    /* synthetic */ zzaqs(zzaqt zzaqtVar, zzaqu zzaquVar, byte[] bArr) {
        Objects.requireNonNull(zzaqtVar);
        this.zza = zzaqtVar;
        this.zzb = zzaquVar;
    }
}
