package com.alightcreative.account;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Keep
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/alightcreative/account/IAPItemType;", "", "tag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "Subscription", "Pass", "Consumable", "Item", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IAPItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IAPItemType[] $VALUES;
    private final String tag;
    public static final IAPItemType Subscription = new IAPItemType("Subscription", 0, "sub");
    public static final IAPItemType Pass = new IAPItemType("Pass", 1, "pass");
    public static final IAPItemType Consumable = new IAPItemType("Consumable", 2, "consumable");
    public static final IAPItemType Item = new IAPItemType("Item", 3, "item");

    private static final /* synthetic */ IAPItemType[] $values() {
        return new IAPItemType[]{Subscription, Pass, Consumable, Item};
    }

    public static EnumEntries<IAPItemType> getEntries() {
        return $ENTRIES;
    }

    static {
        IAPItemType[] iAPItemTypeArr$values = $values();
        $VALUES = iAPItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iAPItemTypeArr$values);
    }

    public static IAPItemType valueOf(String str) {
        return (IAPItemType) Enum.valueOf(IAPItemType.class, str);
    }

    public static IAPItemType[] values() {
        return (IAPItemType[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }

    private IAPItemType(String str, int i2, String str2) {
        this.tag = str2;
    }
}
