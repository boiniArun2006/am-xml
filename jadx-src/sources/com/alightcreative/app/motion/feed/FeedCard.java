package com.alightcreative.app.motion.feed;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\rHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J¡\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u0006:"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCard;", "", "id", "", TtmlNode.TAG_LAYOUT, "publishDate", "", "category", "Lcom/alightcreative/app/motion/feed/FeedCategory;", "lang", "title", "subtitle", "textHtml", "", "phoneImage", "Lcom/alightcreative/app/motion/feed/FeedCardImage;", "tabletImage", "buttons", "Lcom/alightcreative/app/motion/feed/FeedCardButton;", "effects", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/alightcreative/app/motion/feed/FeedCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/alightcreative/app/motion/feed/FeedCardImage;Lcom/alightcreative/app/motion/feed/FeedCardImage;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getLayout", "getPublishDate", "()J", "getCategory", "()Lcom/alightcreative/app/motion/feed/FeedCategory;", "getLang", "getTitle", "getSubtitle", "getTextHtml", "()Ljava/util/List;", "getPhoneImage", "()Lcom/alightcreative/app/motion/feed/FeedCardImage;", "getTabletImage", "getButtons", "getEffects", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeedCard {
    public static final int $stable = 8;
    private final List<FeedCardButton> buttons;
    private final FeedCategory category;
    private final List<String> effects;
    private final String id;
    private final String lang;
    private final String layout;
    private final FeedCardImage phoneImage;
    private final long publishDate;
    private final String subtitle;
    private final FeedCardImage tabletImage;
    private final List<String> textHtml;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedCard copy$default(FeedCard feedCard, String str, String str2, long j2, FeedCategory feedCategory, String str3, String str4, String str5, List list, FeedCardImage feedCardImage, FeedCardImage feedCardImage2, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedCard.id;
        }
        return feedCard.copy(str, (i2 & 2) != 0 ? feedCard.layout : str2, (i2 & 4) != 0 ? feedCard.publishDate : j2, (i2 & 8) != 0 ? feedCard.category : feedCategory, (i2 & 16) != 0 ? feedCard.lang : str3, (i2 & 32) != 0 ? feedCard.title : str4, (i2 & 64) != 0 ? feedCard.subtitle : str5, (i2 & 128) != 0 ? feedCard.textHtml : list, (i2 & 256) != 0 ? feedCard.phoneImage : feedCardImage, (i2 & 512) != 0 ? feedCard.tabletImage : feedCardImage2, (i2 & 1024) != 0 ? feedCard.buttons : list2, (i2 & 2048) != 0 ? feedCard.effects : list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FeedCardImage getTabletImage() {
        return this.tabletImage;
    }

    public final List<FeedCardButton> component11() {
        return this.buttons;
    }

    public final List<String> component12() {
        return this.effects;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPublishDate() {
        return this.publishDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FeedCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> component8() {
        return this.textHtml;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FeedCardImage getPhoneImage() {
        return this.phoneImage;
    }

    public final FeedCard copy(String id, String layout, long publishDate, FeedCategory category, String lang, String title, String subtitle, List<String> textHtml, FeedCardImage phoneImage, FeedCardImage tabletImage, List<FeedCardButton> buttons, List<String> effects) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new FeedCard(id, layout, publishDate, category, lang, title, subtitle, textHtml, phoneImage, tabletImage, buttons, effects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedCard)) {
            return false;
        }
        FeedCard feedCard = (FeedCard) other;
        return Intrinsics.areEqual(this.id, feedCard.id) && Intrinsics.areEqual(this.layout, feedCard.layout) && this.publishDate == feedCard.publishDate && this.category == feedCard.category && Intrinsics.areEqual(this.lang, feedCard.lang) && Intrinsics.areEqual(this.title, feedCard.title) && Intrinsics.areEqual(this.subtitle, feedCard.subtitle) && Intrinsics.areEqual(this.textHtml, feedCard.textHtml) && Intrinsics.areEqual(this.phoneImage, feedCard.phoneImage) && Intrinsics.areEqual(this.tabletImage, feedCard.tabletImage) && Intrinsics.areEqual(this.buttons, feedCard.buttons) && Intrinsics.areEqual(this.effects, feedCard.effects);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.layout.hashCode()) * 31) + Long.hashCode(this.publishDate)) * 31) + this.category.hashCode()) * 31;
        String str = this.lang;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.textHtml;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        FeedCardImage feedCardImage = this.phoneImage;
        int iHashCode6 = (iHashCode5 + (feedCardImage == null ? 0 : feedCardImage.hashCode())) * 31;
        FeedCardImage feedCardImage2 = this.tabletImage;
        int iHashCode7 = (((iHashCode6 + (feedCardImage2 == null ? 0 : feedCardImage2.hashCode())) * 31) + this.buttons.hashCode()) * 31;
        List<String> list2 = this.effects;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FeedCard(id=" + this.id + ", layout=" + this.layout + ", publishDate=" + this.publishDate + ", category=" + this.category + ", lang=" + this.lang + ", title=" + this.title + ", subtitle=" + this.subtitle + ", textHtml=" + this.textHtml + ", phoneImage=" + this.phoneImage + ", tabletImage=" + this.tabletImage + ", buttons=" + this.buttons + ", effects=" + this.effects + ")";
    }

    public FeedCard(String id, String layout, long j2, FeedCategory category, String str, String str2, String str3, List<String> list, FeedCardImage feedCardImage, FeedCardImage feedCardImage2, List<FeedCardButton> buttons, List<String> list2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = id;
        this.layout = layout;
        this.publishDate = j2;
        this.category = category;
        this.lang = str;
        this.title = str2;
        this.subtitle = str3;
        this.textHtml = list;
        this.phoneImage = feedCardImage;
        this.tabletImage = feedCardImage2;
        this.buttons = buttons;
        this.effects = list2;
    }

    public final List<FeedCardButton> getButtons() {
        return this.buttons;
    }

    public final FeedCategory getCategory() {
        return this.category;
    }

    public final List<String> getEffects() {
        return this.effects;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLayout() {
        return this.layout;
    }

    public final FeedCardImage getPhoneImage() {
        return this.phoneImage;
    }

    public final long getPublishDate() {
        return this.publishDate;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final FeedCardImage getTabletImage() {
        return this.tabletImage;
    }

    public final List<String> getTextHtml() {
        return this.textHtml;
    }

    public final String getTitle() {
        return this.title;
    }
}
