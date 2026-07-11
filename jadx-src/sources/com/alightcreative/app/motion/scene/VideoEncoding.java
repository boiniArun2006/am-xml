package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/VideoEncoding;", "", "mime", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMime", "()Ljava/lang/String;", "AVC", "HEVC", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoEncoding[] $VALUES;
    public static final VideoEncoding AVC = new VideoEncoding("AVC", 0, "video/avc");
    public static final VideoEncoding HEVC = new VideoEncoding("HEVC", 1, "video/hevc");
    private final String mime;

    private static final /* synthetic */ VideoEncoding[] $values() {
        return new VideoEncoding[]{AVC, HEVC};
    }

    public static EnumEntries<VideoEncoding> getEntries() {
        return $ENTRIES;
    }

    static {
        VideoEncoding[] videoEncodingArr$values = $values();
        $VALUES = videoEncodingArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(videoEncodingArr$values);
    }

    public static VideoEncoding valueOf(String str) {
        return (VideoEncoding) Enum.valueOf(VideoEncoding.class, str);
    }

    public static VideoEncoding[] values() {
        return (VideoEncoding[]) $VALUES.clone();
    }

    public final String getMime() {
        return this.mime;
    }

    private VideoEncoding(String str, int i2, String str2) {
        this.mime = str2;
    }
}
