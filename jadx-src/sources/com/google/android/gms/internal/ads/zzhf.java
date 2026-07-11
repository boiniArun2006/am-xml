package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhf {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    /* synthetic */ zzhf(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j3, j4, null, i3, null);
    }

    public final boolean zza(int i2) {
        return (this.zzg & i2) == i2;
    }

    public final zzhe zzb() {
        return new zzhe(this, null);
    }

    static {
        zzal.zzb("media3.datasource");
    }

    private zzhf(Uri uri, long j2, int i2, @Nullable byte[] bArr, Map map, long j3, long j4, @Nullable String str, int i3, @Nullable Object obj) {
        boolean z2 = false;
        boolean z3 = j3 >= 0;
        zzgrc.zza(z3);
        zzgrc.zza(z3);
        if (j4 > 0) {
            z2 = true;
        } else if (j4 == -1) {
            j4 = -1;
            z2 = true;
        }
        zzgrc.zza(z2);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j3;
        this.zzf = j4;
        this.zzg = i3;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        long j2 = this.zze;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzf;
        int length3 = String.valueOf(j3).length();
        int i2 = this.zzg;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i2).length() + 1);
        sb.append("DataSpec[");
        sb.append("GET");
        sb.append(" ");
        sb.append(string);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", null, ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public zzhf(Uri uri, long j2, long j3, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j2, j3, null, 0, null);
    }
}
