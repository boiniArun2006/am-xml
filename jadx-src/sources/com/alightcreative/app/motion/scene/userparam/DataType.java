package com.alightcreative.app.motion.scene.userparam;

import com.safedk.android.analytics.brandsafety.l;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/DataType;", "", "glslType", "", "isKeyable", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getGlslType", "()Ljava/lang/String;", "()Z", "FLOAT", "INT", "SOLID_COLOR", "VEC2", "VEC3", "VEC4", "QUAT", "BOOLEAN", "TEXTURE", "STRING", "NONE", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataType[] $VALUES;
    private final String glslType;
    private final boolean isKeyable;
    public static final DataType FLOAT = new DataType("FLOAT", 0, "float", true);
    public static final DataType INT = new DataType("INT", 1, l.f62668w, false);
    public static final DataType SOLID_COLOR = new DataType("SOLID_COLOR", 2, "vec4", true);
    public static final DataType VEC2 = new DataType("VEC2", 3, "vec2", true);
    public static final DataType VEC3 = new DataType("VEC3", 4, "vec3", true);
    public static final DataType VEC4 = new DataType("VEC4", 5, "vec4", true);
    public static final DataType QUAT = new DataType("QUAT", 6, "mat4", true);
    public static final DataType BOOLEAN = new DataType("BOOLEAN", 7, "bool", false);
    public static final DataType TEXTURE = new DataType("TEXTURE", 8, "AC_ImageInfo", false);
    public static final DataType STRING = new DataType("STRING", 9, "", false);
    public static final DataType NONE = new DataType("NONE", 10, "", false);

    private static final /* synthetic */ DataType[] $values() {
        return new DataType[]{FLOAT, INT, SOLID_COLOR, VEC2, VEC3, VEC4, QUAT, BOOLEAN, TEXTURE, STRING, NONE};
    }

    public static EnumEntries<DataType> getEntries() {
        return $ENTRIES;
    }

    static {
        DataType[] dataTypeArr$values = $values();
        $VALUES = dataTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataTypeArr$values);
    }

    public static DataType valueOf(String str) {
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    public static DataType[] values() {
        return (DataType[]) $VALUES.clone();
    }

    public final String getGlslType() {
        return this.glslType;
    }

    /* JADX INFO: renamed from: isKeyable, reason: from getter */
    public final boolean getIsKeyable() {
        return this.isKeyable;
    }

    private DataType(String str, int i2, String str2, boolean z2) {
        this.glslType = str2;
        this.isKeyable = z2;
    }
}
