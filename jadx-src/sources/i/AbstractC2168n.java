package i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2168n {
    public static final String n(C2167j c2167j, C2169w6 translations) {
        Intrinsics.checkNotNullParameter(c2167j, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        String str = (String) translations.rl().get(c2167j.rl());
        return str == null ? c2167j.n() : str;
    }
}
