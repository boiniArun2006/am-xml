package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcyq implements zzdel, zzdjy {
    private zzbzn zza;
    private final Context zzc;
    private final zzfor zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        zzbzn zzbznVar;
        int i2;
        int i3;
        zzbsz zzbszVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbje.zzo.zze()).booleanValue()) {
                i2 = 2;
                i3 = i2 - 1;
                if (i3 != 1) {
                    zzbszVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i3 == 2) {
                    zzbszVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                zzbst zzbstVar = zzbsw.zza;
                this.zza = new zzbzq(this.zzc, zzbszVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), this.zze, this.zzf);
                this.zzg = true;
            } else {
                i2 = 3;
                if (!((Boolean) zzbje.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzbje.zzn.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i2 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                            }
                        } catch (JSONException unused) {
                        }
                        i2 = 1;
                    } else {
                        i2 = 1;
                    }
                }
                i3 = i2 - 1;
                if (i3 != 1) {
                }
                zzbst zzbstVar2 = zzbsw.zza;
                this.zza = new zzbzq(this.zzc, zzbszVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbstVar2, zzbstVar2), this.zze, this.zzf);
                this.zzg = true;
            }
        }
        if (this.zzg && (zzbznVar = this.zza) != null) {
            com.google.common.util.concurrent.Xo xoZzb = zzbznVar.zzb();
            if (!this.zzh && ((Boolean) zzbiw.zzi.zze()).booleanValue()) {
                xoZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzcel.zza(xoZzb, "persistFlagsClient");
        }
    }

    final /* synthetic */ void zzf() {
        zzbgp.zze(this.zzc);
        this.zzh = true;
    }

    zzcyq(Context context, zzfor zzforVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzforVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
        zzc();
    }
}
