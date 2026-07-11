package td9;

import QmE.iF;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import ga6.j;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class u implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73573n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f73572t = 8;
    private static final Map nr = MapsKt.mapOf(TuplesKt.to("extra_feed_content", "[]"), TuplesKt.to("large_bg_watermark", Boolean.FALSE), TuplesKt.to("lag_feedback", 0));

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public u(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73573n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(u uVar, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        M3.j.n(M3.n.nr(it, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), uVar.f73573n);
    }

    private final Task nr(Task task) {
        Task taskAddOnFailureListener = task.addOnFailureListener(new OnFailureListener() { // from class: td9.DAz
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                u.O(this.f73506n, exc);
            }
        });
        Intrinsics.checkNotNullExpressionValue(taskAddOnFailureListener, "addOnFailureListener(...)");
        return taskAddOnFailureListener;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.J2(this.f73557n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.f73573n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(u uVar) {
        com.google.firebase.remoteconfig.j jVarAz = com.google.firebase.remoteconfig.j.az();
        Intrinsics.checkNotNullExpressionValue(jVarAz, "getInstance(...)");
        Task taskXQ = jVarAz.XQ(nr);
        Intrinsics.checkNotNullExpressionValue(taskXQ, "setDefaultsAsync(...)");
        uVar.nr(taskXQ);
        return Unit.INSTANCE;
    }
}
