package com.alightcreative.app.motion.feed;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedCategory;", "", "<init>", "(Ljava/lang/String;I)V", "news", "updates", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedCategory[] $VALUES;
    public static final FeedCategory news = new FeedCategory("news", 0);
    public static final FeedCategory updates = new FeedCategory("updates", 1);

    private static final /* synthetic */ FeedCategory[] $values() {
        return new FeedCategory[]{news, updates};
    }

    public static EnumEntries<FeedCategory> getEntries() {
        return $ENTRIES;
    }

    static {
        FeedCategory[] feedCategoryArr$values = $values();
        $VALUES = feedCategoryArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedCategoryArr$values);
    }

    public static FeedCategory valueOf(String str) {
        return (FeedCategory) Enum.valueOf(FeedCategory.class, str);
    }

    public static FeedCategory[] values() {
        return (FeedCategory[]) $VALUES.clone();
    }

    private FeedCategory(String str, int i2) {
    }
}
