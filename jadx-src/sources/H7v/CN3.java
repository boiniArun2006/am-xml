package H7v;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {
    public static final Wre n(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return new Wre(((d2n.Ml) entry.getKey()).Ik(), entry.getValue(), null);
    }
}
