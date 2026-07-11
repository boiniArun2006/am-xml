package z;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.alightcreative.gl.OpenGLException;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2467Dsr implements g9s {
    private final int J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f76241O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76242n;
    private final int nr;
    private final WeakReference rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76243t;

    public C2467Dsr(final Bitmap bitmap, EnumC2480t wrap, int i2) throws OpenGLException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        int iO = Ew.O("GLBitmapTexture");
        this.f76242n = iO;
        this.rl = new WeakReference(bitmap);
        this.f76243t = bitmap.getWidth();
        this.nr = bitmap.getHeight();
        this.f76241O = bitmap.hasAlpha();
        this.J2 = getWidth() * getHeight() * (jB() ? 4 : 3);
        this.KN = true;
        GLES20.glActiveTexture(i2);
        AbstractC2478o.rl();
        GLES20.glBindTexture(3553, iO);
        AbstractC2478o.rl();
        GLES20.glTexParameteri(3553, 10240, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(3553, 10241, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        AbstractC2478o.rl();
        GLES20.glTexParameteri(3553, 10242, wrap.rl());
        GLES20.glTexParameteri(3553, 10243, wrap.rl());
        AbstractC2478o.rl();
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        AbstractC2478o.t(new Function0() { // from class: z.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2467Dsr.Xw(bitmap);
            }
        });
        rv6.f76332n.nY(iO, bitmap.getWidth(), bitmap.getHeight(), bitmap.getByteCount());
        this.Uo = bitmap.getGenerationId();
    }

    @Override // z.Z
    public int KN() {
        throw new UnsupportedOperationException();
    }

    public boolean U() {
        return this.KN;
    }

    @Override // z.Z
    public int g() {
        throw new UnsupportedOperationException();
    }

    @Override // z.Z
    public int getHeight() {
        return this.nr;
    }

    @Override // z.Z
    public int getSize() {
        return this.J2;
    }

    @Override // z.Z
    public int getWidth() {
        return this.f76243t;
    }

    public boolean jB() {
        return this.f76241O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Xw(Bitmap bitmap) {
        String strName;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            strName = config.name();
        } else {
            strName = null;
        }
        return "bitmap:" + bitmap + " w,h=" + width + "," + height + " cfg=" + strName + " a=" + bitmap.hasAlpha() + " pre=" + bitmap.isPremultiplied() + " gen=" + bitmap.getGenerationId();
    }

    @Override // z.Z
    public int o() {
        if (U()) {
            return this.f76242n;
        }
        throw new IllegalStateException();
    }

    @Override // Cp.j
    public void release() throws OpenGLException {
        if (U()) {
            this.KN = false;
            Ew.rl(this.f76242n);
        }
    }
}
