package GP;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f3537n;
    private final Function1 rl;

    public I28(n backing, Function1 transform) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f3537n = backing;
        this.rl = transform;
    }

    @Override // GP.j
    public boolean hasNext() {
        return this.f3537n.hasNext();
    }

    @Override // GP.j
    public byte next() {
        return ((Number) this.rl.invoke(Short.valueOf(this.f3537n.next()))).byteValue();
    }
}
