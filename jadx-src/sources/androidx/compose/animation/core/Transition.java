package androidx.compose.animation.core;

import GJW.C;
import GJW.Lu;
import GJW.h;
import GJW.vd;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J'\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b(\u0010'J)\u0010+\u001a\u00020\u00192\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u00102\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0014H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0000¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0000¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020\u00102\u0018\u0010@\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030?R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010I\u001a\u0004\bJ\u0010>R+\u0010!\u001a\u00028\u00002\u0006\u0010K\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u00100R7\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000P2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000P8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010L\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR+\u0010Y\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010V\u001a\u0004\bW\u0010\u000f\"\u0004\bX\u0010\u001eR+\u0010\\\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010V\u001a\u0004\bZ\u0010\u000f\"\u0004\b[\u0010\u001eR+\u0010b\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010L\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR,\u0010f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010h\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR+\u0010k\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u00198G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010L\u001a\u0004\bi\u0010_\"\u0004\bj\u0010aR\"\u0010o\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bl\u0010\u000f\"\u0004\bn\u0010\u001eR\u001b\u0010r\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010p\u001a\u0004\bq\u0010\u000fR\u0011\u0010s\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bd\u0010NR\u0011\u0010t\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0001\u0010_R$\u0010\"\u001a\u00020\r2\u0006\u0010u\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010\u000f\"\u0004\bw\u0010\u001eR\u001b\u0010{\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000x8F¢\u0006\u0006\u001a\u0004\by\u0010zR)\u0010|\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000x8F¢\u0006\u0006\u001a\u0004\b]\u0010zR\u001a\u0010~\u001a\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010\u0012\u001a\u0004\bg\u0010_¨\u0006\u0083\u0001"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "parentTransition", "", "label", "<init>", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "J2", "()J", "", "aYN", "()V", "frameTimeNanos", "", "durationScale", "nY", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "g", "(JZ)V", "iF", "(J)V", "ViF", "te", "targetState", "playTimeNanos", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "nr", "(Landroidx/compose/animation/core/Transition;)Z", "e", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "t", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "E2", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "P5", "(Ljava/lang/Object;)V", "O", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "N", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animationState", "nHg", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "fraction", "X", "(F)V", "Uo", "U", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "fD", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", c.f62177j, "Landroidx/compose/animation/core/TransitionState;", "rl", "Landroidx/compose/animation/core/Transition;", "az", "()Landroidx/compose/animation/core/Transition;", "Ljava/lang/String;", "gh", "<set-?>", "Landroidx/compose/runtime/MutableState;", "Ik", "()Ljava/lang/Object;", "bzg", "Landroidx/compose/animation/core/Transition$Segment;", "HI", "()Landroidx/compose/animation/core/Transition$Segment;", "v", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "Landroidx/compose/runtime/MutableLongState;", "XQ", "jB", "_playTimeNanos", "ck", "rV9", "startTimeNanos", "KN", "Z", "()Z", "Xw", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "xMQ", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "mUb", "_transitions", "WPU", "wTp", "isSeeking", "qie", "J", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "Landroidx/compose/runtime/State;", "r", "totalDurationNanos", "currentState", "isRunning", "value", "ty", "s7N", "", "o", "()Ljava/util/List;", "transitions", "animations", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n85#2:2154\n113#2,2:2155\n85#2:2157\n113#2,2:2158\n85#2:2178\n78#3:2148\n107#3,2:2149\n78#3:2151\n107#3,2:2152\n102#4,2:2160\n34#4,6:2162\n104#4:2168\n102#4,2:2169\n34#4,6:2171\n104#4:2177\n34#4,6:2179\n34#4,6:2185\n34#4,6:2191\n34#4,6:2197\n34#4,6:2203\n34#4,6:2209\n34#4,6:2215\n34#4,6:2221\n34#4,6:2247\n34#4,6:2253\n34#4,6:2259\n34#4,6:2265\n34#4,6:2271\n34#4,6:2277\n34#4,6:2283\n34#4,6:2289\n34#4,6:2295\n34#4,6:2301\n269#4,3:2307\n34#4,6:2310\n272#4:2316\n34#4,6:2317\n557#5:2227\n554#5,6:2228\n1247#6,3:2234\n1250#6,3:2238\n1247#6,6:2241\n555#7:2237\n1#8:2323\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n916#1:2142\n916#1:2143,2\n923#1:2145\n923#1:2146,2\n953#1:2154\n953#1:2155,2\n969#1:2157\n969#1:2158,2\n998#1:2178\n930#1:2148\n930#1:2149,2\n950#1:2151\n950#1:2152,2\n987#1:2160,2\n987#1:2162,6\n987#1:2168\n988#1:2169,2\n988#1:2171,6\n988#1:2177\n1002#1:2179,6\n1003#1:2185,6\n1036#1:2191,6\n1045#1:2197,6\n1083#1:2203,6\n1121#1:2209,6\n1134#1:2215,6\n1168#1:2221,6\n1220#1:2247,6\n1221#1:2253,6\n1236#1:2259,6\n1237#1:2265,6\n1245#1:2271,6\n1246#1:2277,6\n1251#1:2283,6\n1252#1:2289,6\n1262#1:2295,6\n1263#1:2301,6\n1267#1:2307,3\n1267#1:2310,6\n1267#1:2316\n1276#1:2317,6\n1185#1:2227\n1185#1:2228,6\n1185#1:2234,3\n1185#1:2238,3\n1186#1:2241,6\n1185#1:2237\n*E\n"})
public final class Transition<S> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableLongState _playTimeNanos;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MutableState updateChildrenNeeded;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState segment;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableLongState startTimeNanos;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final State totalDurationNanos;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState isSeeking;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final SnapshotStateList _transitions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TransitionState transitionState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState targetState;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Transition parentTransition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final SnapshotStateList _animations;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001)B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b¢\u0006\u0002\b\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R{\u0010(\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"2.\u0010#\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010!R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\"8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&\"\u0004\b$\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "state", "targetValueByState", "Landroidx/compose/runtime/State;", c.f62177j, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "nr", "()V", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "rl", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RestrictTo
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1619#1:2142\n1619#1:2143,2\n*E\n"})
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final TwoWayConverter typeConverter;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final MutableState data = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR?\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R=\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0014\u0010&\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "state", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "fD", "(Landroidx/compose/animation/core/Transition$Segment;)V", c.f62177j, "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "HI", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "t", "Lkotlin/jvm/functions/Function1;", "XQ", "()Lkotlin/jvm/functions/Function1;", "iF", "(Lkotlin/jvm/functions/Function1;)V", "O", "ck", "te", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
            private Function1 targetValueByState;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final TransitionAnimationState animation;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private Function1 transitionSpec;

            public DeferredAnimationData(TransitionAnimationState transitionAnimationState, Function1 function1, Function1 function12) {
                this.animation = transitionAnimationState;
                this.transitionSpec = function1;
                this.targetValueByState = function12;
            }

            /* JADX INFO: renamed from: HI, reason: from getter */
            public final TransitionAnimationState getAnimation() {
                return this.animation;
            }

            /* JADX INFO: renamed from: XQ, reason: from getter */
            public final Function1 getTransitionSpec() {
                return this.transitionSpec;
            }

            /* JADX INFO: renamed from: ck, reason: from getter */
            public final Function1 getTargetValueByState() {
                return this.targetValueByState;
            }

            public final void fD(Segment segment) {
                Object objInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!Transition.this.WPU()) {
                    this.animation.E(objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.p5(this.targetValueByState.invoke(segment.getInitialState()), objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            public Object getValue() {
                fD(Transition.this.HI());
                return this.animation.getValue();
            }

            public final void iF(Function1 function1) {
                this.transitionSpec = function1;
            }

            public final void te(Function1 function1) {
                this.targetValueByState = function1;
            }
        }

        public DeferredAnimation(TwoWayConverter twoWayConverter, String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final DeferredAnimationData rl() {
            return (DeferredAnimationData) this.data.getValue();
        }

        public final void t(DeferredAnimationData deferredAnimationData) {
            this.data.setValue(deferredAnimationData);
        }

        public final State n(Function1 transitionSpec, Function1 targetValueByState) {
            DeferredAnimationData deferredAnimationDataRl = rl();
            if (deferredAnimationDataRl == null) {
                Transition transition = Transition.this;
                deferredAnimationDataRl = new DeferredAnimationData(new TransitionAnimationState(targetValueByState.invoke(transition.xMQ()), AnimationStateKt.xMQ(this.typeConverter, targetValueByState.invoke(Transition.this.xMQ())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition transition2 = Transition.this;
                t(deferredAnimationDataRl);
                transition2.t(deferredAnimationDataRl.getAnimation());
            }
            Transition transition3 = Transition.this;
            deferredAnimationDataRl.te(targetValueByState);
            deferredAnimationDataRl.iF(transitionSpec);
            deferredAnimationDataRl.fD(transition3.HI());
            return deferredAnimationDataRl;
        }

        public final void nr() {
            DeferredAnimationData deferredAnimationDataRl = rl();
            if (deferredAnimationDataRl != null) {
                Transition transition = Transition.this;
                deferredAnimationDataRl.getAnimation().p5(deferredAnimationDataRl.getTargetValueByState().invoke(transition.HI().getInitialState()), deferredAnimationDataRl.getTargetValueByState().invoke(transition.HI().getTargetState()), (FiniteAnimationSpec) deferredAnimationDataRl.getTransitionSpec().invoke(transition.HI()));
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "Ljava/lang/Object;", "nr", "()Ljava/lang/Object;", "rl", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SegmentImpl<S> implements Segment<S> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Object initialState;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Object targetState;

        public boolean equals(Object other) {
            if (!(other instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) other;
            return Intrinsics.areEqual(getInitialState(), segment.getInitialState()) && Intrinsics.areEqual(getTargetState(), segment.getTargetState());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* JADX INFO: renamed from: n, reason: from getter */
        public Object getTargetState() {
            return this.targetState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* JADX INFO: renamed from: nr, reason: from getter */
        public Object getInitialState() {
            return this.initialState;
        }

        public SegmentImpl(Object obj, Object obj2) {
            this.initialState = obj;
            this.targetState = obj2;
        }

        public int hashCode() {
            int iHashCode;
            Object initialState = getInitialState();
            int iHashCode2 = 0;
            if (initialState != null) {
                iHashCode = initialState.hashCode();
            } else {
                iHashCode = 0;
            }
            int i2 = iHashCode * 31;
            Object targetState = getTargetState();
            if (targetState != null) {
                iHashCode2 = targetState.hashCode();
            }
            return i2 + iHashCode2;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0001\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00028\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010&\u001a\u00028\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b+\u0010,R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010%R+\u0010&\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R7\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010'8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRC\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020D8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u00106\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010P\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\"R$\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010Y\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010^\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u001eR\u0016\u0010_\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010KR+\u0010b\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b`\u00108\"\u0004\ba\u0010:R\u0016\u0010d\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010cR+\u0010i\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010\u0018R\u0016\u0010j\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010KR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010k¨\u0006m"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "", "isInterrupted", "", "P5", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "X", "(JZ)V", "nHg", "(J)V", "eF", "()V", "", "fraction", "N", "(F)V", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "animationState", "bzg", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "HI", "toString", "()Ljava/lang/String;", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "E", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "p5", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", c.f62177j, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "t", "Ljava/lang/String;", "getLabel", "<set-?>", "O", "Landroidx/compose/runtime/MutableState;", "E2", "()Ljava/lang/Object;", "jB", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/SpringSpec;", "J2", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpring", "r", "XQ", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "wTp", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "o", "ck", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "s7N", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "Z", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "iF", "()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialValueState$animation_core_release", "initialValueState", "S", "Landroidx/compose/animation/core/TargetBasedAnimation;", "initialValueAnimation", "g", "e", "()Z", "rV9", "(Z)V", "isFinished", "Landroidx/compose/runtime/MutableFloatState;", "fD", "()F", "Xw", "resetSnapValue", "useOnlyInitialValue", "getValue", "U", "value", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "Landroidx/compose/runtime/MutableLongState;", "te", "()J", "v", "durationNanos", "isSeeking", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "interruptionSpec", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n85#2:2148\n113#2,2:2149\n85#2:2151\n113#2,2:2152\n85#2:2157\n113#2,2:2158\n79#3:2154\n112#3,2:2155\n78#4:2160\n107#4,2:2161\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1300#1:2142\n1300#1:2143,2\n1308#1:2145\n1308#1:2146,2\n1316#1:2148\n1316#1:2149,2\n1330#1:2151\n1330#1:2152,2\n1343#1:2157\n1343#1:2158,2\n1331#1:2154\n1331#1:2155,2\n1347#1:2160\n1347#1:2161,2\n*E\n"})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private final MutableFloatState resetSnapValue;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final SpringSpec defaultSpring;

        /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
        private final MutableLongState durationNanos;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final MutableState targetValue;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private TargetBasedAnimation initialValueAnimation;

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private AnimationVector velocityVector;

        /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
        private final MutableState value;

        /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
        private final FiniteAnimationSpec interruptionSpec;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private SeekableTransitionState.SeekingAnimationState initialValueState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final MutableState isFinished;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final TwoWayConverter typeConverter;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final MutableState animation;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final MutableState animationSpec;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        public final void HI() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public TransitionAnimationState(Object obj, AnimationVector animationVector, TwoWayConverter twoWayConverter, String str) {
            Object objInvoke;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            SpringSpec springSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = springSpecQie;
            this.animationSpec = SnapshotStateKt__SnapshotStateKt.O(springSpecQie, null, 2, null);
            this.animation = SnapshotStateKt__SnapshotStateKt.O(new TargetBasedAnimation(XQ(), twoWayConverter, obj, E2(), animationVector), null, 2, null);
            this.isFinished = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = PrimitiveSnapshotStateKt.n(-1.0f);
            this.value = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            this.velocityVector = animationVector;
            this.durationNanos = SnapshotLongStateKt.n(ck().nr());
            Float f3 = (Float) VisibilityThresholdsKt.KN().get(twoWayConverter);
            if (f3 != null) {
                float fFloatValue = f3.floatValue();
                AnimationVector animationVector2 = (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj);
                int iRl = animationVector2.getSize();
                for (int i2 = 0; i2 < iRl; i2++) {
                    animationVector2.O(i2, fFloatValue);
                }
                objInvoke = this.typeConverter.getConvertFromVector().invoke(animationVector2);
            } else {
                objInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.qie(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final Object E2() {
            return this.targetValue.getValue();
        }

        static /* synthetic */ void M7(TransitionAnimationState transitionAnimationState, Object obj, boolean z2, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            transitionAnimationState.P5(obj, z2);
        }

        private final void P5(Object initialValue, boolean isInterrupted) {
            TargetBasedAnimation targetBasedAnimation = this.initialValueAnimation;
            if (Intrinsics.areEqual(targetBasedAnimation != null ? targetBasedAnimation.getMutableTargetValue() : null, E2())) {
                s7N(new TargetBasedAnimation(this.interruptionSpec, this.typeConverter, initialValue, initialValue, AnimationVectorsKt.Uo(this.velocityVector)));
                this.useOnlyInitialValue = true;
                v(ck().nr());
                return;
            }
            AnimationSpec animationSpecXQ = (!isInterrupted || this.isSeeking || (XQ() instanceof SpringSpec)) ? XQ() : this.interruptionSpec;
            if (Transition.this.ty() > 0) {
                animationSpecXQ = AnimationSpecKt.t(animationSpecXQ, Transition.this.ty());
            }
            s7N(new TargetBasedAnimation(animationSpecXQ, this.typeConverter, initialValue, E2(), this.velocityVector));
            v(ck().nr());
            this.useOnlyInitialValue = false;
            Transition.this.aYN();
        }

        private final void jB(Object obj) {
            this.targetValue.setValue(obj);
        }

        private final void s7N(TargetBasedAnimation targetBasedAnimation) {
            this.animation.setValue(targetBasedAnimation);
        }

        private final void wTp(FiniteAnimationSpec finiteAnimationSpec) {
            this.animationSpec.setValue(finiteAnimationSpec);
        }

        public final void E(Object targetValue, FiniteAnimationSpec animationSpec) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation targetBasedAnimation = this.initialValueAnimation;
                if (Intrinsics.areEqual(targetValue, targetBasedAnimation != null ? targetBasedAnimation.getMutableTargetValue() : null)) {
                    return;
                }
            }
            if (Intrinsics.areEqual(E2(), targetValue) && fD() == -1.0f) {
                return;
            }
            jB(targetValue);
            wTp(animationSpec);
            P5(fD() == -3.0f ? targetValue : getValue(), !e());
            rV9(fD() == -3.0f);
            if (fD() >= 0.0f) {
                U(ck().J2((long) (ck().nr() * fD())));
            } else if (fD() == -3.0f) {
                U(targetValue);
            }
            this.useOnlyInitialValue = false;
            Xw(-1.0f);
        }

        public final void N(float fraction) {
            if (fraction != -4.0f && fraction != -5.0f) {
                Xw(fraction);
                return;
            }
            TargetBasedAnimation targetBasedAnimation = this.initialValueAnimation;
            if (targetBasedAnimation != null) {
                ck().mUb(targetBasedAnimation.getMutableTargetValue());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object objXMQ = fraction == -4.0f ? ck().getMutableInitialValue() : ck().getMutableTargetValue();
            ck().mUb(objXMQ);
            ck().gh(objXMQ);
            U(objXMQ);
            v(ck().nr());
        }

        public final void T() {
            Xw(-2.0f);
        }

        public void U(Object obj) {
            this.value.setValue(obj);
        }

        public final void X(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = ck().nr();
            }
            U(ck().J2(playTimeNanos));
            this.velocityVector = ck().rl(playTimeNanos);
            if (ck().t(playTimeNanos)) {
                rV9(true);
            }
        }

        public final FiniteAnimationSpec XQ() {
            return (FiniteAnimationSpec) this.animationSpec.getValue();
        }

        public final void Xw(float f3) {
            this.resetSnapValue.Z(f3);
        }

        public final TargetBasedAnimation ck() {
            return (TargetBasedAnimation) this.animation.getValue();
        }

        public final boolean e() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void eF() {
            TargetBasedAnimation targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long jRoundToLong = MathKt.roundToLong(seekingAnimationState.getDurationNanos() * ((double) seekingAnimationState.getValue()));
            Object objJ2 = targetBasedAnimation.J2(jRoundToLong);
            if (this.useOnlyInitialValue) {
                ck().gh(objJ2);
            }
            ck().mUb(objJ2);
            v(ck().nr());
            if (fD() == -2.0f || this.useOnlyInitialValue) {
                U(objJ2);
            } else {
                nHg(Transition.this.ty());
            }
            if (jRoundToLong < seekingAnimationState.getDurationNanos()) {
                seekingAnimationState.gh(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final float fD() {
            return this.resetSnapValue.n();
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: iF, reason: from getter */
        public final SeekableTransitionState.SeekingAnimationState getInitialValueState() {
            return this.initialValueState;
        }

        public final void rV9(boolean z2) {
            this.isFinished.setValue(Boolean.valueOf(z2));
        }

        public final long te() {
            return this.durationNanos.rl();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + E2() + ", spec: " + XQ();
        }

        public final void v(long j2) {
            this.durationNanos.nY(j2);
        }

        public final void bzg(SeekableTransitionState.SeekingAnimationState animationState) {
            if (!Intrinsics.areEqual(ck().getMutableTargetValue(), ck().getMutableInitialValue())) {
                this.initialValueAnimation = ck();
                this.initialValueState = animationState;
            }
            s7N(new TargetBasedAnimation(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.Uo(this.velocityVector)));
            v(ck().nr());
            this.useOnlyInitialValue = true;
        }

        public final void nHg(long playTimeNanos) {
            if (fD() == -1.0f) {
                this.isSeeking = true;
                if (Intrinsics.areEqual(ck().getMutableTargetValue(), ck().getMutableInitialValue())) {
                    U(ck().getMutableTargetValue());
                } else {
                    U(ck().J2(playTimeNanos));
                    this.velocityVector = ck().rl(playTimeNanos);
                }
            }
        }

        public final void p5(Object initialValue, Object targetValue, FiniteAnimationSpec animationSpec) {
            jB(targetValue);
            wTp(animationSpec);
            if (Intrinsics.areEqual(ck().getMutableInitialValue(), initialValue) && Intrinsics.areEqual(ck().getMutableTargetValue(), targetValue)) {
                return;
            }
            M7(this, initialValue, false, 2, null);
        }
    }

    public Transition(TransitionState transitionState, Transition transition, String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState = SnapshotStateKt__SnapshotStateKt.O(xMQ(), null, 2, null);
        this.segment = SnapshotStateKt__SnapshotStateKt.O(new SegmentImpl(xMQ(), xMQ()), null, 2, null);
        this._playTimeNanos = SnapshotLongStateKt.n(0L);
        this.startTimeNanos = SnapshotLongStateKt.n(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this._animations = SnapshotStateKt.J2();
        this._transitions = SnapshotStateKt.J2();
        this.isSeeking = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.totalDurationNanos = SnapshotStateKt.O(new Function0<Long>() { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(this.f15688n.J2());
            }
        });
        transitionState.J2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void aYN() {
        Xw(true);
        if (WPU()) {
            SnapshotStateList snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
                jMax = Math.max(jMax, transitionAnimationState.te());
                transitionAnimationState.nHg(this.lastSeekedTimeNanos);
            }
            Xw(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "targetState", "", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "nr", "()Ljava/lang/Object;", "initialState", c.f62177j, "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Segment<S> {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        /* JADX INFO: renamed from: n */
        Object getTargetState();

        /* JADX INFO: renamed from: nr */
        Object getInitialState();

        default boolean t(Object obj, Object obj2) {
            if (Intrinsics.areEqual(obj, getInitialState()) && Intrinsics.areEqual(obj2, getTargetState())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long J2() {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((TransitionAnimationState) snapshotStateList.get(i2)).te());
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            jMax = Math.max(jMax, ((Transition) snapshotStateList2.get(i3)).J2());
        }
        return jMax;
    }

    private final long XQ() {
        return this._playTimeNanos.rl();
    }

    private final void Xw(boolean z2) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z2));
    }

    private final boolean Z() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final void jB(long j2) {
        this._playTimeNanos.nY(j2);
    }

    private final void v(Segment segment) {
        this.segment.setValue(segment);
    }

    public final void E2(TransitionAnimationState animation) {
        this._animations.remove(animation);
    }

    public final Segment HI() {
        return (Segment) this.segment.getValue();
    }

    public final Object Ik() {
        return this.targetState.getValue();
    }

    public final List KN() {
        return this._animations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(Object initialState, Object targetState, long playTimeNanos) {
        rV9(Long.MIN_VALUE);
        this.transitionState.O(false);
        if (!WPU() || !Intrinsics.areEqual(xMQ(), initialState) || !Intrinsics.areEqual(Ik(), targetState)) {
            if (!Intrinsics.areEqual(xMQ(), initialState)) {
                TransitionState transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    transitionState.nr(initialState);
                }
            }
            bzg(targetState);
            wTp(true);
            v(new SegmentImpl(initialState, targetState));
        }
        SnapshotStateList snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) snapshotStateList.get(i2);
            Intrinsics.checkNotNull(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.WPU()) {
                transition.T(transition.xMQ(), transition.Ik(), playTimeNanos);
            }
        }
        SnapshotStateList snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((TransitionAnimationState) snapshotStateList2.get(i3)).nHg(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U() {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).eF();
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).U();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Uo() {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).HI();
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).Uo();
        }
    }

    public final boolean WPU() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(float fraction) {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).N(fraction);
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).X(fraction);
        }
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final Transition getParentTransition() {
        return this.parentTransition;
    }

    public final void bzg(Object obj) {
        this.targetState.setValue(obj);
    }

    public final long ck() {
        return this.startTimeNanos.rl();
    }

    public final boolean e(Transition transition) {
        return this._transitions.remove(transition);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean mUb() {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((TransitionAnimationState) snapshotStateList.get(i2)).getInitialValueState() != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((Transition) snapshotStateList2.get(i3)).mUb()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nHg(SeekableTransitionState.SeekingAnimationState animationState) {
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).bzg(animationState);
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).nHg(animationState);
        }
    }

    public final boolean nr(Transition transition) {
        return this._transitions.add(transition);
    }

    public final List o() {
        return this._transitions;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long r() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public final void rV9(long j2) {
        this.startTimeNanos.nY(j2);
    }

    public final void s7N(long j2) {
        if (this.parentTransition == null) {
            jB(j2);
        }
    }

    public final boolean t(TransitionAnimationState animation) {
        return this._animations.add(animation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void te() {
        rV9(Long.MIN_VALUE);
        TransitionState transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.nr(Ik());
        }
        s7N(0L);
        this.transitionState.O(false);
        SnapshotStateList snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) snapshotStateList.get(i2)).te();
        }
    }

    public final long ty() {
        Transition transition = this.parentTransition;
        return transition != null ? transition.ty() : XQ();
    }

    public final void wTp(boolean z2) {
        this.isSeeking.setValue(Boolean.valueOf(z2));
    }

    public final Object xMQ() {
        return this.transitionState.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(long playTimeNanos) {
        if (ck() == Long.MIN_VALUE) {
            rV9(playTimeNanos);
        }
        s7N(playTimeNanos);
        Xw(false);
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).nHg(playTimeNanos);
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            if (!Intrinsics.areEqual(transition.Ik(), transition.xMQ())) {
                transition.N(playTimeNanos);
            }
        }
    }

    public final void O(final Object obj, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        boolean zE2;
        int i7;
        Composer composerKN = composer.KN(-1493585151);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(obj);
            } else {
                zE2 = composerKN.E2(obj);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(this)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        boolean z3 = false;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1493585151, i3, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1176)");
            }
            if (!WPU()) {
                composerKN.eF(1822801203);
                P5(obj);
                if (Intrinsics.areEqual(obj, xMQ()) && !S() && !Z()) {
                    composerKN.eF(1824275067);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1823032494);
                    Object objIF = composerKN.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                        composerKN.o(objIF);
                    }
                    final vd vdVar = (vd) objIF;
                    boolean zE22 = composerKN.E2(vdVar);
                    int i8 = i3 & 112;
                    if (i8 == 32) {
                        z3 = true;
                    }
                    boolean z4 = zE22 | z3;
                    Object objIF2 = composerKN.iF();
                    if (z4 || objIF2 == companion.n()) {
                        objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                            /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1192}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Transition J2;

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                private /* synthetic */ Object f15680O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                float f15681n;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                int f15682t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Transition transition, Continuation continuation) {
                                    super(2, continuation);
                                    this.J2 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, continuation);
                                    anonymousClass1.f15680O = obj;
                                    return anonymousClass1;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    final float fHI;
                                    vd vdVar;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f15682t;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            fHI = this.f15681n;
                                            vdVar = (vd) this.f15680O;
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        vd vdVar2 = (vd) this.f15680O;
                                        fHI = SuspendAnimationKt.HI(vdVar2.getCoroutineContext());
                                        vdVar = vdVar2;
                                    }
                                    while (Lu.KN(vdVar)) {
                                        final Transition transition = this.J2;
                                        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                n(l2.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(long j2) {
                                                if (transition.WPU()) {
                                                    return;
                                                }
                                                transition.nY(j2, fHI);
                                            }
                                        };
                                        this.f15680O = vdVar;
                                        this.f15681n = fHI;
                                        this.f15682t = 1;
                                        if (MonotonicFrameClockKt.t(function1, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                C.nr(vdVar, null, h.J2, new AnonymousClass1(this, null), 1, null);
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void n() {
                                    }
                                };
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    EffectsKt.n(vdVar, this, (Function1) objIF2, composerKN, i8);
                    composerKN.Xw();
                }
                composerKN.Xw();
            } else {
                composerKN.eF(1824284987);
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.Transition$animateTo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    this.f15686n.O(obj, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P5(Object targetState) {
        if (!Intrinsics.areEqual(Ik(), targetState)) {
            v(new SegmentImpl(Ik(), targetState));
            if (!Intrinsics.areEqual(xMQ(), Ik())) {
                this.transitionState.nr(Ik());
            }
            bzg(targetState);
            if (!S()) {
                Xw(true);
            }
            SnapshotStateList snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TransitionAnimationState) snapshotStateList.get(i2)).T();
            }
        }
    }

    public final boolean S() {
        if (ck() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void ViF() {
        te();
        this.transitionState.Uo();
    }

    public final void fD(DeferredAnimation deferredAnimation) {
        TransitionAnimationState animation;
        DeferredAnimation.DeferredAnimationData deferredAnimationDataRl = deferredAnimation.rl();
        if (deferredAnimationDataRl != null && (animation = deferredAnimationDataRl.getAnimation()) != null) {
            E2(animation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z2 = true;
        if (ck() == Long.MIN_VALUE) {
            iF(scaledPlayTimeNanos);
        } else if (!this.transitionState.t()) {
            this.transitionState.O(true);
        }
        Xw(false);
        SnapshotStateList snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            if (!transitionAnimationState.e()) {
                transitionAnimationState.X(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!transitionAnimationState.e()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            if (!Intrinsics.areEqual(transition.Ik(), transition.xMQ())) {
                transition.g(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!Intrinsics.areEqual(transition.Ik(), transition.xMQ())) {
                z2 = false;
            }
        }
        if (z2) {
            te();
        }
    }

    public final void iF(long frameTimeNanos) {
        rV9(frameTimeNanos);
        this.transitionState.O(true);
    }

    public final void nY(long frameTimeNanos, float durationScale) {
        boolean z2;
        if (ck() == Long.MIN_VALUE) {
            iF(frameTimeNanos);
        }
        long jCk = frameTimeNanos - ck();
        if (durationScale != 0.0f) {
            jCk = MathKt.roundToLong(jCk / ((double) durationScale));
        }
        s7N(jCk);
        if (durationScale == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(jCk, z2);
    }

    public String toString() {
        List listKN = KN();
        int size = listKN.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ((TransitionAnimationState) listKN.get(i2)) + ", ";
        }
        return str;
    }

    public Transition(TransitionState transitionState, String str) {
        this(transitionState, null, str);
    }

    public Transition(Object obj, String str) {
        this(new MutableTransitionState(obj), null, str);
    }
}
