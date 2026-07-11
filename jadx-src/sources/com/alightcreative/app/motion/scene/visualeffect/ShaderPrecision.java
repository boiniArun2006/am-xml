package com.alightcreative.app.motion.scene.visualeffect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/ShaderPrecision;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MEDIUM", "HIGH", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShaderPrecision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShaderPrecision[] $VALUES;
    public static final ShaderPrecision LOW = new ShaderPrecision("LOW", 0);
    public static final ShaderPrecision MEDIUM = new ShaderPrecision("MEDIUM", 1);
    public static final ShaderPrecision HIGH = new ShaderPrecision("HIGH", 2);

    private static final /* synthetic */ ShaderPrecision[] $values() {
        return new ShaderPrecision[]{LOW, MEDIUM, HIGH};
    }

    public static EnumEntries<ShaderPrecision> getEntries() {
        return $ENTRIES;
    }

    static {
        ShaderPrecision[] shaderPrecisionArr$values = $values();
        $VALUES = shaderPrecisionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shaderPrecisionArr$values);
    }

    public static ShaderPrecision valueOf(String str) {
        return (ShaderPrecision) Enum.valueOf(ShaderPrecision.class, str);
    }

    public static ShaderPrecision[] values() {
        return (ShaderPrecision[]) $VALUES.clone();
    }

    private ShaderPrecision(String str, int i2) {
    }
}
