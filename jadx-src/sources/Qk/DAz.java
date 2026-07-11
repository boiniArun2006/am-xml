package Qk;

import HI0.qf;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.gl.OpenGLException;
import fX.InterfaceC2106j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z.AbstractC2478o;
import z.OU;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class DAz implements SPz {
    private int J2;
    private final Lazy KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f8233O;
    private final IntBuffer Uo;
    private final OU az;
    private ZipOutputStream gh;
    private final Bitmap mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f8234n;
    private final int nr;
    private int qie;
    private final ExportParams rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f8235t;
    private int[] xMQ;

    @Override // Qk.SPz
    public void n() {
        this.qie = 0;
        this.gh = new ZipOutputStream(new FileOutputStream(this.f8234n));
    }

    public DAz(File exportFile, ExportParams exportParams) {
        Intrinsics.checkNotNullParameter(exportFile, "exportFile");
        Intrinsics.checkNotNullParameter(exportParams, "exportParams");
        this.f8234n = exportFile;
        this.rl = exportParams;
        int width = exportParams.getWidth();
        this.f8235t = width;
        int height = exportParams.getHeight();
        this.nr = height;
        this.f8233O = -1L;
        this.Uo = IntBuffer.allocate(width * height);
        this.KN = LazyKt.lazy(new Function0() { // from class: Qk.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DAz.jB(this.f8317n);
            }
        });
        this.xMQ = new int[width * height];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.mUb = bitmapCreateBitmap;
        this.az = new OU(width, height);
    }

    private final int[] Xw() {
        return (int[]) this.KN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] jB(DAz dAz) {
        return new int[dAz.f8235t * dAz.nr];
    }

    @Override // Qk.SPz
    public void T(InterfaceC2106j interfaceC2106j) throws OpenGLException, IOException {
        int[] iArrXw;
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        this.Uo.rewind();
        GLES20.glReadPixels(0, 0, this.f8235t, this.nr, 6408, 5121, this.Uo);
        AbstractC2478o.rl();
        if (this.Uo.hasArray()) {
            iArrXw = this.Uo.array();
        } else {
            this.Uo.rewind();
            this.Uo.get(Xw());
            iArrXw = Xw();
        }
        int i2 = this.nr;
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = this.f8235t;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = (this.nr - 1) - i3;
                int i9 = this.f8235t;
                this.xMQ[(i9 * i3) + i7] = qf.n(iArrXw[(i8 * i9) + i7]);
            }
        }
        Bitmap bitmap = this.mUb;
        int[] iArr = this.xMQ;
        int i10 = this.f8235t;
        bitmap.setPixels(iArr, 0, i10, 0, 0, i10, this.nr);
        this.qie++;
        String str = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(this.qie)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        ZipEntry zipEntry = new ZipEntry(str + "_" + this.J2 + "." + this.rl.getFormat().getBitmapExt());
        if (this.rl.getFormat().getBitmapFormat() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ZipOutputStream zipOutputStream = this.gh;
        ZipOutputStream zipOutputStream2 = null;
        if (zipOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zipOutputStream");
            zipOutputStream = null;
        }
        zipOutputStream.putNextEntry(zipEntry);
        Bitmap bitmap2 = this.mUb;
        Bitmap.CompressFormat bitmapFormat = this.rl.getFormat().getBitmapFormat();
        int imageQuality = this.rl.getImageQuality();
        ZipOutputStream zipOutputStream3 = this.gh;
        if (zipOutputStream3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zipOutputStream");
        } else {
            zipOutputStream2 = zipOutputStream3;
        }
        bitmap2.compress(bitmapFormat, imageQuality, zipOutputStream2);
    }

    @Override // Qk.SPz
    public void Z(InterfaceC2106j interfaceC2106j, long j2) {
        Intrinsics.checkNotNullParameter(interfaceC2106j, "<this>");
        interfaceC2106j.Uo(this.az);
        if (this.f8233O < 0) {
            this.f8233O = j2;
        }
        long j3 = this.f8233O;
        int i2 = (int) ((j2 - j3) / ((long) 10000000));
        this.J2 = i2;
        this.f8233O = j3 + (((long) i2) * 10000000);
    }

    @Override // Cp.j
    public void release() throws IOException {
        ZipOutputStream zipOutputStream = this.gh;
        if (zipOutputStream != null) {
            if (zipOutputStream == null) {
                Intrinsics.throwUninitializedPropertyAccessException("zipOutputStream");
                zipOutputStream = null;
            }
            zipOutputStream.close();
        }
    }
}
