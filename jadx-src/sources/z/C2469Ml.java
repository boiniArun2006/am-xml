package z;

import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector4D;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C2469Ml extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2469Ml(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "solid", "checker");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(C2469Ml c2469Ml, Md md, SolidColor solidColor, SolidColor solidColor2, float f3, Vector4D vector4D, float[] fArr, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            fArr = UGc.J2();
        }
        c2469Ml.render(md, solidColor, solidColor2, f3, vector4D, fArr);
    }

    public final void render(Md geometry, SolidColor color_a, SolidColor color_b, float f3, Vector4D offsetScale, float[] transform) {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(color_a, "color_a");
        Intrinsics.checkNotNullParameter(color_b, "color_b");
        Intrinsics.checkNotNullParameter(offsetScale, "offsetScale");
        Intrinsics.checkNotNullParameter(transform, "transform");
        useProgram();
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("color_a"), color_a.getR(), color_a.getG(), color_a.getB(), color_a.getA());
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("color_b"), color_b.getR(), color_b.getG(), color_b.getB(), color_b.getA());
        AbstractC2478o.rl();
        GLES20.glUniformMatrix4fv(uniform("transform"), 1, false, transform, 0);
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("oneOverCheckSize"), 1.0f / f3);
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("offsetScale"), offsetScale.getX(), offsetScale.getY(), offsetScale.getZ(), offsetScale.getW());
        AbstractC2478o.rl();
        geometry.rl(attrib("position"));
        AbstractC2478o.rl();
    }
}
