package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract /* synthetic */ class u {
    static {
        int i2 = qf.f47635n;
    }

    public static String n(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i2 = zze.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzkd nr(int i2) {
        try {
            zzkb zzkbVarZzc = zzkd.zzc();
            zzkbVarZzc.zzn(i2);
            return (zzkd) zzkbVarZzc.zzf();
        } catch (Exception e2) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e2);
            return null;
        }
    }

    public static zzjz rl(int i2, int i3, Ml ml) {
        try {
            zzjx zzjxVarZzc = zzjz.zzc();
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(ml.rl());
            zzkeVarZzc.zzm(ml.n());
            zzkeVarZzc.zzo(i2);
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(i3);
            return (zzjz) zzjxVarZzc.zzf();
        } catch (Exception e2) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e2);
            return null;
        }
    }

    public static zzjz t(int i2, int i3, Ml ml, String str) {
        try {
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(ml.rl());
            zzkeVarZzc.zzm(ml.n());
            zzkeVarZzc.zzo(i2);
            if (str != null) {
                zzkeVarZzc.zza(str);
            }
            zzjx zzjxVarZzc = zzjz.zzc();
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(i3);
            return (zzjz) zzjxVarZzc.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }
}
