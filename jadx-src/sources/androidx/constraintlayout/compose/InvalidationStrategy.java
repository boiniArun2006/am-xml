package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001 B^\u0012E\b\u0002\u0010\u000b\u001a?\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0002\b\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010RT\u0010\u000b\u001a?\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategy;", "", "Lkotlin/Function3;", "Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "old", "new", "", "Lkotlin/ExtensionFunctionType;", "onIncomingConstraints", "Lkotlin/Function0;", "", "onObservedStateChange", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", c.f62177j, "Lkotlin/jvm/functions/Function3;", "t", "()Lkotlin/jvm/functions/Function3;", "rl", "Lkotlin/jvm/functions/Function0;", "nr", "()Lkotlin/jvm/functions/Function0;", "Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "scope", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "O", "()Landroidx/constraintlayout/compose/ShouldInvalidateCallback;", "shouldInvalidate", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InvalidationStrategy {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function3 onIncomingConstraints;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final ShouldInvalidateCallback shouldInvalidate;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 onObservedStateChange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InvalidationStrategySpecification scope = new InvalidationStrategySpecification();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int J2 = 8;
    private static final InvalidationStrategy Uo = new InvalidationStrategy(null, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategy$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "DefaultInvalidationStrategy", "Landroidx/constraintlayout/compose/InvalidationStrategy;", c.f62177j, "()Landroidx/constraintlayout/compose/InvalidationStrategy;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InvalidationStrategy n() {
            return InvalidationStrategy.Uo;
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ShouldInvalidateCallback getShouldInvalidate() {
        return this.shouldInvalidate;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function0 getOnObservedStateChange() {
        return this.onObservedStateChange;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Function3 getOnIncomingConstraints() {
        return this.onIncomingConstraints;
    }

    public InvalidationStrategy(Function3 function3, Function0 function0) {
        ShouldInvalidateCallback shouldInvalidateCallback;
        this.onIncomingConstraints = function3;
        this.onObservedStateChange = function0;
        if (function3 == null) {
            shouldInvalidateCallback = null;
        } else {
            shouldInvalidateCallback = new ShouldInvalidateCallback() { // from class: androidx.constraintlayout.compose.InvalidationStrategy$shouldInvalidate$1$1
                @Override // androidx.constraintlayout.compose.ShouldInvalidateCallback
                public final boolean n(long j2, long j3) {
                    return ((Boolean) this.f34561n.getOnIncomingConstraints().invoke(this.f34561n.scope, Constraints.n(j2), Constraints.n(j3))).booleanValue();
                }
            };
        }
        this.shouldInvalidate = shouldInvalidateCallback;
    }
}
