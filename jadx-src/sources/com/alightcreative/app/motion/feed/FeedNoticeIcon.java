package com.alightcreative.app.motion.feed;

import com.caoccao.javet.interop.loader.JavetLibLoadingListener;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedNoticeIcon;", "", "<init>", "(Ljava/lang/String;I)V", "twitter", "youtube", "instagram", JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedNoticeIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedNoticeIcon[] $VALUES;
    public static final FeedNoticeIcon twitter = new FeedNoticeIcon("twitter", 0);
    public static final FeedNoticeIcon youtube = new FeedNoticeIcon("youtube", 1);
    public static final FeedNoticeIcon instagram = new FeedNoticeIcon("instagram", 2);
    public static final FeedNoticeIcon custom = new FeedNoticeIcon(JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM, 3);

    private static final /* synthetic */ FeedNoticeIcon[] $values() {
        return new FeedNoticeIcon[]{twitter, youtube, instagram, custom};
    }

    public static EnumEntries<FeedNoticeIcon> getEntries() {
        return $ENTRIES;
    }

    static {
        FeedNoticeIcon[] feedNoticeIconArr$values = $values();
        $VALUES = feedNoticeIconArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedNoticeIconArr$values);
    }

    public static FeedNoticeIcon valueOf(String str) {
        return (FeedNoticeIcon) Enum.valueOf(FeedNoticeIcon.class, str);
    }

    public static FeedNoticeIcon[] values() {
        return (FeedNoticeIcon[]) $VALUES.clone();
    }

    private FeedNoticeIcon(String str, int i2) {
    }
}
