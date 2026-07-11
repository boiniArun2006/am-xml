package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzakb {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakf zzc;
    private int zze;
    private int zzf;

    public static long zza(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static int zze(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract double zza() throws IOException;

    public abstract int zza(int i2) throws zzalf;

    public abstract float zzb() throws IOException;

    public abstract void zzb(int i2) throws zzalf;

    public abstract int zzc();

    public abstract void zzc(int i2);

    public abstract int zzd() throws IOException;

    public abstract boolean zzd(int i2) throws IOException;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzajp zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    private zzakb() {
        this.zzf = zzd;
        this.zzb = Integer.MAX_VALUE;
    }

    static zzakb zza(byte[] bArr, int i2, int i3, boolean z2) {
        zzaka zzakaVar = new zzaka(bArr, i2, i3, z2);
        try {
            zzakaVar.zza(i3);
            return zzakaVar;
        } catch (zzalf e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void zzv() throws zzalf {
        if (this.zza + this.zze >= this.zzf) {
            throw zzalf.zzh();
        }
    }

    public final void zzw() throws zzalf {
        if (this.zze == 0) {
            zzb(0);
        }
    }

    public final void zzx() throws IOException {
        int iZzi;
        do {
            iZzi = zzi();
            if (iZzi != 0) {
                zzv();
                this.zze++;
                this.zze--;
            } else {
                return;
            }
        } while (zzd(iZzi));
    }
}
