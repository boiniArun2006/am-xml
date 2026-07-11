package com.alightcreative.app.motion.feed;

import com.google.android.gms.common.Scopes;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/app/motion/feed/FeedActionType;", "", "<init>", "(Ljava/lang/String;I)V", "none", "View", "YouTube", "youtubePlaylist", "youtubeChannelById", "youtubeChannelByName", "Instagram", "Twitter", "SaveElement", "Email", CreativeInfo.f62455s, "newFeaturePopup", "InAppNavigation", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedActionType[] $VALUES;

    @Json(name = "none")
    public static final FeedActionType none = new FeedActionType("none", 0);

    @Json(name = "view")
    public static final FeedActionType View = new FeedActionType("View", 1);

    @Json(name = "youtube")
    public static final FeedActionType YouTube = new FeedActionType("YouTube", 2);

    @Json(name = "youtube-playlist")
    public static final FeedActionType youtubePlaylist = new FeedActionType("youtubePlaylist", 3);

    @Json(name = "youtube-channel-id")
    public static final FeedActionType youtubeChannelById = new FeedActionType("youtubeChannelById", 4);

    @Json(name = "youtube-channel-name")
    public static final FeedActionType youtubeChannelByName = new FeedActionType("youtubeChannelByName", 5);

    @Json(name = "instagram")
    public static final FeedActionType Instagram = new FeedActionType("Instagram", 6);

    @Json(name = "twitter")
    public static final FeedActionType Twitter = new FeedActionType("Twitter", 7);

    @Json(name = "saveelement")
    public static final FeedActionType SaveElement = new FeedActionType("SaveElement", 8);

    @Json(name = Scopes.EMAIL)
    public static final FeedActionType Email = new FeedActionType("Email", 9);

    @Json(name = CreativeInfo.f62455s)
    public static final FeedActionType survey = new FeedActionType(CreativeInfo.f62455s, 10);

    @Json(name = "new-feature-popup")
    public static final FeedActionType newFeaturePopup = new FeedActionType("newFeaturePopup", 11);

    @Json(name = "in-app-navigation")
    public static final FeedActionType InAppNavigation = new FeedActionType("InAppNavigation", 12);

    private static final /* synthetic */ FeedActionType[] $values() {
        return new FeedActionType[]{none, View, YouTube, youtubePlaylist, youtubeChannelById, youtubeChannelByName, Instagram, Twitter, SaveElement, Email, survey, newFeaturePopup, InAppNavigation};
    }

    public static EnumEntries<FeedActionType> getEntries() {
        return $ENTRIES;
    }

    static {
        FeedActionType[] feedActionTypeArr$values = $values();
        $VALUES = feedActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedActionTypeArr$values);
    }

    public static FeedActionType valueOf(String str) {
        return (FeedActionType) Enum.valueOf(FeedActionType.class, str);
    }

    public static FeedActionType[] values() {
        return (FeedActionType[]) $VALUES.clone();
    }

    private FeedActionType(String str, int i2) {
    }
}
