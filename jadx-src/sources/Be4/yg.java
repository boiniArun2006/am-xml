package Be4;

import Be4.aC;
import Be4.psW;
import Z.w6;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class yg implements aC {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f582t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f583n;
    private final FjR.C rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements aC.j {
        private final boolean rl(String str) {
            return str != null && StringsKt.startsWith$default(str, "video/", false, 2, (Object) null);
        }

        public boolean equals(Object obj) {
            return obj instanceof n;
        }

        public int hashCode() {
            return n.class.hashCode();
        }

        @Override // Be4.aC.j
        public aC n(Lf.qz qzVar, FjR.C c2, eQ.fuX fux) {
            if (!rl(qzVar.rl())) {
                return null;
            }
            return new yg(qzVar.t(), c2);
        }
    }

    private final Bitmap O(Bitmap bitmap, Z.fuX fux) {
        if (t(bitmap, this.rl) && nr(bitmap, this.rl, fux)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Z.w6 w6VarNr = fux.nr();
        int width2 = w6VarNr instanceof w6.j ? ((w6.j) w6VarNr).f12273n : bitmap.getWidth();
        Z.w6 w6VarT = fux.t();
        float fT = (float) Dsr.t(width, height, width2, w6VarT instanceof w6.j ? ((w6.j) w6VarT).f12273n : bitmap.getHeight(), this.rl.ty());
        int iRoundToInt = MathKt.roundToInt(bitmap.getWidth() * fT);
        int iRoundToInt2 = MathKt.roundToInt(bitmap.getHeight() * fT);
        Bitmap.Config configJ2 = (Build.VERSION.SDK_INT < 26 || this.rl.J2() != Bitmap.Config.HARDWARE) ? this.rl.J2() : Bitmap.Config.ARGB_8888;
        Paint paint = new Paint(3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, configJ2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(fT, fT);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    private final long rl(MediaMetadataRetriever mediaMetadataRetriever) {
        Long longOrNull;
        Long lN2 = FjR.z.n(this.rl.qie());
        if (lN2 != null) {
            return lN2.longValue();
        }
        Double dT = FjR.z.t(this.rl.qie());
        long jLongValue = 0;
        if (dT == null) {
            return 0L;
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata != null && (longOrNull = StringsKt.toLongOrNull(strExtractMetadata)) != null) {
            jLongValue = longOrNull.longValue();
        }
        return ((long) 1000) * MathKt.roundToLong(dT.doubleValue() * jLongValue);
    }

    private final boolean t(Bitmap bitmap, FjR.C c2) {
        return Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE || c2.J2() == Bitmap.Config.HARDWARE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[PHI: r0
      0x006b: PHI (r0v16 int) = (r0v13 int), (r0v13 int), (r0v27 int), (r0v27 int) binds: [B:40:0x0084, B:42:0x008a, B:27:0x005e, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Be4.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws IOException {
        int iIntValue;
        Integer intOrNull;
        Integer intOrNull2;
        int iIntValue2;
        Z.fuX fuxN;
        Bitmap bitmapN;
        Integer intOrNull3;
        Integer intOrNull4;
        Integer intOrNull5;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            J2(mediaMetadataRetriever, this.f583n);
            Integer numRl = FjR.z.rl(this.rl.qie());
            int iIntValue3 = numRl != null ? numRl.intValue() : 2;
            long jRl = rl(mediaMetadataRetriever);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int iIntValue4 = (strExtractMetadata == null || (intOrNull5 = StringsKt.toIntOrNull(strExtractMetadata)) == null) ? 0 : intOrNull5.intValue();
            if (iIntValue4 == 90 || iIntValue4 == 270) {
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                iIntValue = (strExtractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(strExtractMetadata2)) == null) ? 0 : intOrNull2.intValue();
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue2 = (strExtractMetadata3 == null || (intOrNull = StringsKt.toIntOrNull(strExtractMetadata3)) == null) ? 0 : intOrNull.intValue();
            } else {
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                iIntValue = (strExtractMetadata4 == null || (intOrNull4 = StringsKt.toIntOrNull(strExtractMetadata4)) == null) ? 0 : intOrNull4.intValue();
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata5 != null && (intOrNull3 = StringsKt.toIntOrNull(strExtractMetadata5)) != null) {
                    iIntValue2 = intOrNull3.intValue();
                }
            }
            int height = iIntValue2;
            if (iIntValue <= 0 || height <= 0) {
                fuxN = Z.fuX.nr;
            } else {
                Z.fuX fuxHI = this.rl.HI();
                int iT = Z.n.rl(fuxHI) ? iIntValue : kYF.z.t(fuxHI.nr(), this.rl.ty());
                Z.fuX fuxHI2 = this.rl.HI();
                double dT = Dsr.t(iIntValue, height, iT, Z.n.rl(fuxHI2) ? height : kYF.z.t(fuxHI2.t(), this.rl.ty()), this.rl.ty());
                if (this.rl.t()) {
                    dT = RangesKt.coerceAtMost(dT, 1.0d);
                }
                fuxN = Z.n.n(MathKt.roundToInt(((double) iIntValue) * dT), MathKt.roundToInt(dT * ((double) height)));
            }
            Z.fuX fux = fuxN;
            Z.w6 w6VarN = fux.n();
            Z.w6 w6VarRl = fux.rl();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 27 && (w6VarN instanceof w6.j) && (w6VarRl instanceof w6.j)) {
                bitmapN = kYF.z.rl(mediaMetadataRetriever, jRl, iIntValue3, ((w6.j) w6VarN).f12273n, ((w6.j) w6VarRl).f12273n, this.rl.J2());
            } else {
                bitmapN = kYF.z.n(mediaMetadataRetriever, jRl, iIntValue3, this.rl.J2());
                if (bitmapN != null) {
                    iIntValue = bitmapN.getWidth();
                    height = bitmapN.getHeight();
                } else {
                    bitmapN = null;
                }
            }
            if (bitmapN == null) {
                throw new IllegalStateException(("Failed to decode frame at " + jRl + " microseconds.").toString());
            }
            Bitmap bitmapO = O(bitmapN, fux);
            fuX fux2 = new fuX(new BitmapDrawable(this.rl.Uo().getResources(), bitmapO), iIntValue <= 0 || height <= 0 || Dsr.t(iIntValue, height, bitmapO.getWidth(), bitmapO.getHeight(), this.rl.ty()) < 1.0d);
            if (i2 >= 29) {
                mediaMetadataRetriever.release();
                return fux2;
            }
            mediaMetadataRetriever.release();
            return fux2;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    public yg(psW psw, FjR.C c2) {
        this.f583n = psw;
        this.rl = c2;
    }

    private final void J2(MediaMetadataRetriever mediaMetadataRetriever, psW psw) throws IOException {
        psw.Uo();
        psW.j jVarUo = psw.Uo();
        if (jVarUo instanceof Be4.j) {
            AssetFileDescriptor assetFileDescriptorOpenFd = this.rl.Uo().getAssets().openFd(((Be4.j) jVarUo).n());
            try {
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(assetFileDescriptorOpenFd, null);
            } finally {
            }
        } else {
            if (jVarUo instanceof Wre) {
                mediaMetadataRetriever.setDataSource(this.rl.Uo(), ((Wre) jVarUo).n());
                return;
            }
            if (jVarUo instanceof C1310m) {
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                C1310m c1310m = (C1310m) jVarUo;
                sb.append(c1310m.rl());
                sb.append('/');
                sb.append(c1310m.t());
                mediaMetadataRetriever.setDataSource(sb.toString());
                return;
            }
            mediaMetadataRetriever.setDataSource(psw.n().toFile().getPath());
        }
    }

    private final boolean nr(Bitmap bitmap, FjR.C c2, Z.fuX fux) {
        int width;
        int height;
        if (c2.t()) {
            return true;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Z.w6 w6VarNr = fux.nr();
        if (w6VarNr instanceof w6.j) {
            width = ((w6.j) w6VarNr).f12273n;
        } else {
            width = bitmap.getWidth();
        }
        Z.w6 w6VarT = fux.t();
        if (w6VarT instanceof w6.j) {
            height = ((w6.j) w6VarT).f12273n;
        } else {
            height = bitmap.getHeight();
        }
        if (Dsr.t(width2, height2, width, height, c2.ty()) == 1.0d) {
            return true;
        }
        return false;
    }
}
