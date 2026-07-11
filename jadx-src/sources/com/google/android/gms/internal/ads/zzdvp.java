package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdvp {
    private final zzfkg zza;
    private final zzdvm zzb;

    zzdvp(zzfkg zzfkgVar, zzdvm zzdvmVar) {
        this.zza = zzfkgVar;
        this.zzb = zzdvmVar;
    }

    public final zzfki zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbtw zzbtwVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbtwVarZzb = new zzbuu(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbtwVarZzb = new zzbuu(new zzbwl());
            } else {
                zzbtt zzbttVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbtwVarZzb = zzbttVarZzd.zzc(string) ? zzbttVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbttVarZzd.zzd(string) ? zzbttVarZzd.zzb(string) : zzbttVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e2);
                        zzbtwVarZzb = zzbttVarZzd.zzb(str);
                    }
                } else {
                    zzbtwVarZzb = zzbttVarZzd.zzb(str);
                }
            }
            zzfki zzfkiVar = new zzfki(zzbtwVarZzb);
            this.zzb.zza(str, zzfkiVar);
            return zzfkiVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfjr(th);
        }
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    @VisibleForTesting
    final zzbtt zzd() throws RemoteException {
        zzbtt zzbttVarZzd = this.zza.zzd();
        if (zzbttVarZzd != null) {
            return zzbttVarZzd;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbvs zzb(String str) throws RemoteException {
        zzbvs zzbvsVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbvsVarZze);
        return zzbvsVarZze;
    }
}
