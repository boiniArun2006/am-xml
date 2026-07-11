package androidx.compose.material3;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.compose.BackHandlerKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u00020\u0015*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006'²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\u001e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function0;", "onKeyboardVisibilityChange", "KN", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/geometry/Rect;", "windowBounds", "anchorBounds", "", "verticalMargin", "Z", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)I", "S", "(Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "XQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Dp;", "F", "ExposedDropdownMenuItemHorizontalPadding", "anchorCoordinates", "anchorWidth", "menuMaxHeight", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1490:1\n77#2:1491\n77#2:1492\n77#2:1493\n77#2:1519\n1#3:1494\n1223#4,6:1495\n1223#4,6:1501\n1223#4,6:1507\n1223#4,6:1513\n1223#4,6:1523\n1223#4,6:1529\n1223#4,6:1535\n1223#4,6:1581\n1223#4,6:1587\n1223#4,6:1593\n1223#4,6:1599\n66#5:1520\n69#5:1521\n72#5:1522\n71#6:1541\n68#6,6:1542\n74#6:1576\n78#6:1580\n78#7,6:1548\n85#7,4:1563\n89#7,2:1573\n93#7:1579\n368#8,9:1554\n377#8:1575\n378#8,2:1577\n4032#9,6:1567\n81#10:1605\n107#10,2:1606\n75#11:1608\n108#11,2:1609\n75#11:1611\n108#11,2:1612\n148#12:1614\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n141#1:1491\n142#1:1492\n143#1:1493\n152#1:1519\n147#1:1495,6\n148#1:1501,6\n149#1:1507,6\n151#1:1513,6\n156#1:1523,6\n159#1:1529,6\n201#1:1535,6\n216#1:1581,6\n226#1:1587,6\n230#1:1593,6\n241#1:1599,6\n153#1:1520\n154#1:1521\n155#1:1522\n200#1:1541\n200#1:1542,6\n200#1:1576\n200#1:1580\n200#1:1548,6\n200#1:1563,4\n200#1:1573,2\n200#1:1579\n200#1:1554,9\n200#1:1575\n200#1:1577,2\n200#1:1567,6\n147#1:1605\n147#1:1606,2\n148#1:1608\n148#1:1609,2\n149#1:1611\n149#1:1612,2\n1489#1:1614\n*E\n"})
public final class ExposedDropdownMenu_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f25796n = Dp.KN(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(Rect rect, Rect rect2, int i2) {
        if (rect2 == null) {
            return 0;
        }
        float f3 = i2;
        float top = rect.getTop() + f3;
        float fXMQ = rect.xMQ() - f3;
        return Math.max((rect2.getTop() > rect.xMQ() || rect2.xMQ() < rect.getTop()) ? MathKt.roundToInt(fXMQ - top) : MathKt.roundToInt(Math.max(rect2.getTop() - top, fXMQ - rect2.xMQ())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect S(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.O(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect XQ(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates == null ? Rect.INSTANCE.n() : RectKt.t(LayoutCoordinatesKt.Uo(layoutCoordinates), IntSizeKt.O(layoutCoordinates.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function1 function1, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        View view;
        Density density;
        int iHow;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        Object objIF2;
        final MutableIntState mutableIntState;
        Object objIF3;
        final MutableIntState mutableIntState2;
        Object objIF4;
        final FocusRequester focusRequester;
        final SoftwareKeyboardController softwareKeyboardController;
        final String strN;
        final String strN2;
        final String strN3;
        Object objIF5;
        final MutableState mutableState2;
        int i7;
        int i8;
        boolean zP5;
        Object obj;
        int i9;
        Density density2;
        int i10;
        final int i11;
        Modifier modifier4;
        int i12;
        final View view2;
        final FocusRequester focusRequester2;
        boolean zE2;
        Object objIF6;
        final MutableState mutableState3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z3;
        Object objIF7;
        boolean z4;
        Object objIF8;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeGh;
        final boolean z5 = z2;
        final Function1 function12 = function1;
        Composer composerKN = composer.KN(2067579792);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z5) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function12) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function3) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(2067579792, i5, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)");
                }
                Configuration configuration = (Configuration) composerKN.ty(AndroidCompositionLocals_androidKt.J2());
                view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
                density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                iHow = density.How(MenuKt.mUb());
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                    composerKN.o(objIF);
                }
                mutableState = (MutableState) objIF;
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = SnapshotIntStateKt.n(0);
                    composerKN.o(objIF2);
                }
                mutableIntState = (MutableIntState) objIF2;
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = SnapshotIntStateKt.n(0);
                    composerKN.o(objIF3);
                }
                mutableIntState2 = (MutableIntState) objIF3;
                objIF4 = composerKN.iF();
                if (objIF4 == companion.n()) {
                    objIF4 = new FocusRequester();
                    composerKN.o(objIF4);
                }
                focusRequester = (FocusRequester) objIF4;
                softwareKeyboardController = (SoftwareKeyboardController) composerKN.ty(CompositionLocalsKt.Ik());
                Strings.Companion companion2 = Strings.INSTANCE;
                strN = Strings_androidKt.n(Strings.n(R.string.f27139v), composerKN, 0);
                strN2 = Strings_androidKt.n(Strings.n(R.string.wTp), composerKN, 0);
                strN3 = Strings_androidKt.n(Strings.n(R.string.rV9), composerKN, 0);
                objIF5 = composerKN.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = SnapshotStateKt__SnapshotStateKt.O(MenuAnchorType.nr(MenuAnchorType.INSTANCE.rl()), null, 2, null);
                    composerKN.o(objIF5);
                }
                mutableState2 = (MutableState) objIF5;
                i7 = i5 & 14;
                i8 = i5 & 112;
                zP5 = composerKN.p5(configuration) | (i7 != 4) | (i8 != 32) | composerKN.p5(view) | composerKN.p5(density);
                Object objIF9 = composerKN.iF();
                if (!zP5 || objIF9 == companion.n()) {
                    i9 = i7;
                    density2 = density;
                    i10 = i8;
                    i11 = iHow;
                    modifier4 = modifier3;
                    i12 = i5;
                    view2 = view;
                    obj = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public String O() {
                            return ((MenuAnchorType) mutableState2.getValue()).getName();
                        }

                        @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                        public Modifier nr(Modifier modifier6, final boolean z6) {
                            final MutableIntState mutableIntState3 = mutableIntState;
                            final MutableIntState mutableIntState4 = mutableIntState2;
                            return LayoutModifierKt.n(modifier6, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return n(measureScope, measurable, constraints.getValue());
                                }

                                public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                                    int iUo = ConstraintsKt.Uo(j2, ExposedDropdownMenu_androidKt.nr(mutableIntState3));
                                    int iJ2 = ConstraintsKt.J2(j2, ExposedDropdownMenu_androidKt.J2(mutableIntState4));
                                    int iTy = z6 ? iUo : Constraints.ty(j2);
                                    if (!z6) {
                                        iUo = Constraints.qie(j2);
                                    }
                                    final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, iTy, iUo, 0, iJ2, 4, null));
                                    return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1.1
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
                            });
                        }
                    };
                    focusRequester2 = focusRequester;
                    z5 = z2;
                    function12 = function1;
                    composerKN.o(obj);
                } else {
                    z5 = z2;
                    i9 = i7;
                    obj = objIF9;
                    i12 = i5;
                    view2 = view;
                    density2 = density;
                    i10 = i8;
                    focusRequester2 = focusRequester;
                    i11 = iHow;
                    function12 = function1;
                    modifier4 = modifier3;
                }
                ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) obj;
                zE2 = composerKN.E2(view2) | composerKN.t(i11);
                objIF6 = composerKN.iF();
                if (!zE2 || objIF6 == companion.n()) {
                    final int i14 = i11;
                    final View view3 = view2;
                    objIF6 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
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
                            ExposedDropdownMenu_androidKt.t(mutableState, layoutCoordinates);
                            ExposedDropdownMenu_androidKt.O(mutableIntState, IntSize.Uo(layoutCoordinates.n()));
                            ExposedDropdownMenu_androidKt.Uo(mutableIntState2, ExposedDropdownMenu_androidKt.Z(ExposedDropdownMenu_androidKt.S(view3.getRootView()), ExposedDropdownMenu_androidKt.XQ(ExposedDropdownMenu_androidKt.rl(mutableState)), i14));
                        }
                    };
                    mutableState3 = mutableState;
                    composerKN.o(objIF6);
                } else {
                    mutableState3 = mutableState;
                }
                Modifier modifierN = OnGloballyPositionedModifierKt.n(modifier4, (Function1) objIF6);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, composerKN, Integer.valueOf((i12 >> 6) & 112));
                composerKN.XQ();
                composerKN.eF(426363998);
                if (z5) {
                    boolean zE22 = composerKN.E2(view2) | composerKN.t(i11);
                    Object objIF10 = composerKN.iF();
                    if (zE22 || objIF10 == companion.n()) {
                        objIF10 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1
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
                                ExposedDropdownMenu_androidKt.Uo(mutableIntState2, ExposedDropdownMenu_androidKt.Z(ExposedDropdownMenu_androidKt.S(view2.getRootView()), ExposedDropdownMenu_androidKt.XQ(ExposedDropdownMenu_androidKt.rl(mutableState3)), i11));
                            }
                        };
                        composerKN.o(objIF10);
                    }
                    KN(view2, density2, (Function0) objIF10, composerKN, 0);
                }
                composerKN.Xw();
                int i15 = i9;
                z3 = i15 != 4;
                objIF7 = composerKN.iF();
                if (!z3 || objIF7 == companion.n()) {
                    objIF7 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
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
                            if (z5) {
                                focusRequester2.J2();
                            }
                        }
                    };
                    composerKN.o(objIF7);
                }
                EffectsKt.KN((Function0) objIF7, composerKN, 0);
                z4 = i10 != 32;
                objIF8 = composerKN.iF();
                if (!z4 || objIF8 == companion.n()) {
                    objIF8 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
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
                            function12.invoke(Boolean.FALSE);
                        }
                    };
                    composerKN.o(objIF8);
                }
                BackHandlerKt.n(z5, (Function0) objIF8, composerKN, i15, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier5 = modifier4;
            } else {
                composerKN.wTp();
                modifier5 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6
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
                        ExposedDropdownMenu_androidKt.n(z5, function12, modifier5, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if ((i5 & 1171) == 1170) {
            if (i13 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Configuration configuration2 = (Configuration) composerKN.ty(AndroidCompositionLocals_androidKt.J2());
            view = (View) composerKN.ty(AndroidCompositionLocals_androidKt.gh());
            density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            iHow = density.How(MenuKt.mUb());
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            mutableState = (MutableState) objIF;
            objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
            }
            mutableIntState = (MutableIntState) objIF2;
            objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
            }
            mutableIntState2 = (MutableIntState) objIF3;
            objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
            }
            focusRequester = (FocusRequester) objIF4;
            softwareKeyboardController = (SoftwareKeyboardController) composerKN.ty(CompositionLocalsKt.Ik());
            Strings.Companion companion22 = Strings.INSTANCE;
            strN = Strings_androidKt.n(Strings.n(R.string.f27139v), composerKN, 0);
            strN2 = Strings_androidKt.n(Strings.n(R.string.wTp), composerKN, 0);
            strN3 = Strings_androidKt.n(Strings.n(R.string.rV9), composerKN, 0);
            objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
            }
            mutableState2 = (MutableState) objIF5;
            i7 = i5 & 14;
            if (i7 != 4) {
            }
            i8 = i5 & 112;
            if (i8 != 32) {
            }
            zP5 = composerKN.p5(configuration2) | (i7 != 4) | (i8 != 32) | composerKN.p5(view) | composerKN.p5(density);
            Object objIF92 = composerKN.iF();
            if (zP5) {
                i9 = i7;
                density2 = density;
                i10 = i8;
                i11 = iHow;
                modifier4 = modifier3;
                i12 = i5;
                view2 = view;
                obj = new ExposedDropdownMenuBoxScopeImpl() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public String O() {
                        return ((MenuAnchorType) mutableState2.getValue()).getName();
                    }

                    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    public Modifier nr(Modifier modifier6, final boolean z6) {
                        final MutableIntState mutableIntState3 = mutableIntState;
                        final MutableIntState mutableIntState4 = mutableIntState2;
                        return LayoutModifierKt.n(modifier6, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return n(measureScope, measurable, constraints.getValue());
                            }

                            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                                int iUo = ConstraintsKt.Uo(j2, ExposedDropdownMenu_androidKt.nr(mutableIntState3));
                                int iJ2 = ConstraintsKt.J2(j2, ExposedDropdownMenu_androidKt.J2(mutableIntState4));
                                int iTy = z6 ? iUo : Constraints.ty(j2);
                                if (!z6) {
                                    iUo = Constraints.qie(j2);
                                }
                                final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, iTy, iUo, 0, iJ2, 4, null));
                                return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1.1
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
                        });
                    }
                };
                focusRequester2 = focusRequester;
                z5 = z2;
                function12 = function1;
                composerKN.o(obj);
                ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$12 = (ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) obj;
                zE2 = composerKN.E2(view2) | composerKN.t(i11);
                objIF6 = composerKN.iF();
                if (zE2) {
                    final int i142 = i11;
                    final View view32 = view2;
                    objIF6 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
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
                            ExposedDropdownMenu_androidKt.t(mutableState, layoutCoordinates);
                            ExposedDropdownMenu_androidKt.O(mutableIntState, IntSize.Uo(layoutCoordinates.n()));
                            ExposedDropdownMenu_androidKt.Uo(mutableIntState2, ExposedDropdownMenu_androidKt.Z(ExposedDropdownMenu_androidKt.S(view32.getRootView()), ExposedDropdownMenu_androidKt.XQ(ExposedDropdownMenu_androidKt.rl(mutableState)), i142));
                        }
                    };
                    mutableState3 = mutableState;
                    composerKN.o(objIF6);
                    Modifier modifierN2 = OnGloballyPositionedModifierKt.n(modifier4, (Function1) objIF6);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo2, companion32.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                    function2Rl = companion32.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion32.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$12, composerKN, Integer.valueOf((i12 >> 6) & 112));
                        composerKN.XQ();
                        composerKN.eF(426363998);
                        if (z5) {
                        }
                        composerKN.Xw();
                        int i152 = i9;
                        if (i152 != 4) {
                        }
                        objIF7 = composerKN.iF();
                        if (!z3) {
                            objIF7 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
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
                                    if (z5) {
                                        focusRequester2.J2();
                                    }
                                }
                            };
                            composerKN.o(objIF7);
                            EffectsKt.KN((Function0) objIF7, composerKN, 0);
                            if (i10 != 32) {
                            }
                            objIF8 = composerKN.iF();
                            if (!z4) {
                                objIF8 = new Function0<Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
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
                                        function12.invoke(Boolean.FALSE);
                                    }
                                };
                                composerKN.o(objIF8);
                                BackHandlerKt.n(z5, (Function0) objIF8, composerKN, i152, 0);
                                if (ComposerKt.v()) {
                                }
                                modifier5 = modifier4;
                            }
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
    public static final int J2(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final View view, final Density density, final Function0 function0, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1319522472);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(view)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(density)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function0)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1319522472, i3, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            boolean zE2 = composerKN.E2(view);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = zE2 | z2;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void n() {
                                exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.n();
                            }
                        };
                    }
                };
                composerKN.o(objIF);
            }
            EffectsKt.n(view, density, (Function1) objIF, composerKN, i3 & 126);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$2
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
                    ExposedDropdownMenu_androidKt.KN(view, density, function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates rl(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
    }
}
