package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class P extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(ShaderSourceLoader sourceLoader, String fragmentTag) {
        super(sourceLoader, "tex2d", fragmentTag);
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
    }

    public final void render(C2470N geometry, Vector2D start, Vector2D end, SolidColor color_start, SolidColor color_end) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(color_start, "color_start");
        Intrinsics.checkNotNullParameter(color_end, "color_end");
        useProgram();
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
