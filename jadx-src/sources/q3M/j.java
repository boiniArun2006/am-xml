package q3M;

import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SimpleDateFormat f72112n = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static final double rl(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return date.getTime() / 1000.0d;
    }

    public static final double n() {
        return r0.getEpochSecond() + (((double) Instant.now().getNano()) / ((double) 1000000000));
    }
}
