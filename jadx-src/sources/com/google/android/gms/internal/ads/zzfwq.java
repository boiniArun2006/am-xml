package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfwq {
    private final zzbcp zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfwq(@NonNull zzbcp zzbcpVar, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.zza = zzbcpVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbcp zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzy;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzian zzianVar = zzian.zza;
                    arrayList = new ArrayList();
                    iMin = 256;
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzy = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = fileInputStream.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                }
                zzian zzianVarZzs = i2 == 0 ? null : zzian.zzs(bArr, 0, i2);
                if (zzianVarZzs == null) {
                    break;
                }
                arrayList.add(zzianVarZzs);
                iMin = Math.min(iMin + iMin, 8192);
                this.zze = bArrZzy;
            }
            bArrZzy = zzian.zzw(arrayList).zzy();
            IOUtils.closeQuietly(fileInputStream);
            this.zze = bArrZzy;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j2) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
