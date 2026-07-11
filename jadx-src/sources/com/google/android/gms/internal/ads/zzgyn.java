package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    com.google.common.util.concurrent.Xo zza;
    Object zzb;

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.Xo xo = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (xo == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (xo.isCancelled()) {
            zzk(xo);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgzo.zzs(xo));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzhag.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e2) {
            zzb(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            zzb(e3.getCause());
        } catch (Exception e4) {
            zzb(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        String string;
        com.google.common.util.concurrent.Xo xo = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (xo != null) {
            String string2 = xo.toString();
            StringBuilder sb = new StringBuilder(string2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(string2);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + string3.length() + 1);
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(string3);
        sb2.append("]");
        return sb2.toString();
    }

    zzgyn(com.google.common.util.concurrent.Xo xo, Object obj) {
        xo.getClass();
        this.zza = xo;
        this.zzb = obj;
    }
}
