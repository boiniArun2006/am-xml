package xFr;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class QJ {
    public static final LocalDateTime n(LocalDateTime localDateTime, ZoneId fromZone) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(fromZone, "fromZone");
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        return t(localDateTime, fromZone, UTC);
    }

    public static /* synthetic */ LocalDateTime rl(LocalDateTime localDateTime, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return n(localDateTime, zoneId);
    }

    public static final LocalDateTime t(LocalDateTime localDateTime, ZoneId zoneId, ZoneId toZone) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, YmsTEL.SlT);
        Intrinsics.checkNotNullParameter(toZone, "toZone");
        ZonedDateTime zonedDateTimeJ = localDateTime.J(zoneId);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeJ, "atZone(...)");
        ZonedDateTime zonedDateTimeI = zonedDateTimeJ.I(toZone);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeI, "withZoneSameInstant(...)");
        LocalDateTime localDateTimeB = zonedDateTimeI.B();
        Intrinsics.checkNotNullExpressionValue(localDateTimeB, "toLocalDateTime(...)");
        return localDateTimeB;
    }
}
