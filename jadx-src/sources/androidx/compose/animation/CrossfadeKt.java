package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aZ\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0088\u0001\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t2&\u0010\f\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\u0012\u0010\u0018\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "", "label", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "t", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "contentKey", c.f62177j, "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alpha", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,139:1\n1247#2,3:140\n1250#2,3:144\n1247#2,6:147\n1247#2,6:153\n1#3:143\n350#4,7:159\n34#5,6:166\n34#5,6:209\n70#6:172\n67#6,9:173\n77#6:218\n79#7,6:182\n86#7,3:197\n89#7,2:206\n93#7:217\n347#8,9:188\n356#8:208\n357#8,2:215\n4206#9,6:200\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:140,3\n104#1:144,3\n105#1:147,6\n110#1:153,6\n117#1:159,7\n124#1:166,6\n136#1:209,6\n135#1:172\n135#1:173,9\n135#1:218\n135#1:182,6\n135#1:197,3\n135#1:206,2\n135#1:217\n135#1:188,9\n135#1:208\n135#1:215,2\n135#1:200,6\n*E\n"})
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Transition transition, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        FiniteAnimationSpec finiteAnimationSpecTy;
        int i8;
        Function1 function12;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(679005231);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(transition) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 1;
        if (i9 != 0) {
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
                    finiteAnimationSpecTy = finiteAnimationSpec;
                    i5 |= composerKN.E2(finiteAnimationSpecTy) ? 256 : 128;
                }
                i8 = i3 & 4;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        function12 = function1;
                        i5 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    if ((i3 & 8) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= composerKN.E2(function3) ? 16384 : 8192;
                    }
                    if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            finiteAnimationSpecTy = AnimationSpecKt.ty(0, 0, null, 7, null);
                        }
                        if (i8 != 0) {
                            function12 = new Function1<Object, Object>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return obj;
                                }
                            };
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(679005231, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        Object objIF = composerKN.iF();
                        Composer.Companion companion = Composer.INSTANCE;
                        Object obj = objIF;
                        if (objIF == companion.n()) {
                            SnapshotStateList snapshotStateListJ2 = SnapshotStateKt.J2();
                            snapshotStateListJ2.add(transition.xMQ());
                            composerKN.o(snapshotStateListJ2);
                            obj = snapshotStateListJ2;
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                        Object objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                            objIF2 = ScatterMapKt.t();
                            composerKN.o(objIF2);
                        }
                        MutableScatterMap mutableScatterMap = (MutableScatterMap) objIF2;
                        if (Intrinsics.areEqual(transition.xMQ(), transition.Ik())) {
                            composerKN.eF(860925177);
                            if (snapshotStateList.size() == 1 && Intrinsics.areEqual(snapshotStateList.get(0), transition.Ik())) {
                                composerKN.eF(861249809);
                                composerKN.Xw();
                            } else {
                                composerKN.eF(861059531);
                                boolean z2 = (i5 & 14) == 4;
                                Object objIF3 = composerKN.iF();
                                if (z2 || objIF3 == companion.n()) {
                                    objIF3 = new Function1<Object, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(Object obj2) {
                                            return Boolean.valueOf(!Intrinsics.areEqual(obj2, transition.Ik()));
                                        }
                                    };
                                    composerKN.o(objIF3);
                                }
                                CollectionsKt.removeAll((List) snapshotStateList, (Function1) objIF3);
                                mutableScatterMap.gh();
                                composerKN.Xw();
                            }
                            composerKN.Xw();
                        } else {
                            composerKN.eF(861255761);
                            composerKN.Xw();
                        }
                        if (mutableScatterMap.rl(transition.Ik())) {
                            composerKN.eF(862059281);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(861316428);
                            Iterator<T> it = snapshotStateList.iterator();
                            int i10 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i10 = -1;
                                    break;
                                } else if (Intrinsics.areEqual(function12.invoke(it.next()), function12.invoke(transition.Ik()))) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            if (i10 == -1) {
                                snapshotStateList.add(transition.Ik());
                            } else {
                                snapshotStateList.set(i10, transition.Ik());
                            }
                            mutableScatterMap.gh();
                            int size = snapshotStateList.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                Object obj2 = snapshotStateList.get(i11);
                                mutableScatterMap.aYN(obj2, ComposableLambdaKt.nr(-1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, finiteAnimationSpecTy, obj2, function3), composerKN, 54));
                            }
                            composerKN.Xw();
                        }
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
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
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        composerKN.eF(-187474512);
                        int size2 = snapshotStateList.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            Object obj3 = snapshotStateList.get(i12);
                            composerKN.X(-1081865889, function12.invoke(obj3));
                            Function2 function2 = (Function2) mutableScatterMap.O(obj3);
                            if (function2 == null) {
                                composerKN.eF(821932266);
                                composerKN.Xw();
                            } else {
                                composerKN.eF(-1081864713);
                                function2.invoke(composerKN, 0);
                                composerKN.Xw();
                            }
                            composerKN.P5();
                        }
                        composerKN.Xw();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                    }
                    final FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpecTy;
                    final Function1 function13 = function12;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i13) {
                                CrossfadeKt.n(transition, modifier3, finiteAnimationSpec2, function13, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                function12 = function1;
                if ((i3 & 8) == 0) {
                }
                if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                }
                final FiniteAnimationSpec finiteAnimationSpec22 = finiteAnimationSpecTy;
                final Function1 function132 = function12;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            finiteAnimationSpecTy = finiteAnimationSpec;
            i8 = i3 & 4;
            if (i8 == 0) {
            }
            function12 = function1;
            if ((i3 & 8) == 0) {
            }
            if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
            }
            final FiniteAnimationSpec finiteAnimationSpec222 = finiteAnimationSpecTy;
            final Function1 function1322 = function12;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 2;
        if (i7 == 0) {
        }
        finiteAnimationSpecTy = finiteAnimationSpec;
        i8 = i3 & 4;
        if (i8 == 0) {
        }
        function12 = function1;
        if ((i3 & 8) == 0) {
        }
        if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
        }
        final FiniteAnimationSpec finiteAnimationSpec2222 = finiteAnimationSpecTy;
        final Function1 function13222 = function12;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, String str, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        FiniteAnimationSpec finiteAnimationSpec2;
        int i8;
        Function3 function32;
        final Modifier modifier3;
        final FiniteAnimationSpec finiteAnimationSpec3;
        final String str2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        Modifier modifier4;
        Composer composerKN = composer.KN(-310686752);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(obj) : composerKN.E2(obj) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    i5 |= composerKN.E2(finiteAnimationSpec2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.p5(str) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.E2(function32) ? 16384 : 8192;
                        }
                    }
                    if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                        str2 = str;
                    } else {
                        if (i10 != 0) {
                            modifier4 = Modifier.INSTANCE;
                            i9 = i8;
                        } else {
                            i9 = i8;
                            modifier4 = modifier2;
                        }
                        FiniteAnimationSpec finiteAnimationSpecTy = i7 != 0 ? AnimationSpecKt.ty(0, 0, null, 7, null) : finiteAnimationSpec2;
                        String str3 = i9 != 0 ? "Crossfade" : str;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-310686752, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        n(androidx.compose.animation.core.TransitionKt.mUb(obj, str3, composerKN, (i5 & 14) | ((i5 >> 6) & 112), 0), modifier4, finiteAnimationSpecTy, null, function32, composerKN, i5 & 58352, 4);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        str2 = str3;
                        modifier3 = modifier4;
                        finiteAnimationSpec3 = finiteAnimationSpecTy;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i11) {
                                CrossfadeKt.rl(obj, modifier3, finiteAnimationSpec3, str2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                if ((i3 & 16) == 0) {
                }
                if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final /* synthetic */ void t(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        boolean zE2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        final Function3 function32;
        final FiniteAnimationSpec finiteAnimationSpec2;
        final Modifier modifier2;
        Composer composerKN = composer.KN(523603005);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
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
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(finiteAnimationSpec)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (composerKN.E2(function3)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i11 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i12 != 0) {
                finiteAnimationSpec = AnimationSpecKt.ty(0, 0, null, 7, null);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec;
            if (ComposerKt.v()) {
                ComposerKt.p5(523603005, i5, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:68)");
            }
            n(androidx.compose.animation.core.TransitionKt.mUb(obj, null, composerKN, i5 & 14, 2), modifier3, finiteAnimationSpec3, null, function3, composerKN, (i5 & 1008) | ((i5 << 3) & 57344), 4);
            function32 = function3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpec3;
        } else {
            function32 = function3;
            composerKN.wTp();
            finiteAnimationSpec2 = finiteAnimationSpec;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i13) {
                    CrossfadeKt.t(obj, modifier2, finiteAnimationSpec2, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
