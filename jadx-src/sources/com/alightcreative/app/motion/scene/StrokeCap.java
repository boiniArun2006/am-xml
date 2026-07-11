package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/StrokeCap;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Butt", "Round", "Square", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrokeCap {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrokeCap[] $VALUES;
    public static final StrokeCap Butt = new StrokeCap("Butt", 0, "butt");
    public static final StrokeCap Round = new StrokeCap("Round", 1, "round");
    public static final StrokeCap Square = new StrokeCap("Square", 2, "square");
    private final String id;

    private static final /* synthetic */ StrokeCap[] $values() {
        return new StrokeCap[]{Butt, Round, Square};
    }

    public static EnumEntries<StrokeCap> getEntries() {
        return $ENTRIES;
    }

    static {
        StrokeCap[] strokeCapArr$values = $values();
        $VALUES = strokeCapArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(strokeCapArr$values);
    }

    public static StrokeCap valueOf(String str) {
        return (StrokeCap) Enum.valueOf(StrokeCap.class, str);
    }

    public static StrokeCap[] values() {
        return (StrokeCap[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    private StrokeCap(String str, int i2, String str2) {
        this.id = str2;
    }
}
