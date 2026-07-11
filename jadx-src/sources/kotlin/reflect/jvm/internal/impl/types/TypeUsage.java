package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.stats.CodePackage;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class TypeUsage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeUsage[] $VALUES;
    public static final TypeUsage SUPERTYPE = new TypeUsage("SUPERTYPE", 0);
    public static final TypeUsage COMMON = new TypeUsage(CodePackage.COMMON, 1);

    private static final /* synthetic */ TypeUsage[] $values() {
        return new TypeUsage[]{SUPERTYPE, COMMON};
    }

    static {
        TypeUsage[] typeUsageArr$values = $values();
        $VALUES = typeUsageArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(typeUsageArr$values);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) $VALUES.clone();
    }

    private TypeUsage(String str, int i2) {
    }
}
