package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003\u001d\u001e\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "J2", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "Uo", "Landroidx/compose/ui/text/font/FontWeight;", "O", "Landroidx/compose/ui/text/font/FontWeight;", "rl", "()Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "I", "t", "()I", "style", "", "Z", "didInitWithContext", "KN", "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "setTypeface$ui_text_release", "(Landroid/graphics/Typeface;)V", "typeface", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AndroidPreloadedFont extends AndroidFont {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private android.graphics.Typeface typeface;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final FontWeight weight;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean didInitWithContext;

    public abstract android.graphics.Typeface J2(Context context);

    public final android.graphics.Typeface Uo(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = J2(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: rl, reason: from getter */
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getStyle() {
        return this.style;
    }
}
