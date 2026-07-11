package QJ;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class z implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8042n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f8043t;

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.Ml(xo, nVar, this, dsr);
    }

    public boolean nr() {
        return this.f8043t;
    }

    public List rl() {
        return this.rl;
    }

    public String t() {
        return this.f8042n;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f8042n + "' Shapes: " + Arrays.toString(this.rl.toArray()) + '}';
    }

    public z(String str, List list, boolean z2) {
        this.f8042n = str;
        this.rl = list;
        this.f8043t = z2;
    }
}
