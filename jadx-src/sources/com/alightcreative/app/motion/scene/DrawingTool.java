package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/DrawingTool;", "", "<init>", "(Ljava/lang/String;I)V", "PEN", "BRUSH", "FILL", "ERASER", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawingTool {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DrawingTool[] $VALUES;
    public static final DrawingTool PEN = new DrawingTool("PEN", 0);
    public static final DrawingTool BRUSH = new DrawingTool("BRUSH", 1);
    public static final DrawingTool FILL = new DrawingTool("FILL", 2);
    public static final DrawingTool ERASER = new DrawingTool("ERASER", 3);

    private static final /* synthetic */ DrawingTool[] $values() {
        return new DrawingTool[]{PEN, BRUSH, FILL, ERASER};
    }

    public static EnumEntries<DrawingTool> getEntries() {
        return $ENTRIES;
    }

    static {
        DrawingTool[] drawingToolArr$values = $values();
        $VALUES = drawingToolArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(drawingToolArr$values);
    }

    public static DrawingTool valueOf(String str) {
        return (DrawingTool) Enum.valueOf(DrawingTool.class, str);
    }

    public static DrawingTool[] values() {
        return (DrawingTool[]) $VALUES.clone();
    }

    private DrawingTool(String str, int i2) {
    }
}
