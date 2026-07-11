package com.alightcreative.app.motion.scene;

import ScC.FuwU.XIvb;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/StrokeEnd;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "None", "Arrow", "TLine", "Square", "FilledSquare", "Diamond", "FilledDiamond", "HollowArrow", "FilledArrow", "HollowCircle", "FilledCircle", "HollowTeardrop", "FilledTeardrop", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StrokeEnd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrokeEnd[] $VALUES;
    private final String id;
    public static final StrokeEnd None = new StrokeEnd("None", 0, "none");
    public static final StrokeEnd Arrow = new StrokeEnd("Arrow", 1, "arrow");
    public static final StrokeEnd TLine = new StrokeEnd("TLine", 2, "t-line");
    public static final StrokeEnd Square = new StrokeEnd("Square", 3, "square");
    public static final StrokeEnd FilledSquare = new StrokeEnd("FilledSquare", 4, XIvb.EFPspZfaeFscq);
    public static final StrokeEnd Diamond = new StrokeEnd("Diamond", 5, "diamond");
    public static final StrokeEnd FilledDiamond = new StrokeEnd("FilledDiamond", 6, "diamond-filled");
    public static final StrokeEnd HollowArrow = new StrokeEnd("HollowArrow", 7, "arrow-hollow");
    public static final StrokeEnd FilledArrow = new StrokeEnd("FilledArrow", 8, "arrow-filled");
    public static final StrokeEnd HollowCircle = new StrokeEnd("HollowCircle", 9, "circle-hollow");
    public static final StrokeEnd FilledCircle = new StrokeEnd("FilledCircle", 10, "circle-filled");
    public static final StrokeEnd HollowTeardrop = new StrokeEnd("HollowTeardrop", 11, "teardrop-hollow");
    public static final StrokeEnd FilledTeardrop = new StrokeEnd("FilledTeardrop", 12, "teardrop-filled");

    private static final /* synthetic */ StrokeEnd[] $values() {
        return new StrokeEnd[]{None, Arrow, TLine, Square, FilledSquare, Diamond, FilledDiamond, HollowArrow, FilledArrow, HollowCircle, FilledCircle, HollowTeardrop, FilledTeardrop};
    }

    public static EnumEntries<StrokeEnd> getEntries() {
        return $ENTRIES;
    }

    static {
        StrokeEnd[] strokeEndArr$values = $values();
        $VALUES = strokeEndArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(strokeEndArr$values);
    }

    public static StrokeEnd valueOf(String str) {
        return (StrokeEnd) Enum.valueOf(StrokeEnd.class, str);
    }

    public static StrokeEnd[] values() {
        return (StrokeEnd[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    private StrokeEnd(String str, int i2, String str2) {
        this.id = str2;
    }
}
