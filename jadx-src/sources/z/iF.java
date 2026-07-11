package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class iF extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iF(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d", "grid");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public final void render(C2470N geometry, SolidColor color, float f3, Vector2D offset, float f4, float f5) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(offset, "offset");
        useProgram();
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform(TtmlNode.ATTR_TTS_COLOR), color.getR(), color.getG(), color.getB(), color.getA());
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("grid_spacing"), f3);
        AbstractC2478o.rl();
        GLES20.glUniform2f(uniform("grid_offset"), offset.getX(), offset.getY());
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("line_width"), f4);
        AbstractC2478o.rl();
        GLES20.glUniform1f(uniform("pixel_scale"), f5);
        AbstractC2478o.rl();
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
