package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class O extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "points");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public final void render(C2479p geometry, SolidColor color, float[] transform) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(transform, "transform");
        useProgram();
        AbstractC2478o.rl();
        GLES20.glUniform4f(optionalUniform(TtmlNode.ATTR_TTS_COLOR), color.getR(), color.getG(), color.getB(), color.getA());
        AbstractC2478o.nr();
        GLES20.glUniformMatrix4fv(optionalUniform("transform"), 1, false, transform, 0);
        AbstractC2478o.nr();
        geometry.J2(attrib("position"), attrib("pointSize"));
        AbstractC2478o.rl();
    }
}
