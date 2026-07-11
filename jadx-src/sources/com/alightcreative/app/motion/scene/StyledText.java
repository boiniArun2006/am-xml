package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, d2 = {"Lcom/alightcreative/app/motion/scene/StyledText;", "", "text", "", TtmlNode.ATTR_TTS_FONT_SIZE, "", "align", "Lcom/alightcreative/app/motion/scene/StyledTextAlign;", "wrapWidth", "", "font", "<init>", "(Ljava/lang/String;FLcom/alightcreative/app/motion/scene/StyledTextAlign;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getFontSize", "()F", "getAlign", "()Lcom/alightcreative/app/motion/scene/StyledTextAlign;", "getWrapWidth", "()I", "getFont", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyledText {
    public static final int $stable = 0;
    private final StyledTextAlign align;
    private final String font;
    private final float fontSize;
    private final String text;
    private final int wrapWidth;

    public StyledText() {
        this(null, 0.0f, null, 0, null, 31, null);
    }

    public static /* synthetic */ StyledText copy$default(StyledText styledText, String str, float f3, StyledTextAlign styledTextAlign, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = styledText.text;
        }
        if ((i3 & 2) != 0) {
            f3 = styledText.fontSize;
        }
        if ((i3 & 4) != 0) {
            styledTextAlign = styledText.align;
        }
        if ((i3 & 8) != 0) {
            i2 = styledText.wrapWidth;
        }
        if ((i3 & 16) != 0) {
            str2 = styledText.font;
        }
        String str3 = str2;
        StyledTextAlign styledTextAlign2 = styledTextAlign;
        return styledText.copy(str, f3, styledTextAlign2, i2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StyledTextAlign getAlign() {
        return this.align;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWrapWidth() {
        return this.wrapWidth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFont() {
        return this.font;
    }

    public final StyledText copy(String text, float fontSize, StyledTextAlign align, int wrapWidth, String font) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(font, "font");
        return new StyledText(text, fontSize, align, wrapWidth, font);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyledText)) {
            return false;
        }
        StyledText styledText = (StyledText) other;
        return Intrinsics.areEqual(this.text, styledText.text) && Float.compare(this.fontSize, styledText.fontSize) == 0 && this.align == styledText.align && this.wrapWidth == styledText.wrapWidth && Intrinsics.areEqual(this.font, styledText.font);
    }

    public int hashCode() {
        return (((((((this.text.hashCode() * 31) + Float.hashCode(this.fontSize)) * 31) + this.align.hashCode()) * 31) + Integer.hashCode(this.wrapWidth)) * 31) + this.font.hashCode();
    }

    public String toString() {
        return "StyledText(text=" + this.text + ", fontSize=" + this.fontSize + ", align=" + this.align + ", wrapWidth=" + this.wrapWidth + ", font=" + this.font + ")";
    }

    public StyledText(String text, float f3, StyledTextAlign align, int i2, String font) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(font, "font");
        this.text = text;
        this.fontSize = f3;
        this.align = align;
        this.wrapWidth = i2;
        this.font = font;
    }

    public final StyledTextAlign getAlign() {
        return this.align;
    }

    public final String getFont() {
        return this.font;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final String getText() {
        return this.text;
    }

    public final int getWrapWidth() {
        return this.wrapWidth;
    }

    public /* synthetic */ StyledText(String str, float f3, StyledTextAlign styledTextAlign, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 18.0f : f3, (i3 & 4) != 0 ? StyledTextAlign.LEFT : styledTextAlign, (i3 & 8) != 0 ? 512 : i2, (i3 & 16) != 0 ? "" : str2);
    }
}
