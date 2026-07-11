package z;

import android.opengl.GLES20;
import com.alightcreative.gl.OpenGLException;
import java.nio.Buffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2479p extends Md {
    private final qz Uo;

    public /* synthetic */ C2479p(Zs zs, qz qzVar, qz qzVar2, C2472aC c2472aC, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Zs.f76289S : zs, qzVar, qzVar2, (i2 & 8) != 0 ? null : c2472aC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2479p(Zs mode, qz vertices, qz pointSizes, C2472aC c2472aC) {
        super(mode, vertices, c2472aC);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(pointSizes, "pointSizes");
        this.Uo = pointSizes;
    }

    public final void J2(int i2, int i3) throws OpenGLException {
        int i5;
        GLES20.glEnableVertexAttribArray(i2);
        if (i3 != -1) {
            GLES20.glEnableVertexAttribArray(i3);
            AbstractC2478o.rl();
        }
        GLES20.glVertexAttribPointer(i2, O().rl(), O().O(), false, O().nr(), (Buffer) O().n());
        AbstractC2478o.rl();
        if (i3 != -1) {
            i5 = i3;
            GLES20.glVertexAttribPointer(i5, this.Uo.rl(), this.Uo.O(), false, this.Uo.nr(), (Buffer) this.Uo.n());
            AbstractC2478o.rl();
        } else {
            i5 = i3;
        }
        if (t() != null) {
            GLES20.glDrawElements(nr().rl(), t().rl(), 5123, t().n());
            AbstractC2478o.rl();
        } else {
            GLES20.glDrawArrays(nr().rl(), 0, Math.min(O().J2(), this.Uo.J2()));
            AbstractC2478o.rl();
        }
        GLES20.glDisableVertexAttribArray(i2);
        if (i5 != -1) {
            GLES20.glDisableVertexAttribArray(i5);
        }
        AbstractC2478o.rl();
    }
}
