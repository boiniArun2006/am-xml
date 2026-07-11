package z;

import com.alightcreative.gl.ShaderSourceLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class yg extends P {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(ShaderSourceLoader sourceLoader) {
        super(sourceLoader, "grad_linear");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
    }
}
