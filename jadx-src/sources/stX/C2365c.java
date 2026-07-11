package stX;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: stX.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2365c implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f73360n;

    public C2365c(Function1 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f73360n = operation;
    }

    @Override // stX.Pl
    public Object n(Object obj, CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f73360n.invoke(obj);
        return aC.f73359n.rl(i2);
    }
}
