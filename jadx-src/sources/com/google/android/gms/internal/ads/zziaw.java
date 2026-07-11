package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zziaw extends zziae {
    private static final boolean zza = zziem.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zziaw() {
        throw null;
    }

    static int zzz(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public abstract void zzH(int i2, int i3) throws IOException;

    public abstract void zzI(int i2, int i3) throws IOException;

    public abstract void zzJ(int i2, int i3) throws IOException;

    public abstract void zzK(int i2, int i3) throws IOException;

    public abstract void zzL(int i2, long j2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i2, long j2) throws IOException;

    public abstract void zzi(int i2, boolean z2) throws IOException;

    public abstract void zzj(int i2, String str) throws IOException;

    public abstract void zzk(int i2, zzian zzianVar) throws IOException;

    public abstract void zzl(zzian zzianVar) throws IOException;

    abstract void zzm(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzn(int i2, zzidc zzidcVar) throws IOException;

    public abstract void zzo(int i2, zzian zzianVar) throws IOException;

    public abstract void zzp(zzidc zzidcVar) throws IOException;

    public abstract void zzq(byte b2) throws IOException;

    public abstract void zzr(int i2) throws IOException;

    public abstract void zzs(int i2) throws IOException;

    public abstract void zzt(int i2) throws IOException;

    public abstract void zzu(long j2) throws IOException;

    public abstract void zzv(long j2) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    /* synthetic */ zziaw(byte[] bArr) {
    }

    public static int zzA(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zzB(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int zzC(zzidc zzidcVar) {
        int iZzbr = zzidcVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    public final void zzD() {
        if (zzb() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
