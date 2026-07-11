package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class zzatf implements zzatg {
    private static final Logger zzb = Logger.getLogger(zzatf.class.getName());
    final ThreadLocal zza = new zzate(this);

    public abstract zzatj zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzatg
    public final zzatj zzb(zzijs zzijsVar, zzatk zzatkVar) throws IOException {
        int iZza;
        long jZzb;
        String strZza;
        long jZzc = zzijsVar.zzc();
        ThreadLocal threadLocal = this.zza;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iZza = zzijsVar.zza((ByteBuffer) threadLocal.get());
            if (iZza == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jZza = zzati.zza((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (jZza < 8 && jZza > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZza);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, com.google.android.exoplayer2.C.ISO88591_NAME);
                    if (jZza == 1) {
                        ThreadLocal threadLocal2 = this.zza;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        zzijsVar.zza((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jZzb = zzati.zzd((ByteBuffer) threadLocal2.get()) - 16;
                    } else if (jZza == 0) {
                        jZzb = zzijsVar.zzb() - zzijsVar.zzc();
                    } else {
                        jZzb = jZza - 8;
                    }
                    if ("uuid".equals(str)) {
                        ThreadLocal threadLocal3 = this.zza;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzijsVar.zza((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j2 = jZzb;
                    if (zzatkVar instanceof zzatj) {
                        strZza = ((zzatj) zzatkVar).zza();
                    } else {
                        strZza = "";
                    }
                    zzatj zzatjVarZza = zza(str, bArr, strZza);
                    ThreadLocal threadLocal4 = this.zza;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    zzatjVarZza.zzb(zzijsVar, (ByteBuffer) threadLocal4.get(), j2, this);
                    return zzatjVarZza;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (iZza >= 0);
        zzijsVar.zzd(jZzc);
        throw new EOFException();
    }
}
