package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzasv {
    @Nullable
    public static zzarh zza(zzaru zzaruVar) {
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        long jZzb;
        long j6;
        long j7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzaruVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb2 = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j3 = 0;
            j4 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i2++;
            }
            j2 = 0;
            i2 = 1;
        } else {
            j2 = 0;
            z2 = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb3 = str3 != null ? zzb(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j5 = jCurrentTimeMillis;
            jZzb = zzb(str4);
        } else {
            j5 = jCurrentTimeMillis;
            jZzb = j2;
        }
        String str5 = (String) map.get("ETag");
        if (i2 != 0) {
            long j9 = (j4 * 1000) + j5;
            j7 = z2 ? j9 : (j3 * 1000) + j9;
            j6 = j9;
        } else {
            j6 = (jZzb2 <= j2 || jZzb3 < jZzb2) ? j2 : (jZzb3 - jZzb2) + j5;
            j7 = j6;
        }
        zzarh zzarhVar = new zzarh();
        zzarhVar.zza = zzaruVar.zzb;
        zzarhVar.zzb = str5;
        zzarhVar.zzf = j6;
        zzarhVar.zze = j7;
        zzarhVar.zzc = jZzb2;
        zzarhVar.zzd = jZzb;
        zzarhVar.zzg = map;
        zzarhVar.zzh = zzaruVar.zzd;
        return zzarhVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzask.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzask.zzd(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String zzc(long j2) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
