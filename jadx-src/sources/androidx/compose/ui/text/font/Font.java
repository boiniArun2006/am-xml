package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorFont, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "J2", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "toString", "()Ljava/lang/String;", "Landroid/os/ParcelFileDescriptor;", "xMQ", "Landroid/os/ParcelFileDescriptor;", "getFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Font extends AndroidPreloadedFont {

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final ParcelFileDescriptor fileDescriptor;

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface J2(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.f33732n.t(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.KN(getStyle())) + ')';
    }
}
