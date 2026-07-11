package com.bendingspoons.concierge.domain.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/concierge/domain/entities/CreationType;", "", "<init>", "(Ljava/lang/String;I)V", "JUST_GENERATED", "READ_FROM_FILE", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreationType[] $VALUES;

    @Json(name = "just_generated")
    public static final CreationType JUST_GENERATED = new CreationType("JUST_GENERATED", 0);

    @Json(name = "read_from_file")
    public static final CreationType READ_FROM_FILE = new CreationType("READ_FROM_FILE", 1);

    private static final /* synthetic */ CreationType[] $values() {
        return new CreationType[]{JUST_GENERATED, READ_FROM_FILE};
    }

    public static EnumEntries<CreationType> getEntries() {
        return $ENTRIES;
    }

    static {
        CreationType[] creationTypeArr$values = $values();
        $VALUES = creationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(creationTypeArr$values);
    }

    public static CreationType valueOf(String str) {
        return (CreationType) Enum.valueOf(CreationType.class, str);
    }

    public static CreationType[] values() {
        return (CreationType[]) $VALUES.clone();
    }

    private CreationType(String str, int i2) {
    }
}
