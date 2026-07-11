package androidx.compose.ui;

import GJW.Lu;
import GJW.xuv;
import androidx.annotation.RestrictTo;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B1\b\u0002\u0012&\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f21\u0010\u0014\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R4\u0010\b\u001a\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0013\u0010$\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001\b\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006&"}, d2 = {"Landroidx/compose/ui/SessionMutex;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", c.f62177j, "()Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/SessionMutex$Session;", "Landroidx/compose/ui/AtomicReference;", "currentSessionHolder", "rl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "R", "Lkotlin/Function1;", "LGJW/vd;", "sessionInitializer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "data", "Lkotlin/coroutines/Continuation;", "session", "KN", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "J2", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/String;", "", "O", "(Ljava/util/concurrent/atomic/AtomicReference;)I", InneractiveMediationNameConsts.OTHER, "", "t", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "nr", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "currentSession", PicoEvent.SESSION_TYPE, "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalComposeUiApi
@JvmInline
@RestrictTo
public final class SessionMutex<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference currentSessionHolder;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/SessionMutex$Session;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "LGJW/xuv;", "job", "value", "<init>", "(LGJW/xuv;Ljava/lang/Object;)V", c.f62177j, "LGJW/xuv;", "()LGJW/xuv;", "rl", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Session<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final xuv job;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Object value;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final xuv getJob() {
            return this.job;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public Session(xuv xuvVar, Object obj) {
            this.job = xuvVar;
            this.value = obj;
        }
    }

    public static String J2(AtomicReference atomicReference) {
        return "SessionMutex(currentSessionHolder=" + atomicReference + ')';
    }

    public static int O(AtomicReference atomicReference) {
        return atomicReference.hashCode();
    }

    private static AtomicReference rl(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static boolean t(AtomicReference atomicReference, Object obj) {
        return (obj instanceof SessionMutex) && Intrinsics.areEqual(atomicReference, ((SessionMutex) obj).getCurrentSessionHolder());
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final /* synthetic */ AtomicReference getCurrentSessionHolder() {
        return this.currentSessionHolder;
    }

    public boolean equals(Object obj) {
        return t(this.currentSessionHolder, obj);
    }

    public int hashCode() {
        return O(this.currentSessionHolder);
    }

    public String toString() {
        return J2(this.currentSessionHolder);
    }

    public static final Object KN(AtomicReference atomicReference, Function1 function1, Function2 function2, Continuation continuation) {
        return Lu.J2(new SessionMutex$withSessionCancellingPrevious$2(function1, atomicReference, function2, null), continuation);
    }

    public static AtomicReference n() {
        return rl(new AtomicReference(null));
    }

    public static final Object nr(AtomicReference atomicReference) {
        Session session = (Session) atomicReference.get();
        if (session != null) {
            return session.getValue();
        }
        return null;
    }
}
