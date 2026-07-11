package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzyx extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzzl zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzyx(int i2, zzbg zzbgVar, int i3, zzzl zzzlVar, int i5, boolean z2, zzgrd zzgrdVar, int i7) {
        int i8;
        int iZzj;
        byte b2;
        boolean z3;
        int iZzj2;
        boolean z4;
        super(i2, zzbgVar, i3);
        this.zzh = zzzlVar;
        int i9 = 1;
        int i10 = true != zzzlVar.zzT ? 16 : 24;
        this.zzg = zzaaa.zzi(this.zzd.zzd);
        this.zzi = zzmn.zzaa(i5, false);
        int i11 = 0;
        while (true) {
            i8 = Integer.MAX_VALUE;
            if (i11 >= zzzlVar.zzq.size()) {
                iZzj = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaa.zzj(this.zzd, (String) zzzlVar.zzq.get(i11), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.zzk = i11;
        this.zzj = iZzj;
        this.zzl = zzaaa.zzm(this.zzd.zzf, 0);
        this.zzm = zzaaa.zzn(this.zzd, zzzlVar.zzr);
        zzv zzvVar = this.zzd;
        int i12 = zzvVar.zzf;
        this.zzn = i12 == 0 || (i12 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    b2 = 0;
                }
                if (b2 != 0) {
                }
            } else if (iHashCode != 187078297) {
                b2 = (iHashCode == 1504698186 && str.equals(MimeTypes.AUDIO_IAMF)) ? (byte) 2 : (byte) -1;
                z3 = b2 != 0 || b2 == 1 || b2 == 2;
            } else {
                if (str.equals("audio/ac4")) {
                    b2 = 1;
                }
                if (b2 != 0) {
                }
            }
        }
        this.zzx = z3;
        int i13 = zzvVar.zzG;
        this.zzr = i13;
        this.zzs = zzvVar.zzH;
        int i14 = zzvVar.zzj;
        this.zzt = i14;
        this.zzf = (i14 == -1 || i14 <= zzzlVar.zzu) && (i13 == -1 || i13 <= zzzlVar.zzt) && zzgrdVar.zza(zzvVar);
        String str2 = zzfj.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            strArrSplit[i15] = zzfj.zzh(strArrSplit[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= strArrSplit.length) {
                iZzj2 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzaaa.zzj(this.zzd, strArrSplit[i16], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzo = i16;
        this.zzp = iZzj2;
        int i17 = 0;
        while (true) {
            if (i17 >= zzzlVar.zzv.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzzlVar.zzv.get(i17))) {
                i8 = i17;
                break;
            }
            i17++;
        }
        this.zzu = i8;
        this.zzv = (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 128;
        this.zzw = (i5 & 64) == 64;
        zzzl zzzlVar2 = this.zzh;
        if (zzmn.zzaa(i5, zzzlVar2.zzV) && ((z4 = this.zzf) || zzzlVar2.zzO)) {
            int i18 = zzzlVar2.zzw.zzb;
            if (zzmn.zzaa(i5, false) && z4 && this.zzd.zzj != -1 && ((zzzlVar2.zzX || !z2) && (i10 & i5) != 0)) {
                i9 = 2;
            }
        } else {
            i9 = 0;
        }
        this.zze = i9;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyx zzyxVar) {
        boolean z2 = this.zzf;
        zzgvz zzgvzVarZza = (z2 && this.zzi) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzi, zzyxVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyxVar.zzk), zzgvz.zzb().zza()).zzb(this.zzj, zzyxVar.zzj).zzb(this.zzl, zzyxVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyxVar.zzm), zzgvz.zzb().zza()).zzd(this.zzq, zzyxVar.zzq).zzd(this.zzn, zzyxVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyxVar.zzo), zzgvz.zzb().zza()).zzb(this.zzp, zzyxVar.zzp).zzd(z2, zzyxVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyxVar.zzu), zzgvz.zzb().zza());
        boolean z3 = this.zzh.zzF;
        zzgts zzgtsVarZza2 = zzgtsVarZza.zzd(this.zzv, zzyxVar.zzv).zzd(this.zzw, zzyxVar.zzw).zzd(this.zzx, zzyxVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyxVar.zzr), zzgvzVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyxVar.zzs), zzgvzVarZza);
        if (Objects.equals(this.zzg, zzyxVar.zzg)) {
            zzgtsVarZza2 = zzgtsVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyxVar.zzt), zzgvzVarZza);
        }
        return zzgtsVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        String str;
        int i2;
        zzyx zzyxVar = (zzyx) zzzsVar;
        boolean z2 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i3 = zzvVar.zzG;
        if (i3 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyxVar.zzd;
        return i3 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i2 = zzvVar.zzH) != -1 && i2 == zzvVar2.zzH && this.zzv == zzyxVar.zzv && this.zzw == zzyxVar.zzw;
    }
}
