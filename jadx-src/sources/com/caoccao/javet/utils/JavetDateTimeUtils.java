package com.caoccao.javet.utils;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetDateTimeUtils {
    public static final ZoneId ZONE_ID_UTC = ZoneId.of("UTC");

    public static ZonedDateTime toZonedDateTime(long j2, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneId);
    }

    public static ZonedDateTime getUTCNow() {
        return ZonedDateTime.now(ZONE_ID_UTC);
    }

    public static ZonedDateTime toZonedDateTime(long j2) {
        return toZonedDateTime(j2, ZoneId.systemDefault());
    }

    private JavetDateTimeUtils() {
    }
}
