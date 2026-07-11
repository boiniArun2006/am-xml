package com.google.android.gms.internal.p002firebaseauthapi;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzakg extends zzajm {
    private static final Logger zza = Logger.getLogger(zzakg.class.getName());
    private static final boolean zzb = zzanp.zzc();
    zzakj zze;

    private static abstract class zza extends zzakg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        zza(int i2) {
            super();
            if (i2 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i2, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zzb(int i2) {
            if (!zzakg.zzb) {
                while ((i2 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    bArr[i3] = (byte) (i2 | 128);
                    this.zzd++;
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                bArr2[i5] = (byte) i2;
                this.zzd++;
                return;
            }
            long j2 = this.zzc;
            while ((i2 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                zzanp.zza(bArr3, i7, (byte) (i2 | 128));
                i2 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i8 = this.zzc;
            this.zzc = i8 + 1;
            zzanp.zza(bArr4, i8, (byte) i2);
            this.zzd += (int) (((long) this.zzc) - j2);
        }

        final void zza(byte b2) {
            int i2 = this.zzc;
            this.zza[i2] = b2;
            this.zzc = i2 + 1;
            this.zzd++;
        }

        final void zza(int i2) {
            int i3 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = i2 >> 24;
            this.zzc = i3 + 4;
            this.zzd += 4;
        }

        final void zzb(long j2) {
            if (zzakg.zzb) {
                long j3 = this.zzc;
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzanp.zza(bArr, i2, (byte) (((int) j2) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzanp.zza(bArr2, i3, (byte) j2);
                this.zzd += (int) (((long) this.zzc) - j3);
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                bArr3[i5] = (byte) (((int) j2) | 128);
                this.zzd++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr4[i7] = (byte) j2;
            this.zzd++;
        }

        final void zza(long j2) {
            int i2 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.zzc = i2 + 8;
            this.zzd += 8;
        }

        final void zza(int i2, int i3) {
            zzb((i2 << 3) | i3);
        }
    }

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zzb(int i2, int i3, int i5, Throwable th) {
            this(i2, i3, i5, th);
        }

        private zzb(long j2, long j3, int i2, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)), th);
        }
    }

    private static class zzc extends zzakg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        zzc(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException(V8ValueTypedArray.PROPERTY_BUFFER);
            }
            if (((bArr.length - i3) | i3) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i3;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b2) throws IOException {
            int i2 = this.zzc;
            try {
                int i3 = i2 + 1;
                try {
                    this.zza[i2] = b2;
                    this.zzc = i3;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i3;
                    throw new zzb(i2, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i2, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i2);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i2, long j2) throws IOException {
            zzk(i2, 1);
            zzh(j2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i2, int i3) throws IOException {
            zzk(i2, 5);
            zzk(i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i2, int i3) throws IOException {
            zzk(i2, 0);
            zzl(i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i2) throws IOException {
            int i3 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i3] = (byte) i2;
                bArr[i3 + 1] = (byte) (i2 >> 8);
                bArr[i3 + 2] = (byte) (i2 >> 16);
                bArr[i3 + 3] = i2 >> 24;
                this.zzc = i3 + 4;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(i3, this.zzb, 4, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i2) throws IOException {
            if (i2 >= 0) {
                zzn(i2);
            } else {
                zzj(i2);
            }
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
                this.zzc += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(this.zzc, this.zzb, i3, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j2) throws IOException {
            int i2;
            int i3;
            int i5 = this.zzc;
            if (!zzakg.zzb || zza() < 10) {
                while ((j2 & (-128)) != 0) {
                    try {
                        i3 = i5 + 1;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                    }
                    try {
                        this.zza[i5] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i5 = i3;
                    } catch (IndexOutOfBoundsException e3) {
                        e = e3;
                        i5 = i3;
                        throw new zzb(i5, this.zzb, 1, (Throwable) e);
                    }
                }
                i2 = i5 + 1;
                try {
                    this.zza[i5] = (byte) j2;
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i5 = i2;
                    throw new zzb(i5, this.zzb, 1, (Throwable) e);
                }
            } else {
                while ((j2 & (-128)) != 0) {
                    zzanp.zza(this.zza, i5, (byte) (((int) j2) | 128));
                    j2 >>>= 7;
                    i5++;
                }
                i2 = i5 + 1;
                zzanp.zza(this.zza, i5, (byte) j2);
            }
            this.zzc = i2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i2) throws IOException {
            int i3;
            int i5 = this.zzc;
            while ((i2 & (-128)) != 0) {
                try {
                    i3 = i5 + 1;
                    try {
                        this.zza[i5] = (byte) (i2 | 128);
                        i2 >>>= 7;
                        i5 = i3;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i5 = i3;
                        throw new zzb(i5, this.zzb, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    throw new zzb(i5, this.zzb, 1, (Throwable) e);
                }
            }
            i3 = i5 + 1;
            this.zza[i5] = (byte) i2;
            this.zzc = i3;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j2) throws IOException {
            int i2 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i2] = (byte) j2;
                bArr[i2 + 1] = (byte) (j2 >> 8);
                bArr[i2 + 2] = (byte) (j2 >> 16);
                bArr[i2 + 3] = (byte) (j2 >> 24);
                bArr[i2 + 4] = (byte) (j2 >> 32);
                bArr[i2 + 5] = (byte) (j2 >> 40);
                bArr[i2 + 6] = (byte) (j2 >> 48);
                bArr[i2 + 7] = (byte) (j2 >> 56);
                this.zzc = i2 + 8;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(i2, this.zzb, 8, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i2, int i3) throws IOException {
            zzk(i2, 0);
            zzn(i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, boolean z2) throws IOException {
            zzk(i2, 0);
            zzb(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i2, zzajp zzajpVar) throws IOException {
            zzk(i2, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzn(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        final void zzc(int i2, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i2, 2);
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza(zzamcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i2, int i3) throws IOException {
            zzn((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza(zzamcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i2);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i2, long j2) throws IOException {
            zzk(i2, 0);
            zzj(j2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, String str) throws IOException {
            zzk(i2, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int i2 = this.zzc;
            try {
                int iZzj = zzakg.zzj(str.length() * 3);
                int iZzj2 = zzakg.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i3 = i2 + iZzj2;
                    this.zzc = i3;
                    int iZza = zzant.zza(str, this.zza, i3, zza());
                    this.zzc = i2;
                    zzn((iZza - i2) - iZzj2);
                    this.zzc = iZza;
                    return;
                }
                zzn(zzant.zza(str));
                this.zzc = zzant.zza(str, this.zza, this.zzc, zza());
            } catch (zzanx e2) {
                this.zzc = i2;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }
    }

    private static final class zzd extends zza {
        private final OutputStream zzf;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b2) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i2, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i2);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i2, int i3) throws IOException {
            zzo(14);
            zza(i2, 5);
            zza(i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i2) throws IOException {
            zzo(4);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i2) throws IOException {
            if (i2 >= 0) {
                zzn(i2);
            } else {
                zzj(i2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i2) throws IOException {
            zzo(5);
            zzb(i2);
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i2) throws IOException {
            if (this.zzb - this.zzc < i2) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i2, long j2) throws IOException {
            zzo(18);
            zza(i2, 1);
            zza(j2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i2, int i3) throws IOException {
            zzo(20);
            zza(i2, 0);
            if (i3 >= 0) {
                zzb(i3);
            } else {
                zzb(i3);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j2) throws IOException {
            zzo(10);
            zzb(j2);
        }

        zzd(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            int i5 = this.zzb;
            int i7 = this.zzc;
            if (i5 - i7 >= i3) {
                System.arraycopy(bArr, i2, this.zza, i7, i3);
                this.zzc += i3;
            } else {
                int i8 = i5 - i7;
                System.arraycopy(bArr, i2, this.zza, i7, i8);
                int i9 = i2 + i8;
                i3 -= i8;
                this.zzc = this.zzb;
                this.zzd += i8;
                zze();
                if (i3 <= this.zzb) {
                    System.arraycopy(bArr, i9, this.zza, 0, i3);
                    this.zzc = i3;
                } else {
                    this.zzf.write(bArr, i9, i3);
                }
            }
            this.zzd += i3;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i2, int i3) throws IOException {
            zzn((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i2, int i3) throws IOException {
            zzo(20);
            zza(i2, 0);
            zzb(i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, boolean z2) throws IOException {
            zzo(11);
            zza(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j2) throws IOException {
            zzo(8);
            zza(j2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i2, long j2) throws IOException {
            zzo(20);
            zza(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzn(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza(zzamcVar, this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i2);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i2, zzajp zzajpVar) throws IOException {
            zzk(i2, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        final void zzc(int i2, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i2, 2);
            zzb(zzamcVar, zzamvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i2, String str) throws IOException {
            zzk(i2, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzj = zzakg.zzj(length);
                int i2 = iZzj + length;
                int i3 = this.zzb;
                if (i2 > i3) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzant.zza(str, bArr, 0, length);
                    zzn(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i2 > i3 - this.zzc) {
                    zze();
                }
                int iZzj2 = zzakg.zzj(str.length());
                int i5 = this.zzc;
                try {
                    if (iZzj2 == iZzj) {
                        int i7 = i5 + iZzj2;
                        this.zzc = i7;
                        int iZza3 = zzant.zza(str, this.zza, i7, this.zzb - i7);
                        this.zzc = i5;
                        iZza = (iZza3 - i5) - iZzj2;
                        zzb(iZza);
                        this.zzc = iZza3;
                    } else {
                        iZza = zzant.zza(str);
                        zzb(iZza);
                        this.zzc = zzant.zza(str, this.zza, this.zzc, iZza);
                    }
                    this.zzd += iZza;
                } catch (zzanx e2) {
                    this.zzd -= this.zzc - i5;
                    this.zzc = i5;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new zzb(e3);
                }
            } catch (zzanx e4) {
                zza(str, e4);
            }
        }
    }

    public static int zza(double d2) {
        return 8;
    }

    public static int zzb(int i2, int i3) {
        return zzj(i2 << 3) + zzg(i3);
    }

    public static int zzc(long j2) {
        return 8;
    }

    public static int zzd(int i2) {
        return 4;
    }

    public static int zze(long j2) {
        return 8;
    }

    static int zzf(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int zzg(int i2) {
        return 4;
    }

    public static int zzh(int i2) {
        return zzj(zza(i2));
    }

    public static int zzi(int i2) {
        return zzj(i2 << 3);
    }

    public static int zzj(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b2) throws IOException;

    public abstract void zzb(int i2, zzamc zzamcVar) throws IOException;

    public abstract void zzb(int i2, String str) throws IOException;

    public abstract void zzb(int i2, boolean z2) throws IOException;

    public abstract void zzb(zzajp zzajpVar) throws IOException;

    abstract void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    abstract void zzb(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i2, zzajp zzajpVar) throws IOException;

    abstract void zzc(int i2, zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzc(zzamc zzamcVar) throws IOException;

    public abstract void zzd(int i2, zzajp zzajpVar) throws IOException;

    public abstract void zzf(int i2, long j2) throws IOException;

    public abstract void zzh(int i2, int i3) throws IOException;

    public abstract void zzh(int i2, long j2) throws IOException;

    public abstract void zzh(long j2) throws IOException;

    public abstract void zzi(int i2, int i3) throws IOException;

    public abstract void zzj(long j2) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzk(int i2, int i3) throws IOException;

    public abstract void zzl(int i2) throws IOException;

    public abstract void zzl(int i2, int i3) throws IOException;

    public abstract void zzn(int i2) throws IOException;

    private zzakg() {
    }

    public static int zza(float f3) {
        return 4;
    }

    public static int zzc(int i2) {
        return zzg(i2);
    }

    public static int zze(int i2) {
        return zzg(i2);
    }

    public static int zzf(int i2, int i3) {
        return zzj(i2 << 3) + zzj(zza(i3));
    }

    public static int zzg(int i2, int i3) {
        return zzj(i2 << 3) + zzj(i3);
    }

    public final void zzi(long j2) throws IOException {
        zzj(zza(j2));
    }

    public final void zzj(int i2, int i3) throws IOException {
        zzl(i2, zza(i3));
    }

    private static int zza(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int zzb(int i2, long j2) {
        return zzj(i2 << 3) + zzg(j2);
    }

    public static int zzc(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzd(int i2, int i3) {
        return zzj(i2 << 3) + zzg(i3);
    }

    public static int zze(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    public final void zzm(int i2) throws IOException {
        zzn(zza(i2));
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zze(int i2, long j2) {
        return zzj(i2 << 3) + zzg(j2);
    }

    public static int zzf(long j2) {
        return zzg(zza(j2));
    }

    public static int zzg(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    private static long zza(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzb(int i2, zzalk zzalkVar) {
        int iZzj = zzj(i2 << 3);
        int iZza = zzalkVar.zza();
        return iZzj + zzj(iZza) + iZza;
    }

    public static int zzd(long j2) {
        return zzg(j2);
    }

    public final void zzg(int i2, long j2) throws IOException {
        zzh(i2, zza(j2));
    }

    public static int zza(int i2, boolean z2) {
        return zzj(i2 << 3) + 1;
    }

    public static int zzd(int i2, long j2) {
        return zzj(i2 << 3) + zzg(zza(j2));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    static int zzb(int i2, zzamc zzamcVar, zzamv zzamvVar) {
        return zzj(i2 << 3) + zza(zzamcVar, zzamvVar);
    }

    public static int zza(int i2, zzajp zzajpVar) {
        int iZzj = zzj(i2 << 3);
        int iZzb = zzajpVar.zzb();
        return iZzj + zzj(iZzb) + iZzb;
    }

    public static int zzb(zzamc zzamcVar) {
        int iZzl = zzamcVar.zzl();
        return zzj(iZzl) + iZzl;
    }

    public static int zza(zzajp zzajpVar) {
        int iZzb = zzajpVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzb(int i2, zzajp zzajpVar) {
        return (zzj(8) << 1) + zzg(2, i2) + zza(3, zzajpVar);
    }

    public static int zza(int i2, double d2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zza(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static zzakg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i2, float f3) {
        return zzj(i2 << 3) + 4;
    }

    @Deprecated
    static int zza(int i2, zzamc zzamcVar, zzamv zzamvVar) {
        return (zzj(i2 << 3) << 1) + ((zzajf) zzamcVar).zza(zzamvVar);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzamc zzamcVar) {
        return zzamcVar.zzl();
    }

    public final void zzb(boolean z2) throws IOException {
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i2, zzalk zzalkVar) {
        return (zzj(8) << 1) + zzg(2, i2) + zzb(3, zzalkVar);
    }

    public final void zzb(int i2, double d2) throws IOException {
        zzf(i2, Double.doubleToRawLongBits(d2));
    }

    public final void zzb(double d2) throws IOException {
        zzh(Double.doubleToRawLongBits(d2));
    }

    public final void zzb(int i2, float f3) throws IOException {
        zzh(i2, Float.floatToRawIntBits(f3));
    }

    public static int zza(zzalk zzalkVar) {
        int iZza = zzalkVar.zza();
        return zzj(iZza) + iZza;
    }

    public final void zzb(float f3) throws IOException {
        zzk(Float.floatToRawIntBits(f3));
    }

    public static int zza(int i2, zzamc zzamcVar) {
        return (zzj(8) << 1) + zzg(2, i2) + zzj(24) + zzb(zzamcVar);
    }

    static int zza(zzamc zzamcVar, zzamv zzamvVar) {
        int iZza = ((zzajf) zzamcVar).zza(zzamvVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(int i2, String str) {
        return zzj(i2 << 3) + zza(str);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzant.zza(str);
        } catch (zzanx unused) {
            length = str.getBytes(zzalb.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzakg zza(OutputStream outputStream, int i2) {
        return new zzd(outputStream, i2);
    }

    final void zza(String str, zzanx zzanxVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzanxVar);
        byte[] bytes = str.getBytes(zzalb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }
}
