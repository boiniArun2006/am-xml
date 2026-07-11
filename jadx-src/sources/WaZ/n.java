package WaZ;

import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xAo.vd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements fVJ.n {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11537t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vd f11538n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(vd safeTimeWithOffsetUseCase) {
        Intrinsics.checkNotNullParameter(safeTimeWithOffsetUseCase, "safeTimeWithOffsetUseCase");
        this.f11538n = safeTimeWithOffsetUseCase;
    }

    @Override // fVJ.n
    public int invoke() {
        Long lValueOf = Long.valueOf(com.alightcreative.app.motion.persist.j.INSTANCE.getCountdownPaywallStartTime());
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return Integer.MAX_VALUE;
        }
        return (int) ((SignalManager.TWENTY_FOUR_HOURS_MILLIS - (this.f11538n.invoke() - lValueOf.longValue())) / ((long) 1000));
    }

    @Override // fVJ.n
    public boolean n() {
        return com.alightcreative.app.motion.persist.j.INSTANCE.getCountdownPaywallStartTime() != 0;
    }

    @Override // fVJ.n
    public void rl() {
        com.alightcreative.app.motion.persist.j.INSTANCE.setCountdownPaywallStartTime(this.f11538n.invoke());
    }
}
