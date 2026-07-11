package wa;

import ajd.j;
import com.bendingspoons.injet.module.AnalyticsModule;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsModule.DebugEvent.Severity.values().length];
            try {
                iArr[AnalyticsModule.DebugEvent.Severity.CRITICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsModule.DebugEvent.Severity.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsModule.DebugEvent.Severity.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalyticsModule.DebugEvent.Severity.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ajd.j rl(AnalyticsModule.DebugEvent debugEvent) {
        return new ajd.j(debugEvent.getCategories(), t(debugEvent.getSeverity()), null, debugEvent.getErrorCode(), pq.I28.t(debugEvent.getInfo()));
    }

    private static final j.EnumC0481j t(AnalyticsModule.DebugEvent.Severity severity) {
        int i2 = j.$EnumSwitchMapping$0[severity.ordinal()];
        if (i2 == 1) {
            return j.EnumC0481j.f13104r;
        }
        if (i2 == 2) {
            return j.EnumC0481j.J2;
        }
        if (i2 == 3) {
            return j.EnumC0481j.f13101O;
        }
        if (i2 == 4) {
            return j.EnumC0481j.f13105t;
        }
        throw new NoWhenBranchMatchedException();
    }
}
