package WK;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {
    private static final /* synthetic */ Ml[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11455e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11460n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ml f11459t = new Ml("DiscoverTemplate", 0, "discover_template");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Ml f11452O = new Ml("SavePresetButton", 1, "save_preset_button");
    public static final Ml J2 = new Ml("PopupListEditButton", 2, "popup_list_edit_button");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ml f11458r = new Ml("TemplateImportPreviewFirstTime", 3, "template_import_preview_first_time");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ml f11457o = new Ml("TemplateImportPreviewTooltip", 4, "template_import_preview_tooltip");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Ml f11454Z = new Ml("TemplateImportPreviewCropTooltip", 5, "template_import_preview_crop_tooltip");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Ml f11453S = new Ml("AdvancedSpeedControl", 6, "advanced_speed_control");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ml f11456g = new Ml("CloudTab", 7, "cloud_tab");

    static {
        Ml[] mlArrN = n();
        E2 = mlArrN;
        f11455e = EnumEntriesKt.enumEntries(mlArrN);
    }

    private static final /* synthetic */ Ml[] n() {
        return new Ml[]{f11459t, f11452O, J2, f11458r, f11457o, f11454Z, f11453S, f11456g};
    }

    public static Ml valueOf(String str) {
        return (Ml) Enum.valueOf(Ml.class, str);
    }

    public static Ml[] values() {
        return (Ml[]) E2.clone();
    }

    public final String rl() {
        return this.f11460n;
    }

    private Ml(String str, int i2, String str2) {
        this.f11460n = str2;
    }
}
