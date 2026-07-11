package com.alightcreative.app.motion.scene;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/Smoothing;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Auto", "serializeToString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Smoothing {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Smoothing[] $VALUES;
    public static final Smoothing None = new Smoothing("None", 0);
    public static final Smoothing Auto = new Smoothing("Auto", 1);

    private static final /* synthetic */ Smoothing[] $values() {
        return new Smoothing[]{None, Auto};
    }

    public static EnumEntries<Smoothing> getEntries() {
        return $ENTRIES;
    }

    static {
        Smoothing[] smoothingArr$values = $values();
        $VALUES = smoothingArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(smoothingArr$values);
    }

    public static Smoothing valueOf(String str) {
        return (Smoothing) Enum.valueOf(Smoothing.class, str);
    }

    public static Smoothing[] values() {
        return (Smoothing[]) $VALUES.clone();
    }

    private Smoothing(String str, int i2) {
    }

    public final String serializeToString() {
        String strName = name();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
