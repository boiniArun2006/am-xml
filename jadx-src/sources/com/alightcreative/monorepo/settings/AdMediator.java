package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/monorepo/settings/AdMediator;", "", "<init>", "(Ljava/lang/String;I)V", "ADMOB", "MAX", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdMediator {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdMediator[] $VALUES;
    public static final AdMediator ADMOB = new AdMediator("ADMOB", 0);
    public static final AdMediator MAX = new AdMediator("MAX", 1);

    private static final /* synthetic */ AdMediator[] $values() {
        return new AdMediator[]{ADMOB, MAX};
    }

    public static EnumEntries<AdMediator> getEntries() {
        return $ENTRIES;
    }

    static {
        AdMediator[] adMediatorArr$values = $values();
        $VALUES = adMediatorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(adMediatorArr$values);
    }

    public static AdMediator valueOf(String str) {
        return (AdMediator) Enum.valueOf(AdMediator.class, str);
    }

    public static AdMediator[] values() {
        return (AdMediator[]) $VALUES.clone();
    }

    private AdMediator(String str, int i2) {
    }
}
