package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;

    @Nullable
    private zzaeu zzb;

    @Nullable
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzj zzjVar, Uri uri, Map map, long j2, long j3, zzaex zzaexVar) throws IOException {
        boolean z2;
        zzael zzaelVar = new zzael(zzjVar, j2, j3);
        this.zzc = zzaelVar;
        if (this.zzb != null) {
            return;
        }
        zzaeu[] zzaeuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzaeuVarArrZzb.length;
        zzguc zzgucVarZzv = zzguf.zzv(length);
        if (length == 1) {
            this.zzb = zzaeuVarArrZzb[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                zzaeu zzaeuVar = zzaeuVarArrZzb[i2];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaelVar.zzn() == j2) {
                    }
                } catch (Throwable th) {
                    zzgrc.zzi(this.zzb != null || zzaelVar.zzn() == j2);
                    zzaelVar.zzl();
                    throw th;
                }
                if (zzaeuVar.zza(zzaelVar)) {
                    this.zzb = zzaeuVar;
                    zzgrc.zzi(true);
                    zzaelVar.zzl();
                    break;
                } else {
                    zzgucVarZzv.zzh(zzaeuVar.zzb());
                    if (this.zzb != null || zzaelVar.zzn() == j2) {
                        z2 = true;
                    }
                    zzgrc.zzi(z2);
                    zzaelVar.zzl();
                    i2++;
                }
                z2 = false;
                zzgrc.zzi(z2);
                zzaelVar.zzl();
                i2++;
            }
            if (this.zzb == null) {
                String strZzd = zzgqw.zzd(zzgvf.zzc(zzguf.zzr(zzaeuVarArrZzb), zzvl.zza), ", ");
                StringBuilder sb = new StringBuilder(strZzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzd);
                sb.append(") could read the stream.");
                throw new zzyo(sb.toString(), uri, zzgucVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j2, long j3) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
