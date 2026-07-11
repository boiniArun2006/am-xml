package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001aH\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\u0012¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010 \u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052*\b\u0002\u0010\u001e\u001a$\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b \u0010!\u001a#\u0010%\u001a\u00020\r2\b\b\u0003\u0010#\u001a\u00020\"2\b\b\u0003\u0010$\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&\u001a2\u0010+\u001a\u00020\u001a*\u00020'2\b\b\u0001\u0010(\u001a\u00020\"2\b\b\u0001\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\u0004\u0018\u00010-*\u00020'2\b\b\u0001\u0010(\u001a\u00020\"2\b\b\u0001\u0010)\u001a\u00020\"H\u0002¢\u0006\u0004\b.\u0010/\u001a \u00100\u001a\u00020\u001a*\u0004\u0018\u00010-2\u0006\u0010*\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a \u00102\u001a\u00020\u001a*\u0004\u0018\u00010-2\u0006\u0010*\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00101\"\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00104\" \u0010;\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismiss", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "nr", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "colors", "t", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "iconColor", "leadingIcon", "onClick", "rl", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "backgroundStyleId", "foregroundStyleId", "O", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "Landroid/content/Context;", "resId", "attrId", "defaultColor", "KN", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "xMQ", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "Uo", "(Landroid/content/res/ColorStateList;J)J", "J2", "Landroidx/compose/ui/window/PopupProperties;", "Landroidx/compose/ui/window/PopupProperties;", "DefaultPopupProperties", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "DefaultContextMenuColors", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,426:1\n87#2:427\n84#2,9:428\n94#2:467\n79#3,6:437\n86#3,3:452\n89#3,2:461\n93#3:466\n79#3,6:480\n86#3,3:495\n89#3,2:504\n79#3,6:517\n86#3,3:532\n89#3,2:541\n93#3:546\n93#3:550\n347#4,9:443\n356#4,3:463\n347#4,9:486\n356#4:506\n347#4,9:523\n356#4,3:543\n357#4,2:548\n4206#5,6:455\n4206#5,6:498\n4206#5,6:535\n1247#6,6:468\n1247#6,6:554\n99#7,6:474\n106#7:551\n70#8:507\n67#8,9:508\n77#8:547\n75#9:552\n75#9:553\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n149#1:427\n149#1:428,9\n149#1:467\n149#1:437,6\n149#1:452,3\n149#1:461,2\n149#1:466\n187#1:480,6\n187#1:495,3\n187#1:504,2\n210#1:517,6\n210#1:532,3\n210#1:541,2\n210#1:546\n187#1:550\n149#1:443,9\n149#1:463,3\n187#1:486,9\n187#1:506\n210#1:523,9\n210#1:543,3\n187#1:548,2\n149#1:455,6\n187#1:498,6\n210#1:535,6\n195#1:468,6\n366#1:554,6\n187#1:474,6\n187#1:551\n210#1:507\n210#1:508,9\n210#1:547\n365#1:552\n366#1:553\n*E\n"})
public final class ContextMenuUi_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PopupProperties f16379n = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
    private static final ContextMenuColors rl;

    static {
        Color.Companion companion = Color.INSTANCE;
        rl = new ContextMenuColors(companion.KN(), companion.n(), companion.n(), Color.az(companion.n(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(companion.n(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final ContextMenuColors O(int i2, int i3, Composer composer, int i5, int i7) {
        int i8 = (i7 & 1) != 0 ? R.style.Widget.PopupMenu : i2;
        int i9 = (i7 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i3;
        if (ComposerKt.v()) {
            ComposerKt.p5(1689505294, i5, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
        }
        Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        boolean zP5 = composer.p5((Configuration) composer.ty(AndroidCompositionLocals_androidKt.J2())) | composer.p5(context);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            ContextMenuColors contextMenuColors = rl;
            long jKN = KN(context, i8, R.attr.colorBackground, contextMenuColors.getBackgroundColor());
            ColorStateList colorStateListXMQ = xMQ(context, i9, R.attr.textColorPrimary);
            long jUo = Uo(colorStateListXMQ, contextMenuColors.getTextColor());
            long jJ2 = J2(colorStateListXMQ, contextMenuColors.getDisabledTextColor());
            Object contextMenuColors2 = new ContextMenuColors(jKN, jUo, jUo, jJ2, jJ2, null);
            composer.o(contextMenuColors2);
            objIF = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return contextMenuColors3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(ContextMenuColors contextMenuColors, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        ContextMenuColors contextMenuColors2;
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-921259293);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            contextMenuColors2 = contextMenuColors;
        } else if ((i2 & 6) == 0) {
            contextMenuColors2 = contextMenuColors;
            i5 = (composerKN.p5(contextMenuColors2) ? 4 : 2) | i2;
        } else {
            contextMenuColors2 = contextMenuColors;
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
                i5 |= composerKN.E2(function3) ? 256 : 128;
            }
            if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-921259293, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:147)");
                }
                ContextMenuSpec contextMenuSpec = ContextMenuSpec.f16374n;
                Modifier modifierUo = ScrollKt.Uo(PaddingKt.gh(IntrinsicKt.rl(BackgroundKt.nr(ShadowKt.rl(modifier3, contextMenuSpec.KN(), RoundedCornerShapeKt.t(contextMenuSpec.t()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), IntrinsicSize.f17697t), 0.0f, contextMenuSpec.xMQ(), 1, null), ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
                int i8 = (i5 << 3) & 7168;
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                int iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierUo);
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
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                Function2 function2Rl = companion.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                function3.invoke(ColumnScopeInstance.f17468n, composerKN, Integer.valueOf(((i8 >> 6) & 112) | 6));
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final ContextMenuColors contextMenuColors3 = contextMenuColors2;
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
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
                        ContextMenuUi_androidKt.n(contextMenuColors3, modifier4, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String str, final boolean z2, final ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, final Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        ContextMenuColors contextMenuColors2;
        Modifier modifier2;
        int i7;
        Function3 function32;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final Function3 function33;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        Modifier modifier4;
        Composer composerKN = composer.KN(791018367);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            contextMenuColors2 = contextMenuColors;
        } else {
            contextMenuColors2 = contextMenuColors;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.p5(contextMenuColors2) ? 256 : 128;
            }
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function32 = function3;
                    i5 |= composerKN.E2(function32) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerKN.E2(function0) ? 131072 : 65536;
                }
                i8 = i5;
                if (composerKN.HI((74899 & i8) != 74898, i8 & 1)) {
                    if (i10 != 0) {
                        i9 = i7;
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        i9 = i7;
                        modifier4 = modifier2;
                    }
                    Function3 function34 = i9 != 0 ? null : function32;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(791018367, i8, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:185)");
                    }
                    ContextMenuSpec contextMenuSpec = ContextMenuSpec.f16374n;
                    Alignment.Vertical verticalJ2 = contextMenuSpec.J2();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(contextMenuSpec.nr());
                    boolean z3 = ((i8 & 112) == 32) | ((458752 & i8) == 131072);
                    Object objIF = composerKN.iF();
                    if (z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0<Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z2) {
                                    function0.invoke();
                                }
                            }
                        };
                        composerKN.o(objIF);
                    }
                    Modifier modifierGh = PaddingKt.gh(SizeKt.WPU(SizeKt.KN(ClickableKt.J2(modifier4, z2, str, null, (Function0) objIF, 4, null), 0.0f, 1, null), contextMenuSpec.rl(), contextMenuSpec.Uo(), contextMenuSpec.n(), contextMenuSpec.Uo()), contextMenuSpec.nr(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalJ2, composerKN, 54);
                    int iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
                    Updater.O(composerN, measurePolicyRl, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    if (function34 == null) {
                        composerKN.eF(554788141);
                    } else {
                        composerKN.eF(554788142);
                        Modifier modifierR = SizeKt.r(Modifier.INSTANCE, contextMenuSpec.O(), 0.0f, contextMenuSpec.O(), contextMenuSpec.O(), 2, null);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        int iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierR);
                        Function0 function0N2 = companion.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.s7N(function0N2);
                        } else {
                            composerKN.r();
                        }
                        Composer composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyUo, companion.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion.O());
                        Function2 function2Rl2 = companion.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        function34.invoke(Color.xMQ(z2 ? contextMenuColors2.getIconColor() : contextMenuColors2.getDisabledIconColor()), composerKN, 0);
                        composerKN.XQ();
                        Unit unit = Unit.INSTANCE;
                    }
                    composerKN.Xw();
                    TextStyle textStyleMUb = contextMenuSpec.mUb(z2 ? contextMenuColors2.getTextColor() : contextMenuColors2.getDisabledTextColor());
                    Function3 function35 = function34;
                    composer2 = composerKN;
                    BasicTextKt.J2(str, rowScopeInstance.n(Modifier.INSTANCE, 1.0f, true), textStyleMUb, null, 0, false, 1, 0, null, null, composer2, (i8 & 14) | 1572864, 952);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    function33 = function35;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i11) {
                            ContextMenuUi_androidKt.rl(str, z2, contextMenuColors, modifier3, function33, function0, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            function32 = function3;
            if ((i3 & 32) != 0) {
            }
            i8 = i5;
            if (composerKN.HI((74899 & i8) != 74898, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        function32 = function3;
        if ((i3 & 32) != 0) {
        }
        i8 = i5;
        if (composerKN.HI((74899 & i8) != 74898, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final PopupPositionProvider popupPositionProvider, final Function0 function0, Modifier modifier, final ContextMenuColors contextMenuColors, final Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1447189339);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.p5(contextMenuColors) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(function1) ? 16384 : 8192;
            }
            if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                composerKN.wTp();
            } else {
                final Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1447189339, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:124)");
                }
                AndroidPopup_androidKt.n(popupPositionProvider, function0, f16379n, ComposableLambdaKt.nr(795909757, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(795909757, i8, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:130)");
                        }
                        final ContextMenuColors contextMenuColors2 = contextMenuColors;
                        Modifier modifier4 = modifier3;
                        final Function1 function12 = function1;
                        ContextMenuUi_androidKt.n(contextMenuColors2, modifier4, ComposableLambdaKt.nr(1156688164, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                n(columnScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(ColumnScope columnScope, Composer composer3, int i9) {
                                if (!composer3.HI((i9 & 17) != 16, i9 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1156688164, i9, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:131)");
                                }
                                Object objIF = composer3.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = new ContextMenuScope();
                                    composer3.o(objIF);
                                }
                                ContextMenuScope contextMenuScope = (ContextMenuScope) objIF;
                                Function1 function13 = function12;
                                ContextMenuColors contextMenuColors3 = contextMenuColors2;
                                contextMenuScope.rl();
                                function13.invoke(contextMenuScope);
                                contextMenuScope.n(contextMenuColors3, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | 3456 | (i5 & 112), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        ContextMenuUi_androidKt.t(popupPositionProvider, function0, modifier2, contextMenuColors, function1, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final long J2(ColorStateList colorStateList, long j2) {
        Integer numValueOf;
        int iMUb = ColorKt.mUb(j2);
        if (colorStateList != null) {
            numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iMUb));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() != iMUb) {
            return ColorKt.rl(numValueOf.intValue());
        }
        return j2;
    }

    private static final long KN(Context context, int i2, int i3, long j2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        int iMUb = ColorKt.mUb(j2);
        int color = typedArrayObtainStyledAttributes.getColor(0, iMUb);
        typedArrayObtainStyledAttributes.recycle();
        if (color == iMUb) {
            return j2;
        }
        return ColorKt.rl(color);
    }

    private static final long Uo(ColorStateList colorStateList, long j2) {
        Integer numValueOf;
        int iMUb = ColorKt.mUb(j2);
        if (colorStateList != null) {
            numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iMUb));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() != iMUb) {
            return ColorKt.rl(numValueOf.intValue());
        }
        return j2;
    }

    public static final void nr(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, Function1 function1, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        Function0 function02;
        final Function1 function12;
        final PopupPositionProvider popupPositionProvider2;
        final Modifier modifier2;
        Composer composerKN = composer.KN(712057293);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(popupPositionProvider)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.E2(function0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(modifier)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (composerKN.E2(function1)) {
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
            if (ComposerKt.v()) {
                ComposerKt.p5(712057293, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            function02 = function0;
            t(popupPositionProvider, function02, modifier3, O(0, 0, composerKN, 0, 3), function1, composerKN, (i5 & 1022) | ((i5 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            function12 = function1;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
        } else {
            function02 = function0;
            function12 = function1;
            popupPositionProvider2 = popupPositionProvider;
            composerKN.wTp();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function03 = function02;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
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
                    ContextMenuUi_androidKt.nr(popupPositionProvider2, function03, modifier2, function12, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private static final ColorStateList xMQ(Context context, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
