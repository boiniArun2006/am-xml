package androidx.compose.ui.graphics.vector;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", c.f62177j, "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,546:1\n152#1,6:550\n41#2:547\n43#2:548\n22#3:549\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n135#1:550,6\n129#1:547\n130#1:548\n130#1:549\n*E\n"})
public final class PathParser {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] nodeData = new float[64];

    public static /* synthetic */ ArrayList rl(PathParser pathParser, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.n(str, arrayList);
    }

    public final ArrayList n(String pathData, ArrayList nodes) {
        int i2;
        char cCharAt;
        int i3;
        int length = pathData.length();
        int i5 = 0;
        while (i5 < length && Intrinsics.compare((int) pathData.charAt(i5), 32) <= 0) {
            i5++;
        }
        while (length > i5 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i7 = 0;
        while (i5 < length) {
            while (true) {
                i2 = i5 + 1;
                cCharAt = pathData.charAt(i5);
                int i8 = cCharAt | ' ';
                if ((i8 - 97) * (i8 - 122) <= 0 && i8 != 101) {
                    break;
                }
                if (i2 >= length) {
                    cCharAt = 0;
                    break;
                }
                i5 = i2;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i7 = 0;
                    while (true) {
                        if (i2 < length && Intrinsics.compare((int) pathData.charAt(i2), 32) <= 0) {
                            i2++;
                        } else {
                            long jN = FastFloatParserKt.n(pathData, i2, length);
                            i3 = (int) (jN >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jN & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i9 = i7 + 1;
                                fArr[i7] = fIntBitsToFloat;
                                if (i9 >= fArr.length) {
                                    float[] fArr2 = new float[i9 * 2];
                                    this.nodeData = fArr2;
                                    ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i7 = i9;
                            }
                            while (i3 < length && pathData.charAt(i3) == ',') {
                                i3++;
                            }
                            if (i3 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    i2 = i3;
                }
                PathNodeKt.n(cCharAt, nodes, this.nodeData, i7);
            }
            i5 = i2;
        }
        return nodes;
    }
}
