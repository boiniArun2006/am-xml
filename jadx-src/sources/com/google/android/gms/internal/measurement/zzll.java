package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzll extends zzky {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzll.class.getName());
    private static final boolean zzd = zzoo.zza();
    zzlm zza;

    private zzll() {
        throw null;
    }

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zzb(int i2, int i3) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzd(int i2, int i3) throws IOException;

    public abstract void zze(int i2, long j2) throws IOException;

    public abstract void zzf(int i2, long j2) throws IOException;

    public abstract void zzg(int i2, boolean z2) throws IOException;

    public abstract void zzh(int i2, String str) throws IOException;

    public abstract void zzi(int i2, zzlg zzlgVar) throws IOException;

    public abstract void zzj(zzlg zzlgVar) throws IOException;

    abstract void zzk(byte[] bArr, int i2, int i3) throws IOException;

    abstract void zzl(int i2, zznl zznlVar, zznw zznwVar) throws IOException;

    public abstract void zzm(int i2, zznl zznlVar) throws IOException;

    public abstract void zzn(int i2, zzlg zzlgVar) throws IOException;

    public abstract void zzo(zznl zznlVar) throws IOException;

    public abstract void zzp(byte b2) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2) throws IOException;

    public abstract void zzs(int i2) throws IOException;

    public abstract void zzt(long j2) throws IOException;

    public abstract void zzu(long j2) throws IOException;

    public abstract void zzw(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract int zzy();

    /* synthetic */ zzll(byte[] bArr) {
    }

    static int zzD(zznl zznlVar, zznw zznwVar) {
        int iZzcd = ((zzkr) zznlVar).zzcd(zznwVar);
        return zzz(iZzcd) + iZzcd;
    }

    @Deprecated
    static int zzG(int i2, zznl zznlVar, zznw zznwVar) {
        int iZzz = zzz(i2 << 3);
        return iZzz + iZzz + ((zzkr) zznlVar).zzcd(zznwVar);
    }

    final void zzF(String str, zzoq zzoqVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzoqVar);
        byte[] bytes = str.getBytes(zzmo.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zzw(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(e2);
        }
    }

    public static int zzA(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzor.zzb(str);
        } catch (zzoq unused) {
            length = str.getBytes(zzmo.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zznl zznlVar) {
        int iZzcn = zznlVar.zzcn();
        return zzz(iZzcn) + iZzcn;
    }

    public static int zzz(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzy() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
