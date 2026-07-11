package z;

import android.opengl.GLES20;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class RzR extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RzR(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d", "tex2d_grad_linear");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(RzR rzR, C2470N c2470n, g9s g9sVar, float f3, Vector2D vector2D, Vector2D vector2D2, SolidColor solidColor, SolidColor solidColor2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        rzR.render(c2470n, g9sVar, f3, vector2D, vector2D2, solidColor, solidColor2);
    }

    public final void render(C2470N geometry, g9s texture, float f3, Vector2D start, Vector2D end, SolidColor color_start, SolidColor color_end) {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(color_start, "color_start");
        Intrinsics.checkNotNullParameter(color_end, "color_end");
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
