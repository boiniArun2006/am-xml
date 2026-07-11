package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftf implements zzfti {
    private static final zzftf zza = new zzftf(new zzftj());
    private Date zzb;
    private boolean zzc;
    private final zzftj zzd;
    private boolean zze;

    private zzftf(zzftj zzftjVar) {
        this.zzd = zzftjVar;
    }

    public static zzftf zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(@NonNull Context context) {
        if (this.zzc) {
            return;
        }
        zzftj zzftjVar = this.zzd;
        zzftjVar.zzd(context);
        zzftjVar.zzg(this);
        zzftjVar.zze();
        this.zze = zzftjVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzd(boolean z2) {
        if (!this.zze && z2) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfth.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfsn) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z2;
    }
}
