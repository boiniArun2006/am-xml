package td9;

import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73587n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f73586t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public w6(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73587n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(long j2) {
        return "Persist.installedAppVersions: " + com.alightcreative.app.motion.persist.j.INSTANCE.getInstalledAppVersions() + "   firstInstallTime=" + j2 + " approx36release=1607270000000";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(w6 w6Var) {
        final long j2 = w6Var.f73587n.getPackageManager().getPackageInfo(w6Var.f73587n.getPackageName(), 0).firstInstallTime;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (!jVar.getInstalledAppVersions().contains("3.5") && j2 < 1607270000000L) {
            jVar.setInstalledAppVersions(SetsKt.plus(jVar.getInstalledAppVersions(), "3.5"));
        }
        if (!jVar.getInstalledAppVersions().contains("5.0.273.1028425")) {
            jVar.setInstalledAppVersions(SetsKt.plus(jVar.getInstalledAppVersions(), "5.0.273.1028425"));
        }
        XoT.C.Uo(w6Var, new Function0() { // from class: td9.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.O(j2);
            }
        });
        if (jVar.getInstallDateTimestamp() == 0) {
            jVar.setInstallDateTimestamp(System.currentTimeMillis());
        }
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(this.f73552n);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
