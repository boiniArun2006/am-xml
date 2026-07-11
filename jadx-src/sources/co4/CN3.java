package co4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 implements UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f43838n;
    private final Function1 rl;

    public CN3(Object obj, Function1 getter) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        this.f43838n = obj;
        this.rl = getter;
    }

    @Override // co4.UGc
    public boolean test(Object obj) {
        return Intrinsics.areEqual(this.rl.invoke(obj), this.f43838n);
    }
}
