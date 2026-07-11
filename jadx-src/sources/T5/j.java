package T5;

import T5.n;
import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements n.w6 {
    @Override // T5.n.w6
    public boolean isTracing() {
        return false;
    }

    @Override // T5.n.w6
    public void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // T5.n.w6
    public void rl() {
        if (isTracing()) {
            Trace.endSection();
        }
    }
}
