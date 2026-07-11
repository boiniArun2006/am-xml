package z;

import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class pO extends AbstractC2476m {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pO(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "tex2d_grad_linear");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }
}
