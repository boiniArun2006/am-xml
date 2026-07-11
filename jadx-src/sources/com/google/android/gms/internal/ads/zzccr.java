package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzccr {

    @GuardedBy
    @VisibleForTesting
    static zzccr zzi;

    abstract zzccj zza();

    public static synchronized zzccr zzb(Context context) {
        try {
            zzccr zzccrVar = zzi;
            if (zzccrVar != null) {
                return zzccrVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbhe.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzgVarZzo.zza(applicationContext);
            zzccl zzcclVar = new zzccl(null);
            zzcclVar.zza(applicationContext);
            zzcclVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzcclVar.zzc(zzgVarZzo);
            zzcclVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            zzccr zzccrVarZze = zzcclVar.zze();
            zzi = zzccrVarZze;
            ((zzccf) ((zzccm) zzccrVarZze).zzc.zzb()).zza();
            final zzccw zzccwVar = (zzccw) ((zzccm) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map mapZzz = com.google.android.gms.ads.internal.util.zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbc));
                Iterator it = mapZzz.keySet().iterator();
                while (it.hasNext()) {
                    zzccwVar.zzb((String) it.next());
                }
                zzccwVar.zza(new zzccu() { // from class: com.google.android.gms.internal.ads.zzccv
                    @Override // com.google.android.gms.internal.ads.zzccu
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzccwVar.zzc(mapZzz, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }
}
