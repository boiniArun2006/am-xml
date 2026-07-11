package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class RGN extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RGN(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d", "tex2d_mask");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public final void render(C2470N geometry, C2467Dsr texture, SolidColor color) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(color, "color");
        AbstractC2478o.rl();
        useProgram();
        AbstractC2478o.rl();
        GLES20.glActiveTexture(33984);
        AbstractC2478o.rl();
        GLES20.glBindTexture(3553, texture.o());
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform(TtmlNode.ATTR_TTS_COLOR), color.getR(), color.getG(), color.getB(), color.getA());
        AbstractC2478o.rl();
        GLES20.glUniform1i(uniform("texture"), 0);
        AbstractC2478o.rl();
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
