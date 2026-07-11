package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000 92\u00020\u0001:\u0001>B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010)\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0012H'¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u0010+R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u00101R\u0011\u0010:\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b7\u00101R\u0014\u0010=\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component", "", "J2", "(I)F", "O", "r", "g", "b", "", "gh", "(FFF)[F", "v", "qie", "([F)[F", "v0", "v1", "v2", "", "mUb", "(FFF)J", "az", "(FFF)F", "x", "y", "z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "colorSpace", "Landroidx/compose/ui/graphics/Color;", "ty", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", c.f62177j, "rl", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "KN", "J", "Uo", "()J", "t", "I", "nr", "componentCount", "xMQ", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,717:1\n53#2,3:718\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n246#1:718,3\n*E\n"})
public abstract class ColorSpace {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long model;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int id;

    public /* synthetic */ ColorSpace(String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, i2);
    }

    public abstract float J2(int component);

    public abstract float O(int component);

    public final float[] gh(float r2, float g2, float b2) {
        return qie(new float[]{r2, g2, b2});
    }

    public abstract float[] qie(float[] v2);

    public abstract float[] rl(float[] v2);

    /* JADX INFO: renamed from: xMQ */
    public boolean getIsSrgb() {
        return false;
    }

    private ColorSpace(String str, long j2, int i2) {
        this.name = str;
        this.model = j2;
        this.id = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getModel() {
        return this.model;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.J2(this.model, colorSpace.model);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.KN(this.model)) * 31) + this.id;
    }

    public final float[] n(float x2, float y2, float z2) {
        float[] fArr = new float[ColorModel.Uo(this.model)];
        fArr[0] = x2;
        fArr[1] = y2;
        fArr[2] = z2;
        return rl(fArr);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final int t() {
        return ColorModel.Uo(this.model);
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.xMQ(this.model)) + ')';
    }

    public float az(float v0, float v1, float v2) {
        return gh(v0, v1, v2)[2];
    }

    public long mUb(float v0, float v1, float v2) {
        float[] fArrGh = gh(v0, v1, v2);
        float f3 = fArrGh[0];
        float f4 = fArrGh[1];
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
    }

    public long ty(float x2, float y2, float z2, float a2, ColorSpace colorSpace) {
        float[] fArrN = n(x2, y2, z2);
        return ColorKt.n(fArrN[0], fArrN[1], fArrN[2], a2, colorSpace);
    }
}
