package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010#\"\u0004\b\r\u0010$R*\u0010'\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0012\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u0002002\u0006\u0010\u001a\u001a\u0002008V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00106\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b5\u0010$R*\u0010:\u001a\u0002072\u0006\u0010\u001a\u001a\u0002078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R*\u0010>\u001a\u00020;2\u0006\u0010\u001a\u001a\u00020;8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010A\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010#\"\u0004\b@\u0010$R*\u0010E\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020B8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R4\u0010J\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010N\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010K\"\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "g", "()Landroid/graphics/Paint;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/BlendMode;", "rl", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "t", "Landroid/graphics/Shader;", "internalShader", "Landroidx/compose/ui/graphics/ColorFilter;", "nr", "Landroidx/compose/ui/graphics/ColorFilter;", "internalColorFilter", "Landroidx/compose/ui/graphics/PathEffect;", "value", "O", "Landroidx/compose/ui/graphics/PathEffect;", "aYN", "()Landroidx/compose/ui/graphics/PathEffect;", "XQ", "(Landroidx/compose/ui/graphics/PathEffect;)V", "pathEffect", "", "()F", "(F)V", "alpha", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "()J", "WPU", "(J)V", "ck", "()I", "r", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "X", "style", "N", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "Z", "Ik", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "ViF", "S", "strokeJoin", "nY", "E2", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "e", "o", "filterQuality", "iF", "()Landroid/graphics/Shader;", "te", "(Landroid/graphics/Shader;)V", "shader", "()Landroidx/compose/ui/graphics/ColorFilter;", "fD", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidPaint implements Paint {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private PathEffect pathEffect;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private android.graphics.Paint internalPaint;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private ColorFilter internalColorFilter;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int _blendMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    public AndroidPaint(android.graphics.Paint paint) {
        this.internalPaint = paint;
        this._blendMode = BlendMode.INSTANCE.te();
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void E2(float f3) {
        AndroidPaint_androidKt.Z(this.internalPaint, f3);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void Ik(int i2) {
        AndroidPaint_androidKt.r(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float N() {
        return AndroidPaint_androidKt.xMQ(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void S(int i2) {
        AndroidPaint_androidKt.o(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void T(float f3) {
        AndroidPaint_androidKt.XQ(this.internalPaint, f3);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public int ViF() {
        return AndroidPaint_androidKt.Uo(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void WPU(long j2) {
        AndroidPaint_androidKt.az(this.internalPaint, j2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void X(int i2) {
        AndroidPaint_androidKt.S(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void XQ(PathEffect pathEffect) {
        AndroidPaint_androidKt.ck(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public int Z() {
        return AndroidPaint_androidKt.J2(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: aYN, reason: from getter */
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: ck, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public int e() {
        return AndroidPaint_androidKt.O(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void fD(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.ty(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: g, reason: from getter */
    public android.graphics.Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: iF, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float n() {
        return AndroidPaint_androidKt.t(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float nY() {
        return AndroidPaint_androidKt.KN(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: nr, reason: from getter */
    public ColorFilter getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void o(int i2) {
        AndroidPaint_androidKt.HI(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void r(int i2) {
        if (BlendMode.e(this._blendMode, i2)) {
            return;
        }
        this._blendMode = i2;
        AndroidPaint_androidKt.qie(this.internalPaint, i2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void rl(float f3) {
        AndroidPaint_androidKt.gh(this.internalPaint, f3);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public long t() {
        return AndroidPaint_androidKt.nr(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void te(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.Ik(this.internalPaint, shader);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.mUb());
    }
}
