package com.alightcreative.app.motion.feed;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCardButtonIcon;", "", "<init>", "(Ljava/lang/String;I)V", "none", "link", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedCardButtonIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedCardButtonIcon[] $VALUES;
    public static final FeedCardButtonIcon none = new FeedCardButtonIcon("none", 0);
    public static final FeedCardButtonIcon link = new FeedCardButtonIcon("link", 1);

    private static final /* synthetic */ FeedCardButtonIcon[] $values() {
        return new FeedCardButtonIcon[]{none, link};
    }

    public static EnumEntries<FeedCardButtonIcon> getEntries() {
        return $ENTRIES;
    }

    static {
        FeedCardButtonIcon[] feedCardButtonIconArr$values = $values();
        $VALUES = feedCardButtonIconArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedCardButtonIconArr$values);
    }

    public static FeedCardButtonIcon valueOf(String str) {
        return (FeedCardButtonIcon) Enum.valueOf(FeedCardButtonIcon.class, str);
    }

    public static FeedCardButtonIcon[] values() {
        return (FeedCardButtonIcon[]) $VALUES.clone();
    }

    private FeedCardButtonIcon(String str, int i2) {
    }
}
