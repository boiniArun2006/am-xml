package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzzz extends zzzs {
    private final boolean zze;
    private final zzzl zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zzs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgvz zzgvzVarZza = (zzzzVar.zze && zzzzVar.zzh) ? zzaaa.zzc : zzaaa.zzc.zza();
        zzgts zzgtsVarZzg = zzgts.zzg();
        boolean z2 = zzzzVar.zzf.zzF;
        return zzgtsVarZzg.zza(Integer.valueOf(zzzzVar.zzk), Integer.valueOf(zzzzVar2.zzk), zzgvzVarZza).zza(Integer.valueOf(zzzzVar.zzj), Integer.valueOf(zzzzVar2.zzj), zzgvzVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        zzzz zzzzVar = (zzzz) zzzsVar;
        if (!Objects.equals(this.zzd.zzo, zzzzVar.zzd.zzo)) {
            return false;
        }
        boolean z2 = this.zzf.zzN;
        return this.zzt == zzzzVar.zzt && this.zzu == zzzzVar.zzu;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzz(int i2, zzbg zzbgVar, int i3, zzzl zzzlVar, int i5, @Nullable String str, int i7, boolean z2) {
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int iZzj;
        boolean z6;
        boolean z7;
        boolean z9;
        boolean z10;
        int i10;
        byte b2;
        boolean z11;
        zzv zzvVar;
        int i11;
        int i12;
        int i13;
        zzv zzvVar2;
        int i14;
        int i15;
        int i16;
        super(i2, zzbgVar, i3);
        this.zzf = zzzlVar;
        int i17 = 1;
        if (true != zzzlVar.zzM) {
            i8 = 16;
        } else {
            i8 = 24;
        }
        if (!z2 || (((i14 = (zzvVar2 = this.zzd).zzv) != -1 && i14 > zzzlVar.zza) || ((i15 = zzvVar2.zzw) != -1 && i15 > zzzlVar.zzb))) {
            z3 = false;
        } else {
            float f3 = zzvVar2.zzz;
            if ((f3 == -1.0f || f3 <= zzzlVar.zzc) && ((i16 = zzvVar2.zzj) == -1 || i16 <= zzzlVar.zzd)) {
                z3 = true;
            }
        }
        this.zze = z3;
        if (!z2 || (((i11 = (zzvVar = this.zzd).zzv) != -1 && i11 < 0) || ((i12 = zzvVar.zzw) != -1 && i12 < 0))) {
            z4 = false;
        } else {
            float f4 = zzvVar.zzz;
            if ((f4 == -1.0f || f4 >= 0.0f) && ((i13 = zzvVar.zzj) == -1 || i13 >= 0)) {
                z4 = true;
            }
        }
        this.zzg = z4;
        this.zzh = zzmn.zzaa(i5, false);
        zzv zzvVar3 = this.zzd;
        float f5 = zzvVar3.zzz;
        if (f5 != -1.0f && f5 >= 10.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.zzi = z5;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i18 = 0;
        while (true) {
            i9 = Integer.MAX_VALUE;
            if (i18 < zzzlVar.zzo.size()) {
                iZzj = zzaaa.zzj(this.zzd, (String) zzzlVar.zzo.get(i18), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                iZzj = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.zzm = i18;
        this.zzn = iZzj;
        this.zzo = zzaaa.zzm(this.zzd.zzf, 0);
        int i19 = this.zzd.zzf;
        if (i19 == 0 || (i19 & 1) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.zzq = z6;
        if (zzaaa.zzi(str) == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.zzr = zzaaa.zzj(this.zzd, str, z7);
        int i20 = 0;
        while (true) {
            if (i20 >= zzzlVar.zzm.size()) {
                break;
            }
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzzlVar.zzm.get(i20))) {
                i9 = i20;
                break;
            }
            i20++;
        }
        this.zzl = i9;
        this.zzp = zzaaa.zzn(this.zzd, zzzlVar.zzn);
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 128) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzt = z9;
        if ((i5 & 64) == 64) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzu = z10;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzo;
        if (str3 == null) {
            i10 = 0;
        } else {
            i10 = 4;
            switch (str3.hashCode()) {
                case -1851077871:
                    b2 = str3.equals("video/dolby-vision") ? (byte) 0 : (byte) -1;
                    break;
                case -1662735862:
                    b2 = str3.equals("video/av01") ? (byte) 1 : (byte) -1;
                    break;
                case -1662541442:
                    b2 = str3.equals("video/hevc") ? (byte) 2 : (byte) -1;
                    break;
                case 1331836730:
                    b2 = str3.equals("video/avc") ? (byte) 4 : (byte) -1;
                    break;
                case 1599127257:
                    b2 = str3.equals("video/x-vnd.on2.vp9") ? (byte) 3 : (byte) -1;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 == 4) {
                                i10 = 1;
                            }
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 3;
                    }
                }
            } else {
                i10 = 5;
            }
        }
        this.zzv = i10;
        if ((zzvVar4.zzf & 16384) != 0) {
            i17 = 0;
        } else {
            zzzl zzzlVar2 = this.zzf;
            if (zzmn.zzaa(i5, zzzlVar2.zzV) && ((z11 = this.zze) || zzzlVar2.zzK)) {
                if (zzmn.zzaa(i5, false) && this.zzg && z11 && zzvVar4.zzj != -1 && (i8 & i5) != 0) {
                    i17 = 2;
                }
            }
        }
        this.zzs = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzzz zzzzVar, zzzz zzzzVar2) {
        zzgts zzgtsVarZza = zzgts.zzg().zzd(zzzzVar.zzh, zzzzVar2.zzh).zza(Integer.valueOf(zzzzVar.zzm), Integer.valueOf(zzzzVar2.zzm), zzgvz.zzb().zza()).zzb(zzzzVar.zzn, zzzzVar2.zzn).zzb(zzzzVar.zzo, zzzzVar2.zzo).zza(Integer.valueOf(zzzzVar.zzp), Integer.valueOf(zzzzVar2.zzp), zzgvz.zzb().zza()).zzd(zzzzVar.zzq, zzzzVar2.zzq).zzb(zzzzVar.zzr, zzzzVar2.zzr).zzd(zzzzVar.zzi, zzzzVar2.zzi).zzd(zzzzVar.zze, zzzzVar2.zze).zzd(zzzzVar.zzg, zzzzVar2.zzg).zza(Integer.valueOf(zzzzVar.zzl), Integer.valueOf(zzzzVar2.zzl), zzgvz.zzb().zza());
        boolean z2 = zzzzVar.zzt;
        zzgts zzgtsVarZzd = zzgtsVarZza.zzd(z2, zzzzVar2.zzt);
        boolean z3 = zzzzVar.zzu;
        zzgts zzgtsVarZzd2 = zzgtsVarZzd.zzd(z3, zzzzVar2.zzu);
        if (z2 && z3) {
            zzgtsVarZzd2 = zzgtsVarZzd2.zzb(zzzzVar.zzv, zzzzVar2.zzv);
        }
        return zzgtsVarZzd2.zze();
    }
}
