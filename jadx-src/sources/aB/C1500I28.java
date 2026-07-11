package aB;

import fJf.Dsr;
import fJf.Ew;
import kotlin.jvm.internal.Intrinsics;
import ln.C2267j;

/* JADX INFO: renamed from: aB.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C1500I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1500I28 f12736n = new C1500I28();

    public static final AbstractC1501Ml n(Ew poolFactory, dF.Ml platformDecoder, C2267j closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Dsr dsrRl = poolFactory.rl();
        Intrinsics.checkNotNullExpressionValue(dsrRl, "getBitmapPool(...)");
        return new C1503j(dsrRl, closeableReferenceFactory);
    }

    private C1500I28() {
    }
}
