package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaln {
    private final zzalo zza = new zzalo();
    private final zzer zzb = new zzer(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i2) {
        int i3;
        int i5 = 0;
        this.zzd = 0;
        do {
            int i7 = this.zzd;
            int i8 = i2 + i7;
            zzalo zzaloVar = this.zza;
            if (i8 >= zzaloVar.zzc) {
                break;
            }
            this.zzd = i7 + 1;
            i3 = zzaloVar.zzf[i8];
            i5 += i3;
        } while (i3 == 255);
        return i5;
    }

    public final zzalo zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzaev zzaevVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i2 = this.zzc;
            if (i2 < 0) {
                zzalo zzaloVar = this.zza;
                if (!zzaloVar.zzb(zzaevVar, -1L) || !zzaloVar.zzc(zzaevVar, true)) {
                    break;
                }
                int iZzf = zzaloVar.zzd;
                if ((zzaloVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i2 = this.zzd;
                } else {
                    i2 = 0;
                }
                if (!zzaey.zzd(zzaevVar, iZzf)) {
                    return false;
                }
                this.zzc = i2;
            }
            int iZzf2 = zzf(i2);
            int i3 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzer zzerVar = this.zzb;
                zzerVar.zzc(zzerVar.zze() + iZzf2);
                if (!zzaey.zzc(zzaevVar, zzerVar.zzi(), zzerVar.zze(), iZzf2)) {
                    return false;
                }
                zzerVar.zzf(zzerVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzerVar.zze())), zzerVar.zze());
    }

    zzaln() {
    }
}
