package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzian implements Iterable<Byte>, Serializable {
    public static final zzian zza = new zzial(zzice.zzb);
    private int zzb = 0;

    zzian() {
    }

    public static zzian zzs(byte[] bArr, int i2, int i3) {
        try {
            return zzt(bArr, i2, i3, false);
        } catch (zzicg e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzian)) {
            return false;
        }
        zzian zzianVar = (zzian) obj;
        int iZzc = zzc();
        if (iZzc != zzianVar.zzc()) {
            return false;
        }
        if (iZzc == 0) {
            return true;
        }
        int i2 = this.zzb;
        int i3 = zzianVar.zzb;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return zzj(zzianVar);
        }
        return false;
    }

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzc();

    public abstract zzian zzd(int i2, int i3);

    protected abstract void zze(byte[] bArr, int i2, int i3, int i5);

    public abstract ByteBuffer zzf();

    abstract void zzg(zziae zziaeVar) throws IOException;

    protected abstract String zzh(Charset charset);

    public abstract boolean zzi();

    protected abstract boolean zzj(zzian zzianVar);

    protected abstract int zzl(int i2, int i3, int i5);

    public abstract zziaq zzm();

    protected abstract int zzp();

    protected abstract boolean zzq();

    static {
        int i2 = zziaa.zza;
    }

    public static zziam zzA() {
        return new zziam(128);
    }

    static void zzB(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i2);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length());
            sb2.append("Index > length: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    static int zzC(int i2, int i3, int i5) {
        int i7 = i3 - i2;
        if ((i2 | i3 | i7 | (i5 - i3)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 44 + String.valueOf(i3).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i5).length());
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i5);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    static /* synthetic */ boolean zzD(byte[] bArr, int i2, byte[] bArr2, int i3, int i5) {
        int i7 = i2 + i5;
        zzC(i2, i7, bArr.length);
        zzC(i3, i5 + i3, bArr2.length);
        while (i2 < i7) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    private static zzian zzk(Iterator it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (zzian) it.next();
        }
        int i3 = i2 >>> 1;
        zzian zzianVarZzk = zzk(it, i3);
        zzian zzianVarZzk2 = zzk(it, i2 - i3);
        if (Integer.MAX_VALUE - zzianVarZzk.zzc() >= zzianVarZzk2.zzc()) {
            return zzidt.zzk(zzianVarZzk, zzianVarZzk2);
        }
        int iZzc = zzianVarZzk.zzc();
        int iZzc2 = zzianVarZzk2.zzc();
        StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length());
        sb.append("ByteString would be too long: ");
        sb.append(iZzc);
        sb.append("+");
        sb.append(iZzc2);
        throw new IllegalArgumentException(sb.toString());
    }

    static zzian zzt(byte[] bArr, int i2, int i3, boolean z2) throws zzicg {
        zzC(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzial(bArr2);
    }

    static zzian zzu(byte[] bArr) {
        try {
            return new zzial(bArr);
        } catch (zzicg e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    public static zzian zzv(String str) {
        return new zzial(str.getBytes(zzice.zza));
    }

    public static zzian zzw(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzc = zzc();
            iZzl = zzl(iZzc, 0, iZzc);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzied.zza(this) : zzied.zza(zzd(0, 47)).concat("..."));
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zziai iterator() {
        return new zziaf(this);
    }

    public final String zzz() {
        return zzc() == 0 ? "" : zzh(zzice.zza);
    }

    @Deprecated
    public final void zzx(byte[] bArr, int i2, int i3, int i5) {
        zzC(0, i5, zzc());
        zzC(i3, i3 + i5, bArr.length);
        if (i5 > 0) {
            zze(bArr, 0, i3, i5);
        }
    }

    public final byte[] zzy() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzice.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }
}
