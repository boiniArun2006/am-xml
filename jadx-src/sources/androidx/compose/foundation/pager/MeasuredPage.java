package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u00102R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b,\u0010*R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\b'\u0010*R\u0016\u0010B\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010(R\u0018\u0010D\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010C\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", "index", "size", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "", "key", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J2", "(I)J", "offset", "layoutWidth", "layoutHeight", "", "xMQ", "(III)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "KN", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "delta", "rl", "(I)V", c.f62177j, "I", "getIndex", "()I", "Uo", "t", "Ljava/util/List;", "nr", "J", "O", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "Z", "mUb", "isVertical", "gh", "crossAxisSize", "", "qie", "[I", "placeableOffsets", "<set-?>", "az", "ty", "mainAxisLayoutSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n125#1:160\n34#2,6:130\n70#2,4:136\n75#2:154\n107#3,7:140\n107#3,7:147\n96#3,5:155\n32#4:161\n32#4:163\n32#4:165\n80#5:162\n80#5:164\n80#5:166\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n94#1:160\n52#1:130,6\n68#1:136,4\n68#1:154\n72#1:140,7\n79#1:147,7\n88#1:155,5\n94#1:161\n119#1:163\n125#1:165\n94#1:162\n119#1:164\n125#1:166\n*E\n"})
public final class MeasuredPage implements PageInfo {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Alignment.Horizontal horizontalAlignment;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Alignment.Vertical verticalAlignment;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int[] placeableOffsets;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List placeables;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int mainAxisLayoutSize;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final boolean reverseLayout;

    public /* synthetic */ MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, list, j2, obj, orientation, horizontal, vertical, layoutDirection, z2);
    }

    private MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2) {
        this.index = i2;
        this.size = i3;
        this.placeables = list;
        this.visualOffset = j2;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.isVertical = orientation == Orientation.f16969n;
        int size = list.size();
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    private final long J2(int index) {
        int[] iArr = this.placeableOffsets;
        int i2 = index * 2;
        return IntOffset.J2((((long) iArr[i2]) << 32) | (((long) iArr[i2 + 1]) & 4294967295L));
    }

    private final int O(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void KN(Placeable.PlacementScope scope) {
        Placeable.PlacementScope placementScope;
        int i2 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.n("position() should be called first");
        }
        int size = this.placeables.size();
        while (i2 < size) {
            Placeable placeable = (Placeable) this.placeables.get(i2);
            long jJ2 = J2(i2);
            if (this.reverseLayout) {
                jJ2 = IntOffset.J2((((long) (this.isVertical ? IntOffset.gh(jJ2) : (this.mainAxisLayoutSize - IntOffset.gh(jJ2)) - O(placeable))) << 32) | (((long) (this.isVertical ? (this.mainAxisLayoutSize - IntOffset.qie(jJ2)) - O(placeable) : IntOffset.qie(jJ2))) & 4294967295L));
            }
            long jHI = IntOffset.HI(jJ2, this.visualOffset);
            if (this.isVertical) {
                placementScope = scope;
                Placeable.PlacementScope.nY(placementScope, placeable, jHI, 0.0f, null, 6, null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.Z(placementScope, placeable, jHI, 0.0f, null, 6, null);
            }
            i2++;
            scope = placementScope;
        }
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void xMQ(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) list.get(i2);
            int i3 = i2 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.rl("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i3] = horizontal.n(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i3 + 1] = offset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i3] = offset;
                int i5 = i3 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.rl("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i5] = vertical.n(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset += width;
        }
    }

    public final void rl(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z2 = this.isVertical;
            if ((z2 && i2 % 2 == 1) || (!z2 && i2 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i2] = iArr[i2] + delta;
            }
        }
    }
}
