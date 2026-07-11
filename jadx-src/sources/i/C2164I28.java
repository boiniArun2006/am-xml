package i;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: i.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2164I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2164I28 f68045n = new C2164I28();

    public final C2165Ml n(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return AbstractC2166Wre.rl(new JSONObject(string));
    }

    public final C2165Ml rl(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return AbstractC2166Wre.rl(json);
    }

    private C2164I28() {
    }
}
