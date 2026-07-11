package z;

import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.gl.OpenGLException;
import java.nio.Buffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z.qz;

/* JADX INFO: renamed from: z.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2470N extends Md {
    public static final j KN;
    private static final C2470N mUb;
    public static final int xMQ;
    private final qz Uo;

    /* JADX INFO: renamed from: z.N$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: z.N$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C1289j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextureCropMode.values().length];
                try {
                    iArr[TextureCropMode.STRETCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextureCropMode.FIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextureCropMode.FILL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private j() {
        }

        public final C2470N nr(float f3, float f4, float f5, float f6, TextureCropMode cropMode, float f7) {
            Intrinsics.checkNotNullParameter(cropMode, "cropMode");
            int i2 = C1289j.$EnumSwitchMapping$0[cropMode.ordinal()];
            if (i2 == 1) {
                return UGc.xMQ(f3, f4, f5, f6);
            }
            if (i2 == 2) {
                return UGc.KN(f3, f4, f5, f6, f7);
            }
            if (i2 == 3) {
                return UGc.Uo(f3, f4, f5, f6, f7);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final C2470N t(Rectangle bounds, Rectangle texCoords) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            Intrinsics.checkNotNullParameter(texCoords, "texCoords");
            float left = bounds.getLeft();
            float top = bounds.getTop();
            float right = bounds.getRight();
            float bottom = bounds.getBottom();
            float left2 = texCoords.getLeft();
            float top2 = texCoords.getTop();
            float right2 = texCoords.getRight();
            float bottom2 = texCoords.getBottom();
            Zs zs = Zs.f76294t;
            qz.j jVar = qz.xMQ;
            return new C2470N(zs, jVar.rl(left, top, 0.0f, left, bottom, 0.0f, right, bottom, 0.0f, right, top, 0.0f), jVar.n(left2, bottom2, left2, top2, right2, top2, right2, bottom2), C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
        }

        public final C2470N n() {
            return C2470N.mUb;
        }

        public final C2470N rl(float f3, float f4, float f5, float f6) {
            return UGc.xMQ(f3, f4, f5, f6);
        }
    }

    static {
        j jVar = new j(null);
        KN = jVar;
        xMQ = 8;
        C2470N c2470nRl = jVar.rl(-1.0f, -1.0f, 1.0f, 1.0f);
        c2470nRl.O().Uo();
        c2470nRl.Uo.Uo();
        mUb = c2470nRl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470N(Zs mode, qz vertices, qz texcoords, C2472aC c2472aC) {
        super(mode, vertices, c2472aC);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(texcoords, "texcoords");
        this.Uo = texcoords;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(int i2, String str) {
        return "texcoordAttrHandle=" + i2 + " (dt=" + str + ")";
    }

    public static /* synthetic */ void gh(C2470N c2470n, int i2, int i3, String str, int i5, Object obj) throws OpenGLException {
        if ((i5 & 4) != 0) {
            str = "";
        }
        c2470n.mUb(i2, i3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(int i2, String str) {
        return "locationAttrHandle=" + i2 + " (dt=" + str + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty(int i2) {
        return "locationAttrHandle=" + i2;
    }

    public final qz HI() {
        return this.Uo;
    }

    public final void mUb(final int i2, final int i3, final String debugTag) throws OpenGLException {
        int i5;
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        AbstractC2478o.rl();
        GLES20.glEnableVertexAttribArray(i2);
        AbstractC2478o.t(new Function0() { // from class: z.mrQ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2470N.qie(i2, debugTag);
            }
        });
        if (i3 != -1) {
            GLES20.glEnableVertexAttribArray(i3);
            AbstractC2478o.t(new Function0() { // from class: z.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2470N.az(i3, debugTag);
                }
            });
        }
        GLES20.glVertexAttribPointer(i2, O().rl(), O().O(), false, O().nr(), (Buffer) O().n());
        AbstractC2478o.t(new Function0() { // from class: z.Pp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2470N.ty(i2);
            }
        });
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
            GLES20.glDrawArrays(nr().rl(), 0, O().J2());
            AbstractC2478o.rl();
        }
        GLES20.glDisableVertexAttribArray(i2);
        if (i5 != -1) {
            GLES20.glDisableVertexAttribArray(i5);
        }
        AbstractC2478o.rl();
    }
}
