package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ&\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR4\u0010k\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d¢\u0006\u0002\bg8\u0006¢\u0006\f\n\u0004\bU\u0010h\u001a\u0004\bi\u0010jR4\u0010n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d¢\u0006\u0002\bg8\u0006¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u0013\u0010p\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bo\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "sizeAnimation", "Landroidx/compose/ui/unit/IntOffset;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "graphicsLayerBlock", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "targetState", "fullSize", "ZwA", "(Landroidx/compose/animation/EnterExitState;J)J", "", "c", "()V", "kC", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "jE", "v", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "WKb", "(Landroidx/compose/animation/core/Transition;)V", "Xw", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Vd", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "jB", "getOffsetAnimation", "GT", "U", "getSlideAnimation", "b", "P5", "Landroidx/compose/animation/EnterTransition;", "W5k", "()Landroidx/compose/animation/EnterTransition;", "poH", "(Landroidx/compose/animation/EnterTransition;)V", "M7", "Landroidx/compose/animation/ExitTransition;", "NC9", "()Landroidx/compose/animation/ExitTransition;", "W1c", "(Landroidx/compose/animation/ExitTransition;)V", "p5", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "ex", "(Lkotlin/jvm/functions/Function0;)V", "eF", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "E", "Z", "lookaheadConstraintsAvailable", "M", "J", "lookaheadSize", "value", "FX", "ni", "(J)V", "lookaheadConstraints", "Landroidx/compose/ui/Alignment;", "B", "Landroidx/compose/ui/Alignment;", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "currentAlignment", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeTransitionSpec", "D", "getSlideSpec", "slideSpec", "UR", "alignment", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1274:1\n30#2:1275\n30#2:1281\n80#3:1276\n85#3:1278\n90#3:1280\n80#3:1282\n85#3:1284\n90#3:1286\n54#4:1277\n59#4:1279\n54#4:1283\n59#4:1285\n1#5:1287\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1161#1:1275\n1172#1:1281\n1161#1:1276\n1164#1:1278\n1164#1:1280\n1172#1:1282\n1189#1:1284\n1189#1:1286\n1164#1:1277\n1164#1:1279\n1189#1:1283\n1189#1:1285\n*E\n"})
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Alignment currentAlignment;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private ExitTransition exit;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private EnterTransition enter;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Transition.DeferredAnimation slideAnimation;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Transition.DeferredAnimation sizeAnimation;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Transition.DeferredAnimation offsetAnimation;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private Function0 isEnabled;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Transition transition;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = AnimationModifierKt.n();

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Function1 sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final FiniteAnimationSpec invoke(Transition.Segment segment) {
            EnterExitState enterExitState = EnterExitState.f15175n;
            EnterExitState enterExitState2 = EnterExitState.f15177t;
            FiniteAnimationSpec animationSpec = null;
            if (segment.t(enterExitState, enterExitState2)) {
                ChangeSize changeSize = this.f15245n.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    animationSpec = changeSize.getAnimationSpec();
                }
            } else if (segment.t(enterExitState2, EnterExitState.f15174O)) {
                ChangeSize changeSize2 = this.f15245n.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    animationSpec = changeSize2.getAnimationSpec();
                }
            } else {
                animationSpec = EnterExitTransitionKt.nr;
            }
            return animationSpec == null ? EnterExitTransitionKt.nr : animationSpec;
        }
    };

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Function1 slideSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
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
                Slide slide = this.f15246n.getEnter().getData().getSlide();
                return (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) ? EnterExitTransitionKt.f15186t : animationSpec2;
            }
            if (!segment.t(enterExitState2, EnterExitState.f15174O)) {
                return EnterExitTransitionKt.f15186t;
            }
            Slide slide2 = this.f15246n.getExit().getData().getSlide();
            return (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) ? EnterExitTransitionKt.f15186t : animationSpec;
        }
    };

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

    private final void ni(long j2) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j2;
    }

    public final void GT(Transition.DeferredAnimation deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final ExitTransition getExit() {
        return this.exit;
    }

    public final Alignment UR() {
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.HI().t(EnterExitState.f15175n, EnterExitState.f15177t)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    public final void Vd(Transition.DeferredAnimation deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void W1c(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final void WKb(Transition transition) {
        this.transition = transition;
    }

    public final long ZwA(EnterExitState targetState, long fullSize) {
        Function1 size;
        Function1 size2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                ChangeSize changeSize = this.enter.getData().getChangeSize();
                if (changeSize != null && (size = changeSize.getSize()) != null) {
                    return ((IntSize) size.invoke(IntSize.rl(fullSize))).getPackedValue();
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                    return ((IntSize) size2.invoke(IntSize.rl(fullSize))).getPackedValue();
                }
            }
        }
        return fullSize;
    }

    public final void b(Transition.DeferredAnimation deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void ex(Function0 function0) {
        this.isEnabled = function0;
    }

    public final long jE(EnterExitState targetState, long fullSize) {
        Function1 slideOffset;
        Function1 slideOffset2;
        Slide slide = this.enter.getData().getSlide();
        long jRl = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.INSTANCE.rl() : ((IntOffset) slideOffset2.invoke(IntSize.rl(fullSize))).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jRl2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.INSTANCE.rl() : ((IntOffset) slideOffset.invoke(IntSize.rl(fullSize))).getPackedValue();
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 == 1) {
            return IntOffset.INSTANCE.rl();
        }
        if (i2 == 2) {
            return jRl;
        }
        if (i2 == 3) {
            return jRl2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long kC(EnterExitState targetState, long fullSize) {
        if (this.currentAlignment == null) {
            return IntOffset.INSTANCE.rl();
        }
        if (UR() == null) {
            return IntOffset.INSTANCE.rl();
        }
        if (Intrinsics.areEqual(this.currentAlignment, UR())) {
            return IntOffset.INSTANCE.rl();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i2 == 1) {
            return IntOffset.INSTANCE.rl();
        }
        if (i2 == 2) {
            return IntOffset.INSTANCE.rl();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize = this.exit.getData().getChangeSize();
        if (changeSize == null) {
            return IntOffset.INSTANCE.rl();
        }
        long packedValue = ((IntSize) changeSize.getSize().invoke(IntSize.rl(fullSize))).getPackedValue();
        Alignment alignmentUR = UR();
        Intrinsics.checkNotNull(alignmentUR);
        LayoutDirection layoutDirection = LayoutDirection.f34160n;
        long jN = alignmentUR.n(fullSize, packedValue, layoutDirection);
        Alignment alignment = this.currentAlignment;
        Intrinsics.checkNotNull(alignment);
        return IntOffset.ty(jN, alignment.n(fullSize, packedValue, layoutDirection));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        State stateN;
        State stateN2;
        if (this.transition.xMQ() == this.transition.Ik()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignmentUR = UR();
            if (alignmentUR == null) {
                alignmentUR = Alignment.INSTANCE.HI();
            }
            this.currentAlignment = alignmentUR;
        }
        if (measureScope.Org()) {
            final Placeable placeableDR0 = measurable.dR0(j2);
            long jT2 = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
            this.lookaheadSize = jT2;
            ni(j2);
            return MeasureScope.ER(measureScope, (int) (jT2 >> 32), (int) (jT2 & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }

                public final void n(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        if (!((Boolean) this.isEnabled.invoke()).booleanValue()) {
            final Placeable placeableDR02 = measurable.dR0(j2);
            return MeasureScope.ER(measureScope, placeableDR02.getWidth(), placeableDR02.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    n(placementScope);
                    return Unit.INSTANCE;
                }

                public final void n(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.xMQ(placementScope, placeableDR02, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final Function1 function1N = this.graphicsLayerBlock.n();
        final Placeable placeableDR03 = measurable.dR0(j2);
        long jT3 = IntSize.t((((long) placeableDR03.getWidth()) << 32) | (((long) placeableDR03.getHeight()) & 4294967295L));
        final long j3 = AnimationModifierKt.rl(this.lookaheadSize) ? this.lookaheadSize : jT3;
        Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
        State stateN3 = deferredAnimation != null ? deferredAnimation.n(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.rl(n(enterExitState));
            }

            public final long n(EnterExitState enterExitState) {
                return this.f15238n.ZwA(enterExitState, j3);
            }
        }) : null;
        if (stateN3 != null) {
            jT3 = ((IntSize) stateN3.getValue()).getPackedValue();
        }
        long jNr = ConstraintsKt.nr(j2, jT3);
        Transition.DeferredAnimation deferredAnimation2 = this.offsetAnimation;
        long jRl = (deferredAnimation2 == null || (stateN2 = deferredAnimation2.n(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                return EnterExitTransitionKt.f15186t;
            }
        }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.t(n(enterExitState));
            }

            public final long n(EnterExitState enterExitState) {
                return this.f15241n.kC(enterExitState, j3);
            }
        })) == null) ? IntOffset.INSTANCE.rl() : ((IntOffset) stateN2.getValue()).getPackedValue();
        Transition.DeferredAnimation deferredAnimation3 = this.slideAnimation;
        long jRl2 = (deferredAnimation3 == null || (stateN = deferredAnimation3.n(this.slideSpec, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.t(n(enterExitState));
            }

            public final long n(EnterExitState enterExitState) {
                return this.f15243n.jE(enterExitState, j3);
            }
        })) == null) ? IntOffset.INSTANCE.rl() : ((IntOffset) stateN.getValue()).getPackedValue();
        Alignment alignment = this.currentAlignment;
        final long jHI = IntOffset.HI(alignment != null ? alignment.n(j3, jNr, LayoutDirection.f34160n) : IntOffset.INSTANCE.rl(), jRl2);
        final long j4 = jRl;
        return MeasureScope.ER(measureScope, (int) (jNr >> 32), (int) (jNr & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
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
                placementScope.S(placeableDR03, IntOffset.gh(j4) + IntOffset.gh(jHI), IntOffset.qie(j4) + IntOffset.qie(jHI), 0.0f, function1N);
            }
        }, 4, null);
    }

    public final void poH(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void pr(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public EnterExitTransitionModifierNode(Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = function0;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.n();
    }
}
