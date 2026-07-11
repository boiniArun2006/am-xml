package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0010\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010#\u001a\u0004\u0018\u00010\"2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010&\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b&\u0010'*\n\u0010(\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "rl", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", TtmlNode.CENTER, "radius", "t", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "nr", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "", "O", "(Ljava/util/List;)I", "numTransparentColors", "", "J2", "(Ljava/util/List;I)[I", "stops", "", "Uo", "(Ljava/util/List;Ljava/util/List;I)[F", "", "KN", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,199:1\n65#2:200\n69#2:203\n65#2:206\n69#2:209\n65#2:212\n69#2:215\n65#2:218\n69#2:221\n60#3:201\n70#3:204\n60#3:207\n70#3:210\n60#3:213\n70#3:216\n60#3:219\n70#3:222\n22#4:202\n22#4:205\n22#4:208\n22#4:211\n22#4:214\n22#4:217\n22#4:220\n22#4:223\n70#5,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n40#1:200\n41#1:203\n42#1:206\n43#1:209\n60#1:212\n61#1:215\n77#1:218\n78#1:221\n40#1:201\n41#1:204\n42#1:207\n43#1:210\n60#1:213\n61#1:216\n77#1:219\n78#1:222\n40#1:202\n41#1:205\n42#1:208\n43#1:211\n60#1:214\n61#1:217\n77#1:220\n78#1:223\n136#1:224,6\n*E\n"})
public final class AndroidShader_androidKt {
    public static final int[] J2(List list, int i2) {
        int i3;
        int i5 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i5 < size) {
                iArr[i5] = ColorKt.mUb(((Color) list.get(i5)).getValue());
                i5++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int lastIndex = CollectionsKt.getLastIndex(list);
        int size2 = list.size();
        int i7 = 0;
        while (i5 < size2) {
            long value = ((Color) list.get(i5)).getValue();
            if (Color.ck(value) == 0.0f) {
                if (i5 == 0) {
                    i3 = i7 + 1;
                    iArr2[i7] = ColorKt.mUb(Color.az(((Color) list.get(1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i5 == lastIndex) {
                    i3 = i7 + 1;
                    iArr2[i7] = ColorKt.mUb(Color.az(((Color) list.get(i5 - 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i8 = i7 + 1;
                    iArr2[i7] = ColorKt.mUb(Color.az(((Color) list.get(i5 - 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i7 += 2;
                    iArr2[i8] = ColorKt.mUb(Color.az(((Color) list.get(i5 + 1)).getValue(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i7 = i3;
            } else {
                iArr2[i7] = ColorKt.mUb(value);
                i7++;
            }
            i5++;
        }
        return iArr2;
    }

    private static final void KN(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int O(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt.getLastIndex(list);
        for (int i3 = 1; i3 < lastIndex; i3++) {
            if (Color.ck(((Color) list.get(i3)).getValue()) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static final float[] Uo(List list, List list2, int i2) {
        if (i2 == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(list2);
        int i3 = 1;
        for (int i5 = 1; i5 < lastIndex; i5++) {
            long value = ((Color) list2.get(i5)).getValue();
            float fFloatValue = list != null ? ((Number) list.get(i5)).floatValue() : i5 / CollectionsKt.getLastIndex(list2);
            int i7 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (Color.ck(value) == 0.0f) {
                i3 += 2;
                fArr[i7] = fFloatValue;
            } else {
                i3 = i7;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(CollectionsKt.getLastIndex(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static final Shader n(ImageBitmap imageBitmap, int i2, int i3) {
        return new BitmapShader(AndroidImageBitmap_androidKt.rl(imageBitmap), AndroidTileMode_androidKt.n(i2), AndroidTileMode_androidKt.n(i3));
    }

    public static final Shader nr(long j2, List list, List list2) {
        KN(list, list2);
        int iO = O(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), J2(list, iO), Uo(list2, list, iO));
    }

    public static final Shader rl(long j2, long j3, List list, List list2, int i2) {
        KN(list, list2);
        int iO = O(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), J2(list, iO), Uo(list2, list, iO), AndroidTileMode_androidKt.n(i2));
    }

    public static final Shader t(long j2, float f3, List list, List list2, int i2) {
        KN(list, list2);
        int iO = O(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f3, J2(list, iO), Uo(list2, list, iO), AndroidTileMode_androidKt.n(i2));
    }
}
