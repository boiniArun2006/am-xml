package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/constraintlayout/compose/SpringBoundary;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", c.f62177j, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "rl", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpringBoundary {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SpringBoundary f34830t = new SpringBoundary("overshoot");
    private static final SpringBoundary nr = new SpringBoundary("bounceStart");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SpringBoundary f34829O = new SpringBoundary("bounceEnd");
    private static final SpringBoundary J2 = new SpringBoundary("bounceBoth");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/SpringBoundary$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/SpringBoundary;", "Overshoot", "Landroidx/constraintlayout/compose/SpringBoundary;", c.f62177j, "()Landroidx/constraintlayout/compose/SpringBoundary;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SpringBoundary n() {
            return SpringBoundary.f34830t;
        }
    }

    public SpringBoundary(String str) {
        this.name = str;
    }
}
