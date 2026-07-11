package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000  2\u00020\u0001:\u0002!\"B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, c.f62177j, "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "rl", "getDestination", "t", "nr", "O", "I", "getRenderIntent-uksYyKA", "()I", "J2", "[F", "Uo", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,328:1\n219#2:329\n221#2,5:330\n60#3:335\n70#3:337\n22#4:336\n22#4:338\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n-1#1:329\n147#1:330,5\n149#1:335\n150#1:337\n149#1:336\n150#1:338\n*E\n"})
public class Connector {

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace source;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final ColorSpace transformDestination;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ColorSpace destination;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ColorSpace transformSource;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "", "rl", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "Landroidx/compose/ui/graphics/colorspace/Connector;", "t", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] rl(ColorSpace source, ColorSpace destination, int intent) {
            if (!RenderIntent.J2(intent, RenderIntent.INSTANCE.n())) {
                return null;
            }
            long model = source.getModel();
            ColorModel.Companion companion = ColorModel.INSTANCE;
            boolean zJ2 = ColorModel.J2(model, companion.rl());
            boolean zJ22 = ColorModel.J2(destination.getModel(), companion.rl());
            if (zJ2 && zJ22) {
                return null;
            }
            if (!zJ2 && !zJ22) {
                return null;
            }
            if (!zJ2) {
                source = destination;
            }
            Intrinsics.checkNotNull(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) source;
            float[] fArrT = zJ2 ? rgb.getWhitePoint().t() : Illuminant.f31613n.t();
            float[] fArrT2 = zJ22 ? rgb.getWhitePoint().t() : Illuminant.f31613n.t();
            return new float[]{fArrT[0] / fArrT2[0], fArrT[1] / fArrT2[1], fArrT[2] / fArrT2[2]};
        }

        private Companion() {
        }

        public final Connector t(final ColorSpace source) {
            final int iT = RenderIntent.INSTANCE.t();
            return new Connector(source, iT) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(source, source, iT, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public long n(long color) {
                    return color;
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "source", "destination", "", "rl", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, c.f62177j, "(J)J", "KN", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "xMQ", "mUb", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,328:1\n219#2:329\n221#2,5:330\n638#3:335\n653#3:336\n668#3:337\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n-1#1:329\n185#1:330,5\n189#1:335\n190#1:336\n191#1:337\n*E\n"})
    public static final class RgbConnector extends Connector {

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private final Rgb mSource;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private final float[] mTransform;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private final Rgb mDestination;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i2);
        }

        private final float[] rl(Rgb source, Rgb destination, int intent) {
            if (ColorSpaceKt.J2(source.getWhitePoint(), destination.getWhitePoint())) {
                return ColorSpaceKt.qie(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrT = source.getWhitePoint().t();
            float[] fArrT2 = destination.getWhitePoint().t();
            WhitePoint whitePoint = source.getWhitePoint();
            Illuminant illuminant = Illuminant.f31613n;
            if (!ColorSpaceKt.J2(whitePoint, illuminant.rl())) {
                transform = ColorSpaceKt.qie(ColorSpaceKt.O(Adaptation.INSTANCE.n().getTransform(), fArrT, illuminant.J2()), source.getTransform());
            }
            if (!ColorSpaceKt.J2(destination.getWhitePoint(), illuminant.rl())) {
                inverseTransform = ColorSpaceKt.gh(ColorSpaceKt.qie(ColorSpaceKt.O(Adaptation.INSTANCE.n().getTransform(), fArrT2, illuminant.J2()), destination.getTransform()));
            }
            if (RenderIntent.J2(intent, RenderIntent.INSTANCE.n())) {
                transform = ColorSpaceKt.az(new float[]{fArrT[0] / fArrT2[0], fArrT[1] / fArrT2[1], fArrT[2] / fArrT2[2]}, transform);
            }
            return ColorSpaceKt.qie(inverseTransform, transform);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            super(rgb, rgb2, rgb, rgb2, i2, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = rl(rgb, rgb2, i2);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public long n(long color) {
            float fZ = Color.Z(color);
            float fO = Color.o(color);
            float fIk = Color.Ik(color);
            float fCk = Color.ck(color);
            float fN = (float) this.mSource.getEotfFunc().n(fZ);
            float fN2 = (float) this.mSource.getEotfFunc().n(fO);
            float fN3 = (float) this.mSource.getEotfFunc().n(fIk);
            float[] fArr = this.mTransform;
            return ColorKt.n((float) this.mDestination.getOetfFunc().n((fArr[0] * fN) + (fArr[3] * fN2) + (fArr[6] * fN3)), (float) this.mDestination.getOetfFunc().n((fArr[1] * fN) + (fArr[4] * fN2) + (fArr[7] * fN3)), (float) this.mDestination.getOetfFunc().n((fArr[2] * fN) + (fArr[5] * fN2) + (fArr[8] * fN3)), fCk, this.mDestination);
        }
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i2);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i2, fArr);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i2;
        this.transform = fArr;
    }

    public long n(long color) {
        float fZ = Color.Z(color);
        float fO = Color.o(color);
        float fIk = Color.Ik(color);
        float fCk = Color.ck(color);
        long jMUb = this.transformSource.mUb(fZ, fO, fIk);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMUb >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMUb & 4294967295L));
        float fAz = this.transformSource.az(fZ, fO, fIk);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fAz *= fArr[2];
        }
        float f3 = fIntBitsToFloat;
        return this.transformDestination.ty(f3, fIntBitsToFloat2, fAz, fCk, this.destination);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        long model = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        this(colorSpace, colorSpace2, ColorModel.J2(model, companion.rl()) ? ColorSpaceKt.nr(colorSpace, Illuminant.f31613n.rl(), null, 2, null) : colorSpace, ColorModel.J2(colorSpace2.getModel(), companion.rl()) ? ColorSpaceKt.nr(colorSpace2, Illuminant.f31613n.rl(), null, 2, null) : colorSpace2, i2, INSTANCE.rl(colorSpace, colorSpace2, i2), null);
    }
}
