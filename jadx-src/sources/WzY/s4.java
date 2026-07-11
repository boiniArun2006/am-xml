package WzY;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.GradientFill;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import z.KH;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface s4 {

    public static final class j {
        public static /* synthetic */ void n(s4 s4Var, Rectangle rectangle, Transform transform, Transform transform2, List list, BlendingMode blendingMode, float f3, List list2, Vector2D vector2D, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginLayer");
            }
            if ((i2 & 1) != 0) {
                rectangle = Rectangle.INSTANCE.getEMPTY();
            }
            if ((i2 & 2) != 0) {
                transform = Transform.INSTANCE.getIDENTITY();
            }
            if ((i2 & 4) != 0) {
                transform2 = Transform.INSTANCE.getIDENTITY();
            }
            if ((i2 & 8) != 0) {
                list = CollectionsKt.emptyList();
            }
            if ((i2 & 16) != 0) {
                blendingMode = BlendingMode.NORMAL;
            }
            if ((i2 & 32) != 0) {
                f3 = 1.0f;
            }
            if ((i2 & 64) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            if ((i2 & 128) != 0) {
                vector2D = Vector2D.INSTANCE.getONE();
            }
            List list3 = list2;
            Vector2D vector2D2 = vector2D;
            BlendingMode blendingMode2 = blendingMode;
            float f4 = f3;
            s4Var.nY(rectangle, transform, transform2, list, blendingMode2, f4, list3, vector2D2);
        }

        public static /* synthetic */ void rl(s4 s4Var, Bitmap bitmap, RectF rectF, Matrix matrix, float f3, yg ygVar, GradientFill gradientFill, TextureCropMode textureCropMode, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillWithBitmap");
            }
            if ((i2 & 4) != 0) {
                matrix = SPz.f11610n;
            }
            Matrix matrix2 = matrix;
            if ((i2 & 8) != 0) {
                f3 = 1.0f;
            }
            s4Var.HI(bitmap, rectF, matrix2, f3, (i2 & 16) != 0 ? null : ygVar, (i2 & 32) != 0 ? null : gradientFill, (i2 & 64) != 0 ? TextureCropMode.STRETCH : textureCropMode);
        }
    }

    void E2(List list, Matrix matrix, yg ygVar);

    void HI(Bitmap bitmap, RectF rectF, Matrix matrix, float f3, yg ygVar, GradientFill gradientFill, TextureCropMode textureCropMode);

    void Ik(Object obj, Rectangle rectangle, Matrix matrix, float f3, WzY.j jVar, Function0 function0);

    void J2(Sis sis);

    KH KN();

    void O();

    Matrix S();

    float Uo();

    void ViF(List list, Matrix matrix, yg ygVar);

    void WPU(z.Z z2, RectF rectF, Matrix matrix, float f3, TextureCropMode textureCropMode);

    void XQ(Rectangle rectangle);

    void Z(float f3, float f4, float f5, yg ygVar);

    int aYN();

    void az();

    RenderEnvironment ck();

    void fD(float f3, float f4, float f5, float f6, yg ygVar);

    int g();

    void gh(float f3, float f4, float f5, float f6, yg ygVar);

    void iF(Matrix matrix);

    int mUb();

    void n();

    void nY(Rectangle rectangle, Transform transform, Transform transform2, List list, BlendingMode blendingMode, float f3, List list2, Vector2D vector2D);

    void o();

    void qie(boolean z2);

    void r();

    int rl();

    void te(Sis sis, yg ygVar);

    void ty(GradientFill gradientFill, RectF rectF, Matrix matrix, float f3);

    void xMQ(boolean z2);
}
