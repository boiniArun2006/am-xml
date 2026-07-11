package kHp;

import ajd.j;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69817n = new j();

    public final ajd.j J2(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "preferences", "tracker", "store"}), j.EnumC0481j.J2, qUrazMnwDskFs.obnjuAeAhlNQ + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    public final ajd.j O(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "preferences", "category", "store"}), j.EnumC0481j.J2, "Error while storing category preferences: " + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    public final ajd.j n(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "bannerRefresh", "read"}), j.EnumC0481j.J2, "Error while reading banner refresh indicator: " + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    public final ajd.j nr(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "trackersVersion", "store"}), j.EnumC0481j.J2, "Error while updating the acknowledged trackers version: " + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    public final ajd.j rl(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "preferences", "category", "read"}), j.EnumC0481j.J2, "Error while reading category preferences: " + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    public final ajd.j t(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"legal", "privacy", "preferences", "tracker", "read"}), j.EnumC0481j.J2, "Error while reading tracker preferences: " + error.getMessage(), null, pq.I28.n(pq.n.O("stacktrace", ExceptionsKt.stackTraceToString(error))), 8, null);
    }

    private j() {
    }
}
