package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "backgroundContent", "Landroidx/compose/ui/Modifier;", "modifier", "", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "gesturesEnabled", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material3/SwipeToDismissBoxState;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "DismissVelocityThreshold", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,266:1\n77#2:267\n77#2:274\n1223#3,6:268\n1223#3,6:351\n71#4:275\n68#4,6:276\n74#4:310\n78#4:400\n78#5,6:282\n85#5,4:297\n89#5,2:307\n78#5,6:318\n85#5,4:333\n89#5,2:343\n93#5:349\n78#5,6:364\n85#5,4:379\n89#5,2:389\n93#5:395\n93#5:399\n368#6,9:288\n377#6:309\n368#6,9:324\n377#6:345\n378#6,2:347\n368#6,9:370\n377#6:391\n378#6,2:393\n378#6,2:397\n4032#7,6:301\n4032#7,6:337\n4032#7,6:383\n98#8:311\n95#8,6:312\n101#8:346\n105#8:350\n98#8:357\n95#8,6:358\n101#8:392\n105#8:396\n148#9:401\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n188#1:267\n226#1:274\n196#1:268,6\n240#1:351,6\n228#1:275\n228#1:276,6\n228#1:310\n228#1:400\n228#1:282,6\n228#1:297,4\n228#1:307,2\n236#1:318,6\n236#1:333,4\n236#1:343,2\n236#1:349\n237#1:364,6\n237#1:379,4\n237#1:389,2\n237#1:395\n228#1:399\n228#1:288,9\n228#1:309\n236#1:324,9\n236#1:345\n236#1:347,2\n237#1:370,9\n237#1:391\n237#1:393,2\n228#1:397,2\n228#1:301,6\n236#1:337,6\n237#1:383,6\n236#1:311\n236#1:312,6\n236#1:346\n236#1:350\n237#1:357\n237#1:358,6\n237#1:392\n237#1:396\n265#1:401\n*E\n"})
public final class SwipeToDismissBoxKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27972n = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final SwipeToDismissBoxState swipeToDismissBoxState, final Function3 function3, Modifier modifier, boolean z2, boolean z3, boolean z4, final Function3 function32, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final boolean z5;
        int i8;
        final boolean z6;
        int i9;
        boolean z7;
        final boolean z9;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean zN;
        Object objIF;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-402577235);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(swipeToDismissBoxState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function3) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z5 = z2;
                    i5 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        z6 = z3;
                        i5 |= composerKN.n(z6) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                        z7 = z4;
                    } else {
                        z7 = z4;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.n(z7) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                        Modifier modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            z5 = true;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i9 != 0) {
                            z7 = true;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-402577235, i5, -1, "androidx.compose.material3.SwipeToDismissBox (SwipeToDismissBox.kt:224)");
                        }
                        z9 = composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t;
                        AnchoredDraggableState anchoredDraggableState = swipeToDismissBoxState.getAnchoredDraggableState();
                        Orientation orientation = Orientation.f16970t;
                        Modifier modifierO = AnchoredDraggableKt.O(modifier3, anchoredDraggableState, orientation, !z7 && swipeToDismissBoxState.rl() == SwipeToDismissBoxValue.Settled, false, null, 24, null);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), true);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierO);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N);
                        }
                        composerN = Updater.n(composerKN);
                        boolean z11 = z7;
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        function2Rl = companion2.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO2, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierO3 = boxScopeInstance.O(companion3);
                        int i11 = (i5 << 6) & 7168;
                        Arrangement arrangement = Arrangement.f17400n;
                        MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion.qie(), composerKN, 0);
                        iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierO3);
                        Function0 function0N2 = companion2.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N2);
                        }
                        composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyRl, companion2.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                        function2Rl2 = companion2.rl();
                        if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO4, companion2.nr());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                        function3.invoke(rowScopeInstance, composerKN, Integer.valueOf(((i11 >> 6) & 112) | 6));
                        composerKN.XQ();
                        AnchoredDraggableState anchoredDraggableState2 = swipeToDismissBoxState.getAnchoredDraggableState();
                        zN = ((i5 & 7168) != 2048) | composerKN.n(z9) | ((57344 & i5) != 16384) | ((i5 & 14) != 4);
                        objIF = composerKN.iF();
                        if (!zN || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue>>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue> invoke(IntSize intSize, Constraints constraints) {
                                    return n(intSize.getPackedValue(), constraints.getValue());
                                }

                                public final Pair n(long j2, long j3) {
                                    final float fUo = IntSize.Uo(j2);
                                    final boolean z12 = z5;
                                    final boolean z13 = z9;
                                    final boolean z14 = z6;
                                    return TuplesKt.to(AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<SwipeToDismissBoxValue>, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                                            n(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                            draggableAnchorsConfig.n(SwipeToDismissBoxValue.Settled, 0.0f);
                                            if (z12) {
                                                draggableAnchorsConfig.n(SwipeToDismissBoxValue.StartToEnd, z13 ? -fUo : fUo);
                                            }
                                            if (z14) {
                                                draggableAnchorsConfig.n(SwipeToDismissBoxValue.EndToStart, z13 ? fUo : -fUo);
                                            }
                                        }
                                    }), swipeToDismissBoxState.nr());
                                }
                            };
                            composerKN.o(objIF);
                        }
                        Modifier modifierKN = AnchoredDraggableKt.KN(companion3, anchoredDraggableState2, orientation, (Function2) objIF);
                        int i12 = (i5 >> 9) & 7168;
                        MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion.qie(), composerKN, 0);
                        iN3 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                        Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierKN);
                        Function0 function0N3 = companion2.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N3);
                        }
                        composerN3 = Updater.n(composerKN);
                        Updater.O(composerN3, measurePolicyRl2, companion2.t());
                        Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                        function2Rl3 = companion2.rl();
                        if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                            composerN3.o(Integer.valueOf(iN3));
                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                        }
                        Updater.O(composerN3, modifierO5, companion2.nr());
                        function32.invoke(rowScopeInstance, composerKN, Integer.valueOf(((i12 >> 6) & 112) | 6));
                        composerKN.XQ();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        z10 = z11;
                        modifier2 = modifier3;
                    } else {
                        composerKN.wTp();
                        z10 = z7;
                    }
                    final boolean z12 = z5;
                    final boolean z13 = z6;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$2
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
                                SwipeToDismissBoxKt.n(swipeToDismissBoxState, function3, modifier4, z12, z13, z10, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                z6 = z3;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i5 & 599187) == 599186) {
                    if (i10 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    if (composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t) {
                    }
                    AnchoredDraggableState anchoredDraggableState3 = swipeToDismissBoxState.getAnchoredDraggableState();
                    Orientation orientation2 = Orientation.f16970t;
                    if (z7) {
                        Modifier modifierO6 = AnchoredDraggableKt.O(modifier3, anchoredDraggableState3, orientation2, !z7 && swipeToDismissBoxState.rl() == SwipeToDismissBoxValue.Settled, false, null, 24, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), true);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                        Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierO6);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0 function0N4 = companion22.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        boolean z112 = z7;
                        Updater.O(composerN, measurePolicyUo2, companion22.t());
                        Updater.O(composerN, compositionLocalMapIk4, companion22.O());
                        function2Rl = companion22.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO22, companion22.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Modifier modifierO32 = boxScopeInstance2.O(companion32);
                            int i112 = (i5 << 6) & 7168;
                            Arrangement arrangement2 = Arrangement.f17400n;
                            MeasurePolicy measurePolicyRl3 = RowKt.rl(arrangement2.J2(), companion4.qie(), composerKN, 0);
                            iN2 = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                            Modifier modifierO42 = ComposedModifierKt.O(composerKN, modifierO32);
                            Function0 function0N22 = companion22.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN2 = Updater.n(composerKN);
                            Updater.O(composerN2, measurePolicyRl3, companion22.t());
                            Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                            function2Rl2 = companion22.rl();
                            if (!composerN2.getInserting()) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                Updater.O(composerN2, modifierO42, companion22.nr());
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                function3.invoke(rowScopeInstance2, composerKN, Integer.valueOf(((i112 >> 6) & 112) | 6));
                                composerKN.XQ();
                                AnchoredDraggableState anchoredDraggableState22 = swipeToDismissBoxState.getAnchoredDraggableState();
                                zN = ((i5 & 7168) != 2048) | composerKN.n(z9) | ((57344 & i5) != 16384) | ((i5 & 14) != 4);
                                objIF = composerKN.iF();
                                if (!zN) {
                                    objIF = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue>>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SwipeToDismissBoxValue>, ? extends SwipeToDismissBoxValue> invoke(IntSize intSize, Constraints constraints) {
                                            return n(intSize.getPackedValue(), constraints.getValue());
                                        }

                                        public final Pair n(long j2, long j3) {
                                            final float fUo = IntSize.Uo(j2);
                                            final boolean z122 = z5;
                                            final boolean z132 = z9;
                                            final boolean z14 = z6;
                                            return TuplesKt.to(AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<SwipeToDismissBoxValue>, Unit>() { // from class: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                                                    n(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.n(SwipeToDismissBoxValue.Settled, 0.0f);
                                                    if (z122) {
                                                        draggableAnchorsConfig.n(SwipeToDismissBoxValue.StartToEnd, z132 ? -fUo : fUo);
                                                    }
                                                    if (z14) {
                                                        draggableAnchorsConfig.n(SwipeToDismissBoxValue.EndToStart, z132 ? fUo : -fUo);
                                                    }
                                                }
                                            }), swipeToDismissBoxState.nr());
                                        }
                                    };
                                    composerKN.o(objIF);
                                    Modifier modifierKN2 = AnchoredDraggableKt.KN(companion32, anchoredDraggableState22, orientation2, (Function2) objIF);
                                    int i122 = (i5 >> 9) & 7168;
                                    MeasurePolicy measurePolicyRl22 = RowKt.rl(arrangement2.J2(), companion4.qie(), composerKN, 0);
                                    iN3 = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                                    Modifier modifierO52 = ComposedModifierKt.O(composerKN, modifierKN2);
                                    Function0 function0N32 = companion22.n();
                                    if (composerKN.getApplier() == null) {
                                    }
                                    composerKN.T();
                                    if (composerKN.getInserting()) {
                                    }
                                    composerN3 = Updater.n(composerKN);
                                    Updater.O(composerN3, measurePolicyRl22, companion22.t());
                                    Updater.O(composerN3, compositionLocalMapIk32, companion22.O());
                                    function2Rl3 = companion22.rl();
                                    if (!composerN3.getInserting()) {
                                        composerN3.o(Integer.valueOf(iN3));
                                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                        Updater.O(composerN3, modifierO52, companion22.nr());
                                        function32.invoke(rowScopeInstance2, composerKN, Integer.valueOf(((i122 >> 6) & 112) | 6));
                                        composerKN.XQ();
                                        composerKN.XQ();
                                        if (ComposerKt.v()) {
                                        }
                                        z10 = z112;
                                        modifier2 = modifier3;
                                    }
                                }
                            }
                        }
                    }
                }
                final boolean z122 = z5;
                final boolean z132 = z6;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z5 = z2;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            z6 = z3;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            final boolean z1222 = z5;
            final boolean z1322 = z6;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z5 = z2;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        z6 = z3;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        final boolean z12222 = z5;
        final boolean z13222 = z6;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
