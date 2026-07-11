package com.alightcreative.app.motion.scene;

import com.alightcreative.app.motion.scene.SolidColor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import yc.oJ;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/ElementTag;", "", "", "id", "Lyc/M;", "colors", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lyc/M;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lyc/M;", "getColors", "()Lyc/M;", "NONE", "RUBY", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "DARKBLUE", "PURPLE", "MAGENTA", "GRAY", "BLACK", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElementTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ElementTag[] $VALUES;
    public static final ElementTag BLACK;
    public static final ElementTag BLUE;
    public static final ElementTag DARKBLUE;
    public static final ElementTag GRAY;
    public static final ElementTag GREEN;
    public static final ElementTag MAGENTA;
    public static final ElementTag NONE;
    public static final ElementTag ORANGE;
    public static final ElementTag PURPLE;
    public static final ElementTag RED;
    public static final ElementTag RUBY;
    public static final ElementTag YELLOW;
    private final yc.M colors;
    private final String id;

    private static final /* synthetic */ ElementTag[] $values() {
        return new ElementTag[]{NONE, RUBY, RED, ORANGE, YELLOW, GREEN, BLUE, DARKBLUE, PURPLE, MAGENTA, GRAY, BLACK};
    }

    public static EnumEntries<ElementTag> getEntries() {
        return $ENTRIES;
    }

    static {
        SolidColor.Companion companion = SolidColor.INSTANCE;
        NONE = new ElementTag("NONE", 0, "", new yc.M(companion.getTRANSPARENT(), companion.getTRANSPARENT()));
        RUBY = new ElementTag("RUBY", 1, "+ruby", oJ.n("FF1D00", "EF4F1B"));
        RED = new ElementTag("RED", 2, "+red", oJ.n("EE4767", "BA2D42"));
        ORANGE = new ElementTag("ORANGE", 3, "+orange", oJ.n("FAA261", "D66D32"));
        YELLOW = new ElementTag("YELLOW", 4, "+yellow", oJ.n("FAD961", "FFF9A1"));
        GREEN = new ElementTag("GREEN", 5, "+green", oJ.n("52CCBC", "90F7EC"));
        BLUE = new ElementTag("BLUE", 6, "+blue", oJ.n("46A7EE", "52C8F6"));
        DARKBLUE = new ElementTag("DARKBLUE", 7, "+darkblue", oJ.n("1D6BD6", "0E579C"));
        PURPLE = new ElementTag("PURPLE", 8, "+purple", oJ.n("9621F0", "CB6FDA"));
        MAGENTA = new ElementTag("MAGENTA", 9, "+magenta", oJ.n("D500FF", "C817A5"));
        GRAY = new ElementTag("GRAY", 10, "+gray", oJ.n("F0F0F0", "A9A9A9"));
        BLACK = new ElementTag("BLACK", 11, "+black", oJ.n("595959", "242424"));
        ElementTag[] elementTagArr$values = $values();
        $VALUES = elementTagArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(elementTagArr$values);
    }

    public static ElementTag valueOf(String str) {
        return (ElementTag) Enum.valueOf(ElementTag.class, str);
    }

    public static ElementTag[] values() {
        return (ElementTag[]) $VALUES.clone();
    }

    public final yc.M getColors() {
        return this.colors;
    }

    public final String getId() {
        return this.id;
    }

    private ElementTag(String str, int i2, String str2, yc.M m2) {
        this.id = str2;
        this.colors = m2;
    }
}
