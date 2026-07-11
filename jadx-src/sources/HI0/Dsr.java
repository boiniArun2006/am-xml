package HI0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr extends Throwable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f3817n;

    public Dsr(Function0 handlerAction) {
        Intrinsics.checkNotNullParameter(handlerAction, "handlerAction");
        this.f3817n = handlerAction;
    }

    public final Function0 n() {
        return this.f3817n;
    }
}
