package Ba;

import j$.time.DayOfWeek;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    public /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f513n = EnumEntriesKt.enumEntries(DayOfWeek.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DayOfWeek n(int i2) {
        if (1 <= i2 && i2 < 8) {
            return (DayOfWeek) j.f513n.get(i2 - 1);
        }
        throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i2).toString());
    }

    public static final int rl(DayOfWeek dayOfWeek) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }
}
