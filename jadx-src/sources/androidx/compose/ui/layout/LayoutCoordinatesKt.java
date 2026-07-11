package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "J2", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "Uo", "KN", "Landroidx/compose/ui/geometry/Rect;", "rl", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "t", "O", c.f62177j, "nr", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,266:1\n54#2:267\n59#2:269\n54#2:355\n59#2:357\n85#3:268\n90#3:270\n53#3,3:312\n53#3,3:316\n53#3,3:320\n53#3,3:324\n60#3:328\n60#3:331\n60#3:334\n60#3:337\n70#3:342\n70#3:345\n70#3:348\n70#3:351\n85#3:356\n90#3:358\n65#4,10:271\n65#4,10:281\n65#4,10:291\n65#4,10:301\n46#4:339\n56#4:340\n46#4:353\n56#4:354\n30#5:311\n30#5:315\n30#5:319\n30#5:323\n65#6:327\n65#6:330\n65#6:333\n65#6:336\n69#6:341\n69#6:344\n69#6:347\n69#6:350\n22#7:329\n22#7:332\n22#7:335\n22#7:338\n22#7:343\n22#7:346\n22#7:349\n22#7:352\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n195#1:267\n196#1:269\n243#1:355\n243#1:357\n195#1:268\n196#1:270\n208#1:312,3\n209#1:316,3\n210#1:320,3\n211#1:324,3\n213#1:328\n214#1:331\n215#1:334\n216#1:337\n221#1:342\n222#1:345\n223#1:348\n224#1:351\n243#1:356\n243#1:358\n199#1:271,10\n200#1:281,10\n201#1:291,10\n202#1:301,10\n218#1:339\n219#1:340\n226#1:353\n227#1:354\n208#1:311\n209#1:315\n210#1:319\n211#1:323\n213#1:327\n214#1:330\n215#1:333\n216#1:336\n221#1:341\n222#1:344\n223#1:347\n224#1:350\n213#1:329\n214#1:332\n215#1:335\n216#1:338\n221#1:343\n222#1:346\n223#1:349\n224#1:352\n*E\n"})
public final class LayoutCoordinatesKt {
    public static final long J2(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.xg(Offset.INSTANCE.t());
    }

    public static final long KN(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.aYN(Offset.INSTANCE.t());
    }

    public static final long Uo(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.B(Offset.INSTANCE.t());
    }

    public static final long O(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesPiY = layoutCoordinates.piY();
        if (layoutCoordinatesPiY != null) {
            return layoutCoordinatesPiY.nHg(layoutCoordinates, Offset.INSTANCE.t());
        }
        return Offset.INSTANCE.t();
    }

    public static final Rect n(LayoutCoordinates layoutCoordinates) {
        Rect rectN;
        LayoutCoordinates layoutCoordinatesPiY = layoutCoordinates.piY();
        if (layoutCoordinatesPiY != null && (rectN = LayoutCoordinates.N(layoutCoordinatesPiY, layoutCoordinates, false, 2, null)) != null) {
            return rectN;
        }
        return new Rect(0.0f, 0.0f, (int) (layoutCoordinates.n() >> 32), (int) (layoutCoordinates.n() & 4294967295L));
    }

    public static final LayoutCoordinates nr(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates layoutCoordinatesPiY = layoutCoordinates.piY();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = layoutCoordinatesPiY;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            layoutCoordinatesPiY = layoutCoordinates.piY();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final Rect rl(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.N(nr(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect t(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesNr = nr(layoutCoordinates);
        float fN = (int) (layoutCoordinatesNr.n() >> 32);
        float fN2 = (int) (layoutCoordinatesNr.n() & 4294967295L);
        Rect rectN = LayoutCoordinates.N(layoutCoordinatesNr, layoutCoordinates, false, 2, null);
        float left = rectN.getLeft();
        float f3 = 0.0f;
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fN) {
            left = fN;
        }
        float top = rectN.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fN2) {
            top = fN2;
        }
        float f4 = rectN.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= fN) {
            fN = f4;
        }
        float fXMQ = rectN.xMQ();
        if (fXMQ >= 0.0f) {
            f3 = fXMQ;
        }
        if (f3 <= fN2) {
            fN2 = f3;
        }
        if (left == fN || top == fN2) {
            return Rect.INSTANCE.n();
        }
        long jB = layoutCoordinatesNr.B(Offset.O((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long jB2 = layoutCoordinatesNr.B(Offset.O((((long) Float.floatToRawIntBits(top)) & 4294967295L) | (Float.floatToRawIntBits(fN) << 32)));
        long jB3 = layoutCoordinatesNr.B(Offset.O((((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fN2)) & 4294967295L)));
        long jB4 = layoutCoordinatesNr.B(Offset.O((((long) Float.floatToRawIntBits(fN2)) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }
}
