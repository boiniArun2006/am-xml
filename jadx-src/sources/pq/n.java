package pq;

import kotlin.jvm.internal.Intrinsics;
import pq.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {
    public static final j.I28 O(String str, String value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return new j.I28(str, value);
    }

    public static final j.C1105j n(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new j.C1105j(str, z2);
    }

    public static final j.Ml nr(String str, Number value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return new j.Ml(str, value);
    }

    public static final j.n rl(String str, w6 value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return new j.n(str, value);
    }

    public static final j.w6 t(String str, Ml value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return new j.w6(str, value);
    }
}
