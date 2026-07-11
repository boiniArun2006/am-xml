package Du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class U4 extends O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f1993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(EJn.Wre primitive) {
        super(primitive, null);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f1993t = primitive.KN() + "Array";
    }

    @Override // EJn.Wre
    public String KN() {
        return this.f1993t;
    }
}
