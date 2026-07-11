package com.google.android.gms.internal.fido;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzhs implements Closeable {
    private final InputStream zza;
    private zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final zzht zzd = zzht.zza();

    private final void zzk(byte[] bArr, int i2) throws IOException {
        int i3 = 0;
        while (i3 != i2) {
            int i5 = this.zza.read(bArr, i3, i2 - i3);
            if (i5 == -1) {
                throw new EOFException();
            }
            i3 += i5;
        }
        this.zzb = null;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() < 24) {
            long jZza = this.zzb.zza();
            this.zzb = null;
            return jZza;
        }
        if (this.zzb.zza() == 24) {
            int i2 = this.zza.read();
            if (i2 == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return ((long) i2) & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j2 = bArr2[0];
            long j3 = bArr2[1];
            return (((long) bArr2[3]) & 255) | ((j3 & 255) << 16) | ((j2 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.zzb.zza()), Integer.valueOf(this.zzb.zzc())));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        long j4 = bArr3[0];
        long j5 = bArr3[1];
        long j6 = bArr3[2];
        long j7 = bArr3[3];
        return (((long) bArr3[7]) & 255) | ((j6 & 255) << 40) | ((j4 & 255) << 56) | ((j5 & 255) << 48) | ((j7 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(ByteCompanionObject.MIN_VALUE);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh);
        }
        return jZzh;
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long jZzh = zzh();
        if (jZzh < 0 || jZzh > DurationKt.MAX_MILLIS) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jZzh > 0) {
            this.zzd.zzg(jZzh + jZzh);
        }
        return jZzh;
    }

    public final zzhr zzd() throws IOException {
        if (this.zzb == null) {
            int i2 = this.zza.read();
            if (i2 == -1) {
                this.zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(i2);
            this.zzb = zzhrVar;
            byte bZzb = zzhrVar.zzb();
            if (bZzb == -128 || bZzb == -96 || bZzb == -64) {
                this.zzd.zzd();
                this.zzd.zzf();
            } else {
                if (bZzb != -32) {
                    if (bZzb != 0 && bZzb != 32) {
                        if (bZzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (bZzb != 96) {
                                throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.zzb.zzc())));
                            }
                            this.zzd.zze(-2L);
                        }
                    }
                    this.zzd.zzf();
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
                this.zzd.zzd();
                this.zzd.zzf();
            }
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iZzh = (int) zzh();
        if (iZzh == 20) {
            return false;
        }
        if (iZzh == 21) {
            return true;
        }
        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }

    public zzhs(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() != 31) {
        } else {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.zzb.zza())));
        }
    }

    private final void zzj(byte b2) throws IOException {
        zzd();
        if (this.zzb.zzb() == b2) {
        } else {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b2 >> 5) & 7), Integer.valueOf(this.zzb.zzc())));
        }
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long jZzh = zzh();
        if (jZzh >= 0 && jZzh <= 2147483647L) {
            if (this.zza.available() >= jZzh) {
                int i2 = (int) jZzh;
                byte[] bArr = new byte[i2];
                zzk(bArr, i2);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
    }

    public final long zzb() throws IOException {
        boolean z2;
        zzd();
        if (this.zzb.zzb() == 0) {
            z2 = true;
        } else if (this.zzb.zzb() == 32) {
            z2 = false;
        } else {
            throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.zzb.zzc())));
        }
        long jZzh = zzh();
        if (jZzh >= 0) {
            if (z2) {
                return jZzh;
            }
            return ~jZzh;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }
}
