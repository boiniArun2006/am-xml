package com.alightcreative.app.motion.scene.userparam;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/StaticTextStyle;", "", "<init>", "(Ljava/lang/String;I)V", "TIP", "SECTION", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StaticTextStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StaticTextStyle[] $VALUES;
    public static final StaticTextStyle TIP = new StaticTextStyle(QiDPjiOCZHDS.rKenbJMZ, 0);
    public static final StaticTextStyle SECTION = new StaticTextStyle("SECTION", 1);

    private static final /* synthetic */ StaticTextStyle[] $values() {
        return new StaticTextStyle[]{TIP, SECTION};
    }

    public static EnumEntries<StaticTextStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        StaticTextStyle[] staticTextStyleArr$values = $values();
        $VALUES = staticTextStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(staticTextStyleArr$values);
    }

    public static StaticTextStyle valueOf(String str) {
        return (StaticTextStyle) Enum.valueOf(StaticTextStyle.class, str);
    }

    public static StaticTextStyle[] values() {
        return (StaticTextStyle[]) $VALUES.clone();
    }

    private StaticTextStyle(String str, int i2) {
    }
}
