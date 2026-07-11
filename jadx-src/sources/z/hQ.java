package z;

import android.graphics.Matrix;
import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class hQ extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hQ(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d_ext");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(hQ hQVar, C2470N c2470n, afx afxVar, float f3, int i2, Object obj) throws OpenGLException {
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        hQVar.render(c2470n, afxVar, f3);
    }

    public final void render(C2470N geometry, afx texture, float f3) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
        AbstractC2478o.rl();
        useProgram();
        AbstractC2478o.rl();
        GLES20.glActiveTexture(33984);
        AbstractC2478o.rl();
        GLES20.glBindTexture(36197, texture.o());
        AbstractC2478o.rl();
        GLES20.glUniform1i(uniform("texture"), 0);
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("alpha"), f3);
        AbstractC2478o.rl();
        float[] fArr = new float[16];
        texture.az(fArr);
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        matrix.preScale(1.0f, -1.0f, 0.5f, 0.5f);
        float f4 = fArr[0];
        float f5 = 0.0f;
        if (f4 > -0.1f && f4 < 0.1f) {
            f5 = fArr[1] < 0.0f ? 90.0f : 270.0f;
        } else if (f4 < 0.0f) {
            f5 = 180.0f;
        }
        matrix.preRotate(f5, 0.5f, 0.5f);
        GLES20.glUniformMatrix4fv(uniform("texTransform"), 1, false, GeometryKt.toGLMat4(matrix), 0);
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
