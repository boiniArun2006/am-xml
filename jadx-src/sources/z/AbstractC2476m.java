package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2476m extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2476m(ShaderSourceLoader sourceLoader, String fragmentTag) {
        super(sourceLoader, "tex2d", fragmentTag);
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
    }

    public static /* synthetic */ void render$default(AbstractC2476m abstractC2476m, C2470N c2470n, g9s g9sVar, Vector2D vector2D, Vector2D vector2D2, SolidColor solidColor, SolidColor solidColor2, float f3, int i2, Object obj) throws OpenGLException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
        }
        abstractC2476m.render(c2470n, g9sVar, vector2D, vector2D2, solidColor, solidColor2, (i2 & 64) != 0 ? 1.0f : f3);
    }

    public final void render(C2470N geometry, g9s texture, Vector2D start, Vector2D end, SolidColor color_start, SolidColor color_end, float f3) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(color_start, "color_start");
        Intrinsics.checkNotNullParameter(color_end, "color_end");
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
        GLES20.glUniform4f(uniform("color_start"), color_start.getR(), color_start.getG(), color_start.getB(), color_start.getA());
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform("color_end"), color_end.getR(), color_end.getG(), color_end.getB(), color_end.getA());
        AbstractC2478o.rl();
        GLES20.glUniform2f(uniform(TtmlNode.START), start.getX(), start.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(uniform(TtmlNode.END), end.getX(), end.getY());
        AbstractC2478o.rl();
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
