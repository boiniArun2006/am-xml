package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class UGc extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGc(CN3 configuration, DGv.Ml module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        Uo();
    }

    private final void Uo() {
        if (Intrinsics.areEqual(n(), DGv.Wre.n())) {
            return;
        }
        n().n(new Mms.lej(O()));
    }
}
