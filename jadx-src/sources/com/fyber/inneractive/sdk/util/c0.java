package com.fyber.inneractive.sdk.util;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class c0 {
    public static String a(int i2) {
        if (i2 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = i2;
        long hours = timeUnit.toHours(j2);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j2 - timeUnit2.toMillis(hours));
        long millis = j2 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j2 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
    }

    public static String a(long j2, long j3, long j4) {
        long j5 = (j2 - j3) - j4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j5);
        long millis = timeUnit.toMillis(j5 - TimeUnit.SECONDS.toMillis(seconds));
        Locale locale = Locale.US;
        return seconds + "." + millis;
    }
}
