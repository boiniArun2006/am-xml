package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/monorepo/settings/PlayfulUnlockStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CALM_OLD", "CALM", "CARDS_HORIZONTAL", "CARDS_VERTICAL", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlayfulUnlockStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlayfulUnlockStyle[] $VALUES;
    public static final PlayfulUnlockStyle CALM_OLD = new PlayfulUnlockStyle("CALM_OLD", 0);
    public static final PlayfulUnlockStyle CALM = new PlayfulUnlockStyle("CALM", 1);
    public static final PlayfulUnlockStyle CARDS_HORIZONTAL = new PlayfulUnlockStyle("CARDS_HORIZONTAL", 2);
    public static final PlayfulUnlockStyle CARDS_VERTICAL = new PlayfulUnlockStyle("CARDS_VERTICAL", 3);

    private static final /* synthetic */ PlayfulUnlockStyle[] $values() {
        return new PlayfulUnlockStyle[]{CALM_OLD, CALM, CARDS_HORIZONTAL, CARDS_VERTICAL};
    }

    public static EnumEntries<PlayfulUnlockStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        PlayfulUnlockStyle[] playfulUnlockStyleArr$values = $values();
        $VALUES = playfulUnlockStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(playfulUnlockStyleArr$values);
    }

    public static PlayfulUnlockStyle valueOf(String str) {
        return (PlayfulUnlockStyle) Enum.valueOf(PlayfulUnlockStyle.class, str);
    }

    public static PlayfulUnlockStyle[] values() {
        return (PlayfulUnlockStyle[]) $VALUES.clone();
    }

    private PlayfulUnlockStyle(String str, int i2) {
    }
}
