package com.alightcreative.app.motion.scene;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/ControlHandle;", "", "<init>", "(Ljava/lang/String;I)V", HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, "MAIN", HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT, "CURVE_OUT", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ControlHandle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ControlHandle[] $VALUES;
    public static final ControlHandle IN = new ControlHandle(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, 0);
    public static final ControlHandle MAIN = new ControlHandle("MAIN", 1);
    public static final ControlHandle OUT = new ControlHandle(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT, 2);
    public static final ControlHandle CURVE_OUT = new ControlHandle("CURVE_OUT", 3);

    private static final /* synthetic */ ControlHandle[] $values() {
        return new ControlHandle[]{IN, MAIN, OUT, CURVE_OUT};
    }

    public static EnumEntries<ControlHandle> getEntries() {
        return $ENTRIES;
    }

    static {
        ControlHandle[] controlHandleArr$values = $values();
        $VALUES = controlHandleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(controlHandleArr$values);
    }

    public static ControlHandle valueOf(String str) {
        return (ControlHandle) Enum.valueOf(ControlHandle.class, str);
    }

    public static ControlHandle[] values() {
        return (ControlHandle[]) $VALUES.clone();
    }

    private ControlHandle(String str, int i2) {
    }
}
