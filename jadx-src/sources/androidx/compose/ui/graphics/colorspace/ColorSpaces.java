package androidx.compose.ui.graphics.colorspace;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010/\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0017\u00102\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u00105\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u00108\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010;\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010>\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010@\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b?\u0010+R\u0017\u0010C\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010+R\u0017\u0010F\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bD\u0010)\u001a\u0004\bE\u0010+R\u0017\u0010G\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010J\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bH\u0010)\u001a\u0004\bI\u0010+R\u0017\u0010L\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bK\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010N\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bM\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010R\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b=\u0010P\u001a\u0004\bK\u0010QR\u0017\u0010S\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b?\u0010P\u001a\u0004\bH\u0010QR\u001a\u0010U\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\bT\u0010+R\u0017\u0010V\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010W\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\bD\u0010+R\u0017\u0010Y\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bB\u0010P\u001a\u0004\bX\u0010QR \u0010]\u001a\b\u0012\u0004\u0012\u00020O0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\bM\u0010\\¨\u0006^"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "params", "", "x", "s7N", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;D)D", "nHg", "v", "pq", "wTp", "", "rl", "[F", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()[F", "SrgbPrimaries", "t", "iF", "Ntsc1953Primaries", "nr", "getBt2020Primaries$ui_graphics_release", "Bt2020Primaries", "O", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "SrgbTransferParameters", "J2", "NoneTransferParameters", "Uo", "getBt2020HlgTransferParameters$ui_graphics_release", "Bt2020HlgTransferParameters", "KN", "getBt2020PqTransferParameters$ui_graphics_release", "Bt2020PqTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "xMQ", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "X", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "mUb", "g", "LinearSrgb", "gh", "ViF", "ExtendedSrgb", "qie", "nY", "LinearExtendedSrgb", "az", "o", "Bt709", "ty", "ck", "Bt2020", "HI", "WPU", "DciP3", "aYN", "DisplayP3", "Ik", "te", "Ntsc1953", "r", "e", "SmpteC", "AdobeRgb", "Z", "E2", "ProPhotoRgb", "XQ", "Aces", "S", "Acescg", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "CieLab", "N", "Unspecified", "Bt2020Hlg", "Bt2020Pq", "fD", "Oklab", "", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ColorSpaces {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final Rgb DciP3;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final Rgb Ntsc1953;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final TransferParameters Bt2020PqTransferParameters;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final Rgb Acescg;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final TransferParameters Bt2020HlgTransferParameters;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final Rgb Unspecified;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final ColorSpace CieXyz;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final Rgb Aces;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final Rgb ProPhotoRgb;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final ColorSpace CieLab;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final Rgb Bt709;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final Rgb DisplayP3;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final Rgb Bt2020Pq;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final Rgb ExtendedSrgb;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final ColorSpace[] ColorSpacesArray;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final Rgb LinearSrgb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ColorSpaces f31604n = new ColorSpaces();

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final Rgb Bt2020Hlg;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float[] Bt2020Primaries;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final Rgb AdobeRgb;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final Rgb LinearExtendedSrgb;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final Rgb SmpteC;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final ColorSpace Oklab;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final Rgb Bt2020;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final Rgb Srgb;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        Illuminant illuminant = Illuminant.f31613n;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, illuminant.O(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, illuminant.O(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, illuminant.O(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.j
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.gh(d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.qie(d2);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, illuminant.O(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.O(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.O(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.O(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.n(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.O(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.O(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.rl(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, illuminant.nr(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.nr(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        CieXyz = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        CieLab = lab;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.O(), transferParameters2, 16);
        Unspecified = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, illuminant.O(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.w6
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.Uo(d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Ml
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.KN(d2);
            }
        }, 0.0f, 1.0f, transferParameters3, 17);
        Bt2020Hlg = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, illuminant.O(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.I28
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.xMQ(d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Wre
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return ColorSpaces.mUb(d2);
            }
        }, 0.0f, 1.0f, transferParameters4, 18);
        Bt2020Pq = rgb17;
        Oklab oklab = new Oklab("Oklab", 19);
        Oklab = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double KN(double d2) {
        return f31604n.nHg(Bt2020HlgTransferParameters, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Uo(double d2) {
        return f31604n.s7N(Bt2020HlgTransferParameters, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double mUb(double d2) {
        return f31604n.wTp(Bt2020PqTransferParameters, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double xMQ(double d2) {
        return f31604n.v(Bt2020PqTransferParameters, d2);
    }

    public final Rgb E2() {
        return ProPhotoRgb;
    }

    public final Rgb HI() {
        return AdobeRgb;
    }

    public final Rgb Ik() {
        return Bt2020Hlg;
    }

    public final Rgb N() {
        return Unspecified;
    }

    public final ColorSpace[] S() {
        return ColorSpacesArray;
    }

    public final float[] T() {
        return SrgbPrimaries;
    }

    public final Rgb ViF() {
        return ExtendedSrgb;
    }

    public final Rgb WPU() {
        return DciP3;
    }

    public final Rgb X() {
        return Srgb;
    }

    public final ColorSpace XQ() {
        return CieXyz;
    }

    public final ColorSpace Z() {
        return CieLab;
    }

    public final Rgb aYN() {
        return DisplayP3;
    }

    public final Rgb az() {
        return Aces;
    }

    public final Rgb ck() {
        return Bt2020;
    }

    public final Rgb e() {
        return SmpteC;
    }

    public final ColorSpace fD() {
        return Oklab;
    }

    public final Rgb g() {
        return LinearSrgb;
    }

    public final float[] iF() {
        return Ntsc1953Primaries;
    }

    public final double nHg(TransferParameters params, double x2) {
        double d2 = x2 < 0.0d ? -1.0d : 1.0d;
        double d4 = x2 * d2;
        double a2 = params.getA();
        double b2 = params.getB();
        double c2 = params.getC();
        double d5 = params.getD();
        double e2 = params.getE();
        double d6 = a2 * d4;
        return (params.getF() + 1.0d) * d2 * (d6 <= 1.0d ? Math.pow(d6, b2) : Math.exp((d4 - e2) * c2) + d5);
    }

    public final Rgb nY() {
        return LinearExtendedSrgb;
    }

    public final Rgb o() {
        return Bt709;
    }

    public final Rgb r() {
        return Bt2020Pq;
    }

    public final double s7N(TransferParameters params, double x2) {
        double d2 = x2 < 0.0d ? -1.0d : 1.0d;
        double a2 = 1.0d / params.getA();
        double b2 = 1.0d / params.getB();
        double c2 = 1.0d / params.getC();
        double d4 = params.getD();
        double e2 = params.getE();
        double f3 = (x2 * d2) / (params.getF() + 1.0d);
        return d2 * (f3 <= 1.0d ? a2 * Math.pow(f3, b2) : (c2 * Math.log(f3 - d4)) + e2);
    }

    public final Rgb te() {
        return Ntsc1953;
    }

    public final Rgb ty() {
        return Acescg;
    }

    public final double v(TransferParameters params, double x2) {
        double d2 = x2 < 0.0d ? -1.0d : 1.0d;
        double d4 = x2 * d2;
        double d5 = -params.getA();
        double d6 = params.getD();
        double f3 = 1.0d / params.getF();
        return d2 * Math.pow(Math.max(d5 + (d6 * Math.pow(d4, f3)), 0.0d) / (params.getB() + ((-params.getE()) * Math.pow(d4, f3))), 1.0d / params.getC());
    }

    public final double wTp(TransferParameters pq2, double x2) {
        double d2 = x2 < 0.0d ? -1.0d : 1.0d;
        double d4 = x2 * d2;
        return d2 * Math.pow(RangesKt.coerceAtLeast(pq2.getA() + (pq2.getB() * Math.pow(d4, pq2.getC())), 0.0d) / (pq2.getD() + (pq2.getE() * Math.pow(d4, pq2.getC()))), pq2.getF());
    }

    private ColorSpaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double gh(double d2) {
        return ColorSpaceKt.n(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double qie(double d2) {
        return ColorSpaceKt.rl(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }
}
