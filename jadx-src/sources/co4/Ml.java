package co4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f43841n = new ArrayList();

    public final void n(Xo format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format instanceof l3D) {
            this.f43841n.add(format);
        } else if (format instanceof fuX) {
            Iterator it = ((fuX) format).t().iterator();
            while (it.hasNext()) {
                this.f43841n.add((l3D) it.next());
            }
        }
    }

    public final fuX rl() {
        return new fuX(this.f43841n);
    }
}
