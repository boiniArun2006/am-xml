package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzchr implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zze(String str);

    protected void zzh(int i2) {
    }

    protected void zzi(int i2) {
    }

    protected void zzj(int i2) {
    }

    protected void zzk(int i2) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j2, long j3, boolean z2, long j4, long j5, long j6, int i2, int i3) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchm(this, str, str2, j2, j3, j4, j5, j6, z2, i2, i3));
    }

    public final void zzn(String str, String str2, int i2, int i3, long j2, long j3, boolean z2, int i5, int i7) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchn(this, str, str2, i2, i3, j2, j3, z2, i5, i7));
    }

    protected final void zzo(String str, String str2, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcho(this, str, str2, i2));
    }

    public final void zzp(String str, String str2, long j2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchp(this, str, str2, j2));
    }

    public final void zzq(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchq(this, str, str2, str3, str4));
    }

    final /* synthetic */ void zzw(String str, Map map) {
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcgeVar.zze("onPrecacheEvent", map);
        }
    }

    public zzchr(zzcge zzcgeVar) {
        Context context = zzcgeVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcgeVar);
    }

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        return zze(str);
    }
}
