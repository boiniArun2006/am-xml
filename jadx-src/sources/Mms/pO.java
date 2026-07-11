package Mms;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class pO {
    public static final yg n(kotlinx.serialization.json.n json, String source) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(source, "source");
        return !json.O().n() ? new yg(source) : new Sis(source);
    }
}
