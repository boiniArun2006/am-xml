package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/Axis2D;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Axis2D {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Axis2D[] $VALUES;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Axis2D f45912X = new Axis2D("X", 0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Axis2D f45913Y = new Axis2D("Y", 1);

    private static final /* synthetic */ Axis2D[] $values() {
        return new Axis2D[]{f45912X, f45913Y};
    }

    public static EnumEntries<Axis2D> getEntries() {
        return $ENTRIES;
    }

    static {
        Axis2D[] axis2DArr$values = $values();
        $VALUES = axis2DArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(axis2DArr$values);
    }

    public static Axis2D valueOf(String str) {
        return (Axis2D) Enum.valueOf(Axis2D.class, str);
    }

    public static Axis2D[] values() {
        return (Axis2D[]) $VALUES.clone();
    }

    private Axis2D(String str, int i2) {
    }
}
