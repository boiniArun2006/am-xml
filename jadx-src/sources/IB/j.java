package IB;

import com.alightcreative.gl.OpenGLException;
import z.Ew;
import z.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements g9s {
    private final int J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f4060O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f4061n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f4062t;

    public boolean Xw() {
        return this.KN;
    }

    public boolean bzg() {
        return this.f4062t;
    }

    @Override // z.Z
    public int getHeight() {
        return this.rl;
    }

    @Override // z.Z
    public int getSize() {
        return this.Uo;
    }

    @Override // z.Z
    public int getWidth() {
        return this.f4061n;
    }

    public String toString() {
        return "GLSimpleTexture2D(tex=" + this.nr + ", stencil=" + this.f4060O + ", depth=" + this.J2 + ", width=" + getWidth() + ", height=" + getHeight() + ")";
    }

    public j(int i2, int i3, int i5, boolean z2, int i7, int i8) {
        int i9;
        this.f4061n = i3;
        this.rl = i5;
        this.f4062t = z2;
        this.nr = i2;
        this.f4060O = i7;
        this.J2 = i8;
        int width = getWidth() * getHeight();
        if (bzg()) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        this.Uo = width * i9;
        this.KN = true;
    }

    @Override // z.Z
    public int KN() {
        if (Xw()) {
            return this.J2;
        }
        throw new IllegalStateException(("The texture (" + this + ") is invalid.").toString());
    }

    @Override // z.Z
    public int g() {
        if (Xw()) {
            return this.f4060O;
        }
        throw new IllegalStateException(("The texture (" + this + ") is invalid.").toString());
    }

    @Override // z.Z
    public int o() {
        if (Xw()) {
            return this.nr;
        }
        throw new IllegalStateException(("The texture (" + this + ") is invalid.").toString());
    }

    @Override // Cp.j
    public void release() throws OpenGLException {
        if (Xw()) {
            this.KN = false;
            Ew.rl(this.nr);
            int i2 = this.f4060O;
            if (i2 != 0) {
                Ew.n(i2);
            }
            int i3 = this.J2;
            if (i3 != 0 && i3 != this.f4060O) {
                Ew.n(i3);
            }
        }
    }
}
