package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/alightcreative/monorepo/settings/ExportUIMenuItem;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO", "TEMPLATE", "PRESET", "PROJECT_PACKAGE", "CLOUD_BACKUP", "PNG", "IMAGE_SEQUENCE", "GIF", "XML", "UNDEFINED", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportUIMenuItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExportUIMenuItem[] $VALUES;
    public static final ExportUIMenuItem VIDEO = new ExportUIMenuItem("VIDEO", 0);
    public static final ExportUIMenuItem TEMPLATE = new ExportUIMenuItem("TEMPLATE", 1);
    public static final ExportUIMenuItem PRESET = new ExportUIMenuItem("PRESET", 2);
    public static final ExportUIMenuItem PROJECT_PACKAGE = new ExportUIMenuItem("PROJECT_PACKAGE", 3);
    public static final ExportUIMenuItem CLOUD_BACKUP = new ExportUIMenuItem("CLOUD_BACKUP", 4);
    public static final ExportUIMenuItem PNG = new ExportUIMenuItem("PNG", 5);
    public static final ExportUIMenuItem IMAGE_SEQUENCE = new ExportUIMenuItem("IMAGE_SEQUENCE", 6);
    public static final ExportUIMenuItem GIF = new ExportUIMenuItem("GIF", 7);
    public static final ExportUIMenuItem XML = new ExportUIMenuItem("XML", 8);
    public static final ExportUIMenuItem UNDEFINED = new ExportUIMenuItem("UNDEFINED", 9);

    private static final /* synthetic */ ExportUIMenuItem[] $values() {
        return new ExportUIMenuItem[]{VIDEO, TEMPLATE, PRESET, PROJECT_PACKAGE, CLOUD_BACKUP, PNG, IMAGE_SEQUENCE, GIF, XML, UNDEFINED};
    }

    public static EnumEntries<ExportUIMenuItem> getEntries() {
        return $ENTRIES;
    }

    static {
        ExportUIMenuItem[] exportUIMenuItemArr$values = $values();
        $VALUES = exportUIMenuItemArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exportUIMenuItemArr$values);
    }

    public static ExportUIMenuItem valueOf(String str) {
        return (ExportUIMenuItem) Enum.valueOf(ExportUIMenuItem.class, str);
    }

    public static ExportUIMenuItem[] values() {
        return (ExportUIMenuItem[]) $VALUES.clone();
    }

    private ExportUIMenuItem(String str, int i2) {
    }
}
