package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class R6 extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d", "tex2d_checker_out");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(R6 r6, C2470N c2470n, g9s g9sVar, float f3, SolidColor solidColor, SolidColor solidColor2, SolidColor solidColor3, float f4, int i2, Object obj) throws OpenGLException {
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        float f5 = f3;
        if ((i2 & 8) != 0) {
            solidColor = SolidColor.INSTANCE.getTRANSPARENT();
        }
        SolidColor solidColor4 = solidColor;
        if ((i2 & 16) != 0) {
            solidColor2 = SolidColor.INSTANCE.getTRANSPARENT();
        }
        SolidColor solidColor5 = solidColor2;
        if ((i2 & 32) != 0) {
            solidColor3 = SolidColor.INSTANCE.getTRANSPARENT();
        }
        r6.render(c2470n, g9sVar, f5, solidColor4, solidColor5, solidColor3, f4);
    }

    public final void render(C2470N geometry, g9s texture, float f3, SolidColor color, SolidColor color_a, SolidColor color_b, float f4) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color_a, "color_a");
        Intrinsics.checkNotNullParameter(color_b, "color_b");
        AbstractC2478o.rl();
        useProgram();
        AbstractC2478o.rl();
        GLES20.glActiveTexture(33984);
        AbstractC2478o.rl();
        GLES20.glBindTexture(3553, texture.o());
        AbstractC2478o.rl();
        GLES20.glUniform1i(uniform("texture"), 0);
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("alpha"), f3);
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform(TtmlNode.ATTR_TTS_COLOR), color.getR(), color.getG(), color.getB(), color.getA());
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("color_a"), color_a.getR(), color_a.getG(), color_a.getB(), color_a.getA());
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("color_b"), color_b.getR(), color_b.getG(), color_b.getB(), color_b.getA());
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("oneOverCheckSize"), 1.0f / f4);
        AbstractC2478o.rl();
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
