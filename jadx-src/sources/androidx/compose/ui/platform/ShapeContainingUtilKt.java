package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "rl", "(Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/Rect;", "rect", "O", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "J2", "(Landroidx/compose/ui/graphics/Outline$Rounded;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/RoundRect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/geometry/RoundRect;)Z", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "centerX", "centerY", "Uo", "(FFJFF)Z", JavetError.PARAMETER_PATH, "nr", "(Landroidx/compose/ui/graphics/Path;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShapeContainingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n48#2:161\n53#2:164\n48#2:167\n53#2:170\n48#2:173\n53#2:176\n53#2:179\n48#2:182\n48#2:185\n48#2:188\n53#2:191\n53#2:194\n48#2:197\n53#2:200\n60#3:162\n70#3:165\n60#3:168\n70#3:171\n60#3:174\n70#3:177\n70#3:180\n60#3:183\n60#3:186\n60#3:189\n70#3:192\n70#3:195\n60#3:198\n70#3:201\n22#4:163\n22#4:166\n22#4:169\n22#4:172\n22#4:175\n22#4:178\n22#4:181\n22#4:184\n22#4:187\n22#4:190\n22#4:193\n22#4:196\n22#4:199\n22#4:202\n*S KotlinDebug\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n*L\n76#1:161\n77#1:164\n79#1:167\n80#1:170\n82#1:173\n83#1:176\n85#1:179\n86#1:182\n110#1:185\n111#1:188\n112#1:191\n113#1:194\n129#1:197\n130#1:200\n76#1:162\n77#1:165\n79#1:168\n80#1:171\n82#1:174\n83#1:177\n85#1:180\n86#1:183\n110#1:186\n111#1:189\n112#1:192\n113#1:195\n129#1:198\n130#1:201\n76#1:163\n77#1:166\n79#1:169\n80#1:172\n82#1:175\n83#1:178\n85#1:181\n86#1:184\n110#1:187\n111#1:190\n112#1:193\n113#1:196\n129#1:199\n130#1:202\n*E\n"})
public final class ShapeContainingUtilKt {
    private static final boolean Uo(float f3, float f4, long j2, float f5, float f6) {
        float f7 = f3 - f5;
        float f8 = f4 - f6;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return ((f7 * f7) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f8 * f8) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    private static final boolean J2(Outline.Rounded rounded, float f3, float f4, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f3 < roundRect.getLeft() || f3 >= roundRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() || f4 < roundRect.getTop() || f4 >= roundRect.getBottom()) {
            return false;
        }
        if (!n(roundRect)) {
            Path pathN = path2 == null ? AndroidPath_androidKt.n() : path2;
            Path.ty(pathN, roundRect, null, 2, null);
            return nr(pathN, f3, f4, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L));
        float f5 = roundRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L));
        float f6 = roundRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.getBottomLeftCornerRadius()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        if (f3 < left && f4 < top) {
            return Uo(f3, f4, roundRect.getTopLeftCornerRadius(), left, top);
        }
        if (f3 < left2 && f4 > bottom2) {
            return Uo(f3, f4, roundRect.getBottomLeftCornerRadius(), left2, bottom2);
        }
        if (f3 > f5 && f4 < top2) {
            return Uo(f3, f4, roundRect.getTopRightCornerRadius(), f5, top2);
        }
        if (f3 <= f6 || f4 <= bottom) {
            return true;
        }
        return Uo(f3, f4, roundRect.getBottomRightCornerRadius(), f6, bottom);
    }

    private static final boolean nr(Path path, float f3, float f4, Path path2, Path path3) {
        Rect rect = new Rect(f3 - 0.005f, f4 - 0.005f, f3 + 0.005f, f4 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.n();
        }
        Path.n(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.n();
        }
        path3.o(path, path2, PathOperation.INSTANCE.rl());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    public static final boolean rl(Outline outline, float f3, float f4, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return O(((Outline.Rectangle) outline).rl(), f3, f4);
        }
        if (outline instanceof Outline.Rounded) {
            return J2((Outline.Rounded) outline, f3, f4, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return nr(((Outline.Generic) outline).getPath(), f3, f4, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean t(Outline outline, float f3, float f4, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return rl(outline, f3, f4, path, path2);
    }

    private static final boolean O(Rect rect, float f3, float f4) {
        if (rect.getLeft() <= f3 && f3 < rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() && rect.getTop() <= f4 && f4 < rect.xMQ()) {
            return true;
        }
        return false;
    }

    private static final boolean n(RoundRect roundRect) {
        if (Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32)) <= roundRect.mUb() && Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32)) <= roundRect.mUb() && Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() & 4294967295L)) <= roundRect.nr() && Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L)) <= roundRect.nr()) {
            return true;
        }
        return false;
    }
}
