package xAo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Lu implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f75262n;

    public Lu(kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f75262n = iapManager;
    }

    @Override // xAo.vd
    public long invoke() {
        return this.f75262n.az() + (((long) com.alightcreative.app.motion.persist.j.INSTANCE.getTimeOffsetSeconds()) * 1000);
    }
}
