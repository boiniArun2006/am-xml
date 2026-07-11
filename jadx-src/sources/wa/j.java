package wa;

import KW9.n;
import com.bendingspoons.injet.module.AnalyticsModule;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends AnalyticsModule {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f75074n;
    private final rB.Ml rl;

    /* JADX INFO: renamed from: wa.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C1263j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsModule.FailableOperation.Status.values().length];
            try {
                iArr[AnalyticsModule.FailableOperation.Status.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsModule.FailableOperation.Status.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsModule.FailableOperation.Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalyticsModule.FailableOperation.Status.CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(Function1 trackEvent, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.f75074n = trackEvent;
        this.rl = spiderSense;
    }

    @Override // com.bendingspoons.injet.module.AnalyticsModule
    public x0X.n J2(AnalyticsModule.UserEvent userEvent) {
        Intrinsics.checkNotNullParameter(userEvent, "userEvent");
        this.f75074n.invoke(userEvent);
        return new n.w6(Unit.INSTANCE);
    }

    @Override // com.bendingspoons.injet.module.AnalyticsModule
    public x0X.n O(AnalyticsModule.FailableOperation failableOperation) {
        Intrinsics.checkNotNullParameter(failableOperation, "failableOperation");
        ajd.j jVarRl = n.rl(failableOperation.getEvent());
        int i2 = C1263j.$EnumSwitchMapping$0[failableOperation.getStatus().ordinal()];
        if (i2 == 1) {
            this.rl.O().rl(jVarRl, failableOperation.getId());
        } else if (i2 == 2) {
            this.rl.O().t(jVarRl, failableOperation.getId());
        } else if (i2 == 3) {
            this.rl.O().nr(jVarRl, failableOperation.getId());
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.rl.O().O(jVarRl, failableOperation.getId());
        }
        return new n.w6(Unit.INSTANCE);
    }

    @Override // com.bendingspoons.injet.module.AnalyticsModule
    public x0X.n nr(AnalyticsModule.DebugEvent debugEvent) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        this.rl.t(n.rl(debugEvent));
        return new n.w6(Unit.INSTANCE);
    }

    @Override // com.bendingspoons.injet.module.AnalyticsModule
    public x0X.n t(AnalyticsModule.DebugEvent debugEvent) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        KW9.w6.n(this.rl, new n.j.CN3(debugEvent.getCategories(), pq.I28.t(debugEvent.getInfo())));
        return new n.w6(Unit.INSTANCE);
    }
}
