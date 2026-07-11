package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.brandsafety.b;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class zzgak {
    static final String zza = new UUID(0, 0).toString();
    final zzgaj zzb;
    final zzgai zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    final zzgah zza(@Nullable String str, @Nullable String str2, long j2, boolean z2) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgah();
        }
        boolean z3 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z3);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z3 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j2) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z3);
        return (strZze2 != null || z2) ? new zzgah(strZze2, zzd(z3)) : zzb(str, str2);
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? V8ValueNull.NULL : "not null";
        int length = str5.length();
        String str6 = str3 == null ? V8ValueNull.NULL : "not null";
        StringBuilder sb2 = new StringBuilder(length + b.f61769v + str6.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str5);
        sb2.append(", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final zzgah zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    final void zzc(boolean z2) throws IOException {
        String str = z2 ? this.zzg : this.zzf;
        zzgaj zzgajVar = this.zzb;
        zzgajVar.zzf(str);
        zzgajVar.zzf(z2 ? this.zze : this.zzd);
    }

    final long zzd(boolean z2) {
        return this.zzb.zzd(z2 ? this.zzg : this.zzf, -1L);
    }

    final String zze(boolean z2) {
        return this.zzb.zzc(z2 ? this.zze : this.zzd, null);
    }

    final boolean zzg(boolean z2) {
        return this.zzb.zzg(this.zzd);
    }

    zzgak(Context context, String str, String str2, String str3) {
        this.zzb = zzgaj.zza(context);
        this.zzc = zzgai.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    final zzgah zzf(String str, boolean z2) throws IOException {
        String str2;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            zzgaj zzgajVar = this.zzb;
            if (z2) {
                str2 = this.zzg;
            } else {
                str2 = this.zzf;
            }
            zzgajVar.zzb(str2, Long.valueOf(jCurrentTimeMillis));
            if (z2) {
                str3 = this.zze;
            } else {
                str3 = this.zzd;
            }
            zzgajVar.zzb(str3, str);
            return new zzgah(str, jCurrentTimeMillis);
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }
}
