package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;

    @Nullable
    private final zzape zzf = new zzape(178, 128);

    @Nullable
    private final zzer zzc = new zzer();

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzl = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        int i2;
        int i3 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzh += (long) zzerVar.zzd();
        this.zzj.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i5 = iZzi + 3;
            int i7 = zzerVar.zzi()[i5] & UByte.MAX_VALUE;
            int i8 = iZzi - iZzg;
            if (!this.zzk) {
                if (i8 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i9 = i8 < 0 ? -i8 : 0;
                zzaoq zzaoqVar = this.zze;
                if (zzaoqVar.zzb(i7, i9)) {
                    zzagh zzaghVar = this.zzj;
                    int i10 = zzaoqVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaoqVar.zzc, zzaoqVar.zza);
                    zzeq zzeqVar = new zzeq(bArrCopyOf, bArrCopyOf.length);
                    zzeqVar.zzo(i10);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(i3);
                    }
                    int iZzj = zzeqVar.zzj(4);
                    float f3 = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzeqVar.zzj(8);
                        int iZzj3 = zzeqVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f3 = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f3 = zza[iZzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f4 = f3;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                        }
                    }
                    if (zzeqVar.zzj(2) != 0) {
                        zzee.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzeqVar.zzg();
                    int iZzj4 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i11 = iZzj4 - 1;
                            int i12 = 0;
                            while (i11 > 0) {
                                i11 >>= 1;
                                i12++;
                            }
                            zzeqVar.zzh(i12);
                        }
                    }
                    zzeqVar.zzg();
                    int iZzj5 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int iZzj6 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl("video/mp2t");
                    zztVar.zzm("video/mp4v-es");
                    zztVar.zzt(iZzj5);
                    zztVar.zzu(iZzj6);
                    zztVar.zzz(f4);
                    zztVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzaghVar.zzz(zztVar.zzM());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzape zzapeVar = this.zzf;
            if (i8 > 0) {
                zzapeVar.zzd(bArrZzi, iZzg, iZzi);
                i2 = 0;
            } else {
                i2 = -i8;
            }
            if (zzapeVar.zze(i2)) {
                int iZza = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                zzer zzerVar2 = this.zzc;
                String str2 = zzfj.zza;
                zzerVar2.zzb(zzapeVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzerVar2);
            }
            if (i7 == 178) {
                if (zzerVar.zzi()[iZzi + 2] == 1) {
                    zzapeVar.zzc(178);
                }
                i7 = 178;
            }
            int i13 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i13), i13, this.zzk);
            this.zzg.zzb(i7, this.zzl);
            iZzg = i5;
            i3 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z2) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }

    zzaos(@Nullable zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = zzaghVarZzu;
        this.zzg = new zzaor(zzaghVarZzu);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }
}
