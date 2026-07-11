package kotlin.reflect.jvm.internal.impl.types.model;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class TypeVariance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeVariance[] $VALUES;
    private final String presentation;
    public static final TypeVariance IN = new TypeVariance(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, 0, "in");
    public static final TypeVariance OUT = new TypeVariance(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT, 1, "out");
    public static final TypeVariance INV = new TypeVariance("INV", 2, "");

    private static final /* synthetic */ TypeVariance[] $values() {
        return new TypeVariance[]{IN, OUT, INV};
    }

    static {
        TypeVariance[] typeVarianceArr$values = $values();
        $VALUES = typeVarianceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(typeVarianceArr$values);
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }

    private TypeVariance(String str, int i2, String str2) {
        this.presentation = str2;
    }
}
