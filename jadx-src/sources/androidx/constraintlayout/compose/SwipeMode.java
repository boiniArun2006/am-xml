package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&BW\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Landroidx/constraintlayout/compose/SwipeMode;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "springMass", "springStiffness", "springDamping", "springThreshold", "Landroidx/constraintlayout/compose/SpringBoundary;", "springBoundary", "maxVelocity", "maxAcceleration", "<init>", "(Ljava/lang/String;FFFFLandroidx/constraintlayout/compose/SpringBoundary;FF)V", c.f62177j, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "rl", "F", "getSpringMass$constraintlayout_compose_release", "()F", "t", "getSpringStiffness$constraintlayout_compose_release", "nr", "getSpringDamping$constraintlayout_compose_release", "O", "getSpringThreshold$constraintlayout_compose_release", "J2", "Landroidx/constraintlayout/compose/SpringBoundary;", "getSpringBoundary$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/SpringBoundary;", "Uo", "getMaxVelocity$constraintlayout_compose_release", "KN", "getMaxAcceleration$constraintlayout_compose_release", "xMQ", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwipeMode {
    private static final SwipeMode gh;
    private static final SwipeMode mUb;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final SpringBoundary springBoundary;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final float maxAcceleration;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float springThreshold;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final float maxVelocity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float springDamping;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float springMass;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float springStiffness;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/constraintlayout/compose/SwipeMode$Companion;", "", "<init>", "()V", "", "maxVelocity", "maxAcceleration", "Landroidx/constraintlayout/compose/SwipeMode;", "t", "(FF)Landroidx/constraintlayout/compose/SwipeMode;", "mass", "stiffness", "damping", "threshold", "Landroidx/constraintlayout/compose/SpringBoundary;", "boundary", c.f62177j, "(FFFFLandroidx/constraintlayout/compose/SpringBoundary;)Landroidx/constraintlayout/compose/SwipeMode;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SwipeMode nr(Companion companion, float f3, float f4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = 4.0f;
            }
            if ((i2 & 2) != 0) {
                f4 = 1.2f;
            }
            return companion.t(f3, f4);
        }

        public static /* synthetic */ SwipeMode rl(Companion companion, float f3, float f4, float f5, float f6, SpringBoundary springBoundary, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f3 = 1.0f;
            }
            if ((i2 & 2) != 0) {
                f4 = 400.0f;
            }
            if ((i2 & 4) != 0) {
                f5 = 10.0f;
            }
            if ((i2 & 8) != 0) {
                f6 = 0.01f;
            }
            if ((i2 & 16) != 0) {
                springBoundary = SpringBoundary.INSTANCE.n();
            }
            SpringBoundary springBoundary2 = springBoundary;
            float f7 = f5;
            return companion.n(f3, f4, f7, f6, springBoundary2);
        }

        public final SwipeMode n(float mass, float stiffness, float damping, float threshold, SpringBoundary boundary) {
            return new SwipeMode("spring", mass, stiffness, damping, threshold, boundary, 0.0f, 0.0f, 192, null);
        }

        public final SwipeMode t(float maxVelocity, float maxAcceleration) {
            return new SwipeMode("velocity", 0.0f, 0.0f, 0.0f, 0.0f, null, maxVelocity, maxAcceleration, 62, null);
        }
    }

    public SwipeMode(String str, float f3, float f4, float f5, float f6, SpringBoundary springBoundary, float f7, float f8) {
        this.name = str;
        this.springMass = f3;
        this.springStiffness = f4;
        this.springDamping = f5;
        this.springThreshold = f6;
        this.springBoundary = springBoundary;
        this.maxVelocity = f7;
        this.maxAcceleration = f8;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        mUb = Companion.nr(companion, 0.0f, 0.0f, 3, null);
        gh = Companion.rl(companion, 0.0f, 0.0f, 0.0f, 0.0f, null, 31, null);
    }

    public /* synthetic */ SwipeMode(String str, float f3, float f4, float f5, float f6, SpringBoundary springBoundary, float f7, float f8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 400.0f : f4, (i2 & 8) != 0 ? 10.0f : f5, (i2 & 16) != 0 ? 0.01f : f6, (i2 & 32) != 0 ? SpringBoundary.INSTANCE.n() : springBoundary, (i2 & 64) != 0 ? 4.0f : f7, (i2 & 128) != 0 ? 1.2f : f8);
    }
}
