package com.alightcreative.app.motion.scene;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneType;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "SCENE", "ELEMENT", "PRESET", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SceneType[] $VALUES;
    private final String label;
    public static final SceneType SCENE = new SceneType("SCENE", 0, "scene");
    public static final SceneType ELEMENT = new SceneType("ELEMENT", 1, "element");
    public static final SceneType PRESET = new SceneType(pTYaLzzmJSGAPQ.xewxs, 2, "preset");

    private static final /* synthetic */ SceneType[] $values() {
        return new SceneType[]{SCENE, ELEMENT, PRESET};
    }

    public static EnumEntries<SceneType> getEntries() {
        return $ENTRIES;
    }

    static {
        SceneType[] sceneTypeArr$values = $values();
        $VALUES = sceneTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sceneTypeArr$values);
    }

    public static SceneType valueOf(String str) {
        return (SceneType) Enum.valueOf(SceneType.class, str);
    }

    public static SceneType[] values() {
        return (SceneType[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    private SceneType(String str, int i2, String str2) {
        this.label = str2;
    }
}
