package KC;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class afx {
    public static final int $stable = 0;
    private final String download;
    private final String thumbnail;
    private final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afx)) {
            return false;
        }
        afx afxVar = (afx) obj;
        return Intrinsics.areEqual(this.title, afxVar.title) && Intrinsics.areEqual(this.thumbnail, afxVar.thumbnail) && Intrinsics.areEqual(this.download, afxVar.download);
    }

    public afx(String title, String thumbnail, String download) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(download, "download");
        this.title = title;
        this.thumbnail = thumbnail;
        this.download = download;
    }

    public static /* synthetic */ afx copy$default(afx afxVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = afxVar.title;
        }
        if ((i2 & 2) != 0) {
            str2 = afxVar.thumbnail;
        }
        if ((i2 & 4) != 0) {
            str3 = afxVar.download;
        }
        return afxVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.thumbnail;
    }

    public final String component3() {
        return this.download;
    }

    public final afx copy(String title, String thumbnail, String download) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(download, "download");
        return new afx(title, thumbnail, download);
    }

    public final String getDownload() {
        return this.download;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.thumbnail.hashCode()) * 31) + this.download.hashCode();
    }

    public String toString() {
        return "ElementRecommendation(title=" + this.title + ", thumbnail=" + this.thumbnail + ", download=" + this.download + ")";
    }
}
