package com.alightcreative.app.motion.fonts;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n {
    private final Map<String, j> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n copy$default(n nVar, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = nVar.fonts;
        }
        return nVar.copy(map);
    }

    public final Map<String, j> component1() {
        return this.fonts;
    }

    public final n copy(Map<String, j> fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        return new n(fonts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.fonts, ((n) obj).fonts);
    }

    public int hashCode() {
        return this.fonts.hashCode();
    }

    public String toString() {
        return "AMFontDB_FontList(fonts=" + this.fonts + ")";
    }

    public n(Map<String, j> fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        this.fonts = fonts;
    }

    public final Map<String, j> getFonts() {
        return this.fonts;
    }
}
