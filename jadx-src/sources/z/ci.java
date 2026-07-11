package z;

import android.graphics.SurfaceTexture;
import com.alightcreative.gl.OpenGLException;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ci implements afx {
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f76303O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f76304n;
    private final int nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WeakReference f76305t;

    public ci(SurfaceTexture surfaceTexture, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f76304n = i2;
        this.rl = i3;
        this.f76305t = new WeakReference(surfaceTexture);
        int iO = i5 != 0 ? i5 : Ew.O("GLSurfaceTexture");
        this.nr = iO;
        this.f76303O = true;
        this.J2 = getWidth() * getHeight() * 3;
        if (i5 == 0) {
            surfaceTexture.attachToGLContext(iO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p5() {
        return "Had to manually delete texture!";
    }

    public boolean P5() {
        return this.f76303O;
    }

    public final long U() {
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f76305t.get();
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0L;
    }

    @Override // z.afx
    public void az(float[] mtx) {
        Intrinsics.checkNotNullParameter(mtx, "mtx");
        SurfaceTexture surfaceTexture = (SurfaceTexture) this.f76305t.get();
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(mtx);
        }
    }

    public final void eF() {
        final SurfaceTexture surfaceTexture = (SurfaceTexture) this.f76305t.get();
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
            XoT.C.Uo(this, new Function0() { // from class: z.SPz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ci.E(surfaceTexture, this);
                }
            });
        }
    }

    @Override // z.Z
    public int getHeight() {
        return this.rl;
    }

    @Override // z.Z
    public int getSize() {
        return this.J2;
    }

    @Override // z.Z
    public int getWidth() {
        return this.f76304n;
    }

    @Override // Cp.j
    public void release() throws OpenGLException {
        XoT.C.Uo(this, new Function0() { // from class: z.Q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ci.M7(this.f76276n);
            }
        });
        if (P5()) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) this.f76305t.get();
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                Unit unit = Unit.INSTANCE;
                rv6.f76332n.aYN(this.nr);
            } else {
                Ew.rl(this.nr);
                Unit unit2 = Unit.INSTANCE;
                XoT.C.HI(this, new Function0() { // from class: z.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ci.p5();
                    }
                });
            }
            this.f76303O = false;
        }
    }

    public String toString() {
        return "<GLSurfaceTexture texName=" + this.nr + ">";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(SurfaceTexture surfaceTexture, ci ciVar) {
        return "updateTexImage() -> ts=" + surfaceTexture.getTimestamp() + " texName=" + ciVar.nr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M7(ci ciVar) {
        return "GLSurfaceTexture:release (valid=" + ciVar.P5() + ")";
    }

    @Override // z.Z
    public int o() {
        if (P5()) {
            return this.nr;
        }
        throw new IllegalStateException();
    }
}
