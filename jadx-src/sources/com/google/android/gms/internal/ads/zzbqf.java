package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbqf implements zzarr {
    private volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    final /* synthetic */ zzbps zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    @Nullable
    public final zzaru zza(zzary zzaryVar) throws zzash {
        Parcelable.Creator<zzbpt> creator = zzbpt.CREATOR;
        Map mapZzm = zzaryVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbpt zzbptVar = new zzbpt(zzaryVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcen zzcenVar = new zzcen();
            this.zza = new zzbps(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbqd(this, zzcenVar), new zzbqe(this, zzcenVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqb zzbqbVar = new zzbqb(this, zzbptVar);
            zzgzy zzgzyVar = zzcei.zza;
            com.google.common.util.concurrent.Xo xoZzi = zzgzo.zzi(zzgzo.zzj(zzcenVar, zzbqbVar, zzgzyVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfr)).intValue(), TimeUnit.MILLISECONDS, zzcei.zzd);
            xoZzi.addListener(new zzbqc(this), zzgzyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) xoZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbpv zzbpvVar = (zzbpv) new zzbzs(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpvVar == null) {
                return null;
            }
            if (zzbpvVar.zza) {
                throw new zzash(zzbpvVar.zzb);
            }
            String[] strArr3 = zzbpvVar.zze;
            String[] strArr4 = zzbpvVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < strArr3.length; i3++) {
                map.put(strArr3[i3], strArr4[i3]);
            }
            return new zzaru(zzbpvVar.zzc, zzbpvVar.zzd, map, zzbpvVar.zzg, zzbpvVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }
}
