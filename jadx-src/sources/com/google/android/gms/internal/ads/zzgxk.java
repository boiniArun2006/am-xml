package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgxk {
    public static final FileOutputStream zza(File file, zzgup zzgupVar, zzgxb zzgxbVar) throws IOException {
        return new FileOutputStream(file, zzgupVar.contains(zzgxj.APPEND));
    }
}
