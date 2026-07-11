package HI0;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class h {
    public static final Pair n(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new Pair(pair.getSecond(), pair.getFirst());
    }
}
