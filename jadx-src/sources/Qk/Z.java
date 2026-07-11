package Qk;

import HI0.qf;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.gl.OpenGLException;
import fX.InterfaceC2106j;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.IntBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z.AbstractC2478o;
import z.OU;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Z implements SPz {
    private final Lazy J2;
    private final Bitmap KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final IntBuffer f8243O;
    private final int[] Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f8244n;
    private final int nr;
    private final ExportParams rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f8245t;
    private final OU xMQ;

    @Override // Qk.SPz
    public void n() {
    }

    @Override // Cp.j
    public void release() {
    }

    public Z(File exportFile, ExportParams exportParams) {
        Intrinsics.checkNotNullParameter(exportFile, "exportFile");
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        this.f8244n = exportFile;
        this.rl = exportParams;
        int width = exportParams.getWidth();
        this.f8245t = width;
        int height = exportParams.getHeight();
        this.nr = height;
        this.f8243O = IntBuffer.allocate(width * height);
        this.J2 = LazyKt.lazy(new Function0() { // from class: Qk.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Z.jB(this.f8247n);
            }
        });
        this.Uo = new int[width * height];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.KN = bitmapCreateBitmap;
        this.xMQ = new OU(width, height);
    }

    private final int[] Xw() {
        return (int[]) this.J2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] jB(Z z2) {
        return new int[z2.f8245t * z2.nr];
    }

    @Override // Qk.SPz
    public void T(InterfaceC2106j interfaceC2106j) throws OpenGLException {
        int[] iArrXw;
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        if (this.mUb) {
            return;
        }
        this.f8243O.rewind();
        GLES20.glReadPixels(0, 0, this.f8245t, this.nr, 6408, 5121, this.f8243O);
        AbstractC2478o.rl();
        if (this.f8243O.hasArray()) {
            iArrXw = this.f8243O.array();
        } else {
            this.f8243O.rewind();
            this.f8243O.get(Xw());
            iArrXw = Xw();
        }
        int i2 = this.nr;
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = this.f8245t;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = (this.nr - 1) - i3;
                int i9 = this.f8245t;
                this.Uo[(i9 * i3) + i7] = qf.n(iArrXw[(i8 * i9) + i7]);
            }
        }
        Bitmap bitmap = this.KN;
        int[] iArr = this.Uo;
        int i10 = this.f8245t;
        bitmap.setPixels(iArr, 0, i10, 0, 0, i10, this.nr);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8244n);
        try {
            if (this.rl.getFormat().getBitmapFormat() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.KN.compress(this.rl.getFormat().getBitmapFormat(), this.rl.getImageQuality(), fileOutputStream);
            CloseableKt.closeFinally(fileOutputStream, null);
            this.mUb = true;
        } finally {
        }
    }

    @Override // Qk.SPz
    public void Z(InterfaceC2106j interfaceC2106j, long j2) {
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        interfaceC2106j.Uo(this.xMQ);
    }
}
