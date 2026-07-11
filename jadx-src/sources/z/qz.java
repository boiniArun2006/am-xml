package z;

import java.nio.FloatBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class qz extends Lu {
    private final FloatBuffer KN;
    public static final j xMQ = new j(null);
    public static final int mUb = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final qz n(float... elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            qz qzVar = new qz(elements.length / 2, 2);
            qzVar.mUb(elements);
            return qzVar;
        }

        public final qz rl(float... elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            qz qzVar = new qz(elements.length / 3, 3);
            qzVar.mUb(elements);
            return qzVar;
        }
    }

    public qz(int i2, int i3) {
        super(i2, i3, 5126, 4);
        FloatBuffer floatBufferAsFloatBuffer = n().asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "asFloatBuffer(...)");
        this.KN = floatBufferAsFloatBuffer;
    }

    public final float KN(int i2) {
        return this.KN.get(i2);
    }

    public final void mUb(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        if (t()) {
            throw new IllegalStateException("Check failed.");
        }
        this.KN.position(0);
        this.KN.put(values);
        this.KN.position(0);
    }

    public String toString() {
        int iJ2 = J2();
        String str = "<GLFloatVertexAttr ";
        for (int i2 = 0; i2 < iJ2; i2++) {
            if (i2 > 0) {
                str = str + "; ";
            }
            int iRl = rl();
            for (int i3 = 0; i3 < iRl; i3++) {
                if (i3 > 0) {
                    str = str + ",";
                }
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(KN((rl() * i2) + i3))}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                str = str + str2;
            }
        }
        return str + ">";
    }

    public final void xMQ(int i2, float f3) {
        if (!t()) {
            this.KN.put(i2, f3);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
