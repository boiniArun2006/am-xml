package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/alightcreative/monorepo/settings/NavigationBarStyle;", "", "<init>", "(Ljava/lang/String;I)V", "RESKIN", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationBarStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationBarStyle[] $VALUES;
    public static final NavigationBarStyle RESKIN = new NavigationBarStyle("RESKIN", 0);

    private static final /* synthetic */ NavigationBarStyle[] $values() {
        return new NavigationBarStyle[]{RESKIN};
    }

    public static EnumEntries<NavigationBarStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        NavigationBarStyle[] navigationBarStyleArr$values = $values();
        $VALUES = navigationBarStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(navigationBarStyleArr$values);
    }

    public static NavigationBarStyle valueOf(String str) {
        return (NavigationBarStyle) Enum.valueOf(NavigationBarStyle.class, str);
    }

    public static NavigationBarStyle[] values() {
        return (NavigationBarStyle[]) $VALUES.clone();
    }

    private NavigationBarStyle(String str, int i2) {
    }
}
