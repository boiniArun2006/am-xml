package androidx.compose.animation;

import GJW.C;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001GB[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0013R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RT\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R*\u00109\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00108\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00103\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R/\u0010F\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Landroidx/compose/ui/Alignment;", "alignment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "startSize", "endSize", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/Constraints;", "default", "b", "(J)J", "kQ", "()V", "c", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "targetSize", "UR", "v", "Landroidx/compose/animation/core/AnimationSpec;", "ex", "()Landroidx/compose/animation/core/AnimationSpec;", "ni", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Xw", "Landroidx/compose/ui/Alignment;", "W5k", "()Landroidx/compose/ui/Alignment;", "W1c", "(Landroidx/compose/ui/Alignment;)V", "jB", "Lkotlin/jvm/functions/Function2;", "poH", "()Lkotlin/jvm/functions/Function2;", "GT", "(Lkotlin/jvm/functions/Function2;)V", "U", "J", "lookaheadSize", "value", "P5", "Vd", "(J)V", "lookaheadConstraints", "", "M7", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "<set-?>", "p5", "Landroidx/compose/runtime/MutableState;", "NC9", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData", "AnimData", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,269:1\n85#2:270\n113#2,2:271\n30#3:273\n30#3:281\n80#4:274\n85#4:277\n90#4:280\n80#4:282\n61#5:275\n54#5:276\n63#5:278\n59#5:279\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n168#1:270\n168#1:271,2\n196#1:273\n238#1:281\n196#1:274\n198#1:277\n197#1:280\n238#1:282\n198#1:275\n198#1:276\n197#1:278\n197#1:279\n*E\n"})
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Alignment alignment;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function2 listener;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AnimationSpec animationSpec;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = AnimationModifierKt.n();

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long lookaheadConstraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final MutableState animData = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/compose/animation/core/Animatable;", "()Landroidx/compose/animation/core/Animatable;", "rl", "J", "()J", "t", "(J)V", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimData {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Animatable anim;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.O(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.KN(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.xMQ(this.startSize)) + ')';
        }

        private AnimData(Animatable animatable, long j2) {
            this.anim = animatable;
            this.startSize = j2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Animatable getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        public final void t(long j2) {
            this.startSize = j2;
        }
    }

    private final void Vd(long j2) {
        this.lookaheadConstraints = j2;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long b(long j2) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j2;
    }

    public final void GT(Function2 function2) {
        this.listener = function2;
    }

    public final AnimData NC9() {
        return (AnimData) this.animData.getValue();
    }

    public final void W1c(Alignment alignment) {
        this.alignment = alignment;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: ex, reason: from getter */
    public final AnimationSpec getAnimationSpec() {
        return this.animationSpec;
    }

    public final void ni(AnimationSpec animationSpec) {
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable placeableDR0;
        long jNr;
        if (measureScope.Org()) {
            Vd(j2);
            placeableDR0 = measurable.dR0(j2);
        } else {
            placeableDR0 = measurable.dR0(b(j2));
        }
        final Placeable placeable = placeableDR0;
        final long jT2 = IntSize.t((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & 4294967295L));
        if (measureScope.Org()) {
            this.lookaheadSize = jT2;
            jNr = jT2;
        } else {
            jNr = ConstraintsKt.nr(j2, UR(AnimationModifierKt.rl(this.lookaheadSize) ? this.lookaheadSize : jT2));
        }
        final int i2 = (int) (jNr >> 32);
        final int i3 = (int) (jNr & 4294967295L);
        return MeasureScope.ER(measureScope, i2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.gh(placementScope, placeable, this.f15374n.getAlignment().n(jT2, IntSize.t((((long) i2) << 32) | (((long) i3) & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: poH, reason: from getter */
    public final Function2 getListener() {
        return this.listener;
    }

    public final void pr(AnimData animData) {
        this.animData.setValue(animData);
    }

    public SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, Function2 function2) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = function2;
    }

    public final long UR(long targetSize) {
        AnimData animDataNC9 = NC9();
        boolean z2 = true;
        if (animDataNC9 != null) {
            if (IntSize.O(targetSize, ((IntSize) animDataNC9.getAnim().ty()).getPackedValue()) || animDataNC9.getAnim().Ik()) {
                z2 = false;
            }
            if (!IntSize.O(targetSize, ((IntSize) animDataNC9.getAnim().qie()).getPackedValue()) || z2) {
                animDataNC9.t(((IntSize) animDataNC9.getAnim().ty()).getPackedValue());
                C.nr(Xli(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animDataNC9, targetSize, this, null), 3, null);
            }
        } else {
            long j2 = 1;
            animDataNC9 = new AnimData(new Animatable(IntSize.rl(targetSize), VectorConvertersKt.KN(IntSize.INSTANCE), IntSize.rl(IntSize.t((j2 & 4294967295L) | (j2 << 32))), null, 8, null), targetSize, null);
        }
        pr(animDataNC9);
        return ((IntSize) animDataNC9.getAnim().ty()).getPackedValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        this.lookaheadSize = AnimationModifierKt.n();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void kQ() {
        super.kQ();
        pr(null);
    }
}
