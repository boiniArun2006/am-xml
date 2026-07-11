package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzich extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i2 = this.zzg[this.zze + this.zzh] & UByte.MAX_VALUE;
            zzb(1);
            return i2;
        }
        int iZzq = zziem.zzq(((long) this.zze) + this.zzi) & UByte.MAX_VALUE;
        zzb(1);
        return iZzq;
    }

    private final boolean zza() {
        ByteBuffer byteBuffer;
        do {
            this.zzd++;
            if (!this.zza.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.zze = this.zzb.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zziem.zzr(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    private final void zzb(int i2) {
        int i3 = this.zze + i2;
        this.zze = i3;
        if (i3 == this.zzb.limit()) {
            zza();
        }
    }

    zzich(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (!zza()) {
            this.zzb = zzice.zzc;
            this.zze = 0;
            this.zzi = 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int iLimit = this.zzb.limit();
        int i5 = this.zze;
        int i7 = iLimit - i5;
        if (i3 > i7) {
            i3 = i7;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i5 + this.zzh, bArr, i2, i3);
            zzb(i3);
            return i3;
        }
        int iPosition = this.zzb.position();
        this.zzb.position(this.zze);
        this.zzb.get(bArr, i2, i3);
        this.zzb.position(iPosition);
        zzb(i3);
        return i3;
    }
}
