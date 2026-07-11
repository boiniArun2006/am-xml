package z;

import android.opengl.GLES20;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderCompileError;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2473c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76298n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76299t;

    public AbstractC2473c(int i2, String code, String tag, boolean z2) throws OpenGLException, ShaderCompileError {
        String str;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f76298n = i2;
        this.rl = z2;
        if (z2 && !UGc.f76284n) {
            UGc.f76284n = true;
            com.alightcreative.app.motion.persist.j.INSTANCE.setEmulatingGLSLMinMaxClamp(true);
        }
        if (i2 != 35633 && i2 != 35632) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC2478o.rl();
        int iGlCreateShader = GLES20.glCreateShader(i2);
        this.f76299t = iGlCreateShader;
        AbstractC2478o.rl();
        if (iGlCreateShader == 0) {
            throw new IllegalStateException("Check failed.");
        }
        GLES20.glShaderSource(iGlCreateShader, code);
        AbstractC2478o.rl();
        GLES20.glCompileShader(iGlCreateShader);
        AbstractC2478o.rl();
        int[] iArr = new int[1];
        int i3 = 0;
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            switch (i2) {
                case 35632:
                    str = "fragment";
                    break;
                case 35633:
                    str = "vertex";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            GLES20.glDeleteShader(iGlCreateShader);
            List<String> listLines = StringsKt.lines(code);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listLines, 10));
            for (Object obj : listLines) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(i5 + ": " + ((String) obj));
                i3 = i5;
            }
            throw new ShaderCompileError("Error compiling " + str + " shader '" + tag + "': " + strGlGetShaderInfoLog + "\n\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null));
        }
    }

    public final int n() {
        return this.f76299t;
    }

    public final void rl() {
        if (!GLES20.glIsShader(this.f76299t)) {
            throw new IllegalStateException("Check failed.");
        }
        GLES20.glDeleteShader(this.f76299t);
        AbstractC2478o.rl();
    }
}
