package com.alightcreative.account;

import androidx.annotation.Keep;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Keep
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/account/LicenseStore;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "GooglePlayStore", "AppleAppStore", "None", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LicenseStore {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LicenseStore[] $VALUES;
    private final String id;
    public static final LicenseStore GooglePlayStore = new LicenseStore("GooglePlayStore", 0, "google_play_store");
    public static final LicenseStore AppleAppStore = new LicenseStore("AppleAppStore", 1, "apple_app_store");
    public static final LicenseStore None = new LicenseStore("None", 2, "none");

    private static final /* synthetic */ LicenseStore[] $values() {
        return new LicenseStore[]{GooglePlayStore, AppleAppStore, None};
    }

    public static EnumEntries<LicenseStore> getEntries() {
        return $ENTRIES;
    }

    static {
        LicenseStore[] licenseStoreArr$values = $values();
        $VALUES = licenseStoreArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(licenseStoreArr$values);
    }

    public static LicenseStore valueOf(String str) {
        return (LicenseStore) Enum.valueOf(LicenseStore.class, str);
    }

    public static LicenseStore[] values() {
        return (LicenseStore[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    private LicenseStore(String str, int i2, String str2) {
        this.id = str2;
    }
}
