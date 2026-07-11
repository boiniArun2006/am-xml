package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f70259n = new LinkedHashMap();

    public final nKK n() {
        return new nKK(this.f70259n);
    }

    public final Dsr rl(String key, Dsr element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (Dsr) this.f70259n.put(key, element);
    }
}
