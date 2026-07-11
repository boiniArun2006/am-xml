package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/monorepo/settings/LandingTab;", "", "<init>", "(Ljava/lang/String;I)V", "PROJECTS", "HOME", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LandingTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LandingTab[] $VALUES;
    public static final LandingTab PROJECTS = new LandingTab("PROJECTS", 0);
    public static final LandingTab HOME = new LandingTab("HOME", 1);

    private static final /* synthetic */ LandingTab[] $values() {
        return new LandingTab[]{PROJECTS, HOME};
    }

    public static EnumEntries<LandingTab> getEntries() {
        return $ENTRIES;
    }

    static {
        LandingTab[] landingTabArr$values = $values();
        $VALUES = landingTabArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(landingTabArr$values);
    }

    public static LandingTab valueOf(String str) {
        return (LandingTab) Enum.valueOf(LandingTab.class, str);
    }

    public static LandingTab[] values() {
        return (LandingTab[]) $VALUES.clone();
    }

    private LandingTab(String str, int i2) {
    }
}
