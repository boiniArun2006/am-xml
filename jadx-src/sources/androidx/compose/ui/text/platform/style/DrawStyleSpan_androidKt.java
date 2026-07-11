package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/StrokeJoin;", "Landroid/graphics/Paint$Join;", "rl", "(I)Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeCap;", "Landroid/graphics/Paint$Cap;", c.f62177j, "(I)Landroid/graphics/Paint$Cap;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawStyleSpan_androidKt {
    public static final Paint.Cap n(int i2) {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        return StrokeCap.Uo(i2, companion.n()) ? Paint.Cap.BUTT : StrokeCap.Uo(i2, companion.rl()) ? Paint.Cap.ROUND : StrokeCap.Uo(i2, companion.t()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join rl(int i2) {
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        return StrokeJoin.Uo(i2, companion.rl()) ? Paint.Join.MITER : StrokeJoin.Uo(i2, companion.t()) ? Paint.Join.ROUND : StrokeJoin.Uo(i2, companion.n()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
