package dF;

import Hh.C;
import Pj0.fuX;
import aB.C1502Wre;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools;
import bA.C1653C;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import fJf.Dsr;
import fJf.QJ;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n implements Ml {
    private static final Class J2 = n.class;
    private static final byte[] Uo = {-1, -39};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Pools.Pool f63469O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f63470n;
    private final PreverificationHelper nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63471t;

    public abstract int nr(int i2, int i3, BitmapFactory.Options options);

    private static final class j implements fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final j f63472n = new j();

        @Override // Pj0.fuX
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void n(Bitmap bitmap) {
        }

        private j() {
        }
    }

    private static BitmapFactory.Options O(C1653C c1653c, Bitmap.Config config, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c1653c.FX();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z3 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z3) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z2) {
            BitmapFactory.decodeStream(c1653c.eF(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z3) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // dF.Ml
    public Pj0.j n(C1653C c1653c, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsO = O(c1653c, config, this.rl);
        boolean z2 = optionsO.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return t((InputStream) C.Uo(c1653c.eF()), optionsO, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z2) {
                return n(c1653c, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    public n(Dsr dsr, Pools.Pool pool, Wre wre) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.nr = preverificationHelper;
        this.f63470n = dsr;
        if (dsr instanceof QJ) {
            this.rl = wre.n();
            this.f63471t = wre.rl();
        }
        this.f63469O = pool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Pj0.j t(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        boolean z2;
        Bitmap bitmap;
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        C.Uo(inputStream);
        int i2 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r02 = i2;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r02 = iWidth;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && (preverificationHelper = this.nr) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            z2 = true;
        } else {
            z2 = false;
        }
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect == null && z2) {
                    options.inMutable = false;
                } else {
                    if (rect != null && z2) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.rl) {
                        Bitmap bitmap2 = (Bitmap) this.f63470n.get(nr(r02, iHeight, options));
                        bitmap = bitmap2;
                        if (bitmap2 == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    options.inBitmap = bitmap;
                    if (i3 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAllocate = (ByteBuffer) this.f63469O.acquire();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(A72.n.nr());
                    }
                    options.inTempStorage = byteBufferAllocate.array();
                    if (rect == null && bitmap != 0) {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap.reconfigure(r02, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            Dzy.j.J2(J2, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapRegionDecoder = r02;
                        }
                    } else {
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f63469O.n(byteBufferAllocate);
                    if (bitmap == 0 && bitmap != bitmapDecodeStream) {
                        this.f63470n.n(bitmap);
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        throw new IllegalStateException();
                    }
                    if (!this.f63471t) {
                        return Pj0.j.Mx(bitmapDecodeStream, j.f63472n);
                    }
                    return Pj0.j.Mx(bitmapDecodeStream, this.f63470n);
                }
                options.inTempStorage = byteBufferAllocate.array();
                if (rect == null) {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                }
                this.f63469O.n(byteBufferAllocate);
                if (bitmap == 0) {
                }
                if (!this.f63471t) {
                }
            } catch (Throwable th3) {
                this.f63469O.n(byteBufferAllocate);
                throw th3;
            }
        } catch (IllegalArgumentException e2) {
            if (bitmap != 0) {
                this.f63470n.n(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 != null) {
                    Pj0.j jVarMx = Pj0.j.Mx(bitmapDecodeStream2, C1502Wre.rl());
                    this.f63469O.n(byteBufferAllocate);
                    return jVarMx;
                }
                throw e2;
            } catch (IOException unused3) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            if (bitmap != 0) {
                this.f63470n.n(bitmap);
            }
            throw e3;
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (i3 >= 26) {
        }
        byteBufferAllocate = (ByteBuffer) this.f63469O.acquire();
        if (byteBufferAllocate == null) {
        }
    }

    @Override // dF.Ml
    public Pj0.j rl(C1653C c1653c, Bitmap.Config config, Rect rect, int i2, ColorSpace colorSpace) {
        boolean z2;
        boolean zFcU = c1653c.fcU(i2);
        BitmapFactory.Options optionsO = O(c1653c, config, this.rl);
        InputStream inputStreamEF = c1653c.eF();
        C.Uo(inputStreamEF);
        if (c1653c.getSize() > i2) {
            inputStreamEF = new EQK.j(inputStreamEF, i2);
        }
        if (!zFcU) {
            inputStreamEF = new EQK.n(inputStreamEF, Uo);
        }
        if (optionsO.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        try {
            try {
                Pj0.j jVarT = t(inputStreamEF, optionsO, rect, colorSpace);
                try {
                    inputStreamEF.close();
                    return jVarT;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return jVarT;
                }
            } finally {
            }
        } catch (RuntimeException e3) {
            if (z3) {
                Pj0.j jVarRl = rl(c1653c, Bitmap.Config.ARGB_8888, rect, i2, colorSpace);
                try {
                    inputStreamEF.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return jVarRl;
            }
            throw e3;
        }
    }
}
