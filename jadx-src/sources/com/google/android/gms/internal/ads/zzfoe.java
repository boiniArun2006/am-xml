package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface zzfoe {
    zzfoe zza();

    boolean zzb();

    zzfoe zzc();

    zzfoe zzd(boolean z2);

    zzfoe zze(String str);

    zzfoe zzf(zzfot zzfotVar);

    zzfoe zzg(zzfjb zzfjbVar);

    zzfoe zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfoe zzi(String str);

    zzfoe zzj(Throwable th);

    zzfoe zzk(String str);

    boolean zzl();

    @Nullable
    zzfoh zzm();

    zzfoe zzp(int i2);

    static zzfoe zzn(Context context, int i2) {
        boolean zBooleanValue;
        if (zzfor.zza()) {
            int i3 = i2 - 2;
            if (i3 != 20 && i3 != 21) {
                if (i3 != 110) {
                    switch (i3) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            zBooleanValue = ((Boolean) zzbix.zzc.zze()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            zBooleanValue = ((Boolean) zzbix.zzd.zze()).booleanValue();
                            break;
                        case 5:
                            zBooleanValue = ((Boolean) zzbix.zzb.zze()).booleanValue();
                            break;
                    }
                } else {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkm)).booleanValue();
                }
            } else {
                zBooleanValue = ((Boolean) zzbix.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfog(context, i2);
            }
        }
        return new zzfph();
    }

    static zzfoe zzo(Context context, int i2, int i3, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfoe zzfoeVarZzn = zzn(context, i2);
        if (zzfoeVarZzn instanceof zzfog) {
            zzfoeVarZzn.zza();
            zzfoeVarZzn.zzp(i3);
            zzfoeVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfon.zza(str)) {
                zzfoeVarZzn.zze(str);
            }
        }
        return zzfoeVarZzn;
    }
}
