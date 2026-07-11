package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u001a\u0010\u001d\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", c.f62177j, "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "getBadgeWithContentHorizontalPadding", "()F", "BadgeWithContentHorizontalPadding", "Z", "BadgeWithContentHorizontalOffset", "t", "XQ", "BadgeWithContentVerticalOffset", "nr", "o", "BadgeOffset", "", "layoutAbsoluteLeft", "layoutAbsoluteTop", "greatGrandParentAbsoluteRight", "greatGrandParentAbsoluteTop", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,243:1\n1223#2,6:244\n1223#2,6:250\n1223#2,6:256\n1223#2,6:262\n1223#2,6:268\n1223#2,6:274\n78#3,6:280\n85#3,4:295\n89#3,2:305\n78#3,6:314\n85#3,4:329\n89#3,2:339\n93#3:345\n78#3,6:354\n85#3,4:369\n89#3,2:379\n93#3:385\n93#3:389\n78#3,6:393\n85#3,4:408\n89#3,2:418\n93#3:424\n368#4,9:286\n377#4:307\n368#4,9:320\n377#4:341\n378#4,2:343\n368#4,9:360\n377#4:381\n378#4,2:383\n378#4,2:387\n368#4,9:399\n377#4:420\n378#4,2:422\n4032#5,6:299\n4032#5,6:333\n4032#5,6:373\n4032#5,6:412\n71#6:308\n69#6,5:309\n74#6:342\n78#6:346\n71#6:347\n68#6,6:348\n74#6:382\n78#6:386\n98#7,3:390\n101#7:421\n105#7:425\n76#8:426\n109#8,2:427\n76#8:429\n109#8,2:430\n76#8:432\n109#8,2:433\n76#8:435\n109#8,2:436\n148#9:438\n148#9:439\n148#9:440\n148#9:441\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n*L\n74#1:244,6\n75#1:250,6\n78#1:256,6\n79#1:262,6\n91#1:268,6\n103#1:274,6\n81#1:280,6\n81#1:295,4\n81#1:305,2\n83#1:314,6\n83#1:329,4\n83#1:339,2\n83#1:345\n88#1:354,6\n88#1:369,4\n88#1:379,2\n88#1:385\n81#1:389\n194#1:393,6\n194#1:408,4\n194#1:418,2\n194#1:424\n81#1:286,9\n81#1:307\n83#1:320,9\n83#1:341\n83#1:343,2\n88#1:360,9\n88#1:381\n88#1:383,2\n81#1:387,2\n194#1:399,9\n194#1:420\n194#1:422,2\n81#1:299,6\n83#1:333,6\n88#1:373,6\n194#1:412,6\n83#1:308\n83#1:309,5\n83#1:342\n83#1:346\n88#1:347\n88#1:348,6\n88#1:382\n88#1:386\n194#1:390,3\n194#1:421\n194#1:425\n74#1:426\n74#1:427,2\n75#1:429\n75#1:430,2\n78#1:432\n78#1:433,2\n79#1:435\n79#1:436,2\n229#1:438\n235#1:439\n236#1:440\n242#1:441\n*E\n"})
public final class BadgeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f24447n = Dp.KN(4);
    private static final float rl = Dp.KN(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f24448t = Dp.KN(14);
    private static final float nr = Dp.KN(6);

    public static final float XQ() {
        return f24448t;
    }

    public static final float Z() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jN;
        long jT2;
        final Function3 function32;
        Modifier modifier3;
        Shape shapeO;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1298144073);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            jN = j2;
            i5 |= ((i3 & 2) == 0 && composerKN.nr(jN)) ? 32 : 16;
        } else {
            jN = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jT2 = j3;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jT2)) ? 256 : 128;
        } else {
            jT2 = j3;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                function32 = function3;
                i5 |= composerKN.E2(function32) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jN = BadgeDefaults.f24446n.n(composerKN, 6);
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 3) & 14);
                        i5 &= -897;
                    }
                    if (i8 != 0) {
                        function32 = null;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1298144073, i5, -1, "androidx.compose.material3.Badge (Badge.kt:183)");
                }
                BadgeTokens badgeTokens = BadgeTokens.f29398n;
                float fNr = function32 == null ? badgeTokens.nr() : badgeTokens.J2();
                if (function32 == null) {
                    composerKN.eF(-1271801170);
                    shapeO = ShapesKt.O(BadgeTokens.f29398n.t(), composerKN, 6);
                    composerKN.Xw();
                } else {
                    composerKN.eF(-1271743789);
                    shapeO = ShapesKt.O(BadgeTokens.f29398n.O(), composerKN, 6);
                    composerKN.Xw();
                }
                Modifier modifierZmq = BackgroundKt.t(SizeKt.n(modifier3, fNr, fNr), jN, shapeO).Zmq(function32 == null ? PaddingKt.gh(Modifier.INSTANCE, f24447n, 0.0f, 2, null) : Modifier.INSTANCE);
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.rl(), Alignment.INSTANCE.xMQ(), composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyRl, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                final RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composerKN.eF(-1705294841);
                if (function32 == null) {
                    ProvideContentColorTextStyleKt.n(jT2, TypographyKt.t(BadgeTokens.f29398n.rl(), composerKN, 6), ComposableLambdaKt.nr(719214594, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(719214594, i9, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:212)");
                            }
                            function32.invoke(rowScopeInstance, composer3, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, ((i5 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    composer2 = composerKN;
                } else {
                    composer2 = composerKN;
                }
                composer2.Xw();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
            }
            final long j4 = jN;
            final long j5 = jT2;
            final Function3 function33 = function32;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt$Badge$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i9) {
                        BadgeKt.n(modifier4, j4, j5, function33, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        function32 = function3;
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i8 != 0) {
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                BadgeTokens badgeTokens2 = BadgeTokens.f29398n;
                if (function32 == null) {
                }
                if (function32 == null) {
                }
                Modifier modifierZmq2 = BackgroundKt.t(SizeKt.n(modifier3, fNr, fNr), jN, shapeO).Zmq(function32 == null ? PaddingKt.gh(Modifier.INSTANCE, f24447n, 0.0f, 2, null) : Modifier.INSTANCE);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.rl(), Alignment.INSTANCE.xMQ(), composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierZmq2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion2.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl2, companion2.t());
                Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion2.nr());
                    final RowScope rowScopeInstance2 = RowScopeInstance.f17780n;
                    composerKN.eF(-1705294841);
                    if (function32 == null) {
                    }
                    composer2.Xw();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier4 = modifier3;
                }
            }
        }
        final long j42 = jN;
        final long j52 = jT2;
        final Function3 function332 = function32;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float o() {
        return nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function3 function3, Modifier modifier, final Function3 function32, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        Object objIF3;
        Object objIF4;
        Object objIF5;
        Object objIF6;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1404022535);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function32) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1404022535, i5, -1, "androidx.compose.material3.BadgedBox (Badge.kt:72)");
                }
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = PrimitiveSnapshotStateKt.n(0.0f);
                    composerKN.o(objIF);
                }
                final MutableFloatState mutableFloatState = (MutableFloatState) objIF;
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = PrimitiveSnapshotStateKt.n(0.0f);
                    composerKN.o(objIF2);
                }
                final MutableFloatState mutableFloatState2 = (MutableFloatState) objIF2;
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = PrimitiveSnapshotStateKt.n(Float.POSITIVE_INFINITY);
                    composerKN.o(objIF3);
                }
                final MutableFloatState mutableFloatState3 = (MutableFloatState) objIF3;
                objIF4 = composerKN.iF();
                if (objIF4 == companion.n()) {
                    objIF4 = PrimitiveSnapshotStateKt.n(Float.NEGATIVE_INFINITY);
                    composerKN.o(objIF4);
                }
                final MutableFloatState mutableFloatState4 = (MutableFloatState) objIF4;
                objIF5 = composerKN.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            n(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        public final void n(LayoutCoordinates layoutCoordinates) {
                            LayoutCoordinates layoutCoordinatesV;
                            LayoutCoordinates layoutCoordinatesPiY;
                            Rect rectT = LayoutCoordinatesKt.t(layoutCoordinates);
                            BadgeKt.J2(mutableFloatState, rectT.getLeft());
                            BadgeKt.KN(mutableFloatState2, rectT.getTop());
                            LayoutCoordinates layoutCoordinatesPiY2 = layoutCoordinates.piY();
                            if (layoutCoordinatesPiY2 != null && (layoutCoordinatesPiY = layoutCoordinatesPiY2.piY()) != null) {
                                layoutCoordinatesV = layoutCoordinatesPiY.v();
                            } else {
                                layoutCoordinatesV = null;
                            }
                            if (layoutCoordinatesV != null) {
                                MutableFloatState mutableFloatState5 = mutableFloatState3;
                                MutableFloatState mutableFloatState6 = mutableFloatState4;
                                Rect rectT2 = LayoutCoordinatesKt.t(layoutCoordinatesV);
                                BadgeKt.mUb(mutableFloatState5, rectT2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
                                BadgeKt.O(mutableFloatState6, rectT2.getTop());
                            }
                        }
                    };
                    composerKN.o(objIF5);
                }
                Modifier modifierN = OnGloballyPositionedModifierKt.n(modifier3, (Function1) objIF5);
                objIF6 = composerKN.iF();
                if (objIF6 == companion.n()) {
                    objIF6 = new MeasurePolicy() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                            int size = list.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                Measurable measurable = (Measurable) list.get(i8);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "badge")) {
                                    final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                    int size2 = list.size();
                                    for (int i9 = 0; i9 < size2; i9++) {
                                        Measurable measurable2 = (Measurable) list.get(i9);
                                        if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "anchor")) {
                                            final Placeable placeableDR02 = measurable2.dR0(j2);
                                            int iZ = placeableDR02.z(AlignmentLineKt.n());
                                            int iZ2 = placeableDR02.z(AlignmentLineKt.rl());
                                            int width = placeableDR02.getWidth();
                                            int height = placeableDR02.getHeight();
                                            Map mapMapOf = MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.n(), Integer.valueOf(iZ)), TuplesKt.to(AlignmentLineKt.rl(), Integer.valueOf(iZ2)));
                                            final MutableFloatState mutableFloatState5 = mutableFloatState2;
                                            final MutableFloatState mutableFloatState6 = mutableFloatState;
                                            final MutableFloatState mutableFloatState7 = mutableFloatState3;
                                            final MutableFloatState mutableFloatState8 = mutableFloatState4;
                                            return measureScope.Zn(width, height, mapMapOf, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$3$1.1
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
                                                    boolean z2 = placeableDR0.getWidth() > measureScope.How(BadgeTokens.f29398n.J2());
                                                    float fZ = z2 ? BadgeKt.Z() : BadgeKt.o();
                                                    float fXQ = z2 ? BadgeKt.XQ() : BadgeKt.o();
                                                    Placeable.PlacementScope.az(placementScope, placeableDR02, 0, 0, 0.0f, 4, null);
                                                    int width2 = placeableDR02.getWidth() - measureScope.How(fZ);
                                                    int iHow = (-placeableDR0.getHeight()) + measureScope.How(fXQ);
                                                    float fUo = BadgeKt.Uo(mutableFloatState5) + iHow;
                                                    float fXMQ = BadgeKt.xMQ(mutableFloatState7) - ((BadgeKt.t(mutableFloatState6) + width2) + placeableDR0.getWidth());
                                                    float fNr = fUo - BadgeKt.nr(mutableFloatState8);
                                                    if (fXMQ < 0.0f) {
                                                        width2 += MathKt.roundToInt(fXMQ);
                                                    }
                                                    int i10 = width2;
                                                    if (fNr < 0.0f) {
                                                        iHow -= MathKt.roundToInt(fNr);
                                                    }
                                                    Placeable.PlacementScope.az(placementScope, placeableDR0, i10, iHow, 0.0f, 4, null);
                                                }
                                            });
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    };
                    composerKN.o(objIF6);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objIF6;
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
                Updater.O(composerN, measurePolicy, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierRl = LayoutIdKt.rl(companion3, "anchor");
                Alignment.Companion companion4 = Alignment.INSTANCE;
                int i8 = ((i5 << 3) & 7168) | 54;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.O(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
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
                Updater.O(composerN2, measurePolicyUo, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function32.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i8 >> 6) & 112) | 6));
                composerKN.XQ();
                Modifier modifierRl2 = LayoutIdKt.rl(companion3, "badge");
                int i9 = ((i5 << 9) & 7168) | 6;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl2);
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
                Updater.O(composerN3, measurePolicyUo2, companion2.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                function2Rl3 = companion2.rl();
                if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion2.nr());
                function3.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i9 >> 6) & 112) | 6));
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BadgeKt$BadgedBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i10) {
                        BadgeKt.rl(function3, modifier4, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i5 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            final MutableFloatState mutableFloatState5 = (MutableFloatState) objIF;
            objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
            }
            final MutableFloatState mutableFloatState22 = (MutableFloatState) objIF2;
            objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
            }
            final MutableFloatState mutableFloatState32 = (MutableFloatState) objIF3;
            objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
            }
            final MutableFloatState mutableFloatState42 = (MutableFloatState) objIF4;
            objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
            }
            Modifier modifierN2 = OnGloballyPositionedModifierKt.n(modifier3, (Function1) objIF5);
            objIF6 = composerKN.iF();
            if (objIF6 == companion.n()) {
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objIF6;
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierN2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N4 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicy2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk4, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO4, companion22.nr());
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierRl3 = LayoutIdKt.rl(companion32, "anchor");
                Alignment.Companion companion42 = Alignment.INSTANCE;
                int i82 = ((i5 << 3) & 7168) | 54;
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion42.O(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierRl3);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyUo3, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    function32.invoke(boxScopeInstance2, composerKN, Integer.valueOf(((i82 >> 6) & 112) | 6));
                    composerKN.XQ();
                    Modifier modifierRl22 = LayoutIdKt.rl(companion32, "badge");
                    int i92 = ((i5 << 9) & 7168) | 6;
                    MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion42.HI(), false);
                    iN3 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                    Modifier modifierO32 = ComposedModifierKt.O(composerKN, modifierRl22);
                    Function0 function0N32 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN3 = Updater.n(composerKN);
                    Updater.O(composerN3, measurePolicyUo22, companion22.t());
                    Updater.O(composerN3, compositionLocalMapIk32, companion22.O());
                    function2Rl3 = companion22.rl();
                    if (!composerN3.getInserting()) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                        Updater.O(composerN3, modifierO32, companion22.nr());
                        function3.invoke(boxScopeInstance2, composerKN, Integer.valueOf(((i92 >> 6) & 112) | 6));
                        composerKN.XQ();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float xMQ(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }
}
