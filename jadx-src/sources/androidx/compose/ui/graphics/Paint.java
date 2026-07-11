package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00128&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00188&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001e\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\"\u0010\"\u001a\u00020\u001f8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\"\u0010&\u001a\u00020#8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010)\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\"\u0010-\u001a\u00020*8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R$\u00104\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010:\u001a\u0004\u0018\u0001058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010@\u001a\u0004\u0018\u00010;8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006AÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "g", "()Landroid/graphics/Paint;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()F", "rl", "(F)V", "alpha", "Landroidx/compose/ui/graphics/Color;", "t", "()J", "WPU", "(J)V", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "ck", "()I", "r", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "X", "style", "N", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "Z", "Ik", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "ViF", "S", "strokeJoin", "nY", "E2", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "e", "o", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "iF", "()Landroid/graphics/Shader;", "te", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/ColorFilter;", "nr", "()Landroidx/compose/ui/graphics/ColorFilter;", "fD", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "Landroidx/compose/ui/graphics/PathEffect;", "aYN", "()Landroidx/compose/ui/graphics/PathEffect;", "XQ", "(Landroidx/compose/ui/graphics/PathEffect;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Paint {
    void E2(float f3);

    void Ik(int i2);

    float N();

    void S(int i2);

    void T(float f3);

    int ViF();

    void WPU(long j2);

    void X(int i2);

    void XQ(PathEffect pathEffect);

    int Z();

    PathEffect aYN();

    int ck();

    int e();

    void fD(ColorFilter colorFilter);

    android.graphics.Paint g();

    Shader iF();

    float n();

    float nY();

    ColorFilter nr();

    void o(int i2);

    void r(int i2);

    void rl(float f3);

    long t();

    void te(Shader shader);
}
