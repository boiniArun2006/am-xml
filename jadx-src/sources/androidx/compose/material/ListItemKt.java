package androidx.compose.material;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0092\u0001\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aA\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "secondaryText", "", "singleLineSecondaryText", "overlineText", "trailing", "text", "rl", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "Landroidx/compose/ui/unit/Dp;", "offsets", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "offset", "t", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "contentAlpha", "J2", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,445:1\n1247#2,6:446\n1247#2,6:483\n79#3,6:452\n86#3,4:467\n90#3,2:477\n94#3:482\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:519\n368#4,9:458\n377#4,3:479\n368#4,9:495\n377#4,3:516\n4034#5,6:471\n4034#5,6:508\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt\n*L\n367#1:446,6\n406#1:483,6\n367#1:452,6\n367#1:467,4\n367#1:477,2\n367#1:482\n406#1:489,6\n406#1:504,4\n406#1:514,2\n406#1:519\n367#1:458,9\n367#1:479,3\n406#1:495,9\n406#1:516,3\n367#1:471,6\n406#1:508,6\n*E\n"})
public final class ListItemKt {
    private static final Function2 J2(final TextStyle textStyle, final float f3, final Function2 function2) {
        if (function2 == null) {
            return null;
        }
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.rl(), LineHeightStyle.Trim.INSTANCE.n(), (DefaultConstructorMarker) null);
        return ComposableLambdaKt.rl(-830176860, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                n(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-830176860, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:439)");
                }
                ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(f3));
                final TextStyle textStyle2 = textStyle;
                final LineHeightStyle lineHeightStyle2 = lineHeightStyle;
                final Function2 function22 = function2;
                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1665877604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i3) {
                        if (!composer2.HI((i3 & 3) != 2, i3 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1665877604, i3, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:440)");
                        }
                        TextKt.n(TextStyle.t(textStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, lineHeightStyle2, 0, 0, null, 15728639, null), function22, composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.xMQ | 48);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, Function2 function2, Function2 function22, boolean z2, Function2 function23, Function2 function24, final Function2 function25, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function26;
        int i7;
        Function2 function27;
        int i8;
        int i9;
        Function2 function28;
        int i10;
        final Modifier modifier2;
        final boolean z3;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-450923337);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function26 = function2;
                i5 |= composerKN.E2(function26) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function27 = function22;
                    i5 |= composerKN.E2(function27) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            function28 = function23;
                            i5 |= composerKN.E2(function28) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function24) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function25) ? 1048576 : 524288;
                        }
                        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                            Modifier modifier3 = i11 != 0 ? Modifier.INSTANCE : modifier;
                            Function2 function213 = i12 != 0 ? null : function26;
                            Function2 function214 = i7 != 0 ? null : function27;
                            boolean z4 = i8 != 0 ? true : z2;
                            Function2 function215 = i9 != 0 ? null : function28;
                            Function2 function216 = i10 == 0 ? function24 : null;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-450923337, i5, -1, "androidx.compose.material.ListItem (ListItem.kt:88)");
                            }
                            Typography typographyT = MaterialTheme.f22169n.t(composerKN, 6);
                            TextStyle subtitle1 = typographyT.getSubtitle1();
                            ContentAlpha contentAlpha = ContentAlpha.f21745n;
                            Function2 function2J2 = J2(subtitle1, contentAlpha.t(composerKN, 6), function25);
                            Intrinsics.checkNotNull(function2J2);
                            Function2 function2J22 = J2(typographyT.getBody2(), contentAlpha.nr(composerKN, 6), function214);
                            Function2 function2J23 = J2(typographyT.getOverline(), contentAlpha.t(composerKN, 6), function215);
                            Function2 function2J24 = J2(typographyT.getCaption(), contentAlpha.t(composerKN, 6), function216);
                            Modifier modifierT = SemanticsModifierKt.t(modifier3, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }
                            });
                            if (function2J22 == null && function2J23 == null) {
                                composerKN.eF(-215900426);
                                OneLine.f22354n.n(modifierT, function213, function2J2, function2J24, composerKN, (i5 & 112) | 24576, 0);
                                composerKN.Xw();
                            } else if ((function2J23 == null && z4) || function2J22 == null) {
                                composerKN.eF(-215701189);
                                TwoLine.f23832n.n(modifierT, function213, function2J2, function2J22, function2J23, function2J24, composerKN, (i5 & 112) | 1572864, 0);
                                composerKN = composerKN;
                                composerKN.Xw();
                            } else {
                                composerKN.eF(-215488839);
                                ThreeLine.f23818n.n(modifierT, function213, function2J2, function2J22, function2J23, function2J24, composerKN, (i5 & 112) | 1572864, 0);
                                composerKN = composerKN;
                                composerKN.Xw();
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function211 = function214;
                            z3 = z4;
                            function212 = function215;
                            function210 = function213;
                            function29 = function216;
                            modifier2 = modifier3;
                        } else {
                            composerKN.wTp();
                            modifier2 = modifier;
                            z3 = z2;
                            function29 = function24;
                            function210 = function26;
                            function211 = function27;
                            function212 = function28;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$1
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
                                    ListItemKt.rl(modifier2, function210, function211, z3, function212, function29, function25, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    function28 = function23;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                function28 = function23;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function27 = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            function28 = function23;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function26 = function2;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function27 = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        function28 = function23;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (composerKN.HI((i5 & 599187) != 599186, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final List list, Modifier modifier, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Composer composerKN = composer.KN(1631148337);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.E2(list)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1631148337, i5, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:365)");
            }
            boolean zE2 = composerKN.E2(list);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list2, long j2) {
                        int height;
                        long jNr = Constraints.nr(j2, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size = list2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            arrayList.add(((Measurable) list2.get(i11)).dR0(jNr));
                        }
                        Integer numValueOf = 0;
                        int size2 = arrayList.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Placeable) arrayList.get(i12)).getWidth()));
                        }
                        int iIntValue = numValueOf.intValue();
                        final int[] iArr = new int[arrayList.size()];
                        List list3 = list;
                        int size3 = arrayList.size();
                        int height2 = 0;
                        for (int i13 = 0; i13 < size3; i13++) {
                            Placeable placeable = (Placeable) arrayList.get(i13);
                            if (i13 > 0) {
                                int i14 = i13 - 1;
                                height = ((Placeable) arrayList.get(i14)).getHeight() - ((Placeable) arrayList.get(i14)).z(AlignmentLineKt.rl());
                            } else {
                                height = 0;
                            }
                            int iMax = Math.max(0, (measureScope.How(((Dp) list3.get(i13)).getValue()) - placeable.z(AlignmentLineKt.n())) - height);
                            iArr[i13] = iMax + height2;
                            height2 += iMax + placeable.getHeight();
                        }
                        return MeasureScope.ER(measureScope, iIntValue, height2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1.2
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
                                List list4 = arrayList;
                                int[] iArr2 = iArr;
                                int size4 = list4.size();
                                for (int i15 = 0; i15 < size4; i15++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list4.get(i15), 0, iArr2[i15], 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int i11 = ((i5 >> 6) & 14) | (i5 & 112);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            int i12 = ((i11 << 6) & 896) | 6;
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
            Updater.O(composerN, measurePolicy, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            function2.invoke(composerKN, Integer.valueOf((i12 >> 6) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
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
                    ListItemKt.n(list, modifier2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final float f3, Modifier modifier, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Composer composerKN = composer.KN(-1062692685);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.rl(f3)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        boolean z3 = true;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1062692685, i5, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:404)");
            }
            if ((i5 & 14) != 4) {
                z3 = false;
            }
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        int iMax;
                        final int iQie;
                        final Placeable placeableDR0 = ((Measurable) list.get(0)).dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                        int iZ = placeableDR0.z(AlignmentLineKt.n());
                        if (iZ != Integer.MIN_VALUE) {
                            iQie = measureScope.How(f3) - iZ;
                            iMax = Math.max(Constraints.az(j2), placeableDR0.getHeight() + iQie);
                        } else {
                            iMax = Math.max(Constraints.az(j2), placeableDR0.getHeight());
                            iQie = IntOffset.qie(Alignment.INSTANCE.O().n(IntSize.INSTANCE.n(), IntSizeKt.n(0, iMax - placeableDR0.getHeight()), measureScope.getLayoutDirection()));
                        }
                        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1.1
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
                                Placeable.PlacementScope.az(placementScope, placeableDR0, 0, iQie, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            int i11 = ((((i5 & 112) | ((i5 >> 6) & 14)) << 6) & 896) | 6;
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
            Updater.O(composerN, measurePolicy, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            function2.invoke(composerKN, Integer.valueOf((i11 >> 6) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    ListItemKt.t(f3, modifier2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
