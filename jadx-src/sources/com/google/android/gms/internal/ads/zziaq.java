package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zziaq {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zziaq() {
    }

    public static int zzK(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzL(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public abstract void zzA(int i2);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public abstract int zza() throws IOException;

    public abstract void zzb(int i2) throws zzicg;

    public abstract boolean zzc(int i2) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzian zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i2) throws zzicg;

    /* synthetic */ zziaq(byte[] bArr) {
    }

    public static zziaq zzF(InputStream inputStream, int i2) {
        if (inputStream != null) {
            return new zziap(inputStream, 4096, null);
        }
        byte[] bArr = zzice.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    static zziaq zzG(byte[] bArr, int i2, int i3, boolean z2) {
        zziao zziaoVar = new zziao(bArr, i2, i3, z2, null);
        try {
            zziaoVar.zzz(i3);
            return zziaoVar;
        } catch (zzicg e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zzM(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i5 = 7;
        while (i5 < 32) {
            int i7 = inputStream.read();
            if (i7 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i3 |= (i7 & 127) << i5;
            if ((i7 & 128) == 0) {
                return i3;
            }
            i5 += 7;
        }
        while (i5 < 64) {
            int i8 = inputStream.read();
            if (i8 == -1) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i8 & 128) == 0) {
                return i3;
            }
            i5 += 7;
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    public final void zzH() throws zzicg {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzicg {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza != 0) {
                zzH();
                this.zzb++;
                this.zzb--;
            } else {
                return;
            }
        } while (zzc(iZza));
    }
}
