package dX;

import Hh.Dsr;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml {
    private static final Ml az = rl().n();
    public final boolean J2;
    public final Bitmap.Config KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f63510O;
    public final boolean Uo;
    public final ColorSpace gh;
    public final bAP.n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63511n;
    public final boolean nr;
    private final boolean qie;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f63512t;
    public final Bitmap.Config xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ml ml = (Ml) obj;
        if (this.f63511n != ml.f63511n || this.rl != ml.rl || this.f63512t != ml.f63512t || this.nr != ml.nr || this.f63510O != ml.f63510O || this.J2 != ml.J2 || this.Uo != ml.Uo) {
            return false;
        }
        boolean z2 = this.qie;
        if (z2 || this.KN == ml.KN) {
            return (z2 || this.xMQ == ml.xMQ) && this.mUb == ml.mUb && this.gh == ml.gh;
        }
        return false;
    }

    public static Ml n() {
        return az;
    }

    public static I28 rl() {
        return new I28();
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f63511n * 31) + this.rl) * 31) + (this.f63512t ? 1 : 0)) * 31) + (this.nr ? 1 : 0)) * 31) + (this.f63510O ? 1 : 0)) * 31) + (this.J2 ? 1 : 0)) * 31) + (this.Uo ? 1 : 0);
        if (!this.qie) {
            iOrdinal = (iOrdinal * 31) + this.KN.ordinal();
        }
        if (!this.qie) {
            int i2 = iOrdinal * 31;
            Bitmap.Config config = this.xMQ;
            iOrdinal = i2 + (config != null ? config.ordinal() : 0);
        }
        int i3 = iOrdinal * 31;
        bAP.n nVar = this.mUb;
        int iHashCode = (i3 + (nVar != null ? nVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.gh;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + t().toString() + "}";
    }

    public Ml(I28 i28) {
        this.f63511n = i28.qie();
        this.rl = i28.gh();
        this.f63512t = i28.KN();
        this.nr = i28.ty();
        this.f63510O = i28.az();
        this.J2 = i28.Uo();
        this.Uo = i28.mUb();
        this.KN = i28.t();
        this.xMQ = i28.rl();
        this.mUb = i28.J2();
        i28.nr();
        this.gh = i28.O();
        this.qie = i28.xMQ();
    }

    protected Dsr.j t() {
        return Dsr.rl(this).n("minDecodeIntervalMs", this.f63511n).n("maxDimensionPx", this.rl).t("decodePreviewFrame", this.f63512t).t("useLastFrameForPreview", this.nr).t("useEncodedImageForPreview", this.f63510O).t("decodeAllFrames", this.J2).t("forceStaticImage", this.Uo).rl("bitmapConfigName", this.KN.name()).rl("animatedBitmapConfigName", this.xMQ.name()).rl("customImageDecoder", this.mUb).rl("bitmapTransformation", null).rl("colorSpace", this.gh);
    }
}
