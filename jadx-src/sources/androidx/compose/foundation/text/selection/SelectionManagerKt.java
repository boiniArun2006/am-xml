package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t0\u00062\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "KN", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "O", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/geometry/Rect;", "Uo", "(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "manager", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "t", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "J2", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "xMQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "offset", "", "nr", "(Landroidx/compose/ui/geometry/Rect;J)Z", c.f62177j, "Landroidx/compose/ui/geometry/Rect;", "invertedInfiniteRect", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,1107:1\n34#2,4:1108\n39#2:1132\n30#3:1112\n30#3:1116\n30#3:1138\n53#4,3:1113\n53#4,3:1117\n60#4:1121\n70#4:1124\n60#4:1127\n70#4:1130\n60#4:1134\n85#4:1137\n53#4,3:1139\n60#4:1143\n70#4:1146\n65#5:1120\n69#5:1123\n65#5:1126\n69#5:1129\n65#5:1133\n65#5:1142\n69#5:1145\n22#6:1122\n22#6:1125\n22#6:1128\n22#6:1131\n22#6:1135\n22#6:1144\n54#7:1136\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n981#1:1108,4\n981#1:1132\n1004#1:1112\n1005#1:1116\n1092#1:1138\n1004#1:1113,3\n1005#1:1117,3\n1011#1:1121\n1012#1:1124\n1013#1:1127\n1014#1:1130\n1048#1:1134\n1080#1:1137\n1092#1:1139,3\n1106#1:1143\n1106#1:1146\n1011#1:1120\n1012#1:1123\n1013#1:1126\n1014#1:1129\n1048#1:1133\n1106#1:1142\n1106#1:1145\n1011#1:1122\n1012#1:1125\n1013#1:1128\n1014#1:1131\n1048#1:1135\n1106#1:1144\n1080#1:1136\n*E\n"})
public final class SelectionManagerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f20917n = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.f19679t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.f19676O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.f19677n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection KN(Selection selection, Selection selection2) {
        Selection selectionJ2;
        return (selection == null || (selectionJ2 = selection.J2(selection2)) == null) ? selection2 : selectionJ2;
    }

    public static final Rect Uo(List list, LayoutCoordinates layoutCoordinates) {
        int i2;
        LayoutCoordinates layoutCoordinatesFD;
        int[] iArr;
        if (list.isEmpty()) {
            return f20917n;
        }
        Rect rect = f20917n;
        float fRl = rect.rl();
        float fT = rect.t();
        float fNr = rect.nr();
        float bottom = rect.getBottom();
        int size = list.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Pair pair = (Pair) list.get(i3);
            Selectable selectable = (Selectable) pair.component1();
            Selection selection = (Selection) pair.component2();
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinatesFD = selectable.fD()) == null) {
                i2 = size;
            } else {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c2] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c2] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = f20917n;
                float fRl2 = rect2.rl();
                float fT2 = rect2.t();
                float fNr2 = rect2.nr();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                i2 = size;
                int i5 = 0;
                while (i5 < length) {
                    int i7 = i5;
                    Rect rectJ2 = selectable.J2(iArr[i7]);
                    fRl2 = Math.min(fRl2, rectJ2.getLeft());
                    fT2 = Math.min(fT2, rectJ2.getTop());
                    fNr2 = Math.max(fNr2, rectJ2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
                    bottom2 = Math.max(bottom2, rectJ2.xMQ());
                    i5 = i7 + 1;
                }
                long jO = Offset.O((((long) Float.floatToRawIntBits(fRl2)) << 32) | (((long) Float.floatToRawIntBits(fT2)) & 4294967295L));
                long jO2 = Offset.O((((long) Float.floatToRawIntBits(fNr2)) << 32) | (((long) Float.floatToRawIntBits(bottom2)) & 4294967295L));
                long jNHg = layoutCoordinates.nHg(layoutCoordinatesFD, jO);
                long jNHg2 = layoutCoordinates.nHg(layoutCoordinatesFD, jO2);
                fRl = Math.min(fRl, Float.intBitsToFloat((int) (jNHg >> 32)));
                fT = Math.min(fT, Float.intBitsToFloat((int) (jNHg & 4294967295L)));
                fNr = Math.max(fNr, Float.intBitsToFloat((int) (jNHg2 >> 32)));
                bottom = Math.max(bottom, Float.intBitsToFloat((int) (jNHg2 & 4294967295L)));
            }
            i3++;
            size = i2;
            c2 = 0;
        }
        return new Rect(fRl, fT, fNr, bottom);
    }

    private static final long J2(SelectionManager selectionManager, long j2, Selection.AnchorInfo anchorInfo) {
        float fCoerceIn;
        Selectable selectableCk = selectionManager.ck(anchorInfo);
        if (selectableCk == null) {
            return Offset.INSTANCE.rl();
        }
        LayoutCoordinates layoutCoordinatesIk = selectionManager.Ik();
        if (layoutCoordinatesIk == null) {
            return Offset.INSTANCE.rl();
        }
        LayoutCoordinates layoutCoordinatesFD = selectableCk.fD();
        if (layoutCoordinatesFD == null) {
            return Offset.INSTANCE.rl();
        }
        int offset = anchorInfo.getOffset();
        if (offset > selectableCk.KN()) {
            return Offset.INSTANCE.rl();
        }
        Offset offsetO = selectionManager.o();
        Intrinsics.checkNotNull(offsetO);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinatesFD.nHg(layoutCoordinatesIk, offsetO.getPackedValue()) >> 32));
        long jAz = selectableCk.az(offset);
        if (TextRange.KN(jAz)) {
            fCoerceIn = selectableCk.nr(offset);
        } else {
            float fNr = selectableCk.nr(TextRange.ty(jAz));
            float fRl = selectableCk.rl(TextRange.xMQ(jAz) - 1);
            fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat, Math.min(fNr, fRl), Math.max(fNr, fRl));
        }
        if (fCoerceIn == -1.0f) {
            return Offset.INSTANCE.rl();
        }
        if (!IntSize.O(j2, IntSize.INSTANCE.n()) && Math.abs(fIntBitsToFloat - fCoerceIn) > ((int) (j2 >> 32)) / 2) {
            return Offset.INSTANCE.rl();
        }
        float fXMQ = selectableCk.xMQ(offset);
        if (fXMQ == -1.0f) {
            return Offset.INSTANCE.rl();
        }
        return layoutCoordinatesIk.nHg(layoutCoordinatesFD, Offset.O((((long) Float.floatToRawIntBits(fCoerceIn)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fXMQ)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List O(List list) {
        int size = list.size();
        if (size != 0 && size != 1) {
            return CollectionsKt.listOf(CollectionsKt.first(list), CollectionsKt.last(list));
        }
        return list;
    }

    public static final boolean nr(Rect rect, long j2) {
        float left = rect.getLeft();
        float f3 = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (left <= fIntBitsToFloat && fIntBitsToFloat <= f3) {
            float top = rect.getTop();
            float fXMQ = rect.xMQ();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            if (top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fXMQ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long t(SelectionManager selectionManager, long j2) {
        int i2;
        Selection selectionFD = selectionManager.fD();
        if (selectionFD == null) {
            return Offset.INSTANCE.rl();
        }
        Handle handleS = selectionManager.S();
        if (handleS == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[handleS.ordinal()];
        }
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor");
                }
                return J2(selectionManager, j2, selectionFD.getEnd());
            }
            return J2(selectionManager, j2, selectionFD.getStart());
        }
        return Offset.INSTANCE.rl();
    }

    public static final Rect xMQ(LayoutCoordinates layoutCoordinates) {
        Rect rectT = LayoutCoordinatesKt.t(layoutCoordinates);
        return RectKt.n(layoutCoordinates.jB(rectT.Z()), layoutCoordinates.jB(rectT.qie()));
    }
}
