package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgxm {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgxb zzgxbVar = new zzgxb();
        file.getClass();
        zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamZza = zzgxk.zza(file, zzgupVarZzp, zzgxbVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
            } else {
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (!file.renameTo(file2)) {
            zzgrc.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
            zzgxl zzgxlVar = new zzgxl(file, null);
            zzgxb zzgxbVar = new zzgxb();
            zzgup zzgupVarZzp = zzgup.zzp(new zzgxj[0]);
            zzgxi zzgxiVarZza = zzgxi.zza();
            try {
                InputStream inputStreamZza = zzgxlVar.zza();
                zzgxiVarZza.zzb(inputStreamZza);
                FileOutputStream fileOutputStreamZza = zzgxk.zza(file2, zzgupVarZzp, zzgxbVar);
                zzgxiVarZza.zzb(fileOutputStreamZza);
                int i2 = zzgxf.zza;
                byte[] bArr = new byte[8192];
                while (true) {
                    int i3 = inputStreamZza.read(bArr);
                    if (i3 == -1) {
                        break;
                    } else {
                        fileOutputStreamZza.write(bArr, 0, i3);
                    }
                }
                zzgxiVarZza.close();
                if (!file.delete()) {
                    if (!file2.delete()) {
                        throw new IOException("Unable to delete ".concat(file2.toString()));
                    }
                    throw new IOException("Unable to delete ".concat(file.toString()));
                }
            } catch (Throwable th) {
                try {
                    throw zzgxiVarZza.zzc(th);
                } catch (Throwable th2) {
                    zzgxiVarZza.close();
                    throw th2;
                }
            }
        }
    }
}
