package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 ^2\u00020\u0001:\u0001cB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010N\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bS\u0010MR\u001a\u0010W\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010RR\u001a\u0010\\\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u001a\u0010_\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bC\u0010`\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "", "gamma", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "component", "J2", "(I)F", "O", "v", "qie", "([F)[F", "v0", "v1", "v2", "", "mUb", "(FFF)J", "az", "(FFF)F", "x", "y", "z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/ui/graphics/Color;", "ty", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "rl", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "nHg", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "F", "Uo", "KN", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "xMQ", "[F", "X", "()[F", "N", "gh", "iF", "inverseTransform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "e", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "fD", "()Lkotlin/jvm/functions/Function1;", "E2", "oetfFunc", "HI", "te", "eotfOrig", "ck", "nY", "Ik", "g", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "o", "isSrgb", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1259:1\n638#2:1260\n653#2:1261\n668#2:1265\n638#2:1266\n653#2:1267\n668#2:1268\n53#3,3:1262\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n788#1:1260\n789#1:1261\n799#1:1265\n811#1:1266\n812#1:1267\n813#1:1268\n791#1:1262,3\n*E\n"})
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final DoubleFunction eotfOrig;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final DoubleFunction eotfFunc;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final TransferParameters transferParameters;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final float max;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Function1 oetf;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final Function1 eotf;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final float[] inverseTransform;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final DoubleFunction oetfOrig;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final DoubleFunction oetfFunc;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final float[] primaries;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction XQ = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Dsr
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double n(double d2) {
            return Rgb.Z(d2);
        }
    };

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "OETF", "EOTF", "", "min", "max", "", "id", "", "iF", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFI)Z", "", "point", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "ck", "(DLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;)Z", "fD", "([FFF)Z", "HI", "([F)F", "p1", "p2", "r", "([F[F)Z", "E2", "([F)[F", "Ik", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "function", "aYN", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "o", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1#1,1259:1\n977#1:1260\n977#1:1261\n977#1:1262\n977#1:1263\n977#1:1264\n977#1:1265\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1050#1:1260\n1051#1:1261\n1057#1:1262\n1058#1:1263\n1063#1:1264\n1064#1:1265\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] E2(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                ArraysKt.copyInto$default(primaries, fArr, 0, 0, 6, 6, (Object) null);
                return fArr;
            }
            float f3 = primaries[0];
            float f4 = primaries[1];
            float f5 = f3 + f4 + primaries[2];
            fArr[0] = f3 / f5;
            fArr[1] = f4 / f5;
            float f6 = primaries[3];
            float f7 = primaries[4];
            float f8 = f6 + f7 + primaries[5];
            fArr[2] = f6 / f8;
            fArr[3] = f7 / f8;
            float f9 = primaries[6];
            float f10 = primaries[7];
            float f11 = f9 + f10 + primaries[8];
            fArr[4] = f9 / f11;
            fArr[5] = f10 / f11;
            return fArr;
        }

        private final float HI(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f3 = primaries[0];
            float f4 = primaries[1];
            float f5 = primaries[2];
            float f6 = primaries[3];
            float f7 = primaries[4];
            float f8 = primaries[5];
            float f9 = ((((((f3 * f6) + (f4 * f7)) + (f5 * f8)) - (f6 * f7)) - (f4 * f5)) - (f3 * f8)) * 0.5f;
            return f9 < 0.0f ? -f9 : f9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] Ik(float[] primaries, WhitePoint whitePoint) {
            float f3 = primaries[0];
            float f4 = primaries[1];
            float f5 = primaries[2];
            float f6 = primaries[3];
            float f7 = primaries[4];
            float f8 = primaries[5];
            float x2 = whitePoint.getX();
            float y2 = whitePoint.getY();
            float f9 = 1;
            float f10 = (f9 - f3) / f4;
            float f11 = (f9 - f5) / f6;
            float f12 = (f9 - f7) / f8;
            float f13 = (f9 - x2) / y2;
            float f14 = f3 / f4;
            float f15 = (f5 / f6) - f14;
            float f16 = (x2 / y2) - f14;
            float f17 = f11 - f10;
            float f18 = (f7 / f8) - f14;
            float f19 = (((f13 - f10) * f15) - (f16 * f17)) / (((f12 - f10) * f15) - (f17 * f18));
            float f20 = (f16 - (f18 * f19)) / f15;
            float f21 = (1.0f - f20) - f19;
            float f22 = f21 / f4;
            float f23 = f20 / f6;
            float f24 = f19 / f8;
            return new float[]{f22 * f3, f21, f22 * ((1.0f - f3) - f4), f23 * f5, f20, f23 * ((1.0f - f5) - f6), f24 * f7, f19, f24 * ((1.0f - f7) - f8)};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean iF(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.f31604n;
            if (!ColorSpaceKt.Uo(primaries, colorSpaces.T()) || !ColorSpaceKt.J2(whitePoint, Illuminant.f31613n.O()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            Rgb rgbX = colorSpaces.X();
            for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                if (!ck(d2, OETF, rgbX.getOetfOrig()) || !ck(d2, EOTF, rgbX.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean r(float[] p1, float[] p2) {
            float f3 = p1[0];
            float f4 = p2[0];
            float f5 = p1[1];
            float f6 = p2[1];
            float f7 = p1[2];
            float f8 = p2[2];
            float f9 = p1[3];
            float f10 = p2[3];
            float f11 = p1[4];
            float f12 = p2[4];
            float f13 = p1[5];
            float f14 = p2[5];
            float[] fArr = {f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12, f13 - f14};
            float f15 = fArr[0];
            float f16 = fArr[1];
            if (((f6 - f14) * f15) - ((f4 - f12) * f16) >= 0.0f && ((f4 - f8) * f16) - ((f6 - f10) * f15) >= 0.0f) {
                float f17 = fArr[2];
                float f18 = fArr[3];
                if (((f10 - f6) * f17) - ((f8 - f4) * f18) >= 0.0f && ((f8 - f12) * f18) - ((f10 - f14) * f17) >= 0.0f) {
                    float f19 = fArr[4];
                    float f20 = fArr[5];
                    if (((f14 - f10) * f19) - ((f12 - f8) * f20) >= 0.0f && ((f12 - f4) * f20) - ((f14 - f6) * f19) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double ViF(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f31604n.s7N(transferParameters, d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double XQ(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f31604n.wTp(transferParameters, d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double Z(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f31604n.nHg(transferParameters, d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double nY(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f31604n.v(transferParameters, d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double S(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.Ik(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double WPU(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.r(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction aYN(final TransferParameters function) {
            if (function.KN()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.eO
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.ViF(function, d2);
                    }
                };
            }
            if (function.xMQ()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.z
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.nY(function, d2);
                    }
                };
            }
            if (function.getE() == 0.0d && function.getF() == 0.0d) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.QJ
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.g(function, d2);
                    }
                };
            }
            return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.l3D
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double n(double d2) {
                    return Rgb.Companion.te(function, d2);
                }
            };
        }

        private final boolean ck(double point, DoubleFunction a2, DoubleFunction b2) {
            if (Math.abs(a2.n(point) - b2.n(point)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean fD(float[] primaries, float min, float max) {
            float fHI = HI(primaries);
            ColorSpaces colorSpaces = ColorSpaces.f31604n;
            if (fHI / HI(colorSpaces.iF()) <= 0.9f || !r(primaries, colorSpaces.T())) {
                if (min < 0.0f && max > 1.0f) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double g(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.HI(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction o(final TransferParameters function) {
            if (function.KN()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.Z(function, d2);
                    }
                };
            }
            if (function.xMQ()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.qz
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.XQ(function, d2);
                    }
                };
            }
            if (function.getE() == 0.0d && function.getF() == 0.0d) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Pl
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double n(double d2) {
                        return Rgb.Companion.S(function, d2);
                    }
                };
            }
            return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Xo
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double n(double d2) {
                    return Rgb.Companion.WPU(function, d2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double te(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.ck(d2, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f3, float f4, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.INSTANCE.rl(), i2, null);
        this.whitePoint = whitePoint;
        this.min = f3;
        this.max = f4;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return n(d2.doubleValue());
            }

            public final Double n(double d2) {
                return Double.valueOf(RangesKt.coerceIn(this.f31627n.getOetfOrig().n(d2), this.f31627n.min, this.f31627n.max));
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.CN3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return Rgb.s7N(this.f31594n, d2);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d2) {
                return n(d2.doubleValue());
            }

            public final Double n(double d2) {
                return Double.valueOf(this.f31626n.getEotfOrig().n(RangesKt.coerceIn(d2, this.f31626n.min, this.f31626n.max)));
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.fuX
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double n(double d2) {
                return Rgb.ViF(this.f31635n, d2);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f3 >= f4) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f4 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrE2 = companion.E2(fArr);
        this.primaries = fArrE2;
        if (fArr2 == null) {
            this.transform = companion.Ik(fArrE2, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.gh(this.transform);
        this.isWideGamut = companion.fD(fArrE2, f3, f4);
        this.isSrgb = companion.iF(fArrE2, whitePoint, doubleFunction, doubleFunction2, f3, f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Z(double d2) {
        return d2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] qie(float[] v2) {
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.eotfFunc.n(v2[0]);
        v2[1] = (float) this.eotfFunc.n(v2[1]);
        v2[2] = (float) this.eotfFunc.n(v2[2]);
        return ColorSpaceKt.ty(this.transform, v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(double d2, double d4) {
        if (d4 < 0.0d) {
            d4 = 0.0d;
        }
        return Math.pow(d4, d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ViF(Rgb rgb, double d2) {
        return rgb.eotfOrig.n(RangesKt.coerceIn(d2, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double XQ(double d2, double d4) {
        if (d4 < 0.0d) {
            d4 = 0.0d;
        }
        return Math.pow(d4, 1.0d / d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double s7N(Rgb rgb, double d2) {
        return RangesKt.coerceIn(rgb.oetfOrig.n(d2), rgb.min, rgb.max);
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float J2(int component) {
        return this.min;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float O(int component) {
        return this.max;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float az(float v0, float v1, float v2) {
        float fN = (float) this.eotfFunc.n(v0);
        float fN2 = (float) this.eotfFunc.n(v1);
        float fN3 = (float) this.eotfFunc.n(v2);
        float[] fArr = this.transform;
        return (fArr[2] * fN) + (fArr[5] * fN2) + (fArr[8] * fN3);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final Function1 getOetf() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long mUb(float v0, float v1, float v2) {
        float fN = (float) this.eotfFunc.n(v0);
        float fN2 = (float) this.eotfFunc.n(v1);
        float fN3 = (float) this.eotfFunc.n(v2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fN) + (fArr[3] * fN2)) + (fArr[6] * fN3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fN) + (fArr[4] * fN2) + (fArr[7] * fN3))) & 4294967295L);
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final Function1 getEotf() {
        return this.eotf;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] rl(float[] v2) {
        ColorSpaceKt.ty(this.inverseTransform, v2);
        if (v2.length < 3) {
            return v2;
        }
        v2[0] = (float) this.oetfFunc.n(v2[0]);
        v2[1] = (float) this.oetfFunc.n(v2[1]);
        v2[2] = (float) this.oetfFunc.n(v2[2]);
        return v2;
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long ty(float x2, float y2, float z2, float a2, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.n((float) this.oetfFunc.n((fArr[0] * x2) + (fArr[3] * y2) + (fArr[6] * z2)), (float) this.oetfFunc.n((fArr[1] * x2) + (fArr[4] * y2) + (fArr[7] * z2)), (float) this.oetfFunc.n((fArr[2] * x2) + (fArr[5] * y2) + (fArr[8] * z2)), a2, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iFloatToIntBits;
        int iFloatToIntBits2;
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f3 = this.min;
        int iHashCode2 = 0;
        if (f3 == 0.0f) {
            iFloatToIntBits = 0;
        } else {
            iFloatToIntBits = Float.floatToIntBits(f3);
        }
        int i2 = (iHashCode + iFloatToIntBits) * 31;
        float f4 = this.max;
        if (f4 == 0.0f) {
            iFloatToIntBits2 = 0;
        } else {
            iFloatToIntBits2 = Float.floatToIntBits(f4);
        }
        int i3 = (i2 + iFloatToIntBits2) * 31;
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            iHashCode2 = transferParameters.hashCode();
        }
        int i5 = i3 + iHashCode2;
        if (this.transferParameters == null) {
            return (((i5 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i2) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.aYN(transferParameters), companion.o(transferParameters), 0.0f, 1.0f, transferParameters, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d2, float f3, float f4, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d2 == 1.0d) {
            doubleFunction = XQ;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.aC
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double n(double d4) {
                    return Rgb.XQ(d2, d4);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d2 == 1.0d) {
            doubleFunction2 = XQ;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.C
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double n(double d4) {
                    return Rgb.S(d2, d4);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f3, f4, new TransferParameters(d2, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i2);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
