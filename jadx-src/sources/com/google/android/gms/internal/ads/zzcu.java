package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzcu implements zzco {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;

    @Nullable
    private zzct zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public final void zzk(@FloatRange float f3) {
        zzgrc.zza(f3 > 0.0f);
        if (this.zzc != f3) {
            this.zzc = f3;
            this.zzi = true;
        }
    }

    public final void zzl(@FloatRange float f3) {
        zzgrc.zza(f3 > 0.0f);
        if (this.zzd != f3) {
            this.zzd = f3;
            this.zzi = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j2) {
        if (this.zzn < 1024) {
            return (long) (j2 / ((double) this.zzc));
        }
        long j3 = this.zzm;
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        long jZza = j3 - ((long) zzctVar.zza());
        int i2 = this.zzh.zzb;
        int i3 = this.zzg.zzb;
        return i2 == i3 ? zzfj.zzt(j2, this.zzn, jZza, RoundingMode.DOWN) : zzfj.zzt(j2, this.zzn * ((long) i3), jZza * ((long) i2), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcl zzb(zzcl zzclVar) throws zzcn {
        int i2 = zzclVar.zzd;
        if (i2 != 2 && i2 != 4) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i3 = this.zzb;
        if (i3 == -1) {
            i3 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i3, zzclVar.zzc, i2);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        zzct zzctVar = this.zzj;
        if (zzctVar != null) {
            zzctVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final ByteBuffer zzf() {
        int iZzf;
        zzct zzctVar = this.zzj;
        if (zzctVar != null && (iZzf = zzctVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                this.zzk = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzctVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += (long) iZzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zzco.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        zzct zzctVar = this.zzj;
        return zzctVar == null || zzctVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final long zzm(long j2) {
        if (this.zzn < 1024) {
            return (long) (((double) this.zzc) * j2);
        }
        long j3 = this.zzm;
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        long jZza = j3 - ((long) zzctVar.zza());
        int i2 = this.zzh.zzb;
        int i3 = this.zzg.zzb;
        return i2 == i3 ? zzfj.zzt(j2, jZza, this.zzn, RoundingMode.DOWN) : zzfj.zzt(j2, jZza * ((long) i2), this.zzn * ((long) i3), RoundingMode.DOWN);
    }

    public zzcu() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzco.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzct zzctVar = this.zzj;
        zzctVar.getClass();
        this.zzm += (long) byteBuffer.remaining();
        zzctVar.zzb(byteBuffer);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(zzcm zzcmVar) {
        boolean z2;
        if (zzc()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                int i2 = zzclVar.zzb;
                int i3 = zzclVar.zzc;
                float f3 = this.zzc;
                float f4 = this.zzd;
                int i5 = zzclVar2.zzb;
                if (zzclVar.zzd == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.zzj = new zzct(i2, i3, f3, f4, i5, z2);
            } else {
                zzct zzctVar = this.zzj;
                if (zzctVar != null) {
                    zzctVar.zze();
                }
            }
        }
        this.zzl = zzco.zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }
}
