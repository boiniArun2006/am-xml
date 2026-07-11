package hL;

import com.bendingspoons.injet.module.WolfModule;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j extends WolfModule {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f67955n = new j();

    @Override // com.bendingspoons.injet.module.WolfModule
    public n J2(Object input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new n.w6(Unit.INSTANCE);
    }

    @Override // com.bendingspoons.injet.module.WolfModule
    public n nr() {
        return new n.w6(new WolfModule.WolfPredictionInfo(null, null, null, 7, null));
    }

    private j() {
    }
}
