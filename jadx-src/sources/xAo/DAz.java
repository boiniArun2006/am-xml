package xAo;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DAz {
    private static final /* synthetic */ DAz[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f75221e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75226n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DAz f75225t = new DAz("ProjectPackage", 0, "project_package");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final DAz f75218O = new DAz("CloudBackup", 1, "cloud_backup");
    public static final DAz J2 = new DAz("Xml", 2, "xml");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final DAz f75224r = new DAz("Video", 3, "video");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DAz f75223o = new DAz("ImageSequence", 4, "image_sequence");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final DAz f75220Z = new DAz("Png", 5, "png");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final DAz f75219S = new DAz("Gif", 6, "gif");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DAz f75222g = new DAz("Unknown", 7, "gif");

    static {
        DAz[] dAzArrN = n();
        E2 = dAzArrN;
        f75221e = EnumEntriesKt.enumEntries(dAzArrN);
    }

    private static final /* synthetic */ DAz[] n() {
        return new DAz[]{f75225t, f75218O, J2, f75224r, f75223o, f75220Z, f75219S, f75222g};
    }

    public static DAz valueOf(String str) {
        return (DAz) Enum.valueOf(DAz.class, str);
    }

    public static DAz[] values() {
        return (DAz[]) E2.clone();
    }

    public final String rl() {
        return this.f75226n;
    }

    private DAz(String str, int i2, String str2) {
        this.f75226n = str2;
    }
}
