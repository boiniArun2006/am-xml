package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/CameraType;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Perspective", "Orthographic", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String id;
    public static final CameraType Perspective = new CameraType("Perspective", 0, "perspective");
    public static final CameraType Orthographic = new CameraType("Orthographic", 1, "orthographic");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/CameraType$Companion;", "", "<init>", "()V", "fromString", "Lcom/alightcreative/app/motion/scene/CameraType;", "id", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCameraProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraProperties.kt\ncom/alightcreative/app/motion/scene/CameraType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,29:1\n1310#2,2:30\n*S KotlinDebug\n*F\n+ 1 CameraProperties.kt\ncom/alightcreative/app/motion/scene/CameraType$Companion\n*L\n9#1:30,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CameraType fromString(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            for (CameraType cameraType : CameraType.values()) {
                if (Intrinsics.areEqual(cameraType.getId(), id)) {
                    return cameraType;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ CameraType[] $values() {
        return new CameraType[]{Perspective, Orthographic};
    }

    public static EnumEntries<CameraType> getEntries() {
        return $ENTRIES;
    }

    static {
        CameraType[] cameraTypeArr$values = $values();
        $VALUES = cameraTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cameraTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public static CameraType valueOf(String str) {
        return (CameraType) Enum.valueOf(CameraType.class, str);
    }

    public static CameraType[] values() {
        return (CameraType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    private CameraType(String str, int i2, String str2) {
        this.id = str2;
    }
}
