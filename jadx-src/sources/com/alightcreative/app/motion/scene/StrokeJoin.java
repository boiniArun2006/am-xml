package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/StrokeJoin;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Miter", "Round", "Bevel", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrokeJoin {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrokeJoin[] $VALUES;
    private final String id;
    public static final StrokeJoin Miter = new StrokeJoin("Miter", 0, "miter");
    public static final StrokeJoin Round = new StrokeJoin("Round", 1, "round");
    public static final StrokeJoin Bevel = new StrokeJoin("Bevel", 2, "bevel");

    private static final /* synthetic */ StrokeJoin[] $values() {
        return new StrokeJoin[]{Miter, Round, Bevel};
    }

    public static EnumEntries<StrokeJoin> getEntries() {
        return $ENTRIES;
    }

    static {
        StrokeJoin[] strokeJoinArr$values = $values();
        $VALUES = strokeJoinArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(strokeJoinArr$values);
    }

    public static StrokeJoin valueOf(String str) {
        return (StrokeJoin) Enum.valueOf(StrokeJoin.class, str);
    }

    public static StrokeJoin[] values() {
        return (StrokeJoin[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    private StrokeJoin(String str, int i2, String str2) {
        this.id = str2;
    }
}
