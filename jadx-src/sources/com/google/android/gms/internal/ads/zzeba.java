package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();

    @GuardedBy
    private final List zzd = new ArrayList();

    @GuardedBy
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdvl zzdvlVarZzc;
        zzdvl zzdvlVarZzc2;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqg zzbqgVar = (zzbqg) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkM)).booleanValue() || (zzdvlVarZzc2 = this.zzb.zzc(zzbqgVar.zza)) == null || (zzbwhVar = zzdvlVarZzc2.zzc) == null) ? "" : zzbwhVar.toString();
                    String str = string;
                    boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue() && (zzdvlVarZzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzdvlVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzbqgVar.zza;
                    list2.add(new zzeaz(str2, str, this.zzb.zzd(str2), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z2));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzeak zzeakVar = this.zza;
                    if (!zzeakVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzeakVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzeaz) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }
}
