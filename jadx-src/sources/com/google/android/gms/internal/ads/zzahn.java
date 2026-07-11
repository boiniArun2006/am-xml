package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzahn extends zzahm {
    private final zzer zzb;
    private final zzer zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzahn(zzagh zzaghVar) {
        super(zzaghVar);
        this.zzb = new zzer(zzgm.zza);
        this.zzc = new zzer(4);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    protected final boolean zza(zzer zzerVar) throws zzahl {
        int iZzs = zzerVar.zzs();
        int i2 = iZzs >> 4;
        int i3 = iZzs & 15;
        if (i3 == 7) {
            this.zzg = i2;
            if (i2 != 5) {
                return true;
            }
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new zzahl(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    protected final boolean zzb(zzer zzerVar, long j2) throws zzat {
        int i2;
        int i3;
        int iZzs = zzerVar.zzs();
        long jZzy = zzerVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzer zzerVar2 = new zzer(new byte[zzerVar.zzd()]);
                zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar.zzd());
                zzadz zzadzVarZza = zzadz.zza(zzerVar2);
                this.zzd = zzadzVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zzadzVarZza.zzl);
                zztVar.zzt(zzadzVarZza.zzc);
                zztVar.zzu(zzadzVarZza.zzd);
                zztVar.zzz(zzadzVarZza.zzk);
                zztVar.zzp(zzadzVarZza.zza);
                this.zza.zzz(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            if (this.zzg == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.zzf) {
                if (i2 != 0) {
                    i3 = 1;
                }
            } else {
                i3 = i2;
            }
            zzer zzerVar3 = this.zzc;
            byte[] bArrZzi = zzerVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i5 = 4 - this.zzd;
            int i7 = 0;
            while (zzerVar.zzd() > 0) {
                zzerVar.zzm(zzerVar3.zzi(), i5, this.zzd);
                zzerVar3.zzh(0);
                zzer zzerVar4 = this.zzb;
                int iZzH = zzerVar3.zzH();
                zzerVar4.zzh(0);
                zzagh zzaghVar = this.zza;
                zzaghVar.zzc(zzerVar4, 4);
                zzaghVar.zzc(zzerVar, iZzH);
                i7 = i7 + 4 + iZzH;
            }
            this.zza.zze(j2 + (jZzy * 1000), i3, i7, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
