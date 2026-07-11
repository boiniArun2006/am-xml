package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Stable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u00128\b\u0002\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!RG\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00103\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u0014\u00105\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/Density;", "density", "", "topWindowInsets", "Landroidx/compose/runtime/State;", "", "keyboardSignalState", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "anchorBounds", "menuBounds", "onPositionCalculated", "<init>", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/runtime/State;ILkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", c.f62177j, "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "rl", "I", "getTopWindowInsets", "()I", "t", "Landroidx/compose/runtime/State;", "getKeyboardSignalState", "()Landroidx/compose/runtime/State;", "nr", "getVerticalMargin", "O", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "J2", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "Uo", "endToAnchorEnd", "KN", "leftToWindowLeft", "xMQ", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "mUb", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "gh", "bottomToAnchorTop", "qie", "topToWindowTop", "az", "bottomToWindowBottom", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1490:1\n1#2:1491\n*E\n"})
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MenuPosition.Horizontal startToAnchorStart;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MenuPosition.Horizontal leftToWindowLeft;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function2 onPositionCalculated;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MenuPosition.Horizontal endToAnchorEnd;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MenuPosition.Vertical bottomToWindowBottom;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MenuPosition.Vertical bottomToAnchorTop;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MenuPosition.Vertical topToAnchorBottom;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int verticalMargin;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MenuPosition.Vertical topToWindowTop;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int topWindowInsets;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final State keyboardSignalState;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MenuPosition.Horizontal rightToWindowRight;

    public ExposedDropdownMenuPositionProvider(Density density, int i2, State state, int i3, Function2 function2) {
        this.density = density;
        this.topWindowInsets = i2;
        this.keyboardSignalState = state;
        this.verticalMargin = i3;
        this.onPositionCalculated = function2;
        MenuPosition menuPosition = MenuPosition.f29232n;
        this.startToAnchorStart = MenuPosition.qie(menuPosition, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.J2(menuPosition, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.KN(menuPosition, 0, 1, null);
        this.rightToWindowRight = MenuPosition.mUb(menuPosition, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.ty(menuPosition, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.rl(menuPosition, 0, 1, null);
        this.topToWindowTop = menuPosition.HI(i3);
        this.bottomToWindowBottom = menuPosition.t(i3);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public long n(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int iN;
        int i2 = 0;
        State state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jN = IntSizeKt.n(IntSize.Uo(windowSize), IntSize.J2(windowSize) + this.topWindowInsets);
        List listListOf = CollectionsKt.listOf((Object[]) new MenuPosition.Horizontal[]{this.startToAnchorStart, this.endToAnchorEnd, IntOffset.gh(anchorBounds.O()) < IntSize.Uo(jN) / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listListOf.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                iN = 0;
                break;
            }
            iN = ((MenuPosition.Horizontal) listListOf.get(i3)).n(anchorBounds, jN, IntSize.Uo(popupContentSize), layoutDirection);
            if (i3 == CollectionsKt.getLastIndex(listListOf) || (iN >= 0 && IntSize.Uo(popupContentSize) + iN <= IntSize.Uo(jN))) {
                break;
            }
            i3++;
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new MenuPosition.Vertical[]{this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.qie(anchorBounds.O()) < IntSize.J2(jN) / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listListOf2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            int iN2 = ((MenuPosition.Vertical) listListOf2.get(i5)).n(anchorBounds, jN, IntSize.J2(popupContentSize));
            if (i5 == CollectionsKt.getLastIndex(listListOf2) || (iN2 >= 0 && IntSize.J2(popupContentSize) + iN2 <= IntSize.J2(jN))) {
                i2 = iN2;
                break;
            }
        }
        long jN2 = IntOffsetKt.n(iN, i2);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.n(jN2, popupContentSize));
        return jN2;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i2, State state, int i3, Function2 function2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, i2, (i5 & 4) != 0 ? null : state, (i5 & 8) != 0 ? density.How(MenuKt.mUb()) : i3, (i5 & 16) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider.2
            public final void n(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                n(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2);
    }
}
