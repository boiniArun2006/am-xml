package GP;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f3538n;

    public fuX(Wre backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f3538n = backing;
    }

    @Override // GP.n
    public boolean hasNext() {
        return this.f3538n.hasNext();
    }

    @Override // GP.n
    public short next() {
        return Ml.t(this.f3538n.next());
    }
}
