package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhb {
    final /* synthetic */ zzhg zza;
    private final String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    @WorkerThread
    public final boolean zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhg zzhgVar = this.zza;
            this.zze = zzhgVar.zzd().getBoolean(this.zzb, this.zzc);
        }
        return this.zze;
    }

    @WorkerThread
    public final void zzb(boolean z2) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putBoolean(this.zzb, z2);
        editorEdit.apply();
        this.zze = z2;
    }

    public zzhb(zzhg zzhgVar, String str, boolean z2) {
        Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = z2;
    }
}
