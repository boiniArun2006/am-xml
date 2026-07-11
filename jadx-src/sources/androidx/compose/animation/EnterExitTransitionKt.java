package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001aB\u0010\u0012\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aB\u0010\u0015\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b!\u0010\"\u001aX\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b%\u0010&\u001aX\u0010+\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010*\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b+\u0010,\u001aX\u00100\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020-2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b0\u00101\u001aX\u00103\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b3\u00104\u001aX\u00106\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020-2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b6\u00107\u001aD\u00109\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u00108\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b9\u0010\u0013\u001aD\u0010;\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b;\u0010\u0013\u001aD\u0010=\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b()\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b=\u0010\u0016\u001aD\u0010?\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010>\u001a\u001d\u0012\u0013\u0012\u00110(¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b?\u0010\u0016\u001a\u0013\u0010@\u001a\u00020\u001c*\u00020'H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010B\u001a\u00020\u001c*\u00020-H\u0002¢\u0006\u0004\bB\u0010C\u001aA\u0010M\u001a\u00020L*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\b2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010N\u001a!\u0010O\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u0004H\u0001¢\u0006\u0004\bO\u0010P\u001a!\u0010Q\u001a\u00020\b*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020\bH\u0001¢\u0006\u0004\bQ\u0010R\u001a1\u0010T\u001a\u00020S*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\b2\u0006\u0010K\u001a\u00020JH\u0003¢\u0006\u0004\bT\u0010U\" \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y\"\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00010[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\"\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]\"\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\r0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010]\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e²\u0006\u000e\u0010c\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010d\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "ty", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/EnterTransition;", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "ck", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "fullSize", "initialOffset", "nY", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetOffset", "E2", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "r", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "mUb", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "shrinkTowards", "targetSize", "S", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "KN", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "qie", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "targetWidth", "Z", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "targetHeight", "aYN", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "initialOffsetX", "g", "initialOffsetY", "iF", "targetOffsetX", "e", "targetOffsetY", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "nHg", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;", "s7N", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/Modifier;", "Uo", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "wTp", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "bzg", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "O", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", c.f62177j, "Landroidx/compose/animation/core/TwoWayConverter;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/SpringSpec;", "rl", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "t", "DefaultOffsetAnimationSpec", "nr", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1274:1\n1247#2,6:1275\n1247#2,6:1281\n1247#2,6:1287\n1247#2,6:1293\n1247#2,6:1299\n1247#2,6:1305\n1247#2,6:1311\n1247#2,6:1317\n1247#2,6:1323\n85#3:1329\n113#3,2:1330\n85#3:1332\n113#3,2:1333\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n871#1:1275,6\n877#1:1281,6\n884#1:1287,6\n893#1:1293,6\n914#1:1299,6\n934#1:1305,6\n969#1:1311,6\n977#1:1317,6\n989#1:1323,6\n914#1:1329\n914#1:1330,2\n934#1:1332\n934#1:1333,2\n*E\n"})
public final class EnterExitTransitionKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TwoWayConverter f15185n = VectorConvertersKt.n(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return n(transformOrigin.getPackedValue());
        }

        public final AnimationVector2D n(long j2) {
            return new AnimationVector2D(TransformOrigin.J2(j2), TransformOrigin.Uo(j2));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.rl(n(animationVector2D));
        }

        public final long n(AnimationVector2D animationVector2D) {
            return TransformOriginKt.n(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final SpringSpec rl = AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SpringSpec f15186t = AnimationSpecKt.qie(0.0f, 400.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 1, null);
    private static final SpringSpec nr = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function1 J2(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, final EnterTransition enterTransition, final ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        final TransformOrigin transformOriginRl;
        final State stateN = deferredAnimation != null ? deferredAnimation.n(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                FiniteAnimationSpec animationSpec;
                FiniteAnimationSpec animationSpec2;
                EnterExitState enterExitState = EnterExitState.f15175n;
                EnterExitState enterExitState2 = EnterExitState.f15177t;
                if (segment.t(enterExitState, enterExitState2)) {
                    Fade fade = enterTransition.getData().getFade();
                    return (fade == null || (animationSpec2 = fade.getAnimationSpec()) == null) ? EnterExitTransitionKt.rl : animationSpec2;
                }
                if (!segment.t(enterExitState2, EnterExitState.f15174O)) {
                    return EnterExitTransitionKt.rl;
                }
                Fade fade2 = exitTransition.getData().getFade();
                return (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) ? EnterExitTransitionKt.rl : animationSpec;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.f15177t.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.f15175n.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.f15174O.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float alpha = 1.0f;
                if (i2 != 1) {
                    if (i2 == 2) {
                        Fade fade = enterTransition.getData().getFade();
                        if (fade != null) {
                            alpha = fade.getAlpha();
                        }
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Fade fade2 = exitTransition.getData().getFade();
                        if (fade2 != null) {
                            alpha = fade2.getAlpha();
                        }
                    }
                }
                return Float.valueOf(alpha);
            }
        }) : null;
        final State stateN2 = deferredAnimation2 != null ? deferredAnimation2.n(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                FiniteAnimationSpec animationSpec;
                FiniteAnimationSpec animationSpec2;
                EnterExitState enterExitState = EnterExitState.f15175n;
                EnterExitState enterExitState2 = EnterExitState.f15177t;
                if (segment.t(enterExitState, enterExitState2)) {
                    Scale scale = enterTransition.getData().getScale();
                    return (scale == null || (animationSpec2 = scale.getAnimationSpec()) == null) ? EnterExitTransitionKt.rl : animationSpec2;
                }
                if (!segment.t(enterExitState2, EnterExitState.f15174O)) {
                    return EnterExitTransitionKt.rl;
                }
                Scale scale2 = exitTransition.getData().getScale();
                return (scale2 == null || (animationSpec = scale2.getAnimationSpec()) == null) ? EnterExitTransitionKt.rl : animationSpec;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.f15177t.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.f15175n.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.f15174O.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float scale = 1.0f;
                if (i2 != 1) {
                    if (i2 == 2) {
                        Scale scale2 = enterTransition.getData().getScale();
                        if (scale2 != null) {
                            scale = scale2.getScale();
                        }
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale3 = exitTransition.getData().getScale();
                        if (scale3 != null) {
                            scale = scale3.getScale();
                        }
                    }
                }
                return Float.valueOf(scale);
            }
        }) : null;
        if (transition.xMQ() == EnterExitState.f15175n) {
            Scale scaleO = enterTransition.getData().getScale();
            transformOriginRl = (scaleO == null && (scaleO = exitTransition.getData().getScale()) == null) ? null : TransformOrigin.rl(scaleO.getTransformOrigin());
        } else {
            Scale scaleO2 = exitTransition.getData().getScale();
            if (scaleO2 != null || (scaleO2 = enterTransition.getData().getScale()) != null) {
                transformOriginRl = TransformOrigin.rl(scaleO2.getTransformOrigin());
            }
        }
        final State stateN3 = deferredAnimation3 != null ? deferredAnimation3.n(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                return AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
            }
        }, new Function1<EnterExitState, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.f15177t.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.f15175n.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.f15174O.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
                return TransformOrigin.rl(n(enterExitState));
            }

            public final long n(EnterExitState enterExitState) {
                TransformOrigin transformOriginRl2;
                int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i2 != 1) {
                    transformOriginRl2 = null;
                    if (i2 == 2) {
                        Scale scale = enterTransition.getData().getScale();
                        if (scale != null || (scale = exitTransition.getData().getScale()) != null) {
                            transformOriginRl2 = TransformOrigin.rl(scale.getTransformOrigin());
                        }
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale2 = exitTransition.getData().getScale();
                        if (scale2 != null || (scale2 = enterTransition.getData().getScale()) != null) {
                            transformOriginRl2 = TransformOrigin.rl(scale2.getTransformOrigin());
                        }
                    }
                } else {
                    transformOriginRl2 = transformOriginRl;
                }
                return transformOriginRl2 != null ? transformOriginRl2.getPackedValue() : TransformOrigin.INSTANCE.n();
            }
        }) : null;
        return new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                State state = stateN;
                graphicsLayerScope.rl(state != null ? ((Number) state.getValue()).floatValue() : 1.0f);
                State state2 = stateN2;
                graphicsLayerScope.Uo(state2 != null ? ((Number) state2.getValue()).floatValue() : 1.0f);
                State state3 = stateN2;
                graphicsLayerScope.az(state3 != null ? ((Number) state3.getValue()).floatValue() : 1.0f);
                State state4 = stateN3;
                graphicsLayerScope.tUK(state4 != null ? ((TransformOrigin) state4.getValue()).getPackedValue() : TransformOrigin.INSTANCE.n());
            }
        };
    }

    public static final ExitTransition E2(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition HI(FiniteAnimationSpec finiteAnimationSpec, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return ty(finiteAnimationSpec, f3);
    }

    public static /* synthetic */ ExitTransition Ik(FiniteAnimationSpec finiteAnimationSpec, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return ck(finiteAnimationSpec, f3);
    }

    public static /* synthetic */ ExitTransition N(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final Integer n(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return T(finiteAnimationSpec, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[PHI: r1
      0x011e: PHI (r1v11 androidx.compose.animation.EnterTransition) = (r1v9 androidx.compose.animation.EnterTransition), (r1v12 androidx.compose.animation.EnterTransition) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[PHI: r2
      0x0139: PHI (r2v10 androidx.compose.animation.ExitTransition) = (r2v8 androidx.compose.animation.ExitTransition), (r2v11 androidx.compose.animation.ExitTransition) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final GraphicsLayerBlockForEnterExit O(final Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, String str, Composer composer, int i2) {
        final Transition.DeferredAnimation deferredAnimation;
        final Transition.DeferredAnimation deferredAnimation2;
        EnterTransition enterTransition2;
        boolean z2;
        ExitTransition exitTransition2;
        boolean z3;
        boolean zE2;
        Object objIF;
        Composer composer2 = composer;
        if (ComposerKt.v()) {
            ComposerKt.p5(642253525, i2, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:956)");
        }
        boolean z4 = true;
        boolean z5 = (enterTransition.getData().getFade() == null && exitTransition.getData().getFade() == null) ? false : true;
        boolean z6 = (enterTransition.getData().getScale() == null && exitTransition.getData().getScale() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimationO = null;
        if (z5) {
            composer2.eF(-675026101);
            TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE);
            Object objIF2 = composer2.iF();
            if (objIF2 == Composer.INSTANCE.n()) {
                objIF2 = str + " alpha";
                composer2.o(objIF2);
            }
            Transition.DeferredAnimation deferredAnimationO2 = androidx.compose.animation.core.TransitionKt.O(transition, twoWayConverterXMQ, (String) objIF2, composer2, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer2 = composer2;
            composer2.Xw();
            deferredAnimation = deferredAnimationO2;
        } else {
            composer2.eF(-674857617);
            composer2.Xw();
            deferredAnimation = null;
        }
        if (z6) {
            composer2.eF(-674790005);
            TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE);
            Object objIF3 = composer2.iF();
            if (objIF3 == Composer.INSTANCE.n()) {
                objIF3 = str + " scale";
                composer2.o(objIF3);
            }
            Transition.DeferredAnimation deferredAnimationO3 = androidx.compose.animation.core.TransitionKt.O(transition, twoWayConverterXMQ2, (String) objIF3, composer2, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer2.Xw();
            deferredAnimation2 = deferredAnimationO3;
        } else {
            composer2.eF(-674621521);
            composer2.Xw();
            deferredAnimation2 = null;
        }
        if (z6) {
            composer2.eF(-674543896);
            deferredAnimationO = androidx.compose.animation.core.TransitionKt.O(transition, f15185n, "TransformOriginInterruptionHandling", composer2, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer2.Xw();
        } else {
            composer2.eF(-674372529);
            composer2.Xw();
        }
        boolean zE22 = composer2.E2(deferredAnimation);
        if (((i2 & 112) ^ 48) > 32) {
            enterTransition2 = enterTransition;
            if (composer2.p5(enterTransition2)) {
                z2 = true;
            }
            boolean z7 = zE22 | z2;
            if (((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                exitTransition2 = exitTransition;
                if (composer2.p5(exitTransition2)) {
                    z3 = true;
                }
                boolean zE23 = z7 | z3 | composer2.E2(deferredAnimation2);
                if ((((i2 & 14) ^ 6) <= 4 || !composer2.p5(transition)) && (i2 & 6) != 4) {
                }
                zE2 = zE23 | z4 | composer2.E2(deferredAnimationO);
                objIF = composer2.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    final EnterTransition enterTransition3 = enterTransition2;
                    final ExitTransition exitTransition3 = exitTransition2;
                    final Transition.DeferredAnimation deferredAnimation3 = deferredAnimationO;
                    GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.n
                        @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                        public final Function1 n() {
                            return EnterExitTransitionKt.J2(deferredAnimation, deferredAnimation2, transition, enterTransition3, exitTransition3, deferredAnimation3);
                        }
                    };
                    composer2.o(graphicsLayerBlockForEnterExit);
                    objIF = graphicsLayerBlockForEnterExit;
                }
                GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit2 = (GraphicsLayerBlockForEnterExit) objIF;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                return graphicsLayerBlockForEnterExit2;
            }
            exitTransition2 = exitTransition;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
                z3 = false;
            }
            boolean zE232 = z7 | z3 | composer2.E2(deferredAnimation2);
            z4 = ((i2 & 14) ^ 6) <= 4 ? false : false;
            zE2 = zE232 | z4 | composer2.E2(deferredAnimationO);
            objIF = composer2.iF();
            if (zE2) {
                final EnterTransition enterTransition32 = enterTransition2;
                final ExitTransition exitTransition32 = exitTransition2;
                final Transition.DeferredAnimation deferredAnimation32 = deferredAnimationO;
                GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit3 = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.n
                    @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                    public final Function1 n() {
                        return EnterExitTransitionKt.J2(deferredAnimation, deferredAnimation2, transition, enterTransition32, exitTransition32, deferredAnimation32);
                    }
                };
                composer2.o(graphicsLayerBlockForEnterExit3);
                objIF = graphicsLayerBlockForEnterExit3;
            }
            GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit22 = (GraphicsLayerBlockForEnterExit) objIF;
            if (ComposerKt.v()) {
            }
            return graphicsLayerBlockForEnterExit22;
        }
        enterTransition2 = enterTransition;
        if ((i2 & 48) != 32) {
            z2 = false;
        }
        boolean z72 = zE22 | z2;
        if (((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) {
        }
        boolean zE2322 = z72 | z3 | composer2.E2(deferredAnimation2);
        if (((i2 & 14) ^ 6) <= 4) {
        }
        zE2 = zE2322 | z4 | composer2.E2(deferredAnimationO);
        objIF = composer2.iF();
        if (zE2) {
        }
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit222 = (GraphicsLayerBlockForEnterExit) objIF;
        if (ComposerKt.v()) {
        }
        return graphicsLayerBlockForEnterExit222;
    }

    public static final ExitTransition S(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), null, false, null, 59, null));
    }

    public static final ExitTransition T(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return E2(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.t(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                return IntOffset.J2((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
            }
        });
    }

    public static final Modifier Uo(Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, String str, Composer composer, int i2, int i3) {
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize changeSizeN;
        final Function0 function02 = (i3 & 4) != 0 ? new Function0<Boolean>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : function0;
        if (ComposerKt.v()) {
            ComposerKt.p5(28261782, i2, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i5 = i2 & 14;
        EnterTransition enterTransitionWTp = wTp(transition, enterTransition, composer, i2 & 126);
        int i7 = i2 >> 3;
        ExitTransition exitTransitionBzg = bzg(transition, exitTransition, composer, (i7 & 112) | i5);
        boolean z2 = true;
        boolean z3 = (enterTransitionWTp.getData().getSlide() == null && exitTransitionBzg.getData().getSlide() == null) ? false : true;
        boolean z4 = (enterTransitionWTp.getData().getChangeSize() == null && exitTransitionBzg.getData().getChangeSize() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimationO = null;
        if (z3) {
            composer.eF(-821159459);
            TwoWayConverter twoWayConverterUo = VectorConvertersKt.Uo(IntOffset.INSTANCE);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = str + " slide";
                composer.o(objIF);
            }
            Transition.DeferredAnimation deferredAnimationO2 = androidx.compose.animation.core.TransitionKt.O(transition, twoWayConverterUo, (String) objIF, composer, i5 | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer.Xw();
            deferredAnimation = deferredAnimationO2;
        } else {
            composer.eF(-821053656);
            composer.Xw();
            deferredAnimation = null;
        }
        if (z4) {
            composer.eF(-820961865);
            TwoWayConverter twoWayConverterKN = VectorConvertersKt.KN(IntSize.INSTANCE);
            Object objIF2 = composer.iF();
            if (objIF2 == Composer.INSTANCE.n()) {
                objIF2 = str + " shrink/expand";
                composer.o(objIF2);
            }
            Transition.DeferredAnimation deferredAnimationO3 = androidx.compose.animation.core.TransitionKt.O(transition, twoWayConverterKN, (String) objIF2, composer, i5 | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer.Xw();
            deferredAnimation2 = deferredAnimationO3;
        } else {
            composer.eF(-820851041);
            composer.Xw();
            deferredAnimation2 = null;
        }
        if (z4) {
            composer.eF(-820777446);
            TwoWayConverter twoWayConverterUo2 = VectorConvertersKt.Uo(IntOffset.INSTANCE);
            Object objIF3 = composer.iF();
            if (objIF3 == Composer.INSTANCE.n()) {
                objIF3 = str + " InterruptionHandlingOffset";
                composer.o(objIF3);
            }
            deferredAnimationO = androidx.compose.animation.core.TransitionKt.O(transition, twoWayConverterUo2, (String) objIF3, composer, i5 | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer.Xw();
        } else {
            composer.eF(-820608001);
            composer.Xw();
        }
        ChangeSize changeSizeN2 = enterTransitionWTp.getData().getChangeSize();
        final boolean z5 = ((changeSizeN2 == null || changeSizeN2.getClip()) && ((changeSizeN = exitTransitionBzg.getData().getChangeSize()) == null || changeSizeN.getClip()) && z4) ? false : true;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExitO = O(transition, enterTransitionWTp, exitTransitionBzg, str, composer, i5 | (i7 & 7168));
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean zN = composer.n(z5);
        if ((((i2 & 7168) ^ 3072) <= 2048 || !composer.p5(function02)) && (i2 & 3072) != 2048) {
            z2 = false;
        }
        boolean z6 = zN | z2;
        Object objIF4 = composer.iF();
        if (z6 || objIF4 == Composer.INSTANCE.n()) {
            objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    n(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                public final void n(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.X(!z5 && ((Boolean) function02.invoke()).booleanValue());
                }
            };
            composer.o(objIF4);
        }
        Modifier modifierZmq = GraphicsLayerModifierKt.n(companion, (Function1) objIF4).Zmq(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimationO, deferredAnimation, enterTransitionWTp, exitTransitionBzg, function02, graphicsLayerBlockForEnterExitO));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return modifierZmq;
    }

    public static /* synthetic */ ExitTransition ViF(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.INSTANCE.n();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final Integer n(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return aYN(finiteAnimationSpec, vertical, z2, function1);
    }

    public static /* synthetic */ ExitTransition WPU(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                public final long n(long j2) {
                    long j3 = 0;
                    return IntSize.t((j3 & 4294967295L) | (j3 << 32));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.rl(n(intSize.getPackedValue()));
                }
            };
        }
        return S(finiteAnimationSpec, alignment, z2, function1);
    }

    public static /* synthetic */ ExitTransition X(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final Integer n(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return e(finiteAnimationSpec, function1);
    }

    public static /* synthetic */ ExitTransition XQ(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.INSTANCE.mUb();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final Integer n(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return Z(finiteAnimationSpec, horizontal, z2, function1);
    }

    public static /* synthetic */ EnterTransition az(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            vertical = Alignment.INSTANCE.n();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final Integer n(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return qie(finiteAnimationSpec, vertical, z2, function1);
    }

    public static final ExitTransition ck(FiniteAnimationSpec finiteAnimationSpec, float f3) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f3, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static final ExitTransition e(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return E2(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.t(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                return IntOffset.J2((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }
        });
    }

    public static /* synthetic */ EnterTransition fD(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final Integer n(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return iF(finiteAnimationSpec, function1);
    }

    public static final EnterTransition g(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return nY(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.t(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                return IntOffset.J2((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }
        });
    }

    public static /* synthetic */ EnterTransition gh(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                public final long n(long j2) {
                    long j3 = 0;
                    return IntSize.t((j3 & 4294967295L) | (j3 << 32));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.rl(n(intSize.getPackedValue()));
                }
            };
        }
        return mUb(finiteAnimationSpec, alignment, z2, function1);
    }

    public static final EnterTransition iF(FiniteAnimationSpec finiteAnimationSpec, final Function1 function1) {
        return nY(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.t(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                return IntOffset.J2((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
            }
        });
    }

    public static final EnterTransition mUb(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z2, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z2), null, false, null, 59, null));
    }

    private static final Alignment nHg(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(horizontal, companion.gh()) ? companion.KN() : Intrinsics.areEqual(horizontal, companion.mUb()) ? companion.J2() : companion.O();
    }

    public static final EnterTransition nY(FiniteAnimationSpec finiteAnimationSpec, Function1 function1) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition o(FiniteAnimationSpec finiteAnimationSpec, float f3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = TransformOrigin.INSTANCE.n();
        }
        return r(finiteAnimationSpec, f3, j2);
    }

    public static final EnterTransition r(FiniteAnimationSpec finiteAnimationSpec, float f3, long j2) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f3, j2, finiteAnimationSpec, null), false, null, 55, null));
    }

    private static final Alignment s7N(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(vertical, companion.qie()) ? companion.az() : Intrinsics.areEqual(vertical, companion.n()) ? companion.rl() : companion.O();
    }

    public static /* synthetic */ EnterTransition te(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final Integer n(int i3) {
                    return Integer.valueOf((-i3) / 2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return g(finiteAnimationSpec, function1);
    }

    public static final EnterTransition ty(FiniteAnimationSpec finiteAnimationSpec, float f3) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f3, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition xMQ(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
        }
        if ((i2 & 2) != 0) {
            horizontal = Alignment.INSTANCE.mUb();
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final Integer n(int i3) {
                    return 0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return n(num.intValue());
                }
            };
        }
        return KN(finiteAnimationSpec, horizontal, z2, function1);
    }

    public static final EnterTransition KN(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, final Function1 function1) {
        return mUb(finiteAnimationSpec, nHg(horizontal), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.rl(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                int iIntValue = ((Number) function1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue();
                return IntSize.t((((long) ((int) (j2 & 4294967295L))) & 4294967295L) | (((long) iIntValue) << 32));
            }
        });
    }

    private static final ExitTransition Xw(MutableState mutableState) {
        return (ExitTransition) mutableState.getValue();
    }

    public static final ExitTransition Z(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z2, final Function1 function1) {
        return S(finiteAnimationSpec, nHg(horizontal), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.rl(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                int iIntValue = ((Number) function1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue();
                return IntSize.t((((long) ((int) (j2 & 4294967295L))) & 4294967295L) | (((long) iIntValue) << 32));
            }
        });
    }

    public static final ExitTransition aYN(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, final Function1 function1) {
        return S(finiteAnimationSpec, s7N(vertical), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.rl(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                int i2 = (int) (j2 >> 32);
                return IntSize.t((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i2) << 32));
            }
        });
    }

    public static final ExitTransition bzg(Transition transition, ExitTransition exitTransition, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1363864804, i2, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(transition)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(exitTransition, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        if (transition.xMQ() == transition.Ik() && transition.xMQ() == EnterExitState.f15177t) {
            if (transition.WPU()) {
                jB(mutableState, exitTransition);
            } else {
                jB(mutableState, ExitTransition.INSTANCE.n());
            }
        } else if (transition.Ik() != EnterExitState.f15177t) {
            jB(mutableState, Xw(mutableState).t(exitTransition));
        }
        ExitTransition exitTransitionXw = Xw(mutableState);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return exitTransitionXw;
    }

    private static final void jB(MutableState mutableState, ExitTransition exitTransition) {
        mutableState.setValue(exitTransition);
    }

    public static final EnterTransition qie(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z2, final Function1 function1) {
        return mUb(finiteAnimationSpec, s7N(vertical), z2, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.rl(n(intSize.getPackedValue()));
            }

            public final long n(long j2) {
                int i2 = (int) (j2 >> 32);
                return IntSize.t((((long) ((Number) function1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i2) << 32));
            }
        });
    }

    private static final void rV9(MutableState mutableState, EnterTransition enterTransition) {
        mutableState.setValue(enterTransition);
    }

    private static final EnterTransition v(MutableState mutableState) {
        return (EnterTransition) mutableState.getValue();
    }

    public static final EnterTransition wTp(Transition transition, EnterTransition enterTransition, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(21614502, i2, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        if ((((i2 & 14) ^ 6) > 4 && composer.p5(transition)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(enterTransition, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        if (transition.xMQ() == transition.Ik() && transition.xMQ() == EnterExitState.f15177t) {
            if (transition.WPU()) {
                rV9(mutableState, enterTransition);
            } else {
                rV9(mutableState, EnterTransition.INSTANCE.n());
            }
        } else if (transition.Ik() == EnterExitState.f15177t) {
            rV9(mutableState, v(mutableState).t(enterTransition));
        }
        EnterTransition enterTransitionV = v(mutableState);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return enterTransitionV;
    }
}
