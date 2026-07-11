package z;

import android.opengl.GLES20;
import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class kO4 extends l3D {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO4(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }

    public static /* synthetic */ void render$default(kO4 ko4, C2470N c2470n, g9s g9sVar, float f3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        ko4.render(c2470n, g9sVar, f3);
    }

    public final void render(C2470N geometry, g9s texture, float f3) {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(texture, "texture");
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
        C2470N.gh(geometry, attrib("position"), attrib("texcoord"), null, 4, null);
        AbstractC2478o.rl();
    }
}
