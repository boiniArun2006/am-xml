package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzaoe {
    private static final ThreadLocal<SimpleDateFormat> zza;

    private static boolean zza(long j2) {
        return j2 >= -62135596800L && j2 <= 253402300799L;
    }

    private static long zzb(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        } catch (NumberFormatException e2) {
            ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
            parseException.initCause(e2);
            throw parseException;
        }
    }

    public static long zza(zzani zzaniVar) {
        return zzb(zzaniVar).zzb();
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        zza = new zzaog();
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    public static zzani zza(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 != -1) {
            String strSubstring2 = str.substring(0, iIndexOf2);
            int iIndexOf3 = strSubstring2.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
                strSubstring = strSubstring2.substring(iIndexOf3 + 1);
                strSubstring2 = strSubstring3;
            } else {
                strSubstring = "";
            }
            long time = zza.get().parse(strSubstring2).getTime() / 1000;
            if (strSubstring.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i2 = 0; i2 < 9; i2++) {
                    iCharAt *= 10;
                    if (i2 < strSubstring.length()) {
                        if (strSubstring.charAt(i2) >= '0' && strSubstring.charAt(i2) <= '9') {
                            iCharAt += strSubstring.charAt(i2) - '0';
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
            }
            if (str.charAt(iIndexOf2) == 'Z') {
                if (str.length() != iIndexOf2 + 1) {
                    throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + "\"", 0);
                }
            } else {
                long jZzb = zzb(str.substring(iIndexOf2 + 1));
                time = str.charAt(iIndexOf2) == '+' ? time - jZzb : time + jZzb;
            }
            try {
                if (zza(time)) {
                    if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                        time = zzbc.zza(time, iCharAt / 1000000000);
                        iCharAt %= 1000000000;
                    }
                    if (iCharAt < 0) {
                        iCharAt += 1000000000;
                        time = zzbc.zzb(time, 1L);
                    }
                    return zzb((zzani) ((zzaky) zzani.zzc().zza(time).zza(iCharAt).zze()));
                }
                throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
            } catch (IllegalArgumentException e2) {
                ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                parseException.initCause(e2);
                throw parseException;
            }
        }
        throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
    }

    private static zzani zzb(zzani zzaniVar) {
        long jZzb = zzaniVar.zzb();
        int iZza = zzaniVar.zza();
        if (!zza(jZzb) || iZza < 0 || iZza >= 1000000000) {
            throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzb), Integer.valueOf(iZza)));
        }
        return zzaniVar;
    }

    static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
