package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00128\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001eRG\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00109\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u0014\u0010;\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0014\u0010E\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010>R\u0014\u0010G\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "anchorBounds", "menuBounds", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", c.f62177j, "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "()J", "rl", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "t", "I", "getVerticalMargin", "nr", "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "O", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "J2", "endToAnchorEnd", "Uo", "leftToWindowLeft", "KN", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "xMQ", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "mUb", "bottomToAnchorTop", "gh", "centerToAnchorTop", "qie", "topToWindowTop", "az", "bottomToWindowBottom", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MenuPosition.Horizontal endToAnchorEnd;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final MenuPosition.Horizontal rightToWindowRight;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MenuPosition.Horizontal startToAnchorStart;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MenuPosition.Horizontal leftToWindowLeft;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MenuPosition.Vertical bottomToWindowBottom;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MenuPosition.Vertical centerToAnchorTop;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final MenuPosition.Vertical bottomToAnchorTop;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOffset;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final Function2 onPositionCalculated;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MenuPosition.Vertical topToWindowTop;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final Density density;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final int verticalMargin;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MenuPosition.Vertical topToAnchorBottom;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, i2, function2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.O(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((DpOffset.KN(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public long n(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int iN;
        int i2 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new MenuPosition.Horizontal[]{this.startToAnchorStart, this.endToAnchorEnd, IntOffset.gh(anchorBounds.O()) < IntSize.Uo(windowSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listListOf.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                iN = 0;
                break;
            }
            iN = ((MenuPosition.Horizontal) listListOf.get(i3)).n(anchorBounds, windowSize, IntSize.Uo(popupContentSize), layoutDirection);
            if (i3 == CollectionsKt.getLastIndex(listListOf) || (iN >= 0 && IntSize.Uo(popupContentSize) + iN <= IntSize.Uo(windowSize))) {
                break;
            }
            i3++;
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new MenuPosition.Vertical[]{this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.qie(anchorBounds.O()) < IntSize.J2(windowSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listListOf2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            int iN2 = ((MenuPosition.Vertical) listListOf2.get(i5)).n(anchorBounds, windowSize, IntSize.J2(popupContentSize));
            if (i5 == CollectionsKt.getLastIndex(listListOf2) || (iN2 >= this.verticalMargin && IntSize.J2(popupContentSize) + iN2 <= IntSize.J2(windowSize) - this.verticalMargin)) {
                i2 = iN2;
                break;
            }
        }
        long jN = IntOffsetKt.n(iN, i2);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.n(jN, popupContentSize));
        return jN;
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.xMQ(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2) {
        this.contentOffset = j2;
        this.density = density;
        this.verticalMargin = i2;
        this.onPositionCalculated = function2;
        int iHow = density.How(DpOffset.J2(j2));
        MenuPosition menuPosition = MenuPosition.f29232n;
        this.startToAnchorStart = menuPosition.gh(iHow);
        this.endToAnchorEnd = menuPosition.O(iHow);
        this.leftToWindowLeft = menuPosition.Uo(0);
        this.rightToWindowRight = menuPosition.xMQ(0);
        int iHow2 = density.How(DpOffset.Uo(j2));
        this.topToAnchorBottom = menuPosition.az(iHow2);
        this.bottomToAnchorTop = menuPosition.n(iHow2);
        this.centerToAnchorTop = menuPosition.nr(iHow2);
        this.topToWindowTop = menuPosition.HI(i2);
        this.bottomToWindowBottom = menuPosition.t(i2);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, (i3 & 4) != 0 ? density.How(MenuKt.mUb()) : i2, (i3 & 8) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            public final void n(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                n(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2, null);
    }
}
