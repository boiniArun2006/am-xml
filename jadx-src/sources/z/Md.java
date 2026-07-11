package z;

import android.opengl.GLES20;
import com.alightcreative.gl.OpenGLException;
import java.nio.Buffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Md {
    private static final Md J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f76265O;
    public static final j nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Zs f76266n;
    private final qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C2472aC f76267t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Md rl(float f3, float f4, float f5, float f6) {
            return new Md(Zs.f76294t, qz.xMQ.rl(f3, f4, 0.0f, f3, f6, 0.0f, f5, f6, 0.0f, f5, f4, 0.0f), C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
        }

        public final Md n() {
            return Md.J2;
        }
    }

    static {
        j jVar = new j(null);
        nr = jVar;
        f76265O = 8;
        Md mdRl = jVar.rl(-1.0f, -1.0f, 1.0f, 1.0f);
        mdRl.rl.Uo();
        J2 = mdRl;
    }

    public Md(Zs mode, qz vertices, C2472aC c2472aC) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        this.f76266n = mode;
        this.rl = vertices;
        this.f76267t = c2472aC;
    }

    public final qz O() {
        return this.rl;
    }

    public final Zs nr() {
        return this.f76266n;
    }

    public final C2472aC t() {
        return this.f76267t;
    }

    public final void rl(int i2) throws OpenGLException {
        GLES20.glEnableVertexAttribArray(i2);
        AbstractC2478o.rl();
        GLES20.glVertexAttribPointer(i2, this.rl.rl(), this.rl.O(), false, this.rl.nr(), (Buffer) this.rl.n());
        AbstractC2478o.rl();
        if (this.f76267t != null) {
            GLES20.glDrawElements(this.f76266n.rl(), this.f76267t.rl(), 5123, this.f76267t.n());
            AbstractC2478o.rl();
        } else {
            GLES20.glDrawArrays(this.f76266n.rl(), 0, this.rl.J2());
            AbstractC2478o.rl();
        }
        GLES20.glDisableVertexAttribArray(i2);
        AbstractC2478o.rl();
    }
}
