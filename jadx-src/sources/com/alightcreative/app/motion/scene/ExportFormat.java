package com.alightcreative.app.motion.scene;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/scene/ExportFormat;", "", "hasAudio", "", "hasVideo", "muxerOutputFormat", "", "bitmapFormat", "Landroid/graphics/Bitmap$CompressFormat;", "bitmapExt", "", "<init>", "(Ljava/lang/String;IZZLjava/lang/Integer;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;)V", "getHasAudio", "()Z", "getHasVideo", "getMuxerOutputFormat", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBitmapFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "getBitmapExt", "()Ljava/lang/String;", "VIDEO_MPEG4", "VIDEO_3GPP", "VIDEO_WEBM", "GIF", "PNG_ZIP", "JPEG_ZIP", "WEBP_ZIP", "PNG_PLAIN", "JPEG_PLAIN", "WEBP_PLAIN", "M4A", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExportFormat[] $VALUES;
    public static final ExportFormat GIF;
    public static final ExportFormat JPEG_PLAIN;
    public static final ExportFormat JPEG_ZIP;
    public static final ExportFormat M4A;
    public static final ExportFormat PNG_PLAIN;
    public static final ExportFormat PNG_ZIP;
    public static final ExportFormat VIDEO_3GPP;
    public static final ExportFormat VIDEO_MPEG4;
    public static final ExportFormat VIDEO_WEBM;
    public static final ExportFormat WEBP_PLAIN;
    public static final ExportFormat WEBP_ZIP;
    private final String bitmapExt;
    private final Bitmap.CompressFormat bitmapFormat;
    private final boolean hasAudio;
    private final boolean hasVideo;
    private final Integer muxerOutputFormat;

    private static final /* synthetic */ ExportFormat[] $values() {
        return new ExportFormat[]{VIDEO_MPEG4, VIDEO_3GPP, VIDEO_WEBM, GIF, PNG_ZIP, JPEG_ZIP, WEBP_ZIP, PNG_PLAIN, JPEG_PLAIN, WEBP_PLAIN, M4A};
    }

    private ExportFormat(String str, int i2, boolean z2, boolean z3, Integer num, Bitmap.CompressFormat compressFormat, String str2) {
        this.hasAudio = z2;
        this.hasVideo = z3;
        this.muxerOutputFormat = num;
        this.bitmapFormat = compressFormat;
        this.bitmapExt = str2;
    }

    public static EnumEntries<ExportFormat> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z2 = true;
        VIDEO_MPEG4 = new ExportFormat("VIDEO_MPEG4", 0, true, z2, 0, null, null, 24, null);
        boolean z3 = true;
        char c2 = 1 == true ? 1 : 0;
        Object[] objArr = null == true ? 1 : 0;
        VIDEO_3GPP = new ExportFormat("VIDEO_3GPP", c2, z2, z3, 2, objArr, null, 24, null);
        Object[] objArr2 = null == true ? 1 : 0;
        VIDEO_WEBM = new ExportFormat("VIDEO_WEBM", 2, z3, true, 1, objArr2, null, 24, null);
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        GIF = new ExportFormat("GIF", 3, false, true, objArr3, objArr4, null, 28, null);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        Object[] objArr5 = null == true ? 1 : 0;
        PNG_ZIP = new ExportFormat("PNG_ZIP", 4, false, true, objArr5, compressFormat, "png", 4, null);
        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
        JPEG_ZIP = new ExportFormat("JPEG_ZIP", 5, false, true, null, compressFormat2, "jpeg", 4, null);
        Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.WEBP;
        boolean z4 = false;
        boolean z5 = true;
        WEBP_ZIP = new ExportFormat("WEBP_ZIP", 6, z4, z5, null, compressFormat3, "webp", 4, null == true ? 1 : 0);
        PNG_PLAIN = new ExportFormat("PNG_PLAIN", 7, false, true, null, compressFormat, "png", 4, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Integer num = null;
        JPEG_PLAIN = new ExportFormat("JPEG_PLAIN", 8, z4, z5, num, compressFormat2, "jpeg", 4, defaultConstructorMarker);
        WEBP_PLAIN = new ExportFormat("WEBP_PLAIN", 9, false, true, null, compressFormat3, "webp", 4, null);
        M4A = new ExportFormat("M4A", 10, true, false, num, null, null, 28, defaultConstructorMarker);
        ExportFormat[] exportFormatArr$values = $values();
        $VALUES = exportFormatArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exportFormatArr$values);
    }

    /* synthetic */ ExportFormat(String str, int i2, boolean z2, boolean z3, Integer num, Bitmap.CompressFormat compressFormat, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, z2, z3, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : compressFormat, (i3 & 16) != 0 ? "" : str2);
    }

    public static ExportFormat valueOf(String str) {
        return (ExportFormat) Enum.valueOf(ExportFormat.class, str);
    }

    public static ExportFormat[] values() {
        return (ExportFormat[]) $VALUES.clone();
    }

    public final String getBitmapExt() {
        return this.bitmapExt;
    }

    public final Bitmap.CompressFormat getBitmapFormat() {
        return this.bitmapFormat;
    }

    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final Integer getMuxerOutputFormat() {
        return this.muxerOutputFormat;
    }
}
