package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R&\u0010\u000b\u001a\u00020\n8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0019\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "rl", "I", "nr", "t", "Landroidx/compose/ui/text/font/FontWeight;", "()Landroidx/compose/ui/text/font/FontWeight;", "O", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "J2", c.f62177j, "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFont implements Font {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int loadingStrategy;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final FontVariation.Settings variationSettings;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int style;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int resId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, fontWeight, i3, settings, i5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.J2(getStyle(), resourceFont.getStyle()) && Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.J2(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    private ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i5) {
        this.resId = i2;
        this.weight = fontWeight;
        this.style = i3;
        this.variationSettings = settings;
        this.loadingStrategy = i5;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().getWeight()) * 31) + FontStyle.Uo(getStyle())) * 31) + FontLoadingStrategy.Uo(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: rl, reason: from getter */
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: t, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.KN(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.KN(getLoadingStrategy())) + ')';
    }
}
