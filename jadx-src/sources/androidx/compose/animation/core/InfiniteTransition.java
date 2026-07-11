package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R#\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "", "gh", "(J)V", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "J2", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "qie", "az", "(Landroidx/compose/runtime/Composer;I)V", c.f62177j, "Ljava/lang/String;", "KN", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", "rl", "Landroidx/compose/runtime/collection/MutableVector;", "_animations", "", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "xMQ", "()Z", "ty", "(Z)V", "refreshChildNeeded", "nr", "J", "startTimeNanos", "O", "mUb", "HI", "isRunning", "", "Uo", "()Ljava/util/List;", "animations", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,345:1\n1101#2:346\n1083#2,2:347\n85#3:349\n113#3,2:350\n85#3:352\n113#3,2:353\n1247#4,6:355\n1247#4,6:361\n423#5,9:367\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n145#1:346\n145#1:347,2\n146#1:349\n146#1:350,2\n148#1:352\n148#1:353,2\n166#1:355,6\n168#1:361,6\n203#1:367,9\n*E\n"})
public final class InfiniteTransition {
    public static final int J2 = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableVector _animations = new MutableVector(new TransitionAnimationState[16], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState refreshChildNeeded = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private long startTimeNanos = Long.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState isRunning = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0001\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R+\u0010.\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001038\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010D¨\u0006F"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "label", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "", "N", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "", "playTimeNanos", "E2", "(J)V", "()V", "e", c.f62177j, "Ljava/lang/Object;", "XQ", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "t", "te", "setTargetValue$animation_core_release", "O", "Landroidx/compose/animation/core/TwoWayConverter;", "iF", "()Landroidx/compose/animation/core/TwoWayConverter;", "J2", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "r", "Landroidx/compose/runtime/MutableState;", "getValue", "X", "value", "o", "Landroidx/compose/animation/core/AnimationSpec;", "ck", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "Z", "Landroidx/compose/animation/core/TargetBasedAnimation;", "HI", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "", "S", "fD", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "g", "startOnTheNextFrame", "J", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,345:1\n85#2:346\n113#2,2:347\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n79#1:346\n79#1:347,2\n*E\n"})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private long playTimeNanosOffset;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final TwoWayConverter typeConverter;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private boolean isFinished;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private TargetBasedAnimation animation;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean startOnTheNextFrame;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Object initialValue;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private AnimationSpec animationSpec;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final MutableState value;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private Object targetValue;

        public final void e() {
            this.startOnTheNextFrame = true;
        }

        public TransitionAnimationState(Object obj, Object obj2, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, String str) {
            this.initialValue = obj;
            this.targetValue = obj2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation(this.animationSpec, twoWayConverter, this.initialValue, this.targetValue, null, 16, null);
        }

        public final void E2(long playTimeNanos) {
            InfiniteTransition.this.ty(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j2 = playTimeNanos - this.playTimeNanosOffset;
            X(this.animation.J2(j2));
            this.isFinished = this.animation.t(j2);
        }

        /* JADX INFO: renamed from: HI, reason: from getter */
        public final TargetBasedAnimation getAnimation() {
            return this.animation;
        }

        public final void N(Object initialValue, Object targetValue, AnimationSpec animationSpec) {
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            InfiniteTransition.this.ty(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        public final void T() {
            X(this.animation.getMutableTargetValue());
            this.startOnTheNextFrame = true;
        }

        public void X(Object obj) {
            this.value.setValue(obj);
        }

        /* JADX INFO: renamed from: XQ, reason: from getter */
        public final Object getInitialValue() {
            return this.initialValue;
        }

        /* JADX INFO: renamed from: ck, reason: from getter */
        public final AnimationSpec getAnimationSpec() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: fD, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: iF, reason: from getter */
        public final TwoWayConverter getTypeConverter() {
            return this.typeConverter;
        }

        /* JADX INFO: renamed from: te, reason: from getter */
        public final Object getTargetValue() {
            return this.targetValue;
        }
    }

    private final void HI(boolean z2) {
        this.isRunning.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gh(long playTimeNanos) {
        MutableVector mutableVector = this._animations;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) objArr[i2];
            if (!transitionAnimationState.getIsFinished()) {
                transitionAnimationState.E2(playTimeNanos);
            }
            if (!transitionAnimationState.getIsFinished()) {
                z2 = false;
            }
        }
        HI(!z2);
    }

    private final boolean mUb() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty(boolean z2) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z2));
    }

    private final boolean xMQ() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    public final void J2(TransitionAnimationState animation) {
        this._animations.rl(animation);
        ty(true);
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final List Uo() {
        return this._animations.Uo();
    }

    public final void qie(TransitionAnimationState animation) {
        this._animations.ck(animation);
    }

    public InfiniteTransition(String str) {
        this.label = str;
    }

    public final void az(Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(-318043801);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(this)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-318043801, i3, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                composerKN.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            if (!mUb() && !xMQ()) {
                composerKN.eF(1721270456);
                composerKN.Xw();
            } else {
                composerKN.eF(1719883733);
                boolean zE2 = composerKN.E2(this);
                Object objIF2 = composerKN.iF();
                if (zE2 || objIF2 == companion.n()) {
                    objIF2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    composerKN.o(objIF2);
                }
                EffectsKt.O(this, (Function2) objIF2, composerKN, i3 & 14);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    this.f15525n.az(composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
