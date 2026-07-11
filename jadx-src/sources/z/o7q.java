package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class o7q extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7q(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "solid");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(o7q o7qVar, Md md, SolidColor solidColor, float[] fArr, int i2, Object obj) throws OpenGLException {
        if ((i2 & 4) != 0) {
            fArr = UGc.J2();
        }
        o7qVar.render(md, solidColor, fArr);
    }

    public final void render(Md geometry, SolidColor color, float[] transform) throws OpenGLException {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(transform, "transform");
        useProgram();
        AbstractC2478o.rl();
        GLES20.glUniform4f(uniform(TtmlNode.ATTR_TTS_COLOR), color.getR(), color.getG(), color.getB(), color.getA());
        AbstractC2478o.rl();
        GLES20.glUniformMatrix4fv(uniform("transform"), 1, false, transform, 0);
        AbstractC2478o.rl();
        geometry.rl(attrib("position"));
        AbstractC2478o.rl();
    }
}
