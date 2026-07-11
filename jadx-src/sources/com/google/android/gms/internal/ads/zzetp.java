package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzetp implements zzfax {
    private final zzgzy zza;
    private final zzdvp zzb;
    private final zzeak zzc;
    private final zzetr zzd;

    public zzetp(zzgzy zzgzyVar, zzdvp zzdvpVar, zzeak zzeakVar, zzetr zzetrVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdvpVar;
        this.zzc = zzeakVar;
        this.zzd = zzetrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        zzbgv zzbgvVar = zzbhe.zznc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            zzetr zzetrVar = this.zzd;
            if (zzetrVar.zzd() != null) {
                zzetq zzetqVarZzd = zzetrVar.zzd();
                zzetqVarZzd.getClass();
                return zzgzo.zza(zzetqVarZzd);
            }
        }
        if (zzgrt.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbX)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgzo.zza(new zzetq(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeto
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzetq zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbX)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfki zzfkiVarZza = this.zzb.zza(str, new JSONObject());
                zzfkiVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznc)).booleanValue() || zZze) {
                    try {
                        zzbwh zzbwhVarZzC = zzfkiVarZza.zzC();
                        if (zzbwhVarZzC != null) {
                            bundle2.putString("sdk_version", zzbwhVarZzC.toString());
                        }
                    } catch (zzfjr unused) {
                    }
                }
                try {
                    zzbwh zzbwhVarZzB = zzfkiVarZza.zzB();
                    if (zzbwhVarZzB != null) {
                        bundle2.putString("adapter_version", zzbwhVarZzB.toString());
                    }
                } catch (zzfjr unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfjr unused3) {
            }
        }
        zzetq zzetqVar = new zzetq(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznc)).booleanValue()) {
            this.zzd.zzc(zzetqVar);
        }
        return zzetqVar;
    }
}
