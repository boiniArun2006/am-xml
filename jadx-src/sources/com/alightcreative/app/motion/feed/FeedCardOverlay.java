package com.alightcreative.app.motion.feed;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCardOverlay;", "", "<init>", "(Ljava/lang/String;I)V", "none", "play", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedCardOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedCardOverlay[] $VALUES;
    public static final FeedCardOverlay none = new FeedCardOverlay("none", 0);
    public static final FeedCardOverlay play = new FeedCardOverlay("play", 1);

    private static final /* synthetic */ FeedCardOverlay[] $values() {
        return new FeedCardOverlay[]{none, play};
    }

    public static EnumEntries<FeedCardOverlay> getEntries() {
        return $ENTRIES;
    }

    static {
        FeedCardOverlay[] feedCardOverlayArr$values = $values();
        $VALUES = feedCardOverlayArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedCardOverlayArr$values);
    }

    public static FeedCardOverlay valueOf(String str) {
        return (FeedCardOverlay) Enum.valueOf(FeedCardOverlay.class, str);
    }

    public static FeedCardOverlay[] values() {
        return (FeedCardOverlay[]) $VALUES.clone();
    }

    private FeedCardOverlay(String str, int i2) {
    }
}
