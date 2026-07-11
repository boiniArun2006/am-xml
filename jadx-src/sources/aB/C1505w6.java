package aB;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bA.C1653C;
import com.facebook.common.memory.PooledByteBuffer;
import fJf.Ew;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aB.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1505w6 implements uK.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f12741t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1504n f12742n;
    private final com.facebook.imagepipeline.memory.w6 rl;

    /* JADX INFO: renamed from: aB.w6$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BitmapFactory.Options rl(int i2, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i2;
            options.inMutable = true;
            return options;
        }
    }

    public C1505w6(Ew poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        this.f12742n = new C1504n(poolFactory.KN());
        com.facebook.imagepipeline.memory.w6 w6VarNr = poolFactory.nr();
        Intrinsics.checkNotNullExpressionValue(w6VarNr, "getFlexByteArrayPool(...)");
        this.rl = w6VarNr;
    }

    @Override // uK.j
    public Bitmap n(int i2, int i3, Bitmap.Config bitmapConfig) throws Throwable {
        C1653C c1653c;
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Pj0.j jVarN = this.f12742n.n((short) i2, (short) i3);
        Intrinsics.checkNotNullExpressionValue(jVarN, "generate(...)");
        try {
            c1653c = new C1653C(jVarN);
        } catch (Throwable th) {
            th = th;
            c1653c = null;
        }
        try {
            c1653c.Uf(com.facebook.imageformat.n.rl);
            BitmapFactory.Options optionsRl = f12741t.rl(c1653c.FX(), bitmapConfig);
            int size = ((PooledByteBuffer) jVarN.eF()).size();
            Object objEF = jVarN.eF();
            Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
            Pj0.j jVarN2 = this.rl.n(size + 2);
            Object objEF2 = jVarN2.eF();
            Intrinsics.checkNotNullExpressionValue(objEF2, "get(...)");
            byte[] bArr = (byte[]) objEF2;
            ((PooledByteBuffer) objEF).O(0, bArr, 0, size);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, optionsRl);
            if (bitmapDecodeByteArray == null) {
                throw new IllegalStateException("Required value was null.");
            }
            bitmapDecodeByteArray.setHasAlpha(true);
            bitmapDecodeByteArray.eraseColor(0);
            Pj0.j.M7(jVarN2);
            C1653C.Uo(c1653c);
            Pj0.j.M7(jVarN);
            return bitmapDecodeByteArray;
        } catch (Throwable th2) {
            th = th2;
            Pj0.j.M7(null);
            C1653C.Uo(c1653c);
            Pj0.j.M7(jVarN);
            throw th;
        }
    }
}
