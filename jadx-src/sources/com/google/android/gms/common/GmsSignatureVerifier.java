package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzah;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza("com.google.android.gms");
        zzaaVar.zzb(204200000L);
        zzm zzmVar = zzo.zzf;
        zzaaVar.zzc(zzah.zzm(zzmVar.zzc(), zzo.zzd.zzc(), zzo.zzb.zzc()));
        zzm zzmVar2 = zzo.zze;
        byte[] bArrZzc = zzmVar2.zzc();
        zzm zzmVar3 = zzo.zzc;
        zzaaVar.zzd(zzah.zzm(bArrZzc, zzmVar3.zzc(), zzo.zza.zzc()));
        zza = zzaaVar.zze();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.zza("com.android.vending");
        zzaaVar2.zzb(82240000L);
        zzaaVar2.zzc(zzah.zzk(zzmVar.zzc()));
        zzaaVar2.zzd(zzah.zzl(zzmVar2.zzc(), zzmVar3.zzc()));
        zzb = zzaaVar2.zze();
        zzc = new HashMap();
    }
}
