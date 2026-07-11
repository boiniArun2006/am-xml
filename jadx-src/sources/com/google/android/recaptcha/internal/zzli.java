package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzli {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzlj zzc;

    private zzli() {
    }

    public static int zzF(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzG(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public abstract void zzA(int i2);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i2) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i2) throws zznn;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzle zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i2) throws zznn;

    /* synthetic */ zzli(zzlh zzlhVar) {
    }

    static zzli zzH(byte[] bArr, int i2, int i3, boolean z2) {
        zzlf zzlfVar = new zzlf(bArr, 0, 0, false, null);
        try {
            zzlfVar.zze(0);
            return zzlfVar;
        } catch (zznn e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void zzI() throws IOException {
        int iZzm;
        do {
            iZzm = zzm();
            if (iZzm != 0) {
                int i2 = this.zza;
                if (i2 < this.zzb) {
                    this.zza = i2 + 1;
                    this.zza--;
                } else {
                    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (zzE(iZzm));
    }
}
