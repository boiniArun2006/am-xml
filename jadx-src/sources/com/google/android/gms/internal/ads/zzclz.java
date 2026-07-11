package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzclz implements zzazc {
    private final Context zza;
    private final zzgbb zzb;

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(@Nullable View view) {
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        return iZzh != 1 ? iZzh != 2 ? iZzh != 3 ? "uns" : "3.0" : "2.0" : "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    @Deprecated
    public final void zze(int i2, int i3, int i5) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        Context context = this.zza;
        float fZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3);
        zzgbb zzgbbVar = this.zzb;
        long j2 = i5;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j2, 0, fZzC, fZzC2, 0);
        zzgbbVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j2, 2, fZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3), 0);
        zzgbbVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        float fZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j2, 1, fZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i3), 0);
        zzgbbVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }

    zzclz(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdx)).intValue();
        int i2 = 2;
        if (iIntValue != 1) {
            if (iIntValue == 2 || iIntValue != 3) {
                i2 = 3;
            } else {
                i2 = 4;
            }
        }
        zzgbw zzgbwVarZze = zzgbx.zze();
        zzgbwVarZze.zza(((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdE)).floatValue());
        zzgbx zzgbxVar = (zzgbx) zzgbwVarZze.zzbu();
        zzgby zzgbyVarZzi = zzgbz.zzi();
        zzgbyVarZzi.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdF)).booleanValue());
        zzgbyVarZzi.zzb(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdH)).longValue());
        zzgbz zzgbzVar = (zzgbz) zzgbyVarZzi.zzbu();
        zzgbe zzgbeVarZzu = zzgbf.zzu();
        zzgbeVarZzu.zzi(i2);
        zzgbeVarZzu.zzb(versionInfoParcel.afmaVersion);
        zzgbeVarZzu.zza(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdb)).booleanValue());
        zzgbeVarZzu.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdu)).intValue() == -1);
        zzgbeVarZzu.zzg(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdw)).intValue());
        zzgbeVarZzu.zze(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdG)).longValue());
        zzgbeVarZzu.zzd(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdv)).intValue());
        zzgbeVarZzu.zzc(zzgbxVar);
        zzgbeVarZzu.zzf(zzgbzVar);
        zzgbb zzgbbVarZza = zzgbb.zza(context, zzcei.zza, (zzgbf) zzgbeVarZzu.zzbu());
        this.zzb = zzgbbVarZza;
        zzgbbVarZza.zzb();
    }
}
