package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzlg implements Iterable, Serializable {
    public static final zzlg zzb = new zzlf(zzmo.zzb);
    private int zza = 0;

    zzlg() {
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzc();

    public abstract zzlg zze(int i2, int i3);

    abstract void zzf(zzky zzkyVar) throws IOException;

    protected abstract int zzg(int i2, int i3, int i5);

    protected final int zzi() {
        return this.zza;
    }

    static {
        int i2 = zzku.zza;
    }

    public static zzlg zzh(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzlf(bArr2);
    }

    static int zzj(int i2, int i3, int i5) {
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

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkz(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzof.zza(this) : zzof.zza(zze(0, 47)).concat("..."));
    }
}
