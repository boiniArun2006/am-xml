package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¶\u0001\u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182>\b\u0002\u0010\u001e\u001a8\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0\u0011¢\u0006\u0004\b \u0010!\u001a\u001c\u0010%\u001a\u00020\u0006*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0086\u0004¢\u0006\u0004\b%\u0010&\u001a®\u0001\u0010(\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000421\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b(\u0010)\"\u0014\u0010+\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*¨\u0006,"}, d2 = {"S", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "label", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "contentKey", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "t", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", "J2", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/core/Transition;", c.f62177j, "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "J", "UnspecifiedSize", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,958:1\n75#2:959\n1247#3,6:960\n1247#3,6:966\n1247#3,6:972\n1247#3,6:991\n1247#3,6:997\n350#4,7:978\n34#5,6:985\n34#5,6:1030\n79#6,6:1003\n86#6,3:1018\n89#6,2:1027\n93#6:1038\n347#7,9:1009\n356#7:1029\n357#7,2:1036\n4206#8,6:1021\n30#9:1039\n80#10:1040\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n774#1:959\n776#1:960,6\n780#1:966,6\n781#1:972,6\n867#1:991,6\n874#1:997,6\n807#1:978,7\n816#1:985,6\n872#1:1030,6\n869#1:1003,6\n869#1:1018,3\n869#1:1027,2\n869#1:1038\n869#1:1009,9\n869#1:1029\n869#1:1036,2\n869#1:1021,6\n702#1:1039\n702#1:1040\n*E\n"})
public final class AnimatedContentKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f14940n;

    static {
        long j2 = Integer.MIN_VALUE;
        f14940n = IntSize.t((j2 & 4294967295L) | (j2 << 32));
    }

    public static final ContentTransform J2(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Transition transition, Modifier modifier, Function1 function1, Alignment alignment, Function1 function12, final Function4 function4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function1 function13;
        int i8;
        Alignment alignmentHI;
        int i9;
        Function1 function14;
        Function4 function42;
        final Modifier modifier3;
        final Function1 function15;
        ScopeUpdateScope scopeUpdateScopeGh;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        SnapshotStateList snapshotStateList;
        int i10;
        final Transition transition2 = transition;
        Composer composerKN = composer.KN(-114689412);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(transition2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 1;
        if (i11 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 2;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function13 = function1;
                    i5 |= composerKN.E2(function13) ? 256 : 128;
                }
                i8 = i3 & 4;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        alignmentHI = alignment;
                        i5 |= composerKN.p5(alignmentHI) ? 2048 : 1024;
                    }
                    i9 = i3 & 8;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            function14 = function12;
                            i5 |= composerKN.E2(function14) ? 16384 : 8192;
                        }
                        if ((i3 & 16) == 0) {
                            if ((i2 & 196608) == 0) {
                                function42 = function4;
                                i5 |= composerKN.E2(function42) ? 131072 : 65536;
                            }
                            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                                composerKN.wTp();
                                modifier3 = modifier2;
                                function15 = function13;
                            } else {
                                Modifier modifier4 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                function15 = i7 != 0 ? new Function1<AnimatedContentTransitionScope<Object>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).t(EnterExitTransitionKt.o(AnimationSpecKt.ty(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i8 != 0) {
                                    alignmentHI = Alignment.INSTANCE.HI();
                                }
                                if (i9 != 0) {
                                    function14 = new Function1<Object, Object>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return obj;
                                        }
                                    };
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-114689412, i5, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:772)");
                                }
                                LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
                                int i12 = i5 & 14;
                                boolean z2 = i12 == 4;
                                Object objIF = composerKN.iF();
                                if (z2 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new AnimatedContentTransitionScopeImpl(transition2, alignmentHI, layoutDirection);
                                    composerKN.o(objIF);
                                }
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) objIF;
                                boolean z3 = i12 == 4;
                                Object objIF2 = composerKN.iF();
                                if (z3 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = SnapshotStateKt.Uo(transition2.xMQ());
                                    composerKN.o(objIF2);
                                }
                                SnapshotStateList snapshotStateList2 = (SnapshotStateList) objIF2;
                                boolean z4 = i12 == 4;
                                Object objIF3 = composerKN.iF();
                                if (z4 || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = ScatterMapKt.t();
                                    composerKN.o(objIF3);
                                }
                                MutableScatterMap mutableScatterMap = (MutableScatterMap) objIF3;
                                if (!snapshotStateList2.contains(transition2.xMQ())) {
                                    snapshotStateList2.clear();
                                    snapshotStateList2.add(transition2.xMQ());
                                }
                                if (Intrinsics.areEqual(transition2.xMQ(), transition2.Ik())) {
                                    if (snapshotStateList2.size() != 1 || !Intrinsics.areEqual(snapshotStateList2.get(0), transition2.xMQ())) {
                                        snapshotStateList2.clear();
                                        snapshotStateList2.add(transition2.xMQ());
                                    }
                                    if (mutableScatterMap.get_size() != 1 || mutableScatterMap.t(transition2.xMQ())) {
                                        mutableScatterMap.gh();
                                    }
                                    animatedContentTransitionScopeImpl2.Ik(alignmentHI);
                                    animatedContentTransitionScopeImpl2.r(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition2.xMQ(), transition2.Ik()) && !snapshotStateList2.contains(transition2.Ik())) {
                                    Iterator<T> it = snapshotStateList2.iterator();
                                    int i13 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i13 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function14.invoke(it.next()), function14.invoke(transition2.Ik()))) {
                                            break;
                                        } else {
                                            i13++;
                                        }
                                    }
                                    if (i13 == -1) {
                                        snapshotStateList2.add(transition2.Ik());
                                    } else {
                                        snapshotStateList2.set(i13, transition2.Ik());
                                    }
                                }
                                if (mutableScatterMap.t(transition2.Ik()) && mutableScatterMap.t(transition2.xMQ())) {
                                    composerKN.eF(919489879);
                                    composerKN.Xw();
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                    snapshotStateList = snapshotStateList2;
                                    i10 = 0;
                                } else {
                                    composerKN.eF(916905750);
                                    mutableScatterMap.gh();
                                    int size = snapshotStateList2.size();
                                    int i14 = 0;
                                    while (i14 < size) {
                                        int i15 = i14;
                                        final Object obj = snapshotStateList2.get(i15);
                                        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                        final Function4 function43 = function42;
                                        final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                        mutableScatterMap.aYN(obj, ComposableLambdaKt.nr(885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            public final void n(Composer composer2, int i16) {
                                                if (!composer2.HI((i16 & 3) != 2, i16 & 1)) {
                                                    composer2.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(885640742, i16, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:817)");
                                                }
                                                Function1 function16 = function15;
                                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                Object objIF4 = composer2.iF();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (objIF4 == companion.n()) {
                                                    objIF4 = (ContentTransform) function16.invoke(animatedContentTransitionScopeImpl4);
                                                    composer2.o(objIF4);
                                                }
                                                final ContentTransform contentTransform = (ContentTransform) objIF4;
                                                boolean zN = composer2.n(Intrinsics.areEqual(transition2.HI().getTargetState(), obj));
                                                Transition transition3 = transition2;
                                                Object obj2 = obj;
                                                Function1 function17 = function15;
                                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl3;
                                                Object objIF5 = composer2.iF();
                                                if (zN || objIF5 == companion.n()) {
                                                    objIF5 = Intrinsics.areEqual(transition3.HI().getTargetState(), obj2) ? ExitTransition.INSTANCE.n() : ((ContentTransform) function17.invoke(animatedContentTransitionScopeImpl5)).getInitialContentExit();
                                                    composer2.o(objIF5);
                                                }
                                                final ExitTransition exitTransition = (ExitTransition) objIF5;
                                                Object obj3 = obj;
                                                Transition transition4 = transition2;
                                                Object objIF6 = composer2.iF();
                                                if (objIF6 == companion.n()) {
                                                    objIF6 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(obj3, transition4.Ik()));
                                                    composer2.o(objIF6);
                                                }
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objIF6;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                boolean zE2 = composer2.E2(contentTransform);
                                                Object objIF7 = composer2.iF();
                                                if (zE2 || objIF7 == companion.n()) {
                                                    objIF7 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                            return n(measureScope, measurable, constraints.getValue());
                                                        }

                                                        public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                                                            final Placeable placeableDR0 = measurable.dR0(j2);
                                                            int width = placeableDR0.getWidth();
                                                            int height = placeableDR0.getHeight();
                                                            final ContentTransform contentTransform2 = contentTransform;
                                                            return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
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
                                                                    placementScope.KN(placeableDR0, 0, 0, contentTransform2.nr());
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer2.o(objIF7);
                                                }
                                                Modifier modifierN = LayoutModifierKt.n(companion2, (Function3) objIF7);
                                                childData.rl(Intrinsics.areEqual(obj, transition2.Ik()));
                                                Modifier modifierZmq = modifierN.Zmq(childData);
                                                Transition transition5 = transition2;
                                                boolean zE22 = composer2.E2(obj);
                                                final Object obj4 = obj;
                                                Object objIF8 = composer2.iF();
                                                if (zE22 || objIF8 == companion.n()) {
                                                    objIF8 = new Function1<Object, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final Boolean invoke(Object obj5) {
                                                            return Boolean.valueOf(Intrinsics.areEqual(obj5, obj4));
                                                        }
                                                    };
                                                    composer2.o(objIF8);
                                                }
                                                Function1 function18 = (Function1) objIF8;
                                                boolean zP5 = composer2.p5(exitTransition);
                                                Object objIF9 = composer2.iF();
                                                if (zP5 || objIF9 == companion.n()) {
                                                    objIF9 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                            EnterExitState enterExitState3 = EnterExitState.f15174O;
                                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !exitTransition.getData().getHold());
                                                        }
                                                    };
                                                    composer2.o(objIF9);
                                                }
                                                Function2 function2 = (Function2) objIF9;
                                                final SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                                final Object obj5 = obj;
                                                final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl3;
                                                final Function4 function44 = function43;
                                                AnimatedVisibilityKt.n(transition5, function18, modifierZmq, targetContentEnter, exitTransition, function2, null, ComposableLambdaKt.nr(-616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                        n(animatedVisibilityScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i17) {
                                                        if ((i17 & 6) == 0) {
                                                            i17 |= (i17 & 8) == 0 ? composer3.p5(animatedVisibilityScope) : composer3.E2(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if (!composer3.HI((i17 & 19) != 18, i17 & 1)) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-616195562, i17, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:853)");
                                                        }
                                                        boolean zP52 = composer3.p5(snapshotStateList4) | composer3.E2(obj5) | composer3.E2(animatedContentTransitionScopeImpl6);
                                                        final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                                        final Object obj6 = obj5;
                                                        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl6;
                                                        Object objIF10 = composer3.iF();
                                                        if (zP52 || objIF10 == Composer.INSTANCE.n()) {
                                                            objIF10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    final SnapshotStateList snapshotStateList6 = snapshotStateList5;
                                                                    final Object obj7 = obj6;
                                                                    final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl8 = animatedContentTransitionScopeImpl7;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void n() {
                                                                            snapshotStateList6.remove(obj7);
                                                                            animatedContentTransitionScopeImpl8.getTargetSizeMap().XQ(obj7);
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.o(objIF10);
                                                        }
                                                        EffectsKt.rl(animatedVisibilityScope, (Function1) objIF10, composer3, i17 & 14);
                                                        MutableScatterMap targetSizeMap = animatedContentTransitionScopeImpl6.getTargetSizeMap();
                                                        Object obj7 = obj5;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap.aYN(obj7, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize());
                                                        Object objIF11 = composer3.iF();
                                                        if (objIF11 == Composer.INSTANCE.n()) {
                                                            objIF11 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.o(objIF11);
                                                        }
                                                        function44.invoke((AnimatedContentScopeImpl) objIF11, obj5, composer3, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 12582912, 64);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                n(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }
                                        }, composerKN, 54));
                                        i14 = i15 + 1;
                                        transition2 = transition;
                                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl3;
                                        snapshotStateList2 = snapshotStateList3;
                                        size = size;
                                        function42 = function4;
                                    }
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                    snapshotStateList = snapshotStateList2;
                                    i10 = 0;
                                    composerKN.Xw();
                                }
                                boolean zP5 = composerKN.p5(transition.HI()) | composerKN.p5(animatedContentTransitionScopeImpl);
                                Object objIF4 = composerKN.iF();
                                if (zP5 || objIF4 == Composer.INSTANCE.n()) {
                                    objIF4 = (ContentTransform) function15.invoke(animatedContentTransitionScopeImpl);
                                    composerKN.o(objIF4);
                                }
                                Modifier modifierZmq = modifier4.Zmq(animatedContentTransitionScopeImpl.KN((ContentTransform) objIF4, composerKN, i10));
                                Object objIF5 = composerKN.iF();
                                if (objIF5 == Composer.INSTANCE.n()) {
                                    objIF5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    composerKN.o(objIF5);
                                }
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objIF5;
                                int iN = ComposablesKt.n(composerKN, i10);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion.n();
                                if (composerKN.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.s7N(function0N);
                                } else {
                                    composerKN.r();
                                }
                                Composer composerN = Updater.n(composerKN);
                                Updater.O(composerN, animatedContentMeasurePolicy, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                composerKN.eF(-1490874326);
                                int size2 = snapshotStateList.size();
                                for (int i16 = i10; i16 < size2; i16++) {
                                    Object obj2 = snapshotStateList.get(i16);
                                    composerKN.X(1908442329, function14.invoke(obj2));
                                    Function2 function2 = (Function2) mutableScatterMap.O(obj2);
                                    if (function2 == null) {
                                        composerKN.eF(-967793488);
                                    } else {
                                        composerKN.eF(1908443505);
                                        function2.invoke(composerKN, Integer.valueOf(i10));
                                    }
                                    composerKN.Xw();
                                    composerKN.P5();
                                }
                                composerKN.Xw();
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                            }
                            final Alignment alignment2 = alignmentHI;
                            final Function1 function16 = function14;
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i17) {
                                        AnimatedContentKt.n(transition, modifier3, function15, alignment2, function16, function4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 196608;
                        function42 = function4;
                        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        }
                        final Alignment alignment22 = alignmentHI;
                        final Function1 function162 = function14;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function14 = function12;
                    if ((i3 & 16) == 0) {
                    }
                    function42 = function4;
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                    }
                    final Alignment alignment222 = alignmentHI;
                    final Function1 function1622 = function14;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                alignmentHI = alignment;
                i9 = i3 & 8;
                if (i9 == 0) {
                }
                function14 = function12;
                if ((i3 & 16) == 0) {
                }
                function42 = function4;
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                final Alignment alignment2222 = alignmentHI;
                final Function1 function16222 = function14;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function13 = function1;
            i8 = i3 & 4;
            if (i8 != 0) {
            }
            alignmentHI = alignment;
            i9 = i3 & 8;
            if (i9 == 0) {
            }
            function14 = function12;
            if ((i3 & 16) == 0) {
            }
            function42 = function4;
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            final Alignment alignment22222 = alignmentHI;
            final Function1 function162222 = function14;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 2;
        if (i7 == 0) {
        }
        function13 = function1;
        i8 = i3 & 4;
        if (i8 != 0) {
        }
        alignmentHI = alignment;
        i9 = i3 & 8;
        if (i9 == 0) {
        }
        function14 = function12;
        if ((i3 & 16) == 0) {
        }
        function42 = function4;
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        final Alignment alignment222222 = alignmentHI;
        final Function1 function1622222 = function14;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static /* synthetic */ SizeTransform nr(boolean z2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return n(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                public final SpringSpec n(long j2, long j3) {
                    return AnimationSpecKt.qie(0.0f, 400.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return t(z2, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Object obj, Modifier modifier, Function1 function1, Alignment alignment, String str, Function1 function12, final Function4 function4, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Function1 function13;
        int i8;
        Alignment alignment2;
        int i9;
        int i10;
        Function1 function14;
        Function4 function42;
        final Modifier modifier2;
        final String str2;
        final Function1 function15;
        final Alignment alignment3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i11;
        Modifier modifier3;
        int i12;
        Alignment alignmentHI;
        Composer composerKN = composer.KN(2132720749);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(obj) : composerKN.E2(obj) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function13 = function1;
                    i5 |= composerKN.E2(function13) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        alignment2 = alignment;
                        i5 |= composerKN.p5(alignment2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(str) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                function14 = function12;
                                i5 |= composerKN.E2(function14) ? 131072 : 65536;
                            }
                            if ((i3 & 64) != 0) {
                                if ((i2 & 1572864) == 0) {
                                    function42 = function4;
                                    i5 |= composerKN.E2(function42) ? 1048576 : 524288;
                                }
                                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                                    if (i13 != 0) {
                                        modifier3 = Modifier.INSTANCE;
                                        i11 = i9;
                                    } else {
                                        i11 = i9;
                                        modifier3 = modifier;
                                    }
                                    Function1 function16 = i7 != 0 ? new Function1<AnimatedContentTransitionScope<Object>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                            return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).t(EnterExitTransitionKt.o(AnimationSpecKt.ty(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    } : function13;
                                    if (i8 != 0) {
                                        alignmentHI = Alignment.INSTANCE.HI();
                                        i12 = i10;
                                    } else {
                                        i12 = i10;
                                        alignmentHI = alignment2;
                                    }
                                    String str3 = i11 != 0 ? "AnimatedContent" : str;
                                    if (i12 != 0) {
                                        function14 = new Function1<Object, Object>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return obj2;
                                            }
                                        };
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(2132720749, i5, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                    }
                                    Transition transitionMUb = androidx.compose.animation.core.TransitionKt.mUb(obj, str3, composerKN, (i5 & 14) | ((i5 >> 9) & 112), 0);
                                    int i14 = i5 & 8176;
                                    int i15 = i5 >> 3;
                                    n(transitionMUb, modifier3, function16, alignmentHI, function14, function42, composerKN, i14 | (57344 & i15) | (i15 & 458752), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    str2 = str3;
                                    modifier2 = modifier3;
                                    function15 = function16;
                                    alignment3 = alignmentHI;
                                } else {
                                    composerKN.wTp();
                                    modifier2 = modifier;
                                    str2 = str;
                                    function15 = function13;
                                    alignment3 = alignment2;
                                }
                                final Function1 function17 = function14;
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i16) {
                                            AnimatedContentKt.rl(obj, modifier2, function15, alignment3, str2, function17, function4, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 1572864;
                            function42 = function4;
                            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                            }
                            final Function1 function172 = function14;
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        function14 = function12;
                        if ((i3 & 64) != 0) {
                        }
                        function42 = function4;
                        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                        }
                        final Function1 function1722 = function14;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    function14 = function12;
                    if ((i3 & 64) != 0) {
                    }
                    function42 = function4;
                    if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                    }
                    final Function1 function17222 = function14;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                alignment2 = alignment;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                function14 = function12;
                if ((i3 & 64) != 0) {
                }
                function42 = function4;
                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                }
                final Function1 function172222 = function14;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function13 = function1;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            alignment2 = alignment;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            function14 = function12;
            if ((i3 & 64) != 0) {
            }
            function42 = function4;
            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
            }
            final Function1 function1722222 = function14;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function13 = function1;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        alignment2 = alignment;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        function14 = function12;
        if ((i3 & 64) != 0) {
        }
        function42 = function4;
        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
        }
        final Function1 function17222222 = function14;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final SizeTransform t(boolean z2, Function2 function2) {
        return new SizeTransformImpl(z2, function2);
    }
}
