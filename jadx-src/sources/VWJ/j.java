package VWJ;

import kotlin.jvm.internal.Intrinsics;
import y8.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final X1.j f11015n;

    public j(X1.j animatedDrawableBackend) {
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f11015n = animatedDrawableBackend;
    }

    @Override // y8.Ml
    public int Uo() {
        return this.f11015n.getHeight();
    }

    @Override // y8.Ml
    public int az() {
        return this.f11015n.getWidth();
    }

    @Override // y8.Ml
    public int gh(int i2) {
        return this.f11015n.Uo(i2);
    }

    @Override // y8.Ml
    public int mUb() {
        return this.f11015n.t();
    }

    @Override // y8.Ml
    public int n() {
        return this.f11015n.n();
    }

    @Override // y8.Ml
    public int rl() {
        return this.f11015n.rl();
    }
}
