package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzaca {
    private final Context zza;
    private boolean zzb;
    private zzuw zzc = zzuw.zzb;
    private final zzui zzd;

    @Nullable
    private Handler zze;

    @Nullable
    private zzadm zzf;

    public zzaca(Context context) {
        this.zza = context;
        this.zzd = new zzuc(context, null, null);
    }

    public final zzaca zza(zzuw zzuwVar) {
        this.zzc = zzuwVar;
        return this;
    }

    public final zzaca zzb(@Nullable Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaca zzc(@Nullable zzadm zzadmVar) {
        this.zzf = zzadmVar;
        return this;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzuw zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzui zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzadm zzi() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzacc zzd() {
        boolean z2;
        zzgrc.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z2 = false;
            if (handler != null && this.zzf != null) {
                z2 = true;
            }
        }
        zzgrc.zzi(z2);
        this.zzb = true;
        return new zzacc(this);
    }
}
