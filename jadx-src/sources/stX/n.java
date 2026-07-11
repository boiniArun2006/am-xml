package stX;

import kotlin.jvm.internal.Intrinsics;
import stX.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f73377t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String expected) {
        super(Integer.valueOf(expected.length()), "the predefined string " + expected, null);
        Intrinsics.checkNotNullParameter(expected, "expected");
        this.f73377t = expected;
    }

    @Override // stX.I28
    public CN3 n(Object obj, CharSequence input, int i2, int i3) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.areEqual(input.subSequence(i2, i3).toString(), this.f73377t)) {
            return null;
        }
        return new CN3.I28(this.f73377t);
    }
}
