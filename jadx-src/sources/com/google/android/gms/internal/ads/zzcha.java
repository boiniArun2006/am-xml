package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcha {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzatm zzatmVar;
        zzatl zzatlVar;
        long j2 = this.zza;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzath(new zzcgz(byteBufferDuplicate), zzche.zzb).zzc().iterator();
            while (true) {
                zzatmVar = null;
                if (!it.hasNext()) {
                    zzatlVar = null;
                    break;
                }
                zzatj zzatjVar = (zzatj) it.next();
                if (zzatjVar instanceof zzatl) {
                    zzatlVar = (zzatl) zzatjVar;
                    break;
                }
            }
            Iterator it2 = zzatlVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzatj zzatjVar2 = (zzatj) it2.next();
                if (zzatjVar2 instanceof zzatm) {
                    zzatmVar = (zzatm) zzatjVar2;
                    break;
                }
            }
            long jZzd = (zzatmVar.zzd() * 1000) / zzatmVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
