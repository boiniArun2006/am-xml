package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class r {
    public static final Pl n(g9s sb, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.O().az() ? new Q(sb, json) : new Pl(sb);
    }
}
