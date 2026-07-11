package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbcb {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhah zzhahVarZze = zzhah.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbca
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhah zzhahVar = zzhahVarZze;
                if (list2 == null) {
                    zzhahVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ApkChecksum apkChecksumN = aC.n(list2.get(i2));
                        if (apkChecksumN.getType() == 8) {
                            zzhahVar.zza(zzban.zza(apkChecksumN.getValue()));
                            return;
                        }
                    }
                    zzhahVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhahVar.zza((Object) null);
                }
            }
        });
        return (String) zzhahVarZze.get();
    }
}
