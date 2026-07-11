package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfla implements zzfkz {
    private final ConcurrentHashMap zza;
    private final zzflg zzb;
    private final zzflc zzc = new zzflc();

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Nullable
    public final synchronized zzfli zza(zzflj zzfljVar) {
        zzfli zzfliVarZzb;
        try {
            zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
            if (zzfkyVar != null) {
                zzfliVarZzb = zzfkyVar.zzb();
                if (zzfliVarZzb == null) {
                    this.zzc.zzb();
                }
                zzflw zzflwVarZzh = zzfkyVar.zzh();
                if (zzfliVarZzb != null) {
                    zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
                    zzbgj.zzb.zza.C0777zza c0777zzaZzs = zzbgj.zzb.zza.zzs();
                    c0777zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
                    zzbgj.zzb.zze.zza zzaVarZzq = zzbgj.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzflwVarZzh.zza);
                    zzaVarZzq.zzg(zzflwVarZzh.zzb);
                    c0777zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0777zzaZzs);
                    zzfliVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfliVarZzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfliVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzb(zzflj zzfljVar, zzfli zzfliVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfky zzfkyVar = (zzfky) concurrentHashMap.get(zzfljVar);
            zzfliVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzfkyVar == null) {
                zzflg zzflgVar = this.zzb;
                zzfky zzfkyVar2 = new zzfky(zzflgVar.zzd, zzflgVar.zze * 1000);
                if (concurrentHashMap.size() == zzflgVar.zzc) {
                    int i2 = zzflgVar.zzg;
                    int i3 = i2 - 1;
                    zzflj zzfljVar2 = null;
                    if (i2 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i3 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfky) entry.getValue()).zzd();
                                zzfljVar2 = (zzflj) entry.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfky) entry2.getValue()).zze();
                                zzfljVar2 = (zzflj) entry2.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i3 == 2) {
                        int iZzf = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfky) entry3.getValue()).zzf();
                                zzfljVar2 = (zzflj) entry3.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfljVar, zzfkyVar2);
                this.zzc.zzc();
                zzfkyVar = zzfkyVar2;
            }
            zZza = zzfkyVar.zza(zzfliVar);
            zzflc zzflcVar = this.zzc;
            zzflcVar.zze();
            zzflb zzflbVarZzf = zzflcVar.zzf();
            zzflw zzflwVarZzh = zzfkyVar.zzh();
            zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
            zzbgj.zzb.zza.C0777zza c0777zzaZzs = zzbgj.zzb.zza.zzs();
            c0777zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
            zzbgj.zzb.zzg.zza zzaVarZzs = zzbgj.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzflbVarZzf.zza);
            zzaVarZzs.zzg(zzflbVarZzf.zzb);
            zzaVarZzs.zzk(zzflwVarZzh.zzb);
            c0777zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0777zzaZzs);
            zzfliVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzc(zzflj zzfljVar) {
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar == null) {
            return true;
        }
        return zzfkyVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final zzflg zze() {
        return this.zzb;
    }

    private final void zzf() {
        Parcelable.Creator<zzflg> creator = zzflg.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhl)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzflg zzflgVar = this.zzb;
            sb.append(zzflgVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i2 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzflj) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i3 = 0; i3 < ((zzfky) entry.getValue()).zzc(); i3++) {
                    sb.append("[O]");
                }
                for (int iZzc = ((zzfky) entry.getValue()).zzc(); iZzc < zzflgVar.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfky) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i2 < zzflgVar.zzc) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Deprecated
    public final zzflj zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzflg zzflgVar = this.zzb;
        return new zzflk(zzmVar, str, new zzbzx(zzflgVar.zza).zza().zzj, zzflgVar.zzf, zzxVar);
    }

    public zzfla(zzflg zzflgVar) {
        this.zza = new ConcurrentHashMap(zzflgVar.zzd);
        this.zzb = zzflgVar;
    }
}
