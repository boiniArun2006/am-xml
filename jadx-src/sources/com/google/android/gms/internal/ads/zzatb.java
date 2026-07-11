package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.l;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class zzatb extends zzary {
    private final Object zza;

    @Nullable
    @GuardedBy
    private final zzasd zzb;

    @Override // com.google.android.gms.internal.ads.zzary
    protected final zzase zzr(zzaru zzaruVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaruVar.zzb;
            Map map = zzaruVar.zzc;
            String str3 = com.google.android.exoplayer2.C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i2].trim().split(l.ae, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaruVar.zzb);
        }
        return zzase.zza(str, zzasv.zza(zzaruVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzary
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzasd zzasdVar;
        synchronized (this.zza) {
            zzasdVar = this.zzb;
        }
        zzasdVar.zza(str);
    }

    public zzatb(int i2, String str, zzasd zzasdVar, @Nullable zzasc zzascVar) {
        super(i2, str, zzascVar);
        this.zza = new Object();
        this.zzb = zzasdVar;
    }
}
