package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", JavetError.PARAMETER_COUNT, "", c.f62177j, "(CLjava/util/ArrayList;[FI)V", "", "rl", "(Ljava/util/List;[FI)V", "t", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"})
public final class PathNodeKt {
    public static final void n(char c2, ArrayList arrayList, float[] fArr, int i2) {
        int i3 = 0;
        switch (c2) {
            case 'A':
                int i5 = i2 - 7;
                for (int i7 = 0; i7 <= i5; i7 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], Float.compare(fArr[i7 + 3], 0.0f) != 0, Float.compare(fArr[i7 + 4], 0.0f) != 0, fArr[i7 + 5], fArr[i7 + 6]));
                }
                return;
            case 'C':
                int i8 = i2 - 6;
                while (i3 <= i8) {
                    arrayList.add(new PathNode.CurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                int i9 = i2 - 1;
                while (i3 <= i9) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'L':
                int i10 = i2 - 2;
                while (i3 <= i10) {
                    arrayList.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                rl(arrayList, fArr, i2);
                return;
            case 'Q':
                int i11 = i2 - 4;
                while (i3 <= i11) {
                    arrayList.add(new PathNode.QuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'S':
                int i12 = i2 - 4;
                while (i3 <= i12) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'T':
                int i13 = i2 - 2;
                while (i3 <= i13) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'V':
                int i14 = i2 - 1;
                while (i3 <= i14) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'Z':
            case INVALID_ADS_ENDPOINT_VALUE:
                arrayList.add(PathNode.Close.f31794t);
                return;
            case 'a':
                int i15 = i2 - 7;
                for (int i16 = 0; i16 <= i15; i16 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], Float.compare(fArr[i16 + 3], 0.0f) != 0, Float.compare(fArr[i16 + 4], 0.0f) != 0, fArr[i16 + 5], fArr[i16 + 6]));
                }
                return;
            case 'c':
                int i17 = i2 - 6;
                while (i3 <= i17) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case 'h':
                int i18 = i2 - 1;
                while (i3 <= i18) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'l':
                int i19 = i2 - 2;
                while (i3 <= i19) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'm':
                t(arrayList, fArr, i2);
                return;
            case 'q':
                int i20 = i2 - 4;
                while (i3 <= i20) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 's':
                int i21 = i2 - 4;
                while (i3 <= i21) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 't':
                int i22 = i2 - 2;
                while (i3 <= i22) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                int i23 = i2 - 1;
                while (i3 <= i23) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c2);
        }
    }

    private static final void rl(List list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i5 = 2; i5 <= i3; i5 += 2) {
                list.add(new PathNode.LineTo(fArr[i5], fArr[i5 + 1]));
            }
        }
    }

    private static final void t(List list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i5 = 2; i5 <= i3; i5 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i5], fArr[i5 + 1]));
            }
        }
    }
}
