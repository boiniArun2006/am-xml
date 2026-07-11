package six;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class aC {
    public static final String n(long j2) {
        String str = Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).p().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
